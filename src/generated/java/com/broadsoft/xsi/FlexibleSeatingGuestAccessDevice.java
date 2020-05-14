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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         Device associated with a flexible seating guest.
 *         Change History:
 *         R20.0 – Added.
 *       
 * 
 * <p>Java-Klasse für FlexibleSeatingGuestAccessDevice complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FlexibleSeatingGuestAccessDevice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deviceName" type="{http://schema.broadsoft.com/xsi}AccessDeviceName"/>
 *         &lt;element name="deviceLevel" type="{http://schema.broadsoft.com/xsi}AccessDeviceLevel"/>
 *         &lt;element name="deviceLinePort" type="{http://schema.broadsoft.com/xsi}AccessDeviceEndpointLinePort" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlexibleSeatingGuestAccessDevice", propOrder = {
    "deviceName",
    "deviceLevel",
    "deviceLinePort"
})
public class FlexibleSeatingGuestAccessDevice {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String deviceName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected AccessDeviceLevel deviceLevel;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String deviceLinePort;

    /**
     * Ruft den Wert der deviceName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Legt den Wert der deviceName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceName(String value) {
        this.deviceName = value;
    }

    /**
     * Ruft den Wert der deviceLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessDeviceLevel }
     *     
     */
    public AccessDeviceLevel getDeviceLevel() {
        return deviceLevel;
    }

    /**
     * Legt den Wert der deviceLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessDeviceLevel }
     *     
     */
    public void setDeviceLevel(AccessDeviceLevel value) {
        this.deviceLevel = value;
    }

    /**
     * Ruft den Wert der deviceLinePort-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceLinePort() {
        return deviceLinePort;
    }

    /**
     * Legt den Wert der deviceLinePort-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceLinePort(String value) {
        this.deviceLinePort = value;
    }

}
