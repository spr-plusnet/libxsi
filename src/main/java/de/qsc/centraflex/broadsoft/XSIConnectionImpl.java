/**
 * 
 */
package de.qsc.centraflex.broadsoft;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Authenticator;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

import javax.xml.bind.JAXBException;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import com.broadsoft.xsi.api.EventChannel;
import com.broadsoft.xsi.api.EventChannelListener;
import com.broadsoft.xsi.api.InvalidCredentialsException;
import com.broadsoft.xsi.api.OperationNotAllowedException;
import com.broadsoft.xsi.api.XSIConnection;
import com.broadsoft.xsi.api.service.BusyLampFieldService;
import com.broadsoft.xsi.api.service.CallRecordingService;
import com.broadsoft.xsi.api.service.CollaborateService;
import com.broadsoft.xsi.api.service.ProfileService;
import com.broadsoft.xsi.api.service.RemoteOfficeService;
import com.broadsoft.xsi.api.service.Service;
import com.broadsoft.xsi.api.service.ServiceType;
import com.broadsoft.xsi.api.service.ServicesService;

/**
 * @author prelle
 *
 */
public class XSIConnectionImpl implements XSIConnection {

	private final static Logger logger = LogManager.getLogger("xsi.actions");
	
	private String hostport;
	private String user;
	private String pass;
	private boolean useSSL;
	private boolean useCType;
	private String encoding;
	private Properties config;
	
	private Map<String, EventChannelImpl> eventChannelByName;
	private Map<ServiceType, Service<?>> services; 

	//-----------------------------------------------------------------
	/**
	 * @throws IOException 
	 */
	public XSIConnectionImpl(Properties config) throws IOException {
		eventChannelByName = new HashMap<String, EventChannelImpl>();
		this.config   = config;
		try {
			if (!config.containsKey(XSIDriver.PROP_XSI_APPNAME)) {
				config.put(XSIDriver.PROP_XSI_APPNAME, "libxsi run by "+System.getProperty("user.name")+" using Java "+System.getProperty("java.version")+" on "+InetAddress.getLocalHost().getHostAddress());
			}
		} catch (IOException e) {
		}

		// Add eventually necessary config properties
		encoding = config.getProperty(XSIDriver.PROP_XSI_ENCODING,"UTF-8");
		useSSL   = Boolean.parseBoolean(config.getProperty(XSIDriver.PROP_XSI_USESSL,"true"));
		useCType = Boolean.parseBoolean(config.getProperty(XSIDriver.PROP_XSI_USECTYPE,"false"));

		hostport = config.getProperty(XSIDriver.PROP_XSI_SERVER);
		if (hostport==null) 
			throw new IllegalArgumentException("Missing property "+XSIDriver.PROP_XSI_SERVER+" in configuration");

		user = config.getProperty(XSIDriver.PROP_XSI_USER);
		pass = config.getProperty(XSIDriver.PROP_XSI_PASS);
		if (user==null) 
			throw new IllegalArgumentException("Missing property "+XSIDriver.PROP_XSI_USER+" in configuration");
		if (pass==null) 
			throw new IllegalArgumentException("Missing property "+XSIDriver.PROP_XSI_PASS+" in configuration");
		
		/*
		 * Init services
		 */
		services = new HashMap<>();
		services.put(ServiceType.BLF, new BusyLampFieldService(this));
		services.put(ServiceType.CALL_RECORDING, new CallRecordingService(this));
		services.put(ServiceType.COLLABORATE, new CollaborateService(this));
		services.put(ServiceType.PROFILE, new ProfileService(this));
		services.put(ServiceType.REMOTE_OFFICE, new RemoteOfficeService(this));
		services.put(ServiceType.SERVICES, new ServicesService(this));
		
		logger.debug("XSIConnection("+config+") called");
	}

