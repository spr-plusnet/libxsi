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
 *         The Call Received event is sent when a subscriber receives an
 *         incoming call.
 * 
 *         For subscriptions to the Advanced Call 2 event package, the event is
 *         generated prior to service processing (e.g. CFA).
 * 
 *         For subscriptions to the Basic Call event package or the Advanced Call
 *         event package, the event is generated after service processing.
 *         If the call is forwarded to a new destination, or rejected
 *         without alerting the user's device(s) (e.g. do not disturb),
 *         then the event is not generated.
 * 
 *         This event is also generated in cases where the subscriber is being
 *         recalled (e.g. call transfer recall). It contains information on
 *         the caller in the remoteParty parameter.
 * 
 *         The call state is Alerting and the personality is terminator.
 *       
 * 
 * <p>Java-Klasse für CallReceivedEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CallReceivedEvent"&gt;
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
@XmlType(name = "CallReceivedEvent")
public class CallReceivedEvent
    extends CallEvent
{


}
