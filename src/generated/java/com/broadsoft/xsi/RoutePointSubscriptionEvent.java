//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The Route Point Subscription event is issued immediately after a
 *         subscription is added or refreshed, provided that the
 *         subscription target is not a collection of subscriber (e.g. a
 *         group).
 *             
 * 
 * <p>Java-Klasse für RoutePointSubscriptionEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RoutePointSubscriptionEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData">
 *       &lt;sequence>
 *         &lt;element name="queueEntries" type="{http://schema.broadsoft.com/xsi}RoutePointQueueEntryList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutePointSubscriptionEvent", propOrder = {
    "queueEntries"
})
@XmlSeeAlso({
    RoutePointSubscriptionResyncEvent.class
})
public class RoutePointSubscriptionEvent
    extends EventData
{

    protected RoutePointQueueEntryList queueEntries;

    /**
     * Ruft den Wert der queueEntries-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoutePointQueueEntryList }
     *     
     */
    public RoutePointQueueEntryList getQueueEntries() {
        return queueEntries;
    }

    /**
     * Legt den Wert der queueEntries-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutePointQueueEntryList }
     *     
     */
    public void setQueueEntries(RoutePointQueueEntryList value) {
        this.queueEntries = value;
    }

}
