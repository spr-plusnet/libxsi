package libxsi;

import java.io.IOException;
import java.util.Properties;

import com.broadsoft.xsi.Profile;
import com.broadsoft.xsi.api.XSIConnection;

import de.plusnet.centraflex.broadsoft.XSIDriver;

public class GetUserInfo {

	//-----------------------------------------------------------------
	public static void main(String[] args) throws IOException {
		System.out.println("Running");
		Properties config = new Properties();
		config.put(XSIDriver.PROP_XSI_USER, "04212025933@qsc.de");
		config.put(XSIDriver.PROP_XSI_PASS, "tamina88ke");
		config.put(XSIDriver.PROP_XSI_SERVER, "web4.bmcag.com");
//		config.put(XSIDriver.PROP_XSI_USESSL, "true");
		config.put(XSIDriver.PROP_XSI_APPNAME, "GetUserInfo Example");
		
		final XSIConnection xsi = XSIDriver.open(config);

		// Action
		System.out.println("\n\n\n--------------Query----------");
		String subURL = String.format("user/%s/profile", xsi.getUser());
		Profile profile = (Profile)xsi.actionGETQuery(subURL);
		System.out.println("My name is "
				+profile.getDetails().getFirstName().getValue()+" "
				+profile.getDetails().getLastName().getValue()
				);
		
		System.out.println("\n\n\n--------------Closing----------");
		xsi.close();

	}

	
}
