module de.plusnet.centraflex.libxsi {
	exports com.broadsoft.xsi.api.service;
	exports de.plusnet.centraflex.broadsoft;
	exports com.broadsoft.xsi.api.action;
	exports com.broadsoft.xsi;
	exports com.broadsoft.xsi.api;

	opens com.broadsoft.xsi;
	
	requires org.eclipse.persistence.moxy;
	requires jakarta.xml.bind;
}