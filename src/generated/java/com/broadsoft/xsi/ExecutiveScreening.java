//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Get the screening setting of an executive.
 *         Change History:
 *         R20.0 – Added.
 *       
 * 
 * <p>Java-Klasse für ExecutiveScreening complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ExecutiveScreening">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enableScreening" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="screeningAlertType" type="{http://schema.broadsoft.com/xsi}ExecutiveScreeningAlertType" minOccurs="0"/>
 *         &lt;element name="alertBroadWorksMobilityLocation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="alertBroadWorksAnywhereLocations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="alertSharedCallAppearanceLocations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecutiveScreening", propOrder = {
    "enableScreening",
    "screeningAlertType",
    "alertBroadWorksMobilityLocation",
    "alertBroadWorksAnywhereLocations",
    "alertSharedCallAppearanceLocations"
})
public class ExecutiveScreening {

    protected Boolean enableScreening;
    @XmlSchemaType(name = "token")
    protected ExecutiveScreeningAlertType screeningAlertType;
    protected Boolean alertBroadWorksMobilityLocation;
    protected Boolean alertBroadWorksAnywhereLocations;
    protected Boolean alertSharedCallAppearanceLocations;

    /**
     * Ruft den Wert der enableScreening-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableScreening() {
        return enableScreening;
    }

    /**
     * Legt den Wert der enableScreening-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableScreening(Boolean value) {
        this.enableScreening = value;
    }

    /**
     * Ruft den Wert der screeningAlertType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExecutiveScreeningAlertType }
     *     
     */
    public ExecutiveScreeningAlertType getScreeningAlertType() {
        return screeningAlertType;
    }

    /**
     * Legt den Wert der screeningAlertType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutiveScreeningAlertType }
     *     
     */
    public void setScreeningAlertType(ExecutiveScreeningAlertType value) {
        this.screeningAlertType = value;
    }

    /**
     * Ruft den Wert der alertBroadWorksMobilityLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlertBroadWorksMobilityLocation() {
        return alertBroadWorksMobilityLocation;
    }

    /**
     * Legt den Wert der alertBroadWorksMobilityLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlertBroadWorksMobilityLocation(Boolean value) {
        this.alertBroadWorksMobilityLocation = value;
    }

    /**
     * Ruft den Wert der alertBroadWorksAnywhereLocations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlertBroadWorksAnywhereLocations() {
        return alertBroadWorksAnywhereLocations;
    }

    /**
     * Legt den Wert der alertBroadWorksAnywhereLocations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlertBroadWorksAnywhereLocations(Boolean value) {
        this.alertBroadWorksAnywhereLocations = value;
    }

    /**
     * Ruft den Wert der alertSharedCallAppearanceLocations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlertSharedCallAppearanceLocations() {
        return alertSharedCallAppearanceLocations;
    }

    /**
     * Legt den Wert der alertSharedCallAppearanceLocations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlertSharedCallAppearanceLocations(Boolean value) {
        this.alertSharedCallAppearanceLocations = value;
    }

}
