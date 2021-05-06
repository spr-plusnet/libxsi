package com.broadsoft.xsi.api.service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.broadsoft.xsi.CustomContact;
import com.broadsoft.xsi.Directory;
import com.broadsoft.xsi.DirectoryDetails;
import com.broadsoft.xsi.EnterpriseCommon;
import com.broadsoft.xsi.GroupCommon;
import com.broadsoft.xsi.Personal;
import com.broadsoft.xsi.PersonalEntry;
import com.broadsoft.xsi.api.XSIConnection;
import com.broadsoft.xsi.api.action.Action;

import de.plusnet.centraflex.broadsoft.XSIException;

/**
 * @author prelle
 *
 */
public class CustomContactService {

	private final static Logger logger = LogManager.getLogger("xsi.service.contact");

	private XSIConnection con;
	private List<Action> actions;

	//-----------------------------------------------------------------
	/**
	 */
	public CustomContactService(XSIConnection con) {
		this.con = con;
		actions = new ArrayList<>();
	}

	//-------------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.service.Service#getType()
	 */
//	@Override
	public ServiceType getType() {
		return ServiceType.CUSTOM_CONTACT;
	}

	//-------------------------------------------------------------------
	public List<String> getDirectoryNames() throws XSIException {
		List<String> ret = new ArrayList<>();
		String subURL = String.format("user/%s/directories/CustomContact", con.getUser());
		try {
			CustomContact logs = (CustomContact) con.actionGETQuery(subURL);
			for (DirectoryDetails detail : logs.getDirectory()) {
				ret.add(detail.getName());
			}
		} catch (IOException e) {
			logger.error("Failed executing service "+getType(),e);
			throw new XSIException("Failed executing service "+getType()+": "+e, 0);
		}
		return ret;
	}

	//-------------------------------------------------------------------
	public List<?> getCustomContacts(String directory) throws XSIException {
		List<String> ret = new ArrayList<>();
		String subURL = String.format("user/%s/directories/CustomContact/"+directory, con.getUser());
		try {
			Directory logs = (Directory) con.actionGETQuery(subURL);
			
		} catch (IOException e) {
			logger.error("Failed executing service "+getType(),e);
			throw new XSIException("Failed executing service "+getType()+": "+e, 0);
		}
		return ret;
	}

	//-------------------------------------------------------------------
	public List<PersonalEntry> getPersonalContacts() throws XSIException {
		List<PersonalEntry> ret = new ArrayList<>();
		String subURL = String.format("user/%s/directories/Personal", con.getUser());
		try {
			Personal data = (Personal) con.actionGETQuery(subURL);
			ret.addAll(data.getEntry());
		} catch (IOException e) {
			logger.error("Failed executing service "+getType(),e);
			throw new XSIException("Failed executing service "+getType()+": "+e, 0);
		}
		return ret;
	}

	//-------------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.service.Service#get()
	 */
//	@Override
	public List<PersonalEntry> getEnterpriseCommon(String name, String number, int results) throws XSIException {
		String subURL = String.format("user/%s/directories/EnterpriseCommon?", con.getUser());
		List<String> params = new ArrayList<String>();
		try {
			if (name!=null && !name.isBlank()) params.add("name="+URLEncoder.encode(name, "UTF-8"));
			if (number!=null && !number.isBlank()) params.add("number="+URLEncoder.encode(number, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			logger.error(e.toString());
		}
		if (results>0) params.add("results="+results);
		subURL += String.join("&", params);
			
		try {
			EnterpriseCommon logs = (EnterpriseCommon) con.actionGETQuery(subURL);
			return logs.getCommonPhoneEntry();
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
	public List<PersonalEntry> getGroupCommon(String name, String number, int results) throws XSIException {
		String subURL = String.format("user/%s/directories/GroupCommon", con.getUser());
		List<String> params = new ArrayList<String>();
		try {
			if (name!=null && !name.isBlank()) params.add("name="+URLEncoder.encode(name, "UTF-8"));
			if (number!=null && !number.isBlank()) params.add("number="+URLEncoder.encode(number, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			logger.error(e.toString());
		}
		if (results>0) params.add("results="+results);
		if (params.size()>0) {
			subURL += "?";
			subURL += String.join("&", params);
		}
			
		try {
			GroupCommon logs = (GroupCommon) con.actionGETQuery(subURL);
			return logs.getCommonPhoneEntry();
		} catch (IOException e) {
			logger.error("Failed executing service GroupCommon",e);
			throw new XSIException("Failed executing service GroupCommon: "+e, 0);
		}
	}

	//-------------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.service.Service#getActions()
	 */
//	@Override
	public List<Action> getActions() {
		return actions;
	}

	
}
