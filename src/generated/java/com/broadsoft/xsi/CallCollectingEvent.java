//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 *         The Call Collecting event is generated when BroadWorks needs to collect
 *         information by interacting with a subscriber. This event
 *         generated in two types of situation:
 * 
 *         i) When programming a service through a Feature Access Code. This
 *         happens for instance when a subscriber activates Call Forward
 *         Always.
 *         ii)When BroadWorks requires some information before calling the remote
 *         party. This happens for instance when a subscriber invoke the
 *         Calling Line ID Blocking service before dialing. This can also
 *         happen when BroadWorks require an authentication or accounting
 *         code before calling the remote party. Note that in these cases,
 *         the Call Collecting event is not generated if the service
 *         activation precedes the setup of a call and the destination is
 *         already known from the dialed digits.
 * 
 * 
 *         The callId and externalTrackingId is generated when the call is
 *         established with BroadWorks and included in the event. The call
 *         state is Active and the personality is originator. The address
 *         parameter of the remoteParty is set to the dialed digits.
 * 
 *       
 * 
 * <p>Java-Klasse für CallCollectingEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CallCollectingEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}CallEvent"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallCollectingEvent")
public class CallCollectingEvent
    extends CallEvent
{


}
