//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="BroadWorksAnywhereInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertAllLocationsForClickToDialCalls" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="alertAllLocationsForGroupPagingCalls" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="locations" type="{http://schema.broadsoft.com/xsi}BroadWorksAnywhereLocationInfoList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
