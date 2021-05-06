/**
 * 
 */
package com.broadsoft.xsi.api.service;

import de.plusnet.centraflex.broadsoft.XSIException;

/**
 * @author spr
 *
 */
public interface WritableService<T> extends Service<T> {

	//-----------------------------------------------------------------
	public void set(T value) throws XSIException;
	
}
