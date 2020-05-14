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
 *         This allows specifying a BA phone number along with a flag to identify
 *         if the number is active or
 *         not.             
 *       
 * 
 * <p>Java-Klasse für BroadWorksAnywhereLocationInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BroadWorksAnywhereLocationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationUri" type="{http://schema.broadsoft.com/xsi}URL" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://schema.broadsoft.com/xsi}Address"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="description" type="{http://schema.broadsoft.com/xsi}NonEmptyToken" minOccurs="0"/>
 *         &lt;element name="criteriaActivations" type="{http://schema.broadsoft.com/xsi}CriteriaActivationList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BroadWorksAnywhereLocationInfo", propOrder = {
    "locationUri",
    "phoneNumber",
    "active",
    "description",
    "criteriaActivations"
})
public class BroadWorksAnywhereLocationInfo {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String locationUri;
    @XmlElement(required = true)
    protected Address phoneNumber;
    protected Boolean active;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String description;
    protected CriteriaActivationList criteriaActivations;

    /**
     * Ruft den Wert der locationUri-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationUri() {
        return locationUri;
    }

    /**
     * Legt den Wert der locationUri-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationUri(String value) {
        this.locationUri = value;
    }

    /**
     * Ruft den Wert der phoneNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Legt den Wert der phoneNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setPhoneNumber(Address value) {
        this.phoneNumber = value;
    }

    /**
     * Ruft den Wert der active-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Legt den Wert der active-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der criteriaActivations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CriteriaActivationList }
     *     
     */
    public CriteriaActivationList getCriteriaActivations() {
        return criteriaActivations;
    }

    /**
     * Legt den Wert der criteriaActivations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CriteriaActivationList }
     *     
     */
    public void setCriteriaActivations(CriteriaActivationList value) {
        this.criteriaActivations = value;
    }

}
