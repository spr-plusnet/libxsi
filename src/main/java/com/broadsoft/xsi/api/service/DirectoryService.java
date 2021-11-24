package com.broadsoft.xsi.api.service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.broadsoft.xsi.CallCenterAgents;
import com.broadsoft.xsi.CallCenters;
import com.broadsoft.xsi.CallCenters.CallCenter;
import com.broadsoft.xsi.Enterprise;
import com.broadsoft.xsi.UserAdditionalEnterpriseGroupDetails;
import com.broadsoft.xsi.api.XSIConnection;

import de.plusnet.centraflex.broadsoft.XSIException;

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

	//-------------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.service.Service#get()
	 */
//	@Override
	public List<UserAdditionalEnterpriseGroupDetails> getByIMP(String key) throws XSIException {
		String subURL = String.format("user/%s/directories/Enterprise?", con.getUser());
		List<String> params = new ArrayList<String>();
		try {
			params.add("impId="+URLEncoder.encode(key, "UTF-8"));
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

	//-------------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.service.Service#get()
	 */
//	@Override
	public List<CallCenter> getCallCenters() throws XSIException {
		String subURL = String.format("user/%s/directories/CallCenters?", con.getUser());
		List<String> params = new ArrayList<String>();
		try {
			params.add("user="+URLEncoder.encode("Supervisor", "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			logger.error(e.toString());
		}
		subURL += String.join("&", params);
			
		try {
			CallCenters list = (CallCenters) con.actionGETQuery(subURL);
			return list.getCallCenter();
		} catch (IOException e) {
			logger.error("Failed executing "+subURL,e);
			throw new XSIException("Failed obtaining CallCenter list: "+e, 0);
		}
	}

	//-------------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.service.Service#get()
	 */
//	@Override
	public List<CallCenterAgents.CallCenter> getCallCenterAgents() throws XSIException {
		String subURL = String.format("user/%s/directories/Agents?", con.getUser());
			
		try {
			CallCenterAgents list = (CallCenterAgents) con.actionGETQuery(subURL);
			return list.getCallCenter();
		} catch (IOException e) {
			logger.error("Failed executing "+subURL,e);
			throw new XSIException("Failed obtaining CallCenter list: "+e, 0);
		}
	}

	//-------------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.service.Service#get()
	 */
//	@Override
	public List<CallCenterAgents.CallCenter> getCallCenterAgents(String callCenter) throws XSIException {
		String subURL = String.format("user/%s/directories/Agents?", con.getUser());
		List<String> params = new ArrayList<String>();
		try {
			params.add("callcenter="+URLEncoder.encode(callCenter, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			logger.error(e.toString());
		}
		subURL += String.join("&", params);
			
		try {
			CallCenterAgents list = (CallCenterAgents) con.actionGETQuery(subURL);
			return list.getCallCenter();
		} catch (IOException e) {
			logger.error("Failed executing "+subURL,e);
			throw new XSIException("Failed obtaining CallCenter list: "+e, 0);
		}
	}
	
}
