/**
 * 
 */
package de.qsc.centraflex.broadsoft;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import javax.net.ssl.SSLException;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import com.broadsoft.xsi.BaseEvent;
import com.broadsoft.xsi.Channel;
import com.broadsoft.xsi.ChannelTerminatedEvent;
import com.broadsoft.xsi.ErrorInfo;
import com.broadsoft.xsi.SubscriptionEvent;
import com.broadsoft.xsi.api.ConnectionState;
import com.broadsoft.xsi.api.EventChannel;
import com.broadsoft.xsi.api.EventChannelListener;
import com.broadsoft.xsi.api.Subscription;

/**
 * @author spr
 *
 */
public class EventChannelImpl implements Runnable, EventChannel {

	private final static Logger logger = LogManager.getLogger("xsi.events");

	private static int count = 0;
	
	private class PostResult {
		int code;
		String mess;
		InputStream in;
		Object jaxb;
	}

	private XSIConnectionImpl session;
	private boolean USE_SSL;
	private boolean USE_CONTENT_TYPE = false;
	private String      encoding;
	private ConnectionState state;
	private String      channelSetId;
	private String      channelID;
	private InputStream in;
	private Collection<EventChannelListener> allListener;
	private List<String> cached = new ArrayList<String>();
	private Thread      thread;
	private Timer        heartbeat;
	private Map<String, SubscriptionImpl> subscriptionsByID;
	private boolean     notClosed;

