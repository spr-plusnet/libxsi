/**
 * 
 */
package com.broadsoft.xsi.api;

import com.broadsoft.xsi.SubscriptionEvent;


/**
 * @author prelle
 *
 */
public interface EventChannelListener {
	
	public void channelStateChanged(EventChannel channel, ConnectionState state);
	
	public void onXSIEvent(EventChannel channel, SubscriptionEvent event);
	
}
