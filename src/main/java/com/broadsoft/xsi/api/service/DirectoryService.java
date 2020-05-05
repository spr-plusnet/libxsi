package com.broadsoft.xsi.api.service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.broadsoft.xsi.Enterprise;
import com.broadsoft.xsi.EnterpriseCommon;
import com.broadsoft.xsi.PersonalEntry;
import com.broadsoft.xsi.UserAdditionalEnterpriseGroupDetails;
import com.broadsoft.xsi.api.XSIConnection;

import de.qsc.centraflex.broadsoft.XSIException;

/**
 * @author prelle
 *
 */
public class DirectoryService {

	private final static Logger logger = LogManager.getLogger("xsi.service.enterprise");

	private XSIConnection con;

	//-----------------------------------------------------------------
	/**
	 */
	public DirectoryService(XSIConnection con) {
		this.con = con;
	}

	//-------------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.service.Service#get()
	 */
//	@Override
	public List<UserAdditionalEnterpriseGroupDetails> get(String key) throws XSIException {
		String subURL = String.format("user/%s/directories/Enterprise?", con.getUser());
		List<String> params = new ArrayList<String>();
		try {
			params.add("firstName="+URLEncoder.encode(key, "UTF-8"));
			params.add("lastName="+URLEncoder.encode(key, "UTF-8"));
			params.add("searchCriteriaModeOr=True");
		} catch (UnsupportedEncodingException e) {
			logger.error(e.toString());
		}
		subURL += String.join("&", params);
			
		try {
			Enterprise logs = (Enterprise) con.actionGETQuery(subURL);
			return logs.getEnterpriseDirectory().getDirectoryDetails();
		} catch (IOException e) {
			logger.error("Failed executing service EnterpriseCommon",e);
			throw new XSIException("Failed executing service EnterpriseCommon: "+e, 0);
		}
	}

//	//-------------------------------------------------------------------
//	/**
//	 * @see com.broadsoft.xsi.api.service.Service#get()
//	 */
////	@Override
//	public List<UserAdditionalEnterpriseGroupDetails> get(String key) throws XSIException {
//		String subURL = String.format("user/%s/directories/Enterprise?", con.getUser());
//		List<String> params = new ArrayList<String>();
//		try {
//			params.add("firstName="+URLEncoder.encode(key, "UTF-8"));
//			params.add("lastName="+URLEncoder.encode(key, "UTF-8"));
//			params.add("searchCriteriaModeOr=True");
//		} catch (UnsupportedEncodingException e) {
//			logger.error(e.toString());
//		}
//		subURL += String.join("&", params);
//			
//		try {
//			Enterprise logs = (Enterprise) con.actionGETQuery(subURL);
//			return logs.getEnterpriseDirectory().getDirectoryDetails();
//		} catch (IOException e) {
//			logger.error("Failed executing service EnterpriseCommon",e);
//			throw new XSIException("Failed executing service EnterpriseCommon: "+e, 0);
//		}
//	}
	
}