	//-----------------------------------------------------------------
	public EventChannelImpl(XSIConnectionImpl sess, String channelName, boolean useSSL, String encoding, boolean useCType) throws IOException {
		this.session = sess;
		this.channelSetId = channelName;
		this.USE_SSL = useSSL;
		this.encoding= encoding;
		this.USE_CONTENT_TYPE = useCType;
		allListener  = new ArrayList<EventChannelListener>();
		subscriptionsByID = new HashMap<String, SubscriptionImpl>();

		logger.debug("Setup XSI event channel to "+sess+" using SSL="+USE_SSL);
		sendSetupRequest();

		logger.info("Channel "+channelID+" from set "+channelSetId+" created");

		int id = ++count;
		notClosed = true;
		thread = new Thread(this, "EventsChannel-"+id+"/"+channelName);
		thread.setDaemon(false);
		thread.start();
		
		heartbeat = new Timer("XSIEventChannelHeartbeat-"+id, true);
		heartbeat.scheduleAtFixedRate(new TimerTask(){
			public void run() {
				try {
					sendChannelHeartbeat();
				} catch (Exception e) {
					heartbeat.cancel();
				}
			}}, 14000, 13000);
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.EventChannel#addListener(com.broadsoft.xsi.api.EventChannelListener)
	 */
	@Override
	public void addListener(EventChannelListener listener) {
		if (!allListener.contains(listener))
			allListener.add(listener);
	}

	//-----------------------------------------------------------------
	private void fireEvent(SubscriptionEvent event) {
		logger.trace("---fire event to "+allListener.size()+" listener");
		for (EventChannelListener tmp : allListener) {
			try {
				tmp.onXSIEvent(this, event);
			} catch (Exception e) {
				logger.error("Error delivering XSI event on listener "+tmp.getClass(),e);
			}
		}
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.XSIConnection#getState()
	 */
	@Override
	public ConnectionState getState() {
		return state;
	}

	//-----------------------------------------------------------------
	void setState(ConnectionState newState) {
		if (newState==state)
			return;
		logger.info("States changed from "+state+" to "+newState);
//		try {
//			throw new RuntimeException("Trace");
//		} catch (Exception e) {
//			logger.error("Why?",e);
//		}
		state = newState;
		for (EventChannelListener callback : allListener) {
			try {
				callback.channelStateChanged(this, newState);
			} catch (Exception e) {
				logger.error("Error calling callback: "+e,e);
			}
		}
	}

	//-----------------------------------------------------------------
	private PostResult sendPost(URL url, String xml) throws IOException {
		logger.debug("POST "+url+"\n"+xml);
		byte[] data = xml.getBytes(encoding);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setDoOutput(true);
		con.setDoInput(true);
		con.setRequestProperty("Accept", "text/xml");
		con.setRequestProperty("Content-Type", "text/xml; charset="+encoding);
		con.setRequestProperty("Content-Length", "" + data);
		Authenticator.setDefault(new Authenticator(){
			protected PasswordAuthentication getPasswordAuthentication() {
				logger.trace("Auth(sendPost): "+session.getUser()+"  / "+session.getPass());
				return new PasswordAuthentication (session.getUser(), session.getPass().toCharArray());
			}
		});
		con.setRequestMethod("POST");
		con.setInstanceFollowRedirects(false);
		//Send request
		logger.debug("Query: "+url);
		DataOutputStream out = new DataOutputStream(con.getOutputStream ());
		out.write(data);
		out.flush ();
		con.connect();


		PostResult ret = new PostResult();
		ret.code = con.getResponseCode();
		ret.mess = con.getResponseMessage();
		logger.debug("Response was "+ret.code+" "+ret.mess);
		if (ret.code==HttpURLConnection.HTTP_MOVED_TEMP) {
			logger.debug("Redirected to "+ con.getHeaderField("Location"));
			return sendPost(new URL(con.getHeaderField("Location")), xml);
		}
		
		if (ret.code==200)
			ret.in = con.getInputStream();
		else {
			ret.in = con.getErrorStream();
			if (ret.in==null) {
				logger.warn("HTTP Error: "+con.getResponseCode()+" "+con.getResponseMessage());
				return ret;
			}
		}

//		logger.debug("Response received: "+con.getContentType());
		String toParse = waitForNextResponse(ret.in);

		if (con.getContentType().startsWith("application/xml")) {
			try {
				logger.info("RCV "+toParse);
				//				logger.fatal("Stop here");
				//				System.exit(0);
				ret.jaxb = XSIDriver.unmarshall(toParse);
			} catch (JAXBException e) {
				logger.error("Failed unmarshalling: \""+toParse+"\"",e);
				throw new IOException(e);
			}
		}

		logger.trace("sendPost done");
		return ret;
	}

	//-----------------------------------------------------------------
	private PostResult sendDelete(URL url, String xml) throws IOException {
		logger.debug("DELETE "+url+"\n"+xml);
		byte[] data = xml.getBytes(encoding);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setDoOutput(true);
		con.setDoInput(true);
		//		con.setRequestProperty("Accept", "application/json");
		con.setRequestProperty("Accept", "text/xml");
		con.setRequestProperty("Content-Type", "text/xml; charset="+encoding);
		con.setRequestProperty("Content-Length", "" + data);
		Authenticator.setDefault(new Authenticator(){
			protected PasswordAuthentication getPasswordAuthentication() {
				logger.trace("Auth(sendDELETE): "+session.getUser()+"  / "+session.getPass());
				return new PasswordAuthentication (session.getUser(), session.getPass().toCharArray());
			}
		});
		con.setRequestMethod("DELETE"); 
		//Send request
		con.connect();
		logger.debug("Request sent");

		PostResult ret = new PostResult();
		ret.code = con.getResponseCode();
		ret.mess = con.getResponseMessage();
		logger.debug("Response was "+ret.code+" "+ret.mess);
		if (ret.code==200)
			ret.in = con.getInputStream();
		else {
			ret.in = con.getErrorStream();
			if (ret.in==null) {
				logger.warn("HTTP Error: "+con.getResponseCode()+" "+con.getResponseMessage());
				return ret;
			}
		}

		return ret;
	}

	//-----------------------------------------------------------------
	private PostResult sendPostDontWait(URL url, String xml) throws IOException {
		logger.debug("POST "+url+"\n"+xml);
		byte[] data = xml.getBytes(encoding);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setDoOutput(true);
		con.setRequestProperty("Accept", "application/json");
		con.setRequestProperty("Content-Type", "text/xml; charset="+encoding);
		con.setRequestProperty("Content-Length", "" + data);
		con.setInstanceFollowRedirects(false);
		Authenticator.setDefault(new Authenticator(){
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication (session.getUser(), session.getPass().toCharArray());
			}
		});
		con.setRequestMethod("POST"); 
		//Send request
		DataOutputStream out = new DataOutputStream(con.getOutputStream ());
		out.write(data);
		out.flush ();
		con.connect();
		logger.trace("Request sent");

		PostResult ret = new PostResult();
		ret.code = con.getResponseCode();
		ret.mess = con.getResponseMessage();
		logger.trace("Response was "+ret.code+" "+ret.mess);
		if (ret.code==200)
			ret.in = con.getInputStream();
		else if (ret.code==302) {
			return sendPostDontWait(new URL(con.getHeaderField("Location")), xml);
		} else
			ret.in = con.getErrorStream();


		return ret;
	}

	//-----------------------------------------------------------------
	private String waitForNextResponse(InputStream in) throws IOException {
		logger.trace("waitForNextResponse");
		if (state==ConnectionState.DISCONNECTED) {
			logger.warn("Cannot wait for events when channel is "+state);
			throw new IllegalStateException("Cannot wait for events when channel is "+state);
		}
		if (in==null)
			throw new NullPointerException("InputStream is not set");

		if (!cached.isEmpty()) {
			String content = cached.remove(0);
			logger.info("Read from cache: "+content);
			return content;
		}

		byte[] buf = new byte[16384];
		int read = 0;
		int pos2 = 0;
		do {
			read = in.read(buf, pos2, buf.length-pos2);
			if (read==-1) {
				if (state==ConnectionState.DISCONNECTED) {
					logger.debug("EventChannel closed");
					return null;
				}
				logger.error("Connection closed by foreign host");
				heartbeat.cancel();
				heartbeat.purge();
				setState(ConnectionState.CONNECTION_LOST);
				throw new IOException("Connection closed by foreign host");
			}
			pos2+=read;
			logger.trace("read="+read+"  pos2="+pos2);
		} while (read>0 && pos2<=32);

		String content = new String(buf,0,pos2);
		// Tokenize
		int pos=0;
		do {
			int newPos = content.indexOf("<?xml", pos+1);
			if (newPos==-1) {
				String line = content.substring(pos);
				//				logger.info("Last Substring "+line);
				cached.add(line);
				break;
			} else {
				String line = content.substring(pos, newPos);
				//				logger.info("Mid  Substring "+line);
				cached.add(line);
				pos = newPos;
			}
		} while (true);

		content = cached.remove(0);
		return content;
	}

	//-----------------------------------------------------------------
	private void sendSetupRequest() throws IOException {
		setState(ConnectionState.CONNECTING);
		Channel channel = new Channel();
		channel.setChannelSetId(channelSetId);
		channel.setPriority(1);;
		channel.setWeight(50);
		channel.setExpires(3600);
		StringWriter foo = new StringWriter();
		try {
			JAXBElement<Channel> toEncode = new JAXBElement<Channel>(
							new QName("http://schema.broadsoft.com/xsi","Channel"),
							Channel.class,channel);

			XSIDriver.marshall(toEncode, foo);
		} catch (Exception e) {
			logger.error("Marshalling failed for "+channel,e);
			throw new IOException("Marshalling failed");
		}

		URL url = new URL(String.format("http"+(USE_SSL?"s":"")+"://%s/com.broadsoft.async/com.broadsoft.xsi-events/v2.0/channel", session.getHostport()));
		String xml = foo.toString();

		PostResult result = sendPost(url, xml);
		this.in = result.in;
		//		JSONObject json = result.json;

		if (result.code==200) {
			Channel confChannel = (Channel)result.jaxb;
			channelID = confChannel.getChannelId();
			//			logger.debug("json = "+json);
			//			logger.debug("mess = "+result.mess);
			//			channelID = (String) ((JSONObject)((JSONObject)json.get("Channel")).get("channelId")).get("$");
			logger.debug("channelID = "+channelID);
			setState(ConnectionState.CONNECTED);
		} else if (result.code==401) {
			logger.warn("HTTP Error: "+result.code+" "+result.mess);
			setState(ConnectionState.ERROR_INVALID_CREDENTIALS);
			throw new IOException("HTTP Error: "+result.code+" "+result.mess);			
		} else if (result.code==503) {
			logger.warn("HTTP Error: "+result.code+" "+result.mess);
			setState(ConnectionState.ERROR_CONNECTION_PROBLEMS);
			throw new IOException("HTTP Error: "+result.code+" "+result.mess);			
		} else if (result.jaxb==null) {
			throw new IOException("HTTP Error: "+result.code+" "+result.mess);
		} else {
			ErrorInfo error = (ErrorInfo)result.jaxb;
			String  mess = error.getSummaryEnglish();
			Integer code = error.getErrorCode();
			throw new XSIException(mess, code);
		}
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.EventChannel#close()
	 */
	@Override
	public void close() throws IOException {
		logger.info("Close event channel '"+channelSetId+"'");
		notClosed = true;

		// Stop threads and timer
		logger.debug("Cancelling heartbeat");
		heartbeat.cancel();
		heartbeat.purge();
		thread.interrupt();
		if (state!=ConnectionState.CONNECTED) {
			setState(ConnectionState.DISCONNECTED);
			return;
		}
		
		URL url = new URL(String.format("http"+(USE_SSL?"s":"")+"://%s/com.broadsoft.async/com.broadsoft.xsi-events/v2.0/channel/%s", session.getHostport(), channelID));

		PostResult result = sendDelete(url, "");
		setState(ConnectionState.DISCONNECTED);
		//		JSONObject json = result.json;

		if (result.code==200) {
			logger.debug("EventChannel closed");
		} else if (result.jaxb==null) {
			throw new IOException("HTTP Error: "+result.code+" "+result.mess);
		} else {
			ErrorInfo error = (ErrorInfo)result.jaxb;
			String  mess = error.getSummaryEnglish();
			Integer code = error.getErrorCode();
			throw new XSIException(mess, code);
		}
	}

	//-----------------------------------------------------------------
	private void sendEventResponse(String eventID) throws IOException {
		logger.debug("sendEventResponse("+eventID+")");
		URL url = new URL(String.format("http"+(USE_SSL?"s":"")+"://%s/com.broadsoft.xsi-events/v2.0/channel/eventresponse", session.getHostport()));
		String xml = "<?xml version=\"1.0\" encoding=\""+encoding+"\"?>\n"+
				"<EventResponse xmlns=\"http://schema.broadsoft.com/xsi\">\n"+
				"<eventID>"+eventID+"</eventID><statusCode>200</statusCode><reason>OK</reason></EventResponse>";

		PostResult result = sendPostDontWait(url, xml);
		if (result.code==200) {
			logger.debug("Event "+eventID+" confirmed");
		} else {
			logger.error("Event "+eventID+" could not be confirmed: "+result.code+" "+result.mess);
			System.exit(0);
		}
	}

	//-----------------------------------------------------------------
	public static String getTextValue(Document doc, String xpath) {
		XPath xPath = XPathFactory.newInstance().newXPath();
		try {
			Node nodes = (Node)xPath.evaluate(xpath,
					doc.getDocumentElement(), XPathConstants.NODE);
			if (nodes==null)
				return null;
			return nodes.getNodeValue();
		} catch (XPathExpressionException e) {
			logger.error("XPath "+xpath+" error: "+e.getCause());
			System.exit(0);
		}
		return null;
	}

//	//-----------------------------------------------------------------
//	private void processSubscriptionEvent(SubscriptionEvent event) {
//		logger.debug("processSubscriptionEvent "+event);
//		//		logger.info("I subscribed to events from "+event.getTargetId());
//		//		String subscribedUser = event.getTargetId();
//		//		EventData data = event.getEventData();
//
//		fireEvent(event);
//	}

	//-----------------------------------------------------------------
	/**
	 * @return TRUE, if channel may stay alive
	 */
	private boolean parseEvent(String content) throws SAXException, IOException {
		try {
			BaseEvent event = (BaseEvent) XSIDriver.unmarshall(content);
			logger.debug("rcv2 "+event);
			return processEvent(event);
		} catch (JAXBException e) {
			logger.error("Error unmarshalling XML event from server: "+e,e);
			logger.error("Content ( ugly ) was: "+content);
			processEvent(null);
			return true;
		}
	}

	//-----------------------------------------------------------------
	/**
	 * @return TRUE, if channel may stay alive
	 */
	private boolean processEvent(BaseEvent event) throws IOException {
		if (event instanceof SubscriptionEvent) {
			SubscriptionEvent subEv = (SubscriptionEvent)event;
			sendEventResponse(subEv.getEventID());
			// 
			logger.info("Received subscribed event: "+subEv.getEventData().getClass());
			fireEvent((SubscriptionEvent)event);
		} else if (event instanceof ChannelTerminatedEvent) {
			ChannelTerminatedEvent termEv = (ChannelTerminatedEvent)event;
			logger.error("XSI event channel closed by foreign host. Reason = "+termEv.getReason());
			return false;
		} else {
			logger.error("Unknown event "+event);
		}

		return true;
	}

	//-----------------------------------------------------------------
	/**
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		try {
			while (notClosed) {
				logger.trace("Waiting for events  "+DateFormat.getTimeInstance().format(new Date(System.currentTimeMillis())));

				String read = waitForNextResponse(in);
				if (read==null) {
					if (state==ConnectionState.DISCONNECTED) {
						logger.debug("Stopped waiting for channel data");
						return;
					}
					logger.warn("Lost event channel connection. Closed by remote host.");
					setState(ConnectionState.CONNECTION_LOST);
					return;
				}
				if (read.contains("ChannelHeartBeat")) {
					logger.trace("RCV: Heartbeat");
					continue;
				}
				logger.debug("RCV: "+read);
				boolean stayAlive = parseEvent(read);

				if (!stayAlive) {
					logger.error("Channel terminated");
					setState(ConnectionState.CONNECTION_LOST);
//					heartbeat.cancel();
					return;
				}
			}
		} catch (Exception e) {
			logger.error("Exception reading from channel: "+e,e);
			logger.error("Channel terminated");
			setState(ConnectionState.DISCONNECTED);
			return;
		}
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.EventChannel#getSetId()
	 */
	@Override
	public String getSetId() {
		return channelSetId;
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.EventChannel#getChannelID()
	 */
	@Override
	public String getChannelID() {
		return channelID;
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.EventChannel#getConnection()
	 */
	@Override
	public XSIConnectionImpl getConnection() {
		return session;
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.EventChannel#subscribe(java.lang.String, java.lang.String)
	 */
	@Override
	public Subscription subscribe(String eventPackage, String applicationId) throws IOException {
		if (subscriptionsByID.containsKey(eventPackage))
			throw new IllegalStateException();
		
		logger.info("Subscribe "+eventPackage);
		String subURL = String.format("user/%s/subscription", session.getUser());
		String xml = "<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>\n"+
				"<Subscription xmlns=\"http://schema.broadsoft.com/xsi\">\n"+
				"  <event>"+eventPackage+"</event>\n"+
				"  <expires>3600</expires>\n"+
				"  <channelSetId>"+channelSetId+"</channelSetId>\n"+
				"  <applicationId>"+applicationId+"</applicationId>\n"+
				"</Subscription>";
		byte[] data = xml.getBytes("iso-8859-1");

		com.broadsoft.xsi.Subscription result = (com.broadsoft.xsi.Subscription) session.eventsPOSTQuery(subURL, data);
		logger.debug("Result = "+result);
		if (result==null) {
			logger.error("Missing expected Subscription data after subscribing - cannot determine subscription ID");
//			return new SubscriptionImpl(null, session.getUser(), eventPackage);
			throw new IOException("Missing expected Subscription data after subscribing - cannot determine subscription ID");
		}
		
		SubscriptionImpl ret = new SubscriptionImpl(result.getSubscriptionId(), session.getUser(), eventPackage);
		subscriptionsByID.put(result.getSubscriptionId(), ret);
		
		return ret;
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.EventChannel#subscribe(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public Subscription subscribe(String user, String eventPackage, String applicationId) throws IOException {
		if (subscriptionsByID.containsKey(eventPackage))
			throw new IllegalStateException();
		
		logger.info("Subscribe "+eventPackage+" for "+user);
		String subURL = String.format("user/%s/subscription", user);
		String xml = "<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>\n"+
				"<Subscription xmlns=\"http://schema.broadsoft.com/xsi\">\n"+
				"  <event>"+eventPackage+"</event>\n"+
				"  <expires>3600</expires>\n"+
				"  <channelSetId>"+channelSetId+"</channelSetId>\n"+
				"  <applicationId>"+applicationId+"</applicationId>\n"+
				"</Subscription>";
		byte[] data = xml.getBytes("iso-8859-1");

		com.broadsoft.xsi.Subscription result = (com.broadsoft.xsi.Subscription) session.eventsPOSTQuery(subURL, data);
		logger.debug("Result = "+result);

		SubscriptionImpl ret = new SubscriptionImpl(result.getSubscriptionId(), user, eventPackage);
		subscriptionsByID.put(result.getSubscriptionId(), ret);
		return ret;
	}
	
	//-----------------------------------------------------------------
	private void sendChannelHeartbeat() {
		logger.debug("sendChannelHeartbeat  "+DateFormat.getTimeInstance().format(new Date(System.currentTimeMillis())));
		if (state!=ConnectionState.CONNECTED) {
			logger.warn("Still keep trying to send channel heartbeats, although channel not connected ("+state+")");
			throw new IllegalStateException("Channel is in state "+state);
		}
		
		try {
			URL url = new URL(String.format("http"+(USE_SSL?"s":"")+"://%s/com.broadsoft.xsi-events/v2.0/channel/%s/heartbeat", session.getHostport(), channelID));
			logger.trace("Query "+url);
			String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+
					"<ChannelHeartbeat xmlns=\"http://schema.broadsoft.com/xsi\" />";
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setDoOutput(false);
			con.setRequestProperty("Accept", "application/json");
			if (USE_CONTENT_TYPE)
				con.setRequestProperty("Content-Type:", "text/xml;charset=UTF-8");
			con.setRequestProperty("Content-Length", "" + Integer.toString(xml.getBytes().length));
			con.setRequestMethod("PUT"); 
			//Send request
			logger.trace("Heartbeat: "+con.getResponseCode()+" "+con.getResponseMessage());
			
			try {
				int code = con.getResponseCode();
				if (code==200) {
					logger.debug("Heartbeat ok: ");
				} else if (code==404) {
					waitForNextResponse(con.getErrorStream());
					logger.warn("Heartbeat failed - unknown channel or channel closed");
					close();
//					heartbeat.cancel();
//					setState(ConnectionState.DISCONNECTED);
				} else {
					String resp = waitForNextResponse(con.getErrorStream());
					logger.info("Heartbeat failed with code "+code+": "+resp);
					close();
//					heartbeat.cancel();
//					setState(ConnectionState.DISCONNECTED);
				}
				con.disconnect();
			} catch (SSLException e) {
				logger.error("Channel heartbeat failed due SSLException: "+e.getMessage()+"  ... one retry");
				int code = con.getResponseCode();
				if (code==200) {
					logger.trace("Heartbeat ok: ");
				} else if (code==404) {
					waitForNextResponse(con.getErrorStream());
					logger.warn("Heartbeat failed - unknown channel or channel closed");
					heartbeat.cancel();
				} else {
					String resp = waitForNextResponse(con.getErrorStream());
					logger.info("Heartbeat failed: "+resp);
					close();
//					heartbeat.cancel();
				}
				con.disconnect();
//				setState(ConnectionState.DISCONNECTED);
				close();
			}
		} catch (Exception e) {
			logger.error("Channel heartbeat failed: "+e,e);
			heartbeat.cancel();
			setState(ConnectionState.DISCONNECTED);
		}
	}


}
