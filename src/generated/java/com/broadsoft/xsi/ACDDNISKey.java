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
 *         &lt;element name="dnisPhoneNumber" type="{http://schema.broadsoft.com/xsi}DN" minOccurs="0"/&gt;
 *         &lt;element name="extension" type="{http://schema.broadsoft.com/xsi}Extension" minOccurs="0"/&gt;
 *         &lt;element name="useCustomCLIDSettings" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="callingLineIdPhoneNumber" type="{http://schema.broadsoft.com/xsi}DN" minOccurs="0"/&gt;
 *         &lt;element name="callingLineIdLastName" type="{http://schema.broadsoft.com/xsi}CallingLineIdLastName" minOccurs="0"/&gt;
 *         &lt;element name="callingLineIdFirstName" type="{http://schema.broadsoft.com/xsi}CallingLineIdFirstName" minOccurs="0"/&gt;
 *         &lt;element name="useCustomDnisAnnouncementSettings" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="priority" type="{http://schema.broadsoft.com/xsi}ACDPriorityType"/&gt;
 *         &lt;element name="allowOutgoingACDCall" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "dnisPhoneNumber",
    "extension",
    "useCustomCLIDSettings",
    "callingLineIdPhoneNumber",
    "callingLineIdLastName",
    "callingLineIdFirstName",
    "useCustomDnisAnnouncementSettings",
    "priority",
    "allowOutgoingACDCall"
})
@XmlRootElement(name = "ACDDNISKey")
public class ACDDNISKey {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String dnisPhoneNumber;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String extension;
    protected Boolean useCustomCLIDSettings;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String callingLineIdPhoneNumber;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String callingLineIdLastName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String callingLineIdFirstName;
    protected Boolean useCustomDnisAnnouncementSettings;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String priority;
    protected Boolean allowOutgoingACDCall;

    /**
     * Ruft den Wert der dnisPhoneNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnisPhoneNumber() {
        return dnisPhoneNumber;
    }

    /**
     * Legt den Wert der dnisPhoneNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDnisPhoneNumber(String value) {
        this.dnisPhoneNumber = value;
    }

    /**
     * Ruft den Wert der extension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Legt den Wert der extension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * Ruft den Wert der useCustomCLIDSettings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseCustomCLIDSettings() {
        return useCustomCLIDSettings;
    }

    /**
     * Legt den Wert der useCustomCLIDSettings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseCustomCLIDSettings(Boolean value) {
        this.useCustomCLIDSettings = value;
    }

    /**
     * Ruft den Wert der callingLineIdPhoneNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingLineIdPhoneNumber() {
        return callingLineIdPhoneNumber;
    }

    /**
     * Legt den Wert der callingLineIdPhoneNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingLineIdPhoneNumber(String value) {
        this.callingLineIdPhoneNumber = value;
    }

    /**
     * Ruft den Wert der callingLineIdLastName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingLineIdLastName() {
        return callingLineIdLastName;
    }

    /**
     * Legt den Wert der callingLineIdLastName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingLineIdLastName(String value) {
        this.callingLineIdLastName = value;
    }

    /**
     * Ruft den Wert der callingLineIdFirstName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingLineIdFirstName() {
        return callingLineIdFirstName;
    }

    /**
     * Legt den Wert der callingLineIdFirstName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingLineIdFirstName(String value) {
        this.callingLineIdFirstName = value;
    }

    /**
     * Ruft den Wert der useCustomDnisAnnouncementSettings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseCustomDnisAnnouncementSettings() {
        return useCustomDnisAnnouncementSettings;
    }

    /**
     * Legt den Wert der useCustomDnisAnnouncementSettings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseCustomDnisAnnouncementSettings(Boolean value) {
        this.useCustomDnisAnnouncementSettings = value;
    }

    /**
     * Ruft den Wert der priority-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Legt den Wert der priority-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Ruft den Wert der allowOutgoingACDCall-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowOutgoingACDCall() {
        return allowOutgoingACDCall;
    }

    /**
     * Legt den Wert der allowOutgoingACDCall-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowOutgoingACDCall(Boolean value) {
        this.allowOutgoingACDCall = value;
    }

}
