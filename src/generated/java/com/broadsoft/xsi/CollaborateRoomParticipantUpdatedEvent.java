//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Sent when one or more participants have their participant
 *         information updated.
 *       
 * 
 * <p>Java-Klasse für CollaborateRoomParticipantUpdatedEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CollaborateRoomParticipantUpdatedEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData">
 *       &lt;sequence>
 *         &lt;element name="collaborateRoomParticipants" type="{http://schema.broadsoft.com/xsi}CollaborateRoomParticipants"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollaborateRoomParticipantUpdatedEvent", propOrder = {
    "collaborateRoomParticipants"
})
public class CollaborateRoomParticipantUpdatedEvent
    extends EventData
{

    @XmlElement(required = true)
    protected CollaborateRoomParticipants collaborateRoomParticipants;

    /**
     * Ruft den Wert der collaborateRoomParticipants-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CollaborateRoomParticipants }
     *     
     */
    public CollaborateRoomParticipants getCollaborateRoomParticipants() {
        return collaborateRoomParticipants;
    }

    /**
     * Legt den Wert der collaborateRoomParticipants-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CollaborateRoomParticipants }
     *     
     */
    public void setCollaborateRoomParticipants(CollaborateRoomParticipants value) {
        this.collaborateRoomParticipants = value;
    }

}
