//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="CollaborateRoomEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="collaborateRoomInfo" type="{http://schema.broadsoft.com/xsi}CollaborateRoomEventInfo"/>
 *         &lt;element name="collaborateRoomParticipants" type="{http://schema.broadsoft.com/xsi}CollaborateRoomParticipants"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
