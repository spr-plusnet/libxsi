package libxsi;

import java.io.IOException;
import java.util.Properties;

import com.broadsoft.xsi.CallReceivedEvent;
import com.broadsoft.xsi.SubscriptionEvent;
import com.broadsoft.xsi.api.ConnectionState;
import com.broadsoft.xsi.api.EventChannel;
import com.broadsoft.xsi.api.EventChannelListener;
import com.broadsoft.xsi.api.XSIConnection;

import de.qsc.centraflex.broadsoft.XSIDriver;

public class EventWaiter {

	//-----------------------------------------------------------------
	public static void main(String[] args) throws IOException {
		Properties config = new Properties();
		config.put(XSIDriver.PROP_XSI_SERVER, "web-b.bmcag.com");
//		config.put(XSIDriver.PROP_XSI_SERVER, "web3.bmcag.com");
//		config.put(XSIDriver.PROP_XSI_USER, "022149937093@qsc.de");
		config.put(XSIDriver.PROP_XSI_USER, "040668610764@qsc.de");
		config.put(XSIDriver.PROP_XSI_PASS, "<yourpass>");
		config.put(XSIDriver.PROP_XSI_USESSL, "true");
		
		XSIConnection xsi = XSIDriver.open(config);
		EventChannel channel = xsi.createEventChannel("myChannel",new EventChannelListener() {
			
			@Override
			public void channelStateChanged(EventChannel channel, ConnectionState state) {
				System.out.println(state);
			}

			@Override
			public void onXSIEvent(EventChannel channel,
					SubscriptionEvent event) {
				System.out.println("RCV event: "+event);
//				CallSubscriptionEvent csev = (CallSubscriptionEvent) event.getEventData();
				System.out.println("..-> "+event.getEventData());
				if (event.getEventData() instanceof CallReceivedEvent) {
					CallReceivedEvent cre = (CallReceivedEvent)event.getEventData();
					System.out.println("CallReceived");
					System.out.println("- call = "+cre.getCall());
				}
				
			}
		});

		try {
			channel.subscribe("Basic Call", "myAppID2");
			System.out.println("\n\n\n");
//			channel.subscribe("Audi-Hotline@qsc.de", "Call Center Queue", "myAppID2");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		// Wait 2 minutes, than close the channel
		try {
			Thread.sleep(120000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		channel.close();
	}

	
}
