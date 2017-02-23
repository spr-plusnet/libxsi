//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="CallCollectingEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}CallEvent">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
