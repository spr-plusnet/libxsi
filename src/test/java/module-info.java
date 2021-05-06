module de.centraflex.libxsi {
	exports com.broadsoft.xsi.api.service;
	exports com.sun.activation.registries;
	exports com.broadsoft.xsi.api.action;
	exports de.plusnet.centraflex.broadsoft;
	exports com.broadsoft.xsi;
	exports com.broadsoft.xsi.api;

	requires jakarta.xml.bind;
	requires java.xml;
	requires org.apache.logging.log4j;
	requires org.eclipse.persistence.core;
	requires org.eclipse.persistence.moxy;
}