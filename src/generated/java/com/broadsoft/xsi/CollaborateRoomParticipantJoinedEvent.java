//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         Sent when one or more participants join a collaboration.
 *         
 *         Change History:
 *         21.0 - added.
 *       
 * 
 * <p>Java-Klasse für CollaborateRoomParticipantJoinedEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CollaborateRoomParticipantJoinedEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="collaborateRoomParticipants" type="{http://schema.broadsoft.com/xsi}CollaborateRoomParticipants"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollaborateRoomParticipantJoinedEvent", propOrder = {
    "collaborateRoomParticipants"
})
public class CollaborateRoomParticipantJoinedEvent
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
