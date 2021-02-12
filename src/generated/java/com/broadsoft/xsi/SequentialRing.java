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
 *         Contains the Sequential Ring service configuration data.
 *         Sequential Ring allows you to sequentially ring up to 5 locations in addition
 *         to the base location for a
 *         specified number of rings. The 5 locations can be either a phone number or a
 *         SIP-URI. The feature applies to calls matching your pre-defined
 *         criteria. Use this service to ring calls from your manager, a family member, 
 *         or an important customer on your cell phone, alternate business phone, 
 *         or home phone. If the criteria do not match, the call continues as if 
 *         this service was not turned on. Via the XSI, the ability to create/edit 
 *         criteria is not provided. Only the ability to retrieve the
 *         list of criteria, defined by their name, and whether each criteria is
 *         active or not, is provided at this time.
 *       
 * 
 * <p>Java-Klasse für SequentialRing complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SequentialRing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ringBaseLocationFirst" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="baseLocationNumberOfRings" type="{http://schema.broadsoft.com/xsi}NumberOfRingsZeroToTwentyExcludeOne" minOccurs="0"/>
 *         &lt;element name="continueIfBaseLocationIsBusy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="callerMayStopSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="location1" type="{http://schema.broadsoft.com/xsi}SequentialRingLocation" minOccurs="0"/>
 *         &lt;element name="location2" type="{http://schema.broadsoft.com/xsi}SequentialRingLocation" minOccurs="0"/>
 *         &lt;element name="location3" type="{http://schema.broadsoft.com/xsi}SequentialRingLocation" minOccurs="0"/>
 *         &lt;element name="location4" type="{http://schema.broadsoft.com/xsi}SequentialRingLocation" minOccurs="0"/>
 *         &lt;element name="location5" type="{http://schema.broadsoft.com/xsi}SequentialRingLocation" minOccurs="0"/>
 *         &lt;element name="criteriaActivationList" type="{http://schema.broadsoft.com/xsi}CriteriaActivationList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SequentialRing", propOrder = {
    "ringBaseLocationFirst",
    "baseLocationNumberOfRings",
    "continueIfBaseLocationIsBusy",
    "callerMayStopSearch",
    "location1",
    "location2",
    "location3",
    "location4",
    "location5",
    "criteriaActivationList"
})
public class SequentialRing {

    protected Boolean ringBaseLocationFirst;
    protected Integer baseLocationNumberOfRings;
    protected Boolean continueIfBaseLocationIsBusy;
    protected Boolean callerMayStopSearch;
    protected SequentialRingLocation location1;
    protected SequentialRingLocation location2;
    protected SequentialRingLocation location3;
    protected SequentialRingLocation location4;
    protected SequentialRingLocation location5;
    protected CriteriaActivationList criteriaActivationList;

    /**
     * Ruft den Wert der ringBaseLocationFirst-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRingBaseLocationFirst() {
        return ringBaseLocationFirst;
    }

    /**
     * Legt den Wert der ringBaseLocationFirst-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRingBaseLocationFirst(Boolean value) {
        this.ringBaseLocationFirst = value;
    }

    /**
     * Ruft den Wert der baseLocationNumberOfRings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBaseLocationNumberOfRings() {
        return baseLocationNumberOfRings;
    }

    /**
     * Legt den Wert der baseLocationNumberOfRings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBaseLocationNumberOfRings(Integer value) {
        this.baseLocationNumberOfRings = value;
    }

    /**
     * Ruft den Wert der continueIfBaseLocationIsBusy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContinueIfBaseLocationIsBusy() {
        return continueIfBaseLocationIsBusy;
    }

    /**
     * Legt den Wert der continueIfBaseLocationIsBusy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContinueIfBaseLocationIsBusy(Boolean value) {
        this.continueIfBaseLocationIsBusy = value;
    }

    /**
     * Ruft den Wert der callerMayStopSearch-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCallerMayStopSearch() {
        return callerMayStopSearch;
    }

    /**
     * Legt den Wert der callerMayStopSearch-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCallerMayStopSearch(Boolean value) {
        this.callerMayStopSearch = value;
    }

    /**
     * Ruft den Wert der location1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SequentialRingLocation }
     *     
     */
    public SequentialRingLocation getLocation1() {
        return location1;
    }

    /**
     * Legt den Wert der location1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SequentialRingLocation }
     *     
     */
    public void setLocation1(SequentialRingLocation value) {
        this.location1 = value;
    }

    /**
     * Ruft den Wert der location2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SequentialRingLocation }
     *     
     */
    public SequentialRingLocation getLocation2() {
        return location2;
    }

    /**
     * Legt den Wert der location2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SequentialRingLocation }
     *     
     */
    public void setLocation2(SequentialRingLocation value) {
        this.location2 = value;
    }

    /**
     * Ruft den Wert der location3-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SequentialRingLocation }
     *     
     */
    public SequentialRingLocation getLocation3() {
        return location3;
    }

    /**
     * Legt den Wert der location3-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SequentialRingLocation }
     *     
     */
    public void setLocation3(SequentialRingLocation value) {
        this.location3 = value;
    }

    /**
     * Ruft den Wert der location4-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SequentialRingLocation }
     *     
     */
    public SequentialRingLocation getLocation4() {
        return location4;
    }

    /**
     * Legt den Wert der location4-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SequentialRingLocation }
     *     
     */
    public void setLocation4(SequentialRingLocation value) {
        this.location4 = value;
    }

    /**
     * Ruft den Wert der location5-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SequentialRingLocation }
     *     
     */
    public SequentialRingLocation getLocation5() {
        return location5;
    }

    /**
     * Legt den Wert der location5-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SequentialRingLocation }
     *     
     */
    public void setLocation5(SequentialRingLocation value) {
        this.location5 = value;
    }

    /**
     * Ruft den Wert der criteriaActivationList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CriteriaActivationList }
     *     
     */
    public CriteriaActivationList getCriteriaActivationList() {
        return criteriaActivationList;
    }

    /**
     * Legt den Wert der criteriaActivationList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CriteriaActivationList }
     *     
     */
    public void setCriteriaActivationList(CriteriaActivationList value) {
        this.criteriaActivationList = value;
    }

}
