package com.broadsoft.xsi.api.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.broadsoft.xsi.Call;
import com.broadsoft.xsi.CallInfo;
import com.broadsoft.xsi.CallStartInfo;
import com.broadsoft.xsi.Calls;
import com.broadsoft.xsi.api.XSIConnection;

import de.qsc.centraflex.broadsoft.XSIException;

/**
 * @author prelle
 *
 */
public class CallControlService {

	private final static Logger logger = LogManager.getLogger("xsi.service.callctrl");

	private XSIConnection con;

	//-------------------------------------------------------------------
	public CallControlService(XSIConnection con) {
		this.con = con;
	}

	//-------------------------------------------------------------------
	public List<Call> list() {
		ArrayList<Call> ret = new ArrayList<Call>();
		
		/*
		 * Obtain a list of call-ids and request information for each call
		 */
		String subURL = String.format("user/%s/calls", con.getUser());
		try {
			Calls info = (Calls) con.actionGETQuery(subURL);
			// Now get details for each call
			for (CallInfo tmp : info.getCall()) {
				Call call = (Call) con.actionGETQuery(tmp.getUri());
				ret.add(call);
			}
			
		} catch (IOException e) {
			logger.error("Failed to get list of calls",e);
		}
		
		
		return ret;
	}

	//-------------------------------------------------------------------
	public CallStartInfo createCall(String target) throws XSIException {
		String subURL = String.format("user/%s/calls/new?address=%s", con.getUser(), target);
		try {
			CallStartInfo info = (CallStartInfo) con.actionPOSTQuery(subURL, new byte[0]);
			logger.warn("CallStartInfo  = "+info);
			return info;
		} catch (IOException e) {
			logger.error("Failed executing service ",e);
			throw new XSIException("Failed executing service : "+e, 0);
		}
	}

	//-------------------------------------------------------------------
	public Call getCall(String callID) throws XSIException {
		String subURL = String.format("user/%s/calls/%s", con.getUser(), callID);
		try {
			Call info = (Call) con.actionGETQuery(subURL);
			return info;
		} catch (IOException e) {
			logger.error("Failed executing service ",e);
			throw new XSIException("Failed executing service : "+e, 0);
		}
	}

	//-------------------------------------------------------------------
	public void acceptCall(String callID) throws XSIException {
		String subURL = String.format("user/%s/calls/%s/Talk", con.getUser(), callID);
		try {
			con.actionPUTQuery(subURL, new byte[0]);
		} catch (IOException e) {
			logger.error("Failed executing service ",e);
			throw new XSIException("Failed executing service : "+e, 0);
		}
	}

	//-------------------------------------------------------------------
	public void releaseCall(String callID) throws XSIException {
		String subURL = String.format("user/%s/calls/%s", con.getUser(), callID);
		try {
			con.actionDELETEQuery(subURL, new byte[0]);
		} catch (IOException e) {
			logger.error("Failed executing service ",e);
			throw new XSIException("Failed executing service : "+e, 0);
		}
	}
}
