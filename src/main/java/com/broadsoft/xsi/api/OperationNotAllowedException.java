/**
 * 
 */
package com.broadsoft.xsi.api;

import java.io.IOException;

/**
 * @author spr
 *
 */
public class OperationNotAllowedException extends IOException {

	private static final long serialVersionUID = 2626810969481909226L;

	//-----------------------------------------------------------------
	public OperationNotAllowedException(String message) {
		super(message);
	}

}
