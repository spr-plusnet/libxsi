//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="CollaborateRoomSubscriptionEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData">
 *       &lt;sequence>
 *         &lt;element name="conference" type="{http://schema.broadsoft.com/xsi}CollaborateRoom" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
