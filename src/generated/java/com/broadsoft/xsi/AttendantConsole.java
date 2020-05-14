//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="launchOnLogin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowUserViewCallDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="displayFields" type="{http://schema.broadsoft.com/xsi}AttendantConsoleDisplayFieldList" minOccurs="0"/>
 *         &lt;element name="monitoredUsers" type="{http://schema.broadsoft.com/xsi}UserDetailInfoList" minOccurs="0"/>
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
    "launchOnLogin",
    "allowUserViewCallDetails",
    "displayFields",
    "monitoredUsers"
})
@XmlRootElement(name = "AttendantConsole")
public class AttendantConsole {

    protected Boolean launchOnLogin;
    protected Boolean allowUserViewCallDetails;
    @XmlElementRef(name = "displayFields", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<AttendantConsoleDisplayFieldList> displayFields;
    @XmlElementRef(name = "monitoredUsers", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<UserDetailInfoList> monitoredUsers;

    /**
     * Ruft den Wert der launchOnLogin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLaunchOnLogin() {
        return launchOnLogin;
    }

    /**
     * Legt den Wert der launchOnLogin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLaunchOnLogin(Boolean value) {
        this.launchOnLogin = value;
    }

    /**
     * Ruft den Wert der allowUserViewCallDetails-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowUserViewCallDetails() {
        return allowUserViewCallDetails;
    }

    /**
     * Legt den Wert der allowUserViewCallDetails-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowUserViewCallDetails(Boolean value) {
        this.allowUserViewCallDetails = value;
    }

    /**
     * Ruft den Wert der displayFields-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AttendantConsoleDisplayFieldList }{@code >}
     *     
     */
    public JAXBElement<AttendantConsoleDisplayFieldList> getDisplayFields() {
        return displayFields;
    }

    /**
     * Legt den Wert der displayFields-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AttendantConsoleDisplayFieldList }{@code >}
     *     
     */
    public void setDisplayFields(JAXBElement<AttendantConsoleDisplayFieldList> value) {
        this.displayFields = value;
    }

    /**
     * Ruft den Wert der monitoredUsers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserDetailInfoList }{@code >}
     *     
     */
    public JAXBElement<UserDetailInfoList> getMonitoredUsers() {
        return monitoredUsers;
    }

    /**
     * Legt den Wert der monitoredUsers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserDetailInfoList }{@code >}
     *     
     */
    public void setMonitoredUsers(JAXBElement<UserDetailInfoList> value) {
        this.monitoredUsers = value;
    }

}
