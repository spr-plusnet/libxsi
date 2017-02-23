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
 *         The Call Answered event is generated when a call originated or received
 *         by the subscriber is answered.
 *         For a given call, there may be more than one Call Answered event
 *         generated. This can happened for instance if an Active call is
 *         redirected following a Blind Transfer request. In such case, the
 *         call will go back in Alerting state. Once the transferred
 *         destination answers the call, a new Call Answered event is
 *         generated. As a result, a total of two Call Answered events will
 *         have been received: the first one before the transfer (since the
 *         call was already in the active state prior to the transfer) and
 *         the second one after the successful transfer. The answerTime
 *         captured in the event always indicates the time of the first
 *         call answer. The call state is Active.
 *       
 * 
 * <p>Java-Klasse für CallAnsweredEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CallAnsweredEvent">
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
@XmlType(name = "CallAnsweredEvent")
public class CallAnsweredEvent
    extends CallEvent
{


}
