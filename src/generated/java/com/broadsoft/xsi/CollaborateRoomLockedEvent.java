//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="CollaborateRoomLockedEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData">
 *       &lt;sequence>
 *         &lt;element name="collaborateRoomParticipant" type="{http://schema.broadsoft.com/xsi}CollaborateRoomParticipant" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
