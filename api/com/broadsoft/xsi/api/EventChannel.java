package com.broadsoft.xsi.api;

import java.io.IOException;

public interface EventChannel {

	//-----------------------------------------------------------------
	public ConnectionState getState();

	//-----------------------------------------------------------------
	public void addListener(EventChannelListener listener);

	//-----------------------------------------------------------------
	public void close() throws IOException;

	//-----------------------------------------------------------------
	/**
	 * @return the session
	 */
	public XSIConnection getConnection();

	//-----------------------------------------------------------------
	/**
	 * Subscribe events for this user
	 */
	public Subscription subscribe(String eventPackage, String applicationId) throws IOException ;

	//-----------------------------------------------------------------
	/**
	 * Subscribe events of other users
	 */
	public Subscription subscribe(String user, String eventPackage, String applicationId) throws IOException ;

	//-----------------------------------------------------------------
	public String getChannelID();

	//-----------------------------------------------------------------
	public String getSetId();

}