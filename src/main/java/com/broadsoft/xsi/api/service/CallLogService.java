package com.broadsoft.xsi.api.service;

import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.List;

import com.broadsoft.xsi.CallLogs;
import com.broadsoft.xsi.api.XSIConnection;
import com.broadsoft.xsi.api.action.Action;

import de.plusnet.centraflex.broadsoft.XSIException;

/**
 * @author prelle
 *
 */
public class CallLogService {

	private final static Logger logger = System.getLogger("xsi.service.calllogs");

	private XSIConnection con;
	private List<Action> actions;

	//-----------------------------------------------------------------
	/**
	 */
	public CallLogService(XSIConnection con) {
		if (con==null)
			throw new NullPointerException();
		this.con = con;
		actions = new ArrayList<>();
	}

	//-------------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.service.Service#getType()
	 */
//	@Override
	public ServiceType getType() {
		return ServiceType.CALL_LOGS;
	}

	//-------------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.service.Service#get()
	 */
//	@Override
	public CallLogs get() throws XSIException {
		String subURL = String.format("user/%s/directories/CallLogs", con.getUser());
		try {
			CallLogs logs = (CallLogs) con.actionGETQuery(subURL);
			return logs;
//			List<CallHistoryEntry> ret = new ArrayList<CallHistoryEntry>();
//			ret.addAll(logs.getReceived().getCallLogsEntry());
//			ret.addAll(logs.getMissed().getCallLogsEntry());
//			ret.addAll(logs.getPlaced().getCallLogsEntry());
//			Collections.sort(ret, new Comparator<CallLogsEntry>() {
//				public int compare(CallLogsEntry o1, CallLogsEntry o2) {
//					return o1.getTime().compare(o2.getTime());
//				}
//			});
//			Collections.reverse(ret);
//			return ret;
		} catch (IOException e) {
			logger.log(Level.ERROR, "Failed executing service "+getType(),e);
			throw new XSIException("Failed executing service "+getType()+": "+e, 0);
		}
	}

	//-------------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.service.Service#getActions()
	 */
//	@Override
	public List<Action> getActions() {
		return actions;
	}

	
}
