/**
 * 
 */
package de.qsc.centraflex.broadsoft;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.Writer;
import java.util.Properties;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.broadsoft.xsi.api.XSIConnection;

/**
 * @author prelle
 *
 */
public class XSIDriver {
	private final static Logger logger = LoggerFactory.getLogger("connector.xsi");


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
		if (pack.getImplementationTitle()==null)
			logger.info("XSI Driver running directly from class files");
		else
			logger.info(XSIDriver.class.getPackage().getImplementationTitle()+" version "+XSIDriver.class.getPackage().getImplementationVersion());
		try {
			jaxb = JAXBContext.newInstance("com.broadsoft.xsi");
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
