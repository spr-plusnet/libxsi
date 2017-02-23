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


/**
 * 
 *         Defines the common settings for all Instant Rooms. 
 *         Release Added R21.0.
 *       
 * 
 * <p>Java-Klasse für CommonInstantRoomSettings complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CommonInstantRoomSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="endSessionOnOwnerExit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ownerRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="attendeeNotification" type="{http://schema.broadsoft.com/xsi}CollaborateRoomAttendeeNotification" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonInstantRoomSettings", propOrder = {
    "endSessionOnOwnerExit",
    "ownerRequired",
    "attendeeNotification"
})
public class CommonInstantRoomSettings {

    protected Boolean endSessionOnOwnerExit;
    protected Boolean ownerRequired;
    @XmlSchemaType(name = "token")
    protected CollaborateRoomAttendeeNotification attendeeNotification;

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

}
