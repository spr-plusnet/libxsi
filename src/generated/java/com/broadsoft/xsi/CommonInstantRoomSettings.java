//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="CommonInstantRoomSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="endSessionOnOwnerExit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ownerRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="attendeeNotification" type="{http://schema.broadsoft.com/xsi}CollaborateRoomAttendeeNotification" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
