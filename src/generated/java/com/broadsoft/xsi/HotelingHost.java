//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo">
 *       &lt;sequence>
 *         &lt;element name="enforceAssociationLimit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="associationLimitHours" type="{http://schema.broadsoft.com/xsi}HotelingAssociationLimitHours" minOccurs="0"/>
 *         &lt;element name="accessLevel" type="{http://schema.broadsoft.com/xsi}HotelingHostAccessLevel" minOccurs="0"/>
 *         &lt;element name="removeGuestAssociation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="guestLastName" type="{http://schema.broadsoft.com/xsi}LastName" minOccurs="0"/>
 *         &lt;element name="guestFirstName" type="{http://schema.broadsoft.com/xsi}FirstName" minOccurs="0"/>
 *         &lt;element name="guestPhoneNumber" type="{http://schema.broadsoft.com/xsi}DN" minOccurs="0"/>
 *         &lt;element name="guestExtension" type="{http://schema.broadsoft.com/xsi}Extension" minOccurs="0"/>
 *         &lt;element name="guestLocationDialingCode" type="{http://schema.broadsoft.com/xsi}LocationDialingCode" minOccurs="0"/>
 *         &lt;element name="guestAssociationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "enforceAssociationLimit",
    "associationLimitHours",
    "accessLevel",
    "removeGuestAssociation",
    "guestLastName",
    "guestFirstName",
    "guestPhoneNumber",
    "guestExtension",
    "guestLocationDialingCode",
    "guestAssociationDateTime"
})
@XmlRootElement(name = "HotelingHost")
public class HotelingHost
    extends ActivatableServiceInfo
{

    protected Boolean enforceAssociationLimit;
    protected Integer associationLimitHours;
    @XmlSchemaType(name = "token")
    protected HotelingHostAccessLevel accessLevel;
    protected Boolean removeGuestAssociation;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String guestLastName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String guestFirstName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String guestPhoneNumber;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String guestExtension;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String guestLocationDialingCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar guestAssociationDateTime;

    /**
     * Ruft den Wert der enforceAssociationLimit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnforceAssociationLimit() {
        return enforceAssociationLimit;
    }

    /**
     * Legt den Wert der enforceAssociationLimit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnforceAssociationLimit(Boolean value) {
        this.enforceAssociationLimit = value;
    }

    /**
     * Ruft den Wert der associationLimitHours-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAssociationLimitHours() {
        return associationLimitHours;
    }

    /**
     * Legt den Wert der associationLimitHours-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAssociationLimitHours(Integer value) {
        this.associationLimitHours = value;
    }

    /**
     * Ruft den Wert der accessLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HotelingHostAccessLevel }
     *     
     */
    public HotelingHostAccessLevel getAccessLevel() {
        return accessLevel;
    }

    /**
     * Legt den Wert der accessLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelingHostAccessLevel }
     *     
     */
    public void setAccessLevel(HotelingHostAccessLevel value) {
        this.accessLevel = value;
    }

    /**
     * Ruft den Wert der removeGuestAssociation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoveGuestAssociation() {
        return removeGuestAssociation;
    }

    /**
     * Legt den Wert der removeGuestAssociation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoveGuestAssociation(Boolean value) {
        this.removeGuestAssociation = value;
    }

    /**
     * Ruft den Wert der guestLastName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestLastName() {
        return guestLastName;
    }

    /**
     * Legt den Wert der guestLastName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestLastName(String value) {
        this.guestLastName = value;
    }

    /**
     * Ruft den Wert der guestFirstName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestFirstName() {
        return guestFirstName;
    }

    /**
     * Legt den Wert der guestFirstName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestFirstName(String value) {
        this.guestFirstName = value;
    }

    /**
     * Ruft den Wert der guestPhoneNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestPhoneNumber() {
        return guestPhoneNumber;
    }

    /**
     * Legt den Wert der guestPhoneNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestPhoneNumber(String value) {
        this.guestPhoneNumber = value;
    }

    /**
     * Ruft den Wert der guestExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestExtension() {
        return guestExtension;
    }

    /**
     * Legt den Wert der guestExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestExtension(String value) {
        this.guestExtension = value;
    }

    /**
     * Ruft den Wert der guestLocationDialingCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestLocationDialingCode() {
        return guestLocationDialingCode;
    }

    /**
     * Legt den Wert der guestLocationDialingCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestLocationDialingCode(String value) {
        this.guestLocationDialingCode = value;
    }

    /**
     * Ruft den Wert der guestAssociationDateTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGuestAssociationDateTime() {
        return guestAssociationDateTime;
    }

    /**
     * Legt den Wert der guestAssociationDateTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGuestAssociationDateTime(XMLGregorianCalendar value) {
        this.guestAssociationDateTime = value;
    }

}
