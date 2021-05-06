package com.broadsoft.xsi.api.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.broadsoft.xsi.Call;
import com.broadsoft.xsi.CallInfo;
import com.broadsoft.xsi.CallStartInfo;
import com.broadsoft.xsi.Calls;
import com.broadsoft.xsi.api.XSIConnection;

import de.plusnet.centraflex.broadsoft.XSIException;

/**
 * @author prelle
 *
 */
public class CallControlService {

	private final static Logger logger = LoggerFactory.getLogger("xsi.service.callctrl");

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
	public CallStartInfo createCall(String target, String clid, String location, String locAddress) throws XSIException {
		String subURL = String.format("user/%s/calls/new?address=%s", con.getUser(), target);
		if (clid!=null)
			subURL+="&clid="+clid;
		if (location!=null)
			subURL+="&location="+location;
		if (locAddress!=null)
			subURL+="&locationAddress="+locAddress;
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

	//-------------------------------------------------------------------
	public void holdCall(String callID) throws XSIException {
		logger.debug("holdCall");
		String subURL = String.format("user/%s/calls/%s/Hold", con.getUser(), callID);
		try {
			con.actionPUTQuery(subURL, new byte[0]);
		} catch (IOException e) {
			logger.error("Failed executing service ",e);
			throw new XSIException("Failed executing service : "+e, 0);
		}
	}

	//-------------------------------------------------------------------
	public void resumeCall(String callID) throws XSIException {
		logger.debug("resumeCall");
		String subURL = String.format("user/%s/calls/%s/Reconnect", con.getUser(), callID);
		try {
			con.actionPUTQuery(subURL, new byte[0]);
		} catch (IOException e) {
			logger.error("Failed executing service ",e);
			throw new XSIException("Failed executing service : "+e, 0);
		}
	}
}
