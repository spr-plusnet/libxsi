module de.plusnet.centraflex.libxsi {
	exports com.broadsoft.xsi.api.service;
	exports de.qsc.centraflex.broadsoft;
	exports com.broadsoft.xsi.api.action;
	exports com.broadsoft.xsi;
	exports com.broadsoft.xsi.api;

	opens com.broadsoft.xsi;
	
	requires java.xml;
	requires java.xml.bind;
	requires org.apache.logging.log4j;
}