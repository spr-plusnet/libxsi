//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         Defines the details of an instance of an active Collaboration
 *         Release Added R21.0
 *       
 * 
 * <p>Java-Klasse für CollaborateRoomInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CollaborateRoomInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomType" type="{http://schema.broadsoft.com/xsi}CollaborateRoomType" minOccurs="0"/>
 *         &lt;element name="roomId" type="{http://schema.broadsoft.com/xsi}CollaborateRoomId" minOccurs="0"/>
 *         &lt;element name="endSessionOnOwnerExit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ownerRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="attendeeNotification" type="{http://schema.broadsoft.com/xsi}CollaborateRoomAttendeeNotification" minOccurs="0"/>
 *         &lt;element name="roomSchedule" type="{http://schema.broadsoft.com/xsi}CollaborateRoomSchedule" minOccurs="0"/>
 *         &lt;element name="instantRoomDuration" type="{http://schema.broadsoft.com/xsi}CollaborateInstantRoomDuration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollaborateRoomInfo", propOrder = {
    "name",
    "roomType",
    "roomId",
    "endSessionOnOwnerExit",
    "ownerRequired",
    "attendeeNotification",
    "roomSchedule",
    "instantRoomDuration"
})
public class CollaborateRoomInfo {

    protected String name;
    @XmlSchemaType(name = "token")
    protected CollaborateRoomType roomType;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String roomId;
    protected Boolean endSessionOnOwnerExit;
    protected Boolean ownerRequired;
    @XmlSchemaType(name = "token")
    protected CollaborateRoomAttendeeNotification attendeeNotification;
    protected CollaborateRoomSchedule roomSchedule;
    protected CollaborateInstantRoomDuration instantRoomDuration;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der roomType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CollaborateRoomType }
     *     
     */
    public CollaborateRoomType getRoomType() {
        return roomType;
    }

    /**
     * Legt den Wert der roomType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CollaborateRoomType }
     *     
     */
    public void setRoomType(CollaborateRoomType value) {
        this.roomType = value;
    }

    /**
     * Ruft den Wert der roomId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomId() {
        return roomId;
    }

    /**
     * Legt den Wert der roomId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomId(String value) {
        this.roomId = value;
    }

    /**
     * Ruft den Wert der endSessionOnOwnerExit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndSessionOnOwnerExit() {
        return endSessionOnOwnerExit;
    }

    /**
     * Legt den Wert der endSessionOnOwnerExit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndSessionOnOwnerExit(Boolean value) {
        this.endSessionOnOwnerExit = value;
    }

    /**
     * Ruft den Wert der ownerRequired-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOwnerRequired() {
        return ownerRequired;
    }

    /**
     * Legt den Wert der ownerRequired-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOwnerRequired(Boolean value) {
        this.ownerRequired = value;
    }

    /**
     * Ruft den Wert der attendeeNotification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CollaborateRoomAttendeeNotification }
     *     
     */
    public CollaborateRoomAttendeeNotification getAttendeeNotification() {
        return attendeeNotification;
    }

    /**
     * Legt den Wert der attendeeNotification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CollaborateRoomAttendeeNotification }
     *     
     */
    public void setAttendeeNotification(CollaborateRoomAttendeeNotification value) {
        this.attendeeNotification = value;
    }

    /**
     * Ruft den Wert der roomSchedule-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CollaborateRoomSchedule }
     *     
     */
    public CollaborateRoomSchedule getRoomSchedule() {
        return roomSchedule;
    }

    /**
     * Legt den Wert der roomSchedule-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CollaborateRoomSchedule }
     *     
     */
    public void setRoomSchedule(CollaborateRoomSchedule value) {
        this.roomSchedule = value;
    }

    /**
     * Ruft den Wert der instantRoomDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CollaborateInstantRoomDuration }
     *     
     */
    public CollaborateInstantRoomDuration getInstantRoomDuration() {
        return instantRoomDuration;
    }

    /**
     * Legt den Wert der instantRoomDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CollaborateInstantRoomDuration }
     *     
     */
    public void setInstantRoomDuration(CollaborateInstantRoomDuration value) {
        this.instantRoomDuration = value;
    }

}
