//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Contains the BroadWorks Anywhere service configuration data.
 *         BroadWorks Anywhere allows you to link fixed and mobile phones to a user
 *         account.
 *         
 *         Change History:
 *         R19.0 - Added alertAllLocationsForGroupPagingCalls.
 *       
 * 
 * <p>Java-Klasse für BroadWorksAnywhereInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BroadWorksAnywhereInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alertAllLocationsForClickToDialCalls" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="alertAllLocationsForGroupPagingCalls" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="locations" type="{http://schema.broadsoft.com/xsi}BroadWorksAnywhereLocationInfoList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BroadWorksAnywhereInfo", propOrder = {
    "alertAllLocationsForClickToDialCalls",
    "alertAllLocationsForGroupPagingCalls",
    "locations"
})
public class BroadWorksAnywhereInfo {

    protected Boolean alertAllLocationsForClickToDialCalls;
    protected Boolean alertAllLocationsForGroupPagingCalls;
    protected BroadWorksAnywhereLocationInfoList locations;

    /**
     * Ruft den Wert der alertAllLocationsForClickToDialCalls-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlertAllLocationsForClickToDialCalls() {
        return alertAllLocationsForClickToDialCalls;
    }

    /**
     * Legt den Wert der alertAllLocationsForClickToDialCalls-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlertAllLocationsForClickToDialCalls(Boolean value) {
        this.alertAllLocationsForClickToDialCalls = value;
    }

    /**
     * Ruft den Wert der alertAllLocationsForGroupPagingCalls-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlertAllLocationsForGroupPagingCalls() {
        return alertAllLocationsForGroupPagingCalls;
    }

    /**
     * Legt den Wert der alertAllLocationsForGroupPagingCalls-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlertAllLocationsForGroupPagingCalls(Boolean value) {
        this.alertAllLocationsForGroupPagingCalls = value;
    }

    /**
     * Ruft den Wert der locations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BroadWorksAnywhereLocationInfoList }
     *     
     */
    public BroadWorksAnywhereLocationInfoList getLocations() {
        return locations;
    }

    /**
     * Legt den Wert der locations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BroadWorksAnywhereLocationInfoList }
     *     
     */
    public void setLocations(BroadWorksAnywhereLocationInfoList value) {
        this.locations = value;
    }

}
