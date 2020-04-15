package com.broadsoft.xsi.api.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.broadsoft.xsi.CallLogs;
import com.broadsoft.xsi.CallLogsEntries;
import com.broadsoft.xsi.CallLogsEntry;
import com.broadsoft.xsi.CustomContact;
import com.broadsoft.xsi.Directory;
import com.broadsoft.xsi.DirectoryDetails;
import com.broadsoft.xsi.Personal;
import com.broadsoft.xsi.PersonalEntry;
import com.broadsoft.xsi.api.XSIConnection;
import com.broadsoft.xsi.api.action.Action;

import de.qsc.centraflex.broadsoft.XSIException;

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
	 * @see com.broadsoft.xsi.api.service.Service#getActions()
	 */
//	@Override
	public List<Action> getActions() {
		return actions;
	}

	
}
