//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         Service Profile Information for group service.
 *         It is identical to the ServiceInstanceAddProfile, but without
 *         the password.
 *         Prior to release 17 this was called
 *         ServiceInstanceReadProfile.
 *       
 * 
 * <p>Java-Klasse für ServiceInstanceReadProfile complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServiceInstanceReadProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://schema.broadsoft.com/xsi}ServiceInstanceProfileName"/>
 *         &lt;element name="callingLineIdLastName" type="{http://schema.broadsoft.com/xsi}CallingLineIdLastName"/>
 *         &lt;element name="callingLineIdFirstName" type="{http://schema.broadsoft.com/xsi}CallingLineIdFirstName"/>
 *         &lt;element name="hiraganaLastName" type="{http://schema.broadsoft.com/xsi}HiraganaLastName" minOccurs="0"/>
 *         &lt;element name="hiraganaFirstName" type="{http://schema.broadsoft.com/xsi}HiraganaFirstName" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://schema.broadsoft.com/xsi}DN" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://schema.broadsoft.com/xsi}Extension" minOccurs="0"/>
 *         &lt;element name="department" type="{http://schema.broadsoft.com/xsi}DepartmentKey" minOccurs="0"/>
 *         &lt;element name="language" type="{http://schema.broadsoft.com/xsi}Language" minOccurs="0"/>
 *         &lt;element name="timeZone" type="{http://schema.broadsoft.com/xsi}TimeZone" minOccurs="0"/>
 *         &lt;element name="timeZoneDisplayName" type="{http://schema.broadsoft.com/xsi}TimeZoneDisplayName" minOccurs="0"/>
 *         &lt;element name="alias" type="{http://schema.broadsoft.com/xsi}SIPURI" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="publicUserIdentity" type="{http://schema.broadsoft.com/xsi}SIPURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceInstanceReadProfile", propOrder = {
    "name",
    "callingLineIdLastName",
    "callingLineIdFirstName",
    "hiraganaLastName",
    "hiraganaFirstName",
    "phoneNumber",
    "extension",
    "department",
    "language",
    "timeZone",
    "timeZoneDisplayName",
    "alias",
    "publicUserIdentity"
})
public class ServiceInstanceReadProfile {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String callingLineIdLastName;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String callingLineIdFirstName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String hiraganaLastName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String hiraganaFirstName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String phoneNumber;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String extension;
    protected DepartmentKey department;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String language;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String timeZone;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String timeZoneDisplayName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> alias;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String publicUserIdentity;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Ruft den Wert der hiraganaLastName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHiraganaLastName() {
        return hiraganaLastName;
    }

    /**
     * Legt den Wert der hiraganaLastName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHiraganaLastName(String value) {
        this.hiraganaLastName = value;
    }

    /**
     * Ruft den Wert der hiraganaFirstName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHiraganaFirstName() {
        return hiraganaFirstName;
    }

    /**
     * Legt den Wert der hiraganaFirstName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHiraganaFirstName(String value) {
        this.hiraganaFirstName = value;
    }

    /**
     * Ruft den Wert der phoneNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Legt den Wert der phoneNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
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
     * Ruft den Wert der department-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DepartmentKey }
     *     
     */
    public DepartmentKey getDepartment() {
        return department;
    }

    /**
     * Legt den Wert der department-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentKey }
     *     
     */
    public void setDepartment(DepartmentKey value) {
        this.department = value;
    }

    /**
     * Ruft den Wert der language-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Legt den Wert der language-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
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

    /**
     * Gets the value of the alias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAlias() {
        if (alias == null) {
            alias = new ArrayList<String>();
        }
        return this.alias;
    }

    /**
     * Ruft den Wert der publicUserIdentity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicUserIdentity() {
        return publicUserIdentity;
    }

    /**
     * Legt den Wert der publicUserIdentity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicUserIdentity(String value) {
        this.publicUserIdentity = value;
    }

}
