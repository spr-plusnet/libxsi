package com.broadsoft.xsi.api;

import java.io.IOException;
import java.util.Collection;

import com.broadsoft.xsi.api.service.Service;
import com.broadsoft.xsi.api.service.ServiceType;


public interface XSIConnection {

	//-----------------------------------------------------------------
	/**
	 * @return the user
	 */
	public String getUser();

	//-----------------------------------------------------------------
	/**
	 * Perform a HTTP GET request
	 * @param subURL The part of the URL to be appended after https://&lt;server&gt;/com.broadsoft.xsi-actions/v2.0/
	 */
	public Object actionGETQuery(String subURL) throws IOException;

	//-----------------------------------------------------------------
	/**
	 * Perform a HTTP PUT request
	 * @param subURL The part of the URL to be appended after https://&lt;server&gt;/com.broadsoft.xsi-actions/v2.0/
	 */
	public Object actionPUTQuery(String subURL, byte[] data) throws IOException;

	//-----------------------------------------------------------------
	/**
	 * Perform a HTTP PUT request
	 * @param subURL The part of the URL to be appended after https://&lt;server&gt;/com.broadsoft.xsi-actions/v2.0/
	 * @param toEncode Object to marshall to XML
	 */
	public Object actionPUTQuery(String subURL, Object toEncode) throws IOException;

	//-----------------------------------------------------------------
	/**
	 * Perform a HTTP POST request
	 * @param subURL The part of the URL to be appended after https://&lt;server&gt;/com.broadsoft.xsi-events/v2.0/
	 */
	public Object eventsPOSTQuery(String subURL, byte[] data) throws IOException;

	//-----------------------------------------------------------------
	/**
	 * Close all event channel and subscriptions
	 */
	public void close();

	//-----------------------------------------------------------------
	public EventChannel createEventChannel(String name, EventChannelListener listener) throws IOException;

	//-----------------------------------------------------------------
	public Object actionPOSTQuery(String subURL, byte[] data) throws IOException;

	//-----------------------------------------------------------------
	public Object actionPOSTQuery(String subURL, Object toEncode) throws IOException;

	//-----------------------------------------------------------------
	public Object actionDELETEQuery(String subURL, byte[] data) throws IOException;

	//-----------------------------------------------------------------
	public Object actionDELETEQuery(String subURL, Object toEncode) throws IOException;

	//-----------------------------------------------------------------
	public Collection<Service<?>> getServices();

	//-----------------------------------------------------------------
	public Service<?> getService(ServiceType type);

}