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
 * &lt;complexType name="ExecutiveScreening"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enableScreening" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="screeningAlertType" type="{http://schema.broadsoft.com/xsi}ExecutiveScreeningAlertType" minOccurs="0"/&gt;
 *         &lt;element name="alertBroadWorksMobilityLocation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="alertBroadWorksAnywhereLocations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="alertSharedCallAppearanceLocations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