	//-----------------------------------------------------------------
	/**
	 * @return the hostport
	 */
	public String getHostport() {
		return hostport;
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.XSIConnection#getUser()
	 */
	@Override
	public String getUser() {
		return user;
	}

	//-----------------------------------------------------------------
	/**
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}

	//-----------------------------------------------------------------
	/**
	 * @return the config
	 */
	public Properties getConfig() {
		return config;
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.XSIConnection#actionGETQuery(java.lang.String)
	 */
	@Override
	public Object actionGETQuery(String subURL) throws IOException {

		try {
			URL url = new URL(String.format("http"+(useSSL?"s":"")+"://%s/com.broadsoft.xsi-actions/v2.0/%s", hostport, subURL));
			logger.info("GET "+url);

			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestProperty("Charset", encoding);
			con.setRequestProperty("Accept-Charset", encoding);
			if (config.containsKey(XSIDriver.PROP_XSI_APPNAME)) 
				con.setRequestProperty("User-Agent", (String)config.getProperty(XSIDriver.PROP_XSI_APPNAME));
			
			Authenticator.setDefault(new Authenticator(){
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication (user, pass.toCharArray());
				}
			});
			con.setRequestMethod("GET"); 

			logger.debug("Connected: "+con.getResponseCode()+" "+con.getResponseMessage());
			switch (con.getResponseCode()) {
			case 200:
				InputStream in = con.getInputStream();
				logger.debug("Currently "+in.available()+" bytes available");
				
				/*
				 * Sometimes data returns with a content length header,
				 * sometimes with a "Transfer-Encoding: chunked"
				 * The following code works in both cases.
				 */
				ReadableByteChannel channel = Channels.newChannel(in);

				// content length is not known upfront, hence a initial size
				int bufferLength = 2048;

				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				ByteBuffer byteBuffer = ByteBuffer.allocate(bufferLength);

				int numRead = 0;
				int readTotal = 0;
				while (numRead >= 0) {
					byteBuffer.rewind();
					//Read bytes from the channel
					numRead = channel.read(byteBuffer);
					byteBuffer.rewind();
					logger.trace(" Read "+numRead);
					if (numRead > 0) {
						readTotal += numRead;
						byte[] dataBytes = byteBuffer.array();
						baos.write(dataBytes, 0, numRead);
						logger.debug("** "+new String(dataBytes,0, numRead));
					}
//					try { Thread.sleep(20); } catch (Exception e) {}
					byteBuffer.clear();
				}

				String rcvEncoding = con.getContentEncoding();
				int index = con.getContentType().indexOf("charset=");
				if (index>0)
					rcvEncoding = con.getContentType().substring(index+8, con.getContentType().length());
				
				// Copy to string

				logger.debug("Read "+readTotal+" bytes as "+rcvEncoding+" (probably "+baos.size()+")");
				byte[] mess = new byte[readTotal];
				System.arraycopy(baos.toByteArray(), 0, mess, 0, readTotal);
				String message = new String(mess, rcvEncoding);
				logger.debug(message);

				try {
					return XSIDriver.unmarshall(message);
				} catch (JAXBException e) {
					logger.error("Error unmarshalling server response: "+e);
					logger.error("Message was:\n"+message);
					con.disconnect();
					throw new IOException("Error unmarshalling server response: "+e);
				}
			case 401:
				throw new InvalidCredentialsException("Unauthorized. Server replied "+con.getResponseMessage());
			case 403: // Forbidden
				throw new OperationNotAllowedException("Operation not allowed. Server replied: "+con.getResponseMessage());
			default:
				logger.warn("Unexpected response contacting Broadsoft server: "+con.getResponseCode()+" "+con.getResponseMessage()+"\nRequest was: GET "+url);
			}

			con.disconnect();
		} catch (MalformedURLException e) {
			logger.error("Malformed URL - url was "+subURL);
		} catch (IOException e) {
			logger.error("Exception making GET request: "+e);
			throw e;
		} 

		return null;
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.XSIConnection#actionPUTQuery(java.lang.String, byte[])
	 */
	@Override
	public Object actionPUTQuery(String subURL, byte[] data) throws IOException {

		try {
			URL url = new URL(String.format("http"+(useSSL?"s":"")+"://%s/com.broadsoft.xsi-actions/v2.0/%s", hostport, subURL));
			logger.debug("PUT "+url+"\n"+(new String(data)));

			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestProperty("Charset", encoding);
			if (!config.containsKey(XSIDriver.PROP_XSI_APPNAME)) 
				con.setRequestProperty("User-Agent", (String)config.getProperty(XSIDriver.PROP_XSI_APPNAME));
			
			Authenticator.setDefault(new Authenticator(){
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication (user, pass.toCharArray());
				}
			});
			con.setDoInput(true);
			con.setRequestProperty("Accept", "application/xml");
			con.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");
			con.setRequestProperty("Content-Length", "" +data.length);
			con.setRequestMethod("PUT"); 

			//Send request
			if (data!=null && data.length>0) {
				con.setDoOutput(true);
				DataOutputStream out = new DataOutputStream(con.getOutputStream ());
				out.write(data);
				out.flush ();
			}
			
			con.connect();

			logger.debug("Connected: "+con.getResponseCode()+" "+con.getResponseMessage());
			switch (con.getResponseCode()) {
			case 200:
			case 201:
				if (con.getInputStream().available()<=0)
					return null;
				byte[] mess = new byte[con.getInputStream().available()];
				con.getInputStream().read(mess);
				String message = new String(mess);
				logger.debug(message);

				try {
					return XSIDriver.unmarshall(message);
				} catch (JAXBException e) {
					logger.error("Error unmarshalling server response: "+e);
				}
				break;
			case 401:
				throw new InvalidCredentialsException("Unauthorized. Server replied "+con.getResponseMessage());
			case 403: // Forbidden
				throw new OperationNotAllowedException("Operation not allowed. Server replied: "+con.getResponseMessage());
			default:
				logger.warn("Unexpected response contacting Broadsoft server: "+con.getResponseCode()+" "+con.getResponseMessage());
				throw new IOException("Unexpected response contacting Broadsoft server: "+con.getResponseCode()+" "+con.getResponseMessage());
			}

			con.disconnect();
		} catch (MalformedURLException e) {
			logger.error("Malformed URL - url was "+subURL);
		} catch (IOException e) {
			logger.error("Exception making GET request: "+e);
			throw e;
		} 

		return null;
	}
	
	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.XSIConnection#actionPUTQuery(java.lang.String, java.lang.Object)
	 */
	@Override
	public Object actionPUTQuery(String subURL, Object toEncode) throws IOException {
		ByteArrayOutputStream outBS = new ByteArrayOutputStream();
		OutputStreamWriter out = new OutputStreamWriter(outBS, Charset.forName("UTF-8"));
		try {
			XSIDriver.marshall(toEncode, out);
			out.close();
			return actionPUTQuery(subURL, outBS.toByteArray());
		} catch (JAXBException e) {
			throw new IOException("Problem marshalling "+toEncode,e);
		}
	}

	public static String streamToString(InputStream is) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader rd = new BufferedReader(new InputStreamReader(is));
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        return sb.toString();
    }
	
	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.XSIConnection#eventsPOSTQuery(java.lang.String)
	 */
	@Override
	public Object eventsPOSTQuery(String subURL, byte[] data) throws IOException {

		try {
			URL url = new URL(String.format("http"+(useSSL?"s":"")+"://%s/com.broadsoft.xsi-events/v2.0/%s", hostport, subURL));
			logger.debug("POST "+url+"\n"+(new String(data)));

			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestProperty("Charset", encoding);
			if (config.containsKey(XSIDriver.PROP_XSI_APPNAME)) 
				con.setRequestProperty("User-Agent", (String)config.getProperty(XSIDriver.PROP_XSI_APPNAME));
			
			Authenticator.setDefault(new Authenticator(){
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication (user, pass.toCharArray());
				}
			});
			con.setDoOutput(true);
			con.setDoInput(true);
			con.setRequestProperty("Accept", "application/xml");
			con.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");
			con.setRequestProperty("Content-Length", "" +data.length);
			con.setRequestMethod("POST"); 
			con.setInstanceFollowRedirects(false);

			//Send request
			DataOutputStream out = new DataOutputStream(con.getOutputStream ());
			out.write(data);
			out.flush ();
			
			con.connect();

			logger.debug("Connected: "+con.getResponseCode()+" "+con.getResponseMessage());
			if (con.getResponseCode()==HttpURLConnection.HTTP_MOVED_TEMP) {
				logger.debug("Redirected to "+ con.getHeaderField("Location"));
				
				out.close();
				url = new URL(con.getHeaderField("Location"));
				logger.debug("POST "+url+"\n"+(new String(data)));
				
				con = (HttpURLConnection) url.openConnection();
				con.setRequestProperty("Charset", encoding);
				if (config.containsKey(XSIDriver.PROP_XSI_APPNAME)) 
					con.setRequestProperty("User-Agent", (String)config.getProperty(XSIDriver.PROP_XSI_APPNAME));
				
				Authenticator.setDefault(new Authenticator(){
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication (user, pass.toCharArray());
					}
				});
				con.setDoOutput(true);
				con.setDoInput(true);
				con.setRequestProperty("Accept", "application/xml");
				con.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");
				con.setRequestProperty("Content-Length", "" +data.length);
				con.setRequestMethod("POST"); 

				//Send request
				out = new DataOutputStream(con.getOutputStream ());
				out.write(data);
				out.flush ();
				
				con.connect();
			}

