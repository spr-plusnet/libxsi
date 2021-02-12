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
 *         The ACD Subscription event is issued immediately after a subscription
 *         is added or refreshed, provided that the subscription target is
 *         not a collection of subscriber (e.g. a group).
 *       
 * 
 * <p>Java-Klasse für ACDSubscriptionEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ACDSubscriptionEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData">
 *       &lt;sequence>
 *         &lt;element name="queueEntries" type="{http://schema.broadsoft.com/xsi}ACDQueueEntryList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACDSubscriptionEvent", propOrder = {
    "queueEntries"
})
@XmlSeeAlso({
    ACDSubscriptionResyncEvent.class
})
public class ACDSubscriptionEvent
    extends EventData
{

    protected ACDQueueEntryList queueEntries;

    /**
     * Ruft den Wert der queueEntries-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ACDQueueEntryList }
     *     
     */
    public ACDQueueEntryList getQueueEntries() {
        return queueEntries;
    }

    /**
     * Legt den Wert der queueEntries-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ACDQueueEntryList }
     *     
     */
    public void setQueueEntries(ACDQueueEntryList value) {
        this.queueEntries = value;
    }

}
