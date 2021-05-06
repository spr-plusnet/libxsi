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
 *         This schema defines the information of a
 *         collaboration which is active.It will give current state of
 *         the collaboration
 *       
 * 
 * <p>Java-Klasse für CollaborateRoomEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CollaborateRoomEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="collaborateRoomInfo" type="{http://schema.broadsoft.com/xsi}CollaborateRoomEventInfo"/&gt;
 *         &lt;element name="collaborateRoomParticipants" type="{http://schema.broadsoft.com/xsi}CollaborateRoomParticipants"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollaborateRoomEvent", propOrder = {
    "collaborateRoomInfo",
    "collaborateRoomParticipants"
})
public class CollaborateRoomEvent {

    @XmlElement(required = true)
    protected CollaborateRoomEventInfo collaborateRoomInfo;
    @XmlElement(required = true)
    protected CollaborateRoomParticipants collaborateRoomParticipants;

    /**
     * Ruft den Wert der collaborateRoomInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CollaborateRoomEventInfo }
     *     
     */
    public CollaborateRoomEventInfo getCollaborateRoomInfo() {
        return collaborateRoomInfo;
    }

    /**
     * Legt den Wert der collaborateRoomInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CollaborateRoomEventInfo }
     *     
     */
    public void setCollaborateRoomInfo(CollaborateRoomEventInfo value) {
        this.collaborateRoomInfo = value;
    }

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
