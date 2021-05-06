//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="RoutePointSubscriptionEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="queueEntries" type="{http://schema.broadsoft.com/xsi}RoutePointQueueEntryList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
