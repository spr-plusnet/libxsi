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
 *         Sent whenever a collaboration is locked.
 *       
 * 
 * <p>Java-Klasse für CollaborateRoomLockedEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CollaborateRoomLockedEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="collaborateRoomParticipant" type="{http://schema.broadsoft.com/xsi}CollaborateRoomParticipant" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollaborateRoomLockedEvent", propOrder = {
    "collaborateRoomParticipant"
})
public class CollaborateRoomLockedEvent
    extends EventData
{

    protected CollaborateRoomParticipant collaborateRoomParticipant;

    /**
     * Ruft den Wert der collaborateRoomParticipant-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CollaborateRoomParticipant }
     *     
     */
    public CollaborateRoomParticipant getCollaborateRoomParticipant() {
        return collaborateRoomParticipant;
    }

    /**
     * Legt den Wert der collaborateRoomParticipant-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CollaborateRoomParticipant }
     *     
     */
    public void setCollaborateRoomParticipant(CollaborateRoomParticipant value) {
        this.collaborateRoomParticipant = value;
    }

}
