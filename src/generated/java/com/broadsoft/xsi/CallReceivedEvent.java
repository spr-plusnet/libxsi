//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="CallReceivedEvent">
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
@XmlType(name = "CallReceivedEvent")
public class CallReceivedEvent
    extends CallEvent
{


}
