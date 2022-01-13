package com.broadsoft.xsi.api.service;

import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.List;

import com.broadsoft.xsi.CallCenter;
import com.broadsoft.xsi.api.XSIConnection;
import com.broadsoft.xsi.api.action.Action;

import de.plusnet.centraflex.broadsoft.XSIException;

/**
 * @author spr
 *
 */
public class CallCenterService implements Service<CallCenter> {

	private final static Logger logger = System.getLogger("xsi.service.callcenter");

	private XSIConnection con;
	
	//-----------------------------------------------------------------
	public CallCenterService(XSIConnection con) {
		this.con = con;
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.service.Service#getType()
	 */
	@Override
	public ServiceType getType() {
		return ServiceType.CALL_CENTER;
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.service.Service#get()
	 */
	@Override
	public CallCenter get() throws XSIException {
		try {
			return (CallCenter)con.actionGETQuery(String.format("services/CallCenter"));
		} catch (IOException e) {
			logger.log(Level.ERROR, "Failed obtaining CallCenter options",e);
			throw new XSIException("Failed obtaining CallCenter options: "+e, 0);
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
