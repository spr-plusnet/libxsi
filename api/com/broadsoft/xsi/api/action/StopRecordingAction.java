/**
 * 
 */
package com.broadsoft.xsi.api.action;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.broadsoft.xsi.api.XSIConnection;

import de.qsc.centraflex.broadsoft.XSIException;

/**
 * @author spr
 *
 */
public class StopRecordingAction implements CallControlAction {

	private final static Logger logger = Logger.getLogger("xsi.service.callrecording");

	private XSIConnection con;

	//-----------------------------------------------------------------
	/**
	 */
	public StopRecordingAction(XSIConnection con) {
		this.con = con;
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.action.Action#getType()
	 */
	@Override
	public ActionType getType() {
		return ActionType.RECORD_STOP;
	}

	//-----------------------------------------------------------------
	/**
	 * @throws XSIException 
	 * @see com.broadsoft.xsi.api.action.CallControlAction#execute(java.lang.String)
	 */
	@Override
	public void execute(String callID) throws XSIException {
		String subURL = String.format("user/%s/calls/%s/StopRecording", con.getUser(), callID);
		try {
			con.actionPUTQuery(subURL, null);
		} catch (IOException e) {
			logger.error("Failed executing action",e);
			throw new XSIException("Failed executing service "+e, 0);
		}
	}

}
