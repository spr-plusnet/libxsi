//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="details" type="{http://schema.broadsoft.com/xsi}UserDetails"/&gt;
 *         &lt;element name="additionalDetails" type="{http://schema.broadsoft.com/xsi}UserAdditionalDetails"/&gt;
 *         &lt;element name="passwordExpiresDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="fac" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="registrations" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="scheduleList" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="portalPasswordChange" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="countryCode" type="{http://schema.broadsoft.com/xsi}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="nationalPrefix" type="{http://schema.broadsoft.com/xsi}NationalPrefix" minOccurs="0"/&gt;
 *         &lt;element name="timeZone" type="{http://schema.broadsoft.com/xsi}TimeZone" minOccurs="0"/&gt;
 *         &lt;element name="timeZoneDisplayName" type="{http://schema.broadsoft.com/xsi}TimeZoneDisplayName" minOccurs="0"/&gt;
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
    "details",
    "additionalDetails",
    "passwordExpiresDays",
    "fac",
    "registrations",
    "scheduleList",
    "portalPasswordChange",
    "countryCode",
    "nationalPrefix",
    "timeZone",
    "timeZoneDisplayName"
})
@XmlRootElement(name = "Profile")
public class Profile {

    @XmlElement(required = true)
    protected UserDetails details;
    @XmlElement(required = true)
    protected UserAdditionalDetails additionalDetails;
    protected Integer passwordExpiresDays;
    @XmlSchemaType(name = "anyURI")
    protected String fac;
    @XmlSchemaType(name = "anyURI")
    protected String registrations;
    @XmlSchemaType(name = "anyURI")
    protected String scheduleList;
    @XmlSchemaType(name = "anyURI")
    protected String portalPasswordChange;
    protected Integer countryCode;
    protected Integer nationalPrefix;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String timeZone;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String timeZoneDisplayName;

    /**
     * Ruft den Wert der details-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserDetails }
     *     
     */
    public UserDetails getDetails() {
        return details;
    }

    /**
     * Legt den Wert der details-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDetails }
     *     
     */
    public void setDetails(UserDetails value) {
        this.details = value;
    }

    /**
     * Ruft den Wert der additionalDetails-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserAdditionalDetails }
     *     
     */
    public UserAdditionalDetails getAdditionalDetails() {
        return additionalDetails;
    }

    /**
     * Legt den Wert der additionalDetails-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAdditionalDetails }
     *     
     */
    public void setAdditionalDetails(UserAdditionalDetails value) {
        this.additionalDetails = value;
    }

    /**
     * Ruft den Wert der passwordExpiresDays-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPasswordExpiresDays() {
        return passwordExpiresDays;
    }

    /**
     * Legt den Wert der passwordExpiresDays-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPasswordExpiresDays(Integer value) {
        this.passwordExpiresDays = value;
    }

    /**
     * Ruft den Wert der fac-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFac() {
        return fac;
    }

    /**
     * Legt den Wert der fac-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFac(String value) {
        this.fac = value;
    }

    /**
     * Ruft den Wert der registrations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrations() {
        return registrations;
    }

    /**
     * Legt den Wert der registrations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrations(String value) {
        this.registrations = value;
    }

    /**
     * Ruft den Wert der scheduleList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleList() {
        return scheduleList;
    }

    /**
     * Legt den Wert der scheduleList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleList(String value) {
        this.scheduleList = value;
    }

    /**
     * Ruft den Wert der portalPasswordChange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortalPasswordChange() {
        return portalPasswordChange;
    }

    /**
     * Legt den Wert der portalPasswordChange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortalPasswordChange(String value) {
        this.portalPasswordChange = value;
    }

    /**
     * Ruft den Wert der countryCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountryCode() {
        return countryCode;
    }

    /**
     * Legt den Wert der countryCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountryCode(Integer value) {
        this.countryCode = value;
    }

    /**
     * Ruft den Wert der nationalPrefix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNationalPrefix() {
        return nationalPrefix;
    }

    /**
     * Legt den Wert der nationalPrefix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNationalPrefix(Integer value) {
        this.nationalPrefix = value;
    }

    /**
     * Ruft den Wert der timeZone-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Legt den Wert der timeZone-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Ruft den Wert der timeZoneDisplayName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneDisplayName() {
        return timeZoneDisplayName;
    }

    /**
     * Legt den Wert der timeZoneDisplayName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneDisplayName(String value) {
        this.timeZoneDisplayName = value;
    }

}
