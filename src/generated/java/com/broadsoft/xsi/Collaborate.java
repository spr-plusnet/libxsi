//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bridgeInfo" type="{http://schema.broadsoft.com/xsi}CollaborateBridgeInfo" minOccurs="0"/&gt;
 *         &lt;element name="rooms" type="{http://schema.broadsoft.com/xsi}CollaborateRoomList" minOccurs="0"/&gt;
 *         &lt;element name="commonInstantRoomSettings" type="{http://schema.broadsoft.com/xsi}CommonInstantRoomSettings" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
