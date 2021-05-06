/**
 * 
 */
package de.plusnet.centraflex.broadsoft;

import com.broadsoft.xsi.api.Subscription;

/**
 * @author prelle
 *
 */
public class SubscriptionImpl implements Subscription {
	
	private String id;
	private String user;
	private String eventPackage;

	//-----------------------------------------------------------------
	/**
	 */
	public SubscriptionImpl(String id, String user, String eventPackage) {
		this.id = id;
		this.user = user;
		this.eventPackage = eventPackage;
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.Subscription#getUser()
	 */
	@Override
	public String getUser() {
		return user;
	}

	//-----------------------------------------------------------------
	/**
	 * @see com.broadsoft.xsi.api.Subscription#getEventPackage()
	 */
	@Override
	public String getEventPackage() {
		return eventPackage;
	}

	//-----------------------------------------------------------------
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

}
