/**
 * 
 */
package com.broadsoft.xsi.api.service;

import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.List;

import com.broadsoft.xsi.RemoteOffice;
import com.broadsoft.xsi.api.XSIConnection;
import com.broadsoft.xsi.api.action.Action;

import de.plusnet.centraflex.broadsoft.XSIException;

/**
 * @author spr
 *
 */
public class RemoteOfficeService implements WritableService<RemoteOffice> {

	private final static Logger logger = System.getLogger("xsi.service.remoteoffice");

	private XSIConnection con;

	//-----------------------------------------------------------------
	/**
	 */
	public RemoteOfficeService(XSIConnection con) {
		this.con = con;
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.service.Service#getType()
	 */
	@Override
	public ServiceType getType() {
		return ServiceType.REMOTE_OFFICE;
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.service.Service#get()
	 */
	@Override
	public RemoteOffice get() throws XSIException {
		String subURL = String.format("user/%s/services/RemoteOffice", con.getUser());
		try {
			return (RemoteOffice) con.actionGETQuery(subURL);
		} catch (IOException e) {
			logger.log(Level.ERROR, "Failed executing service "+getType(),e);
			throw new XSIException("Failed executing service "+getType()+": "+e, 0);
		}
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.service.WritableService#set(java.lang.Object)
	 */
	@Override
	public void set(RemoteOffice value) throws XSIException {
		try {
			con.actionPUTQuery("user/"+con.getUser()+"/services/RemoteOffice", value);
		} catch (IOException e) {
			logger.log(Level.ERROR, "Failed executing service "+getType(),e);
			throw new XSIException("Failed executing service "+getType()+": "+e, 0);
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

}
