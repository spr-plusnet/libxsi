/**
 * 
 */
package com.broadsoft.xsi.api.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.broadsoft.xsi.AccessDevice;
import com.broadsoft.xsi.AccessDevices;
import com.broadsoft.xsi.Profile;
import com.broadsoft.xsi.api.XSIConnection;
import com.broadsoft.xsi.api.action.Action;

import de.plusnet.centraflex.broadsoft.XSIException;

/**
 * @author spr
 *
 */
public class ProfileService implements Service<Profile> {

	private final static Logger logger = LoggerFactory.getLogger("xsi.service.profile");

	private XSIConnection con;
	
	//-----------------------------------------------------------------
	public ProfileService(XSIConnection con) {
		this.con = con;
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.service.Service#getType()
	 */
	@Override
	public ServiceType getType() {
		return ServiceType.PROFILE;
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.service.Service#get()
	 */
	@Override
	public Profile get() throws XSIException {
		try {
			return (Profile)con.actionGETQuery(String.format("user/%s/profile", con.getUser()));
		} catch (IOException e) {
			logger.error("Failed obtaining own profile",e);
			throw new XSIException("Failed obtaining own profile: "+e, 0);
		}
		
	}

	//-----------------------------------------------------------------
	public static Profile get(XSIConnection con, String user) throws XSIException {
		try {
			return (Profile)con.actionGETQuery(String.format("user/%s/profile", user));
		} catch (IOException e) {
			logger.error("Failed obtaining profile",e);
			throw new XSIException("Failed obtaining profile: "+e, 0);
		}
		
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.service.Service#getActions()
	 */
	@Override
	public List<Action> getActions() {
		return new ArrayList<Action>();
	}

	//-----------------------------------------------------------------
	public List<AccessDevice> getAccessDevices() throws XSIException {
		try {
			AccessDevices devs = ((AccessDevices)con.actionGETQuery(String.format("user/%s/profile/device", con.getUser())));
			return devs.getAccessDevice();
		} catch (IOException e) {
			logger.error("Failed obtaining list of devices",e);
			throw new XSIException("Failed obtaining own profile: "+e, 0);
		}
		
	}

}
