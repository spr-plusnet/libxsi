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
 * &lt;complexType name="CallAnsweredEvent"&gt;
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
@XmlType(name = "CallAnsweredEvent")
public class CallAnsweredEvent
    extends CallEvent
{


}
