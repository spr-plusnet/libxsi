/**
 * 
 */
package com.broadsoft.xsi.api.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.broadsoft.xsi.BusyLampField;
import com.broadsoft.xsi.api.XSIConnection;
import com.broadsoft.xsi.api.action.Action;

import de.qsc.centraflex.broadsoft.XSIException;

/**
 * @author spr
 *
 */
public class BusyLampFieldService implements Service<BusyLampField> {

	private final static Logger logger = Logger.getLogger("xsi.service.blf");

	private XSIConnection con;

	//-----------------------------------------------------------------
	/**
	 */
	public BusyLampFieldService(XSIConnection con) {
		this.con = con;
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.service.Service#getType()
	 */
	@Override
	public ServiceType getType() {
		return ServiceType.BLF;
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.service.Service#get()
	 */
	@Override
	public BusyLampField get() throws XSIException {
		String subURL = String.format("user/%s/services/BusyLampField", con.getUser());
		try {
			return (BusyLampField) con.actionGETQuery(subURL);
		} catch (IOException e) {
			logger.error("Failed executing service "+getType(),e);
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
