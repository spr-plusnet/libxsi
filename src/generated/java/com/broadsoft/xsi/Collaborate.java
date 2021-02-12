//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bridgeInfo" type="{http://schema.broadsoft.com/xsi}CollaborateBridgeInfo" minOccurs="0"/>
 *         &lt;element name="rooms" type="{http://schema.broadsoft.com/xsi}CollaborateRoomList" minOccurs="0"/>
 *         &lt;element name="commonInstantRoomSettings" type="{http://schema.broadsoft.com/xsi}CommonInstantRoomSettings" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bridgeInfo",
    "rooms",
    "commonInstantRoomSettings"
})
@XmlRootElement(name = "Collaborate")
public class Collaborate {

    protected CollaborateBridgeInfo bridgeInfo;
    protected CollaborateRoomList rooms;
    protected CommonInstantRoomSettings commonInstantRoomSettings;

    /**
     * Ruft den Wert der bridgeInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CollaborateBridgeInfo }
     *     
     */
    public CollaborateBridgeInfo getBridgeInfo() {
        return bridgeInfo;
    }

    /**
     * Legt den Wert der bridgeInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CollaborateBridgeInfo }
     *     
     */
    public void setBridgeInfo(CollaborateBridgeInfo value) {
        this.bridgeInfo = value;
    }

    /**
     * Ruft den Wert der rooms-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CollaborateRoomList }
     *     
     */
    public CollaborateRoomList getRooms() {
        return rooms;
    }

    /**
     * Legt den Wert der rooms-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CollaborateRoomList }
     *     
     */
    public void setRooms(CollaborateRoomList value) {
        this.rooms = value;
    }

    /**
     * Ruft den Wert der commonInstantRoomSettings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CommonInstantRoomSettings }
     *     
     */
    public CommonInstantRoomSettings getCommonInstantRoomSettings() {
        return commonInstantRoomSettings;
    }

    /**
     * Legt den Wert der commonInstantRoomSettings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonInstantRoomSettings }
     *     
     */
    public void setCommonInstantRoomSettings(CommonInstantRoomSettings value) {
        this.commonInstantRoomSettings = value;
    }

}
