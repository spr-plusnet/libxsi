//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="CollaborateRoom">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roomSessionInfo" type="{http://schema.broadsoft.com/xsi}CollaborateRoomSessionInfo" minOccurs="0"/>
 *         &lt;element name="roomParticipants" type="{http://schema.broadsoft.com/xsi}CollaborateRoomParticipants" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
