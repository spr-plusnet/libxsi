/**
 * 
 */
package com.broadsoft.xsi.api.service;

import java.util.List;

import com.broadsoft.xsi.api.action.Action;

import de.plusnet.centraflex.broadsoft.XSIException;

/**
 * @author spr
 *
 */
public interface Service<T> {

	//-----------------------------------------------------------------
	public ServiceType getType();

	//-----------------------------------------------------------------
	public T get() throws XSIException;

	//-----------------------------------------------------------------
	public List<Action> getActions();

}
