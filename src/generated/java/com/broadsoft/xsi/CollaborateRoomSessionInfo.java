//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
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
 *         including the clientSessionInfo parameter used to link the 
 *         collaboration and the chat room.
 *         Release Added R21
 *       
 * 
 * <p>Java-Klasse für CollaborateRoomSessionInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CollaborateRoomSessionInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roomType" type="{http://schema.broadsoft.com/xsi}CollaborateRoomType" minOccurs="0"/>
 *         &lt;element name="roomId" type="{http://schema.broadsoft.com/xsi}CollaborateRoomId" minOccurs="0"/>
 *         &lt;element name="locked" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/>
 *         &lt;element name="clientSessionInfo" type="{http://schema.broadsoft.com/xsi}ClientSessionInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollaborateRoomSessionInfo", propOrder = {
    "roomType",
    "roomId",
    "locked",
    "clientSessionInfo"
})
public class CollaborateRoomSessionInfo {

    @XmlSchemaType(name = "token")
    protected CollaborateRoomType roomType;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String roomId;
    protected EmptyContent locked;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String clientSessionInfo;

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
     * Ruft den Wert der locked-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getLocked() {
        return locked;
    }

    /**
     * Legt den Wert der locked-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setLocked(EmptyContent value) {
        this.locked = value;
    }

    /**
     * Ruft den Wert der clientSessionInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientSessionInfo() {
        return clientSessionInfo;
    }

    /**
     * Legt den Wert der clientSessionInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientSessionInfo(String value) {
        this.clientSessionInfo = value;
    }

}
