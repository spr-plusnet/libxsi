/**
 * 
 */
package com.broadsoft.xsi.api.action;

import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import com.broadsoft.xsi.api.XSIConnection;

import de.qsc.centraflex.broadsoft.XSIException;

/**
 * @author spr
 *
 */
public class RecordAction implements CallControlAction {

	private final static Logger logger = LogManager.getLogger("xsi.service.callrecording");

	private XSIConnection con;

	//-----------------------------------------------------------------
	/**
	 */
	public RecordAction(XSIConnection con) {
		this.con = con;
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.action.Action#getType()
	 */
	@Override
	public ActionType getType() {
		return ActionType.RECORD_START;
	}

	//-----------------------------------------------------------------
	/**
	 * @throws XSIException 
	 * @see com.broadsoft.xsi.api.action.CallControlAction#execute(java.lang.String)
	 */
	@Override
	public void execute(String callID) throws XSIException {
		String subURL = String.format("user/%s/calls/%s/Record", con.getUser(), callID);
		try {
			con.actionPUTQuery(subURL, null);
		} catch (IOException e) {
			logger.error("Failed executing action",e);
			throw new XSIException("Failed executing service "+e, 0);
		}
	}

}
