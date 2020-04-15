package com.broadsoft.xsi.api.service;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.broadsoft.xsi.Call;
import com.broadsoft.xsi.CallStartInfo;
import com.broadsoft.xsi.CollaborateBridgeInfo;
import com.broadsoft.xsi.api.XSIConnection;
import com.broadsoft.xsi.api.action.Action;

import de.qsc.centraflex.broadsoft.XSIException;

/**
 * @author prelle
 *
 */
public class CallControlService implements Service<Call> {

	private final static Logger logger = LogManager.getLogger("xsi.service.callctrl");

	private XSIConnection con;

	//-------------------------------------------------------------------
	public CallControlService(XSIConnection con) {
		this.con = con;
	}

	//-------------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.service.Service#getType()
	 */
	@Override
	public ServiceType getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Call get() throws XSIException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Action> getActions() {
		// TODO Auto-generated method stub
		return null;
	}

	//-------------------------------------------------------------------
	public void createCall(String target) throws XSIException {
		String subURL = String.format("user/%s/calls/new?address=%s", con.getUser(), target);
		try {
			CallStartInfo info = (CallStartInfo) con.actionPOSTQuery(subURL, new byte[0]);
			logger.warn("CallStartInfo  = "+info);
		} catch (IOException e) {
			logger.error("Failed executing service "+getType(),e);
			throw new XSIException("Failed executing service "+getType()+": "+e, 0);
		}
	}
}
