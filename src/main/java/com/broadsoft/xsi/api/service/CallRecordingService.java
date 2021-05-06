/**
 * 
 */
package com.broadsoft.xsi.api.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.broadsoft.xsi.CallRecording;
import com.broadsoft.xsi.api.XSIConnection;
import com.broadsoft.xsi.api.action.Action;
import com.broadsoft.xsi.api.action.RecordAction;
import com.broadsoft.xsi.api.action.StopRecordingAction;

import de.plusnet.centraflex.broadsoft.XSIException;

/**
 * @author spr
 *
 */
public class CallRecordingService implements WritableService<CallRecording> {

	private final static Logger logger = LogManager.getLogger("xsi.service.callrecording");

	private XSIConnection con;
	private List<Action> actions;

	//-----------------------------------------------------------------
	/**
	 */
	public CallRecordingService(XSIConnection con) {
		this.con = con;
		actions = new ArrayList<>();
		
		actions.add(new RecordAction(con));
		actions.add(new StopRecordingAction(con));
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.service.Service#getType()
	 */
	@Override
	public ServiceType getType() {
		return ServiceType.CALL_RECORDING;
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.service.Service#get()
	 */
	@Override
	public CallRecording get() throws XSIException {
		String subURL = String.format("user/%s/services/CallRecording", con.getUser());
		try {
			return (CallRecording) con.actionGETQuery(subURL);
		} catch (IOException e) {
			logger.error("Failed executing service "+getType(),e);
			throw new XSIException("Failed executing service "+getType()+": "+e, 0);
		}
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.service.WritableService#set(java.lang.Object)
	 */
	@Override
	public void set(CallRecording value) throws XSIException {
		try {
			con.actionPUTQuery("user/"+con.getUser()+"/services/CallRecording", value);
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
		return actions;
	}

}
