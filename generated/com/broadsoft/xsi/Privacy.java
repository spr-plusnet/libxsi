//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *           Contains the Privacy service configuration data.
 *           User Privacy allows you to exclude yourself from Group and
 *           Enterprise Directory listings, Auto Attendant extension and/or
 *           name dialing, and Phone Status monitoring. You can also select
 *           members in an Enterprise or Group who are allowed to monitor
 *           your phone status. These selected members can view your phone
 *           status even if you enable phone status privacy.
 *         
 * 
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isEnableDirectoryPrivacy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isEnableAutoAttendantExtensionDialingPrivacy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isEnableAutoAttendantNameDialingPrivacy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isEnablePhoneStatusPrivacy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowedUsers" type="{http://schema.broadsoft.com/xsi}UserDetailInfoList" minOccurs="0"/>
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
    "isEnableDirectoryPrivacy",
    "isEnableAutoAttendantExtensionDialingPrivacy",
    "isEnableAutoAttendantNameDialingPrivacy",
    "isEnablePhoneStatusPrivacy",
    "allowedUsers"
})
@XmlRootElement(name = "Privacy")
public class Privacy {

    protected Boolean isEnableDirectoryPrivacy;
    protected Boolean isEnableAutoAttendantExtensionDialingPrivacy;
    protected Boolean isEnableAutoAttendantNameDialingPrivacy;
    protected Boolean isEnablePhoneStatusPrivacy;
    @XmlElementRef(name = "allowedUsers", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<UserDetailInfoList> allowedUsers;

    /**
     * Ruft den Wert der isEnableDirectoryPrivacy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEnableDirectoryPrivacy() {
        return isEnableDirectoryPrivacy;
    }

    /**
     * Legt den Wert der isEnableDirectoryPrivacy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnableDirectoryPrivacy(Boolean value) {
        this.isEnableDirectoryPrivacy = value;
    }

    /**
     * Ruft den Wert der isEnableAutoAttendantExtensionDialingPrivacy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEnableAutoAttendantExtensionDialingPrivacy() {
        return isEnableAutoAttendantExtensionDialingPrivacy;
    }

    /**
     * Legt den Wert der isEnableAutoAttendantExtensionDialingPrivacy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnableAutoAttendantExtensionDialingPrivacy(Boolean value) {
        this.isEnableAutoAttendantExtensionDialingPrivacy = value;
    }

    /**
     * Ruft den Wert der isEnableAutoAttendantNameDialingPrivacy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEnableAutoAttendantNameDialingPrivacy() {
        return isEnableAutoAttendantNameDialingPrivacy;
    }

    /**
     * Legt den Wert der isEnableAutoAttendantNameDialingPrivacy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnableAutoAttendantNameDialingPrivacy(Boolean value) {
        this.isEnableAutoAttendantNameDialingPrivacy = value;
    }

    /**
     * Ruft den Wert der isEnablePhoneStatusPrivacy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEnablePhoneStatusPrivacy() {
        return isEnablePhoneStatusPrivacy;
    }

    /**
     * Legt den Wert der isEnablePhoneStatusPrivacy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnablePhoneStatusPrivacy(Boolean value) {
        this.isEnablePhoneStatusPrivacy = value;
    }

    /**
     * Ruft den Wert der allowedUsers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserDetailInfoList }{@code >}
     *     
     */
    public JAXBElement<UserDetailInfoList> getAllowedUsers() {
        return allowedUsers;
    }

    /**
     * Legt den Wert der allowedUsers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserDetailInfoList }{@code >}
     *     
     */
    public void setAllowedUsers(JAXBElement<UserDetailInfoList> value) {
        this.allowedUsers = value;
    }

}
