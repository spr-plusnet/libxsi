//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="details" type="{http://schema.broadsoft.com/xsi}UserDetails"/>
 *         &lt;element name="additionalDetails" type="{http://schema.broadsoft.com/xsi}UserAdditionalDetails"/>
 *         &lt;element name="passwordExpiresDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fac" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="registrations" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="scheduleList" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="portalPasswordChange" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://schema.broadsoft.com/xsi}CountryCode" minOccurs="0"/>
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
    "details",
    "additionalDetails",
    "passwordExpiresDays",
    "fac",
    "registrations",
    "scheduleList",
    "portalPasswordChange",
    "countryCode"
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

}
