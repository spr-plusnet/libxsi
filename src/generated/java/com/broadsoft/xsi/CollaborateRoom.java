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
 *         This schema defines the information of a room which is active. 
 *         It will give current state of the room including the list of 
 *         participants and owner.
 *         Release Added: R21.0
 *       
 * 
 * <p>Java-Klasse für CollaborateRoom complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CollaborateRoom"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roomSessionInfo" type="{http://schema.broadsoft.com/xsi}CollaborateRoomSessionInfo" minOccurs="0"/&gt;
 *         &lt;element name="roomParticipants" type="{http://schema.broadsoft.com/xsi}CollaborateRoomParticipants" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollaborateRoom", propOrder = {
    "roomSessionInfo",
    "roomParticipants"
})
public class CollaborateRoom {

    protected CollaborateRoomSessionInfo roomSessionInfo;
    protected CollaborateRoomParticipants roomParticipants;

    /**
     * Ruft den Wert der roomSessionInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CollaborateRoomSessionInfo }
     *     
     */
    public CollaborateRoomSessionInfo getRoomSessionInfo() {
        return roomSessionInfo;
    }

    /**
     * Legt den Wert der roomSessionInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CollaborateRoomSessionInfo }
     *     
     */
    public void setRoomSessionInfo(CollaborateRoomSessionInfo value) {
        this.roomSessionInfo = value;
    }

    /**
     * Ruft den Wert der roomParticipants-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CollaborateRoomParticipants }
     *     
     */
    public CollaborateRoomParticipants getRoomParticipants() {
        return roomParticipants;
    }

    /**
     * Legt den Wert der roomParticipants-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CollaborateRoomParticipants }
     *     
     */
    public void setRoomParticipants(CollaborateRoomParticipants value) {
        this.roomParticipants = value;
    }

}
