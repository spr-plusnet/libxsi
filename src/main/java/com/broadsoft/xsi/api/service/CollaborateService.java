package com.broadsoft.xsi.api.service;

import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.List;

import com.broadsoft.xsi.CollaborateBridgeInfo;
import com.broadsoft.xsi.api.XSIConnection;
import com.broadsoft.xsi.api.action.Action;

import de.plusnet.centraflex.broadsoft.XSIException;

/**
 * @author spr
 *
 */
public class CollaborateService implements Service<CollaborateBridgeInfo> {

	private final static Logger logger = System.getLogger("xsi.service.collaborate");

	private XSIConnection con;
	
	//-----------------------------------------------------------------
	public CollaborateService(XSIConnection con) {
		this.con = con;
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.service.Service#getType()
	 */
	@Override
	public ServiceType getType() {
		return ServiceType.COLLABORATE;
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.service.Service#get()
	 */
	@Override
	public CollaborateBridgeInfo get() throws XSIException {
		try {
			return (CollaborateBridgeInfo)con.actionGETQuery(String.format("services/collaborate"));
		} catch (IOException e) {
			logger.log(Level.ERROR, "Failed obtaining collaboration options",e);
			throw new XSIException("Failed obtaining collaboration options: "+e, 0);
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
