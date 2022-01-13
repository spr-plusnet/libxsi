module de.centraflex.libxsi {
	exports com.broadsoft.xsi;
	exports com.broadsoft.xsi.api;
	exports com.broadsoft.xsi.api.action;
	exports com.broadsoft.xsi.api.service;
	exports de.plusnet.centraflex.broadsoft;

	requires jakarta.xml.bind;
	requires java.xml;
	
	opens com.broadsoft.xsi to jakarta.xml.bind;
}