			switch (con.getResponseCode()) {
			case 200:
				byte[] mess = new byte[con.getInputStream().available()];
//				con.getInputStream().read(mess);
				String message = streamToString(con.getInputStream());
				logger.debug("RCV: "+message);
				if (message.isEmpty()) {
					logger.warn("Empty response received");
					return null;
				}

				try {
					return XSIDriver.unmarshall(message);
				} catch (JAXBException e) {
					logger.error("Error unmarshalling server response: "+e);
				}
				break;
			case 401:
				throw new InvalidCredentialsException("Unauthorized. Server replied "+con.getResponseMessage());
			case 403: // Forbidden
				throw new OperationNotAllowedException("Operation not allowed. Server replied: "+con.getResponseMessage());
			default:
				logger.warn("Unexpected response contacting Broadsoft server: "+con.getResponseCode()+" "+con.getResponseMessage());
				throw new IOException("Unexpected response contacting Broadsoft server: "+con.getResponseCode()+" "+con.getResponseMessage());
			}

			con.disconnect();
		} catch (MalformedURLException e) {
			logger.error("Malformed URL - url was "+subURL);
		} catch (IOException e) {
			logger.error("Exception making GET request: "+e);
			throw e;
		} 

		return null;
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.XSIConnection#actionPOSTQuery(java.lang.String, java.lang.Object)
	 */
	@Override
	public Object actionPOSTQuery(String subURL, Object toEncode) throws IOException {
		ByteArrayOutputStream outBS = new ByteArrayOutputStream();
		OutputStreamWriter out = new OutputStreamWriter(outBS, Charset.forName("UTF-8"));
		try {
			XSIDriver.marshall(toEncode, out);
			out.close();
			return actionPOSTQuery(subURL, outBS.toByteArray());
		} catch (JAXBException e) {
			throw new IOException("Problem marshalling "+toEncode,e);
		}
		
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.XSIConnection#eventsPOSTQuery(java.lang.String)
	 */
	@Override
	public Object actionPOSTQuery(String subURL, byte[] data) throws IOException {

		try {
			URL url = new URL(String.format("http://%s/com.broadsoft.xsi-actions/v2.0/%s", hostport, subURL));
			logger.info("Query "+url+"\n"+(new String(data)));
			logger.debug("POST "+url);

			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestProperty("Charset", encoding);
			con.setRequestProperty("Accept-Charset", encoding);
			if (config.containsKey(XSIDriver.PROP_XSI_APPNAME)) 
				con.setRequestProperty("User-Agent", (String)config.getProperty(XSIDriver.PROP_XSI_APPNAME));
			
			Authenticator.setDefault(new Authenticator(){
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication (user, pass.toCharArray());
				}
			});
			con.setDoOutput(true);
			con.setDoInput(true);
			con.setRequestProperty("Accept", "application/xml");
			con.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");
			con.setRequestProperty("Content-Length", "" +data.length);
			con.setRequestMethod("POST"); 

			//Send request
			DataOutputStream out = new DataOutputStream(con.getOutputStream ());
			out.write(data);
			out.flush ();
			
			con.connect();

			logger.debug("Connected: "+con.getResponseCode()+" "+con.getResponseMessage());
			switch (con.getResponseCode()) {
			case 200:
			case 201:
				byte[] mess = new byte[con.getInputStream().available()];
				con.getInputStream().read(mess);
				String message = new String(mess);
				logger.debug(message);

				try {
					return XSIDriver.unmarshall(message);
				} catch (JAXBException e) {
					logger.error("Error unmarshalling server response: "+e);
				}
				break;
			case 401:
				throw new InvalidCredentialsException("Unauthorized. Server replied "+con.getResponseMessage());
			case 403: // Forbidden
				throw new OperationNotAllowedException("Operation not allowed. Server replied: "+con.getResponseMessage());
			default:
				logger.warn("Unexpected response contacting Broadsoft server: "+con.getResponseCode()+" "+con.getResponseMessage());
				throw new IOException("Unexpected response contacting Broadsoft server: "+con.getResponseCode()+" "+con.getResponseMessage());
			}

			con.disconnect();
		} catch (MalformedURLException e) {
			logger.error("Malformed URL - url was "+subURL);
		} catch (IOException e) {
			logger.error("Exception making GET request: "+e);
			throw e;
		} 

		return null;
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.XSIConnection#actionPOSTQuery(java.lang.String, java.lang.Object)
	 */
	@Override
	public Object actionDELETEQuery(String subURL, Object toEncode) throws IOException {
		ByteArrayOutputStream outBS = new ByteArrayOutputStream();
		OutputStreamWriter out = new OutputStreamWriter(outBS, Charset.forName("UTF-8"));
		try {
			XSIDriver.marshall(toEncode, out);
			out.close();
			return actionDELETEQuery(subURL, outBS.toByteArray());
		} catch (JAXBException e) {
			throw new IOException("Problem marshalling "+toEncode,e);
		}
		
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.XSIConnection#eventsPOSTQuery(java.lang.String)
	 */
	@Override
	public Object actionDELETEQuery(String subURL, byte[] data) throws IOException {

		try {
			URL url = new URL(String.format("http://%s/com.broadsoft.xsi-actions/v2.0/%s", hostport, subURL));
			logger.debug("Query "+url+"\n"+(new String(data)));
			logger.debug("DELETE "+url);

			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestProperty("Charset", encoding);
			if (config.containsKey(XSIDriver.PROP_XSI_APPNAME)) 
				con.setRequestProperty("User-Agent", (String)config.getProperty(XSIDriver.PROP_XSI_APPNAME));
			
			Authenticator.setDefault(new Authenticator(){
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication (user, pass.toCharArray());
				}
			});
			con.setDoOutput(true);
			con.setDoInput(true);
			con.setRequestProperty("Accept", "application/xml");
			con.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");
			con.setRequestProperty("Content-Length", "" +data.length);
			con.setRequestMethod("DELETE"); 

			//Send request
			DataOutputStream out = new DataOutputStream(con.getOutputStream ());
			out.write(data);
			out.flush ();
			
			con.connect();

			logger.debug("Connected: "+con.getResponseCode()+" "+con.getResponseMessage());
			switch (con.getResponseCode()) {
			case 200:
			case 201:
				byte[] mess = new byte[con.getInputStream().available()];
				con.getInputStream().read(mess);
				if (mess==null || mess.length==0)
					return null;
				String message = new String(mess);
				logger.debug(message);

				try {
					return XSIDriver.unmarshall(message);
				} catch (JAXBException e) {
					logger.error("Error unmarshalling server response: "+e);
				}
				break;
			case 401:
				throw new InvalidCredentialsException("Unauthorized. Server replied "+con.getResponseMessage());
			case 403: // Forbidden
				throw new OperationNotAllowedException("Operation not allowed. Server replied: "+con.getResponseMessage());
			default:
				logger.warn("Unexpected response contacting Broadsoft server: "+con.getResponseCode()+" "+con.getResponseMessage());
				throw new IOException("Unexpected response contacting Broadsoft server: "+con.getResponseCode()+" "+con.getResponseMessage());
			}

			con.disconnect();
		} catch (MalformedURLException e) {
			logger.error("Malformed URL - url was "+subURL);
		} catch (IOException e) {
			logger.error("Exception making GET request: "+e);
			throw e;
		} 

		return null;
	}


	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.XSIConnection#createEventChannel(java.lang.String)
	 */
	@Override
	public EventChannel createEventChannel(String name, EventChannelListener listener) throws IOException {
		logger.debug("createEventChannel("+name+")");
		// First set the default cookie manager.
		CookieHandler.setDefault(new CookieManager(null, CookiePolicy.ACCEPT_ALL));		

		EventChannelImpl channel = new EventChannelImpl(this, name, useSSL, encoding, useCType, listener);
		logger.debug("Channel created");
		
		logger.debug("Thread for channel started");
		return channel;
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.XSIConnection#close()
	 */
	@Override
	public void close() {
		for (EventChannelImpl channel : eventChannelByName.values()) {
			try {
				channel.close();
			} catch (IOException e) {
			}
		}
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.XSIConnection#getServices()
	 */
	@Override
	public Collection<Service<?>> getServices() {
		return services.values();
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.XSIConnection#getService(com.broadsoft.xsi.api.service.ServiceType)
	 */
	@Override
	public Service<?> getService(ServiceType type) {
		Service<?>  ret = services.get(type);
		if (ret==null)
			throw new NoSuchElementException("Service "+type);
		return ret;
	}

}
