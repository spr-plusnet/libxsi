/**
 * 
 */
package com.broadsoft.xsi.api.action;

import de.plusnet.centraflex.broadsoft.XSIException;

/**
 * @author spr
 *
 */
public interface CallControlAction extends Action {

	public void execute(String callID)  throws XSIException;
	
}
