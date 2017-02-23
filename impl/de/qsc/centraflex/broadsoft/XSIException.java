/**
 * 
 */
package de.qsc.centraflex.broadsoft;

import java.io.IOException;

/**
 * @author spr
 *
 */
@SuppressWarnings("serial")
public class XSIException extends IOException {
	
	private int errorCode;

	//-----------------------------------------------------------------
	/**
	 * @param message
	 */
	public XSIException(String message, int code) {
		super(message);
		this.errorCode = code;
	}

	//-----------------------------------------------------------------
	/**
	 * @return the errorCode
	 */
	public int getErrorCode() {
		return errorCode;
	}

	//-----------------------------------------------------------------
	public String toString() {
		return this.getClass().getName()+": "+errorCode+": "+getMessage();
	}

}
