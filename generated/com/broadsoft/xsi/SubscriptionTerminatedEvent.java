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
 *         SubscriptionTerminatedEvent is a generic event used to report that the specified subscription
 *         has been terminated.
 *         Note that there are multiple ways a subscription can be terminated such
 *         as:
 *         -Application requests termination of Subscription
 *         - Subscription expiration
 *         - Change in the Privacy settings of the targetId for a subscription
 *         - Manual deletion by an administrator.
 *             
 * 
 * <p>Java-Klasse für SubscriptionTerminatedEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionTerminatedEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionTerminatedEvent")
public class SubscriptionTerminatedEvent
    extends EventData
{


}
