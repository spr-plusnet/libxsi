package de.plusnet.centraflex.broadsoft;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.Writer;
import java.util.HashMap;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.persistence.Version;

import com.broadsoft.xsi.api.XSIConnection;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

/**
 * @author prelle
 *
 */
public class XSIDriver {
	private final static Logger logger = LogManager.getLogger("connector.xsi");


	public final static String PROP_XSI_SERVER = "xsi.server";
	public final static String PROP_XSI_USER   = "xsi.user";
	public final static String PROP_XSI_PASS   = "xsi.pass";
	public final static String PROP_XSI_USESSL = "xsi.usessl";
	public final static String PROP_XSI_ENCODING = "xsi.encoding";
	public final static String PROP_XSI_USECTYPE = "xsi.usectype";
	public static final String PROP_XSI_APPNAME  = "xsi.appname";

	private static JAXBContext jaxb;
	private static Unmarshaller unmarshaller;
	private static Marshaller marshaller;

	//-----------------------------------------------------------------
	static {
		Package pack = XSIDriver.class.getPackage();
		Version.getVersionString();
		if (pack.getImplementationTitle()==null)
			logger.info("XSI Driver running directly from class files");
		else
			logger.info(XSIDriver.class.getPackage().getImplementationTitle()+" version "+XSIDriver.class.getPackage().getImplementationVersion());
		try {
//			jaxb = ContextFactory.createContext("com.broadsoft.xsi", XSIDriver.class.getClassLoader(), new HashMap<String, Object>());
			jaxb = org.eclipse.persistence.jaxb.JAXBContextFactory.createContext("com.broadsoft.xsi", XSIDriver.class.getClassLoader(), new HashMap<String, Object>());
//			jaxb = JAXBContext.newInstance("com.broadsoft.xsi");
			unmarshaller = jaxb.createUnmarshaller();
			marshaller   = jaxb.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		} catch (JAXBException e) {
			logger.error("Could not initialize JAXB context: "+e);
			System.exit(0);
		}
	}

	//-----------------------------------------------------------------
	static Object unmarshall(String xml) throws JAXBException {
		synchronized (unmarshaller) {
			Object ret = unmarshaller.unmarshal(new StringReader(xml));
			if (ret instanceof JAXBElement<?>) {
				JAXBElement<?> jaxb = (JAXBElement<?>)ret;
				return jaxb.getValue();
			}

			return ret;
		}
	}

	//-----------------------------------------------------------------
	static Object unmarshall(InputStream in) throws JAXBException {
		synchronized (unmarshaller) {
			Object ret = unmarshaller.unmarshal(in);
			if (ret instanceof JAXBElement<?>) {
				JAXBElement<?> jaxb = (JAXBElement<?>)ret;
				return jaxb.getValue();
			}

			return ret;
		}
	}

	//-----------------------------------------------------------------
	static void marshall(Object jaxbElement, Writer out) throws JAXBException {
		marshaller.marshal(jaxbElement, out);
	}

	//-----------------------------------------------------------------
	public static XSIConnection open(Properties config) throws IOException {
		return new XSIConnectionImpl(config);
	}

	//-----------------------------------------------------------------
	public static JAXBContext getContext() {
		return jaxb;
	}

}
