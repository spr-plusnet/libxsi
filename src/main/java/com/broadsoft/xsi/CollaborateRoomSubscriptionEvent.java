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
 *         Initial event sent for the Collaborate event package.
 *         The CollaborateRoomSubscriptionEvent is generated whenever 
 *         a subscription to a collaborate room is added or refreshed.
 *       
 * 
 * <p>Java-Klasse für CollaborateRoomSubscriptionEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CollaborateRoomSubscriptionEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conference" type="{http://schema.broadsoft.com/xsi}CollaborateRoom" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollaborateRoomSubscriptionEvent", propOrder = {
    "conference"
})
@XmlSeeAlso({
    CollaborateRoomSubscriptionResyncEvent.class
})
public class CollaborateRoomSubscriptionEvent
    extends EventData
{

    protected CollaborateRoom conference;

    /**
     * Ruft den Wert der conference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CollaborateRoom }
     *     
     */
    public CollaborateRoom getConference() {
        return conference;
    }

    /**
     * Legt den Wert der conference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CollaborateRoom }
     *     
     */
    public void setConference(CollaborateRoom value) {
        this.conference = value;
    }

}
