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
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         The registration for Push Notifications for a user.
 *         Change History:
 *         R22.0 - Added        
 *       
 * 
 * <p>Java-Klasse für PushNotificationRegistrationEntry complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PushNotificationRegistrationEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applicationId" type="{http://schema.broadsoft.com/xsi}PushNotificationApplicationId"/&gt;
 *         &lt;element name="applicationVersion" type="{http://schema.broadsoft.com/xsi}PushNotificationApplicationVersion"/&gt;
 *         &lt;element name="registrationId" type="{http://schema.broadsoft.com/xsi}PushNotificationRegistrationId"/&gt;
 *         &lt;element name="deviceOSType" type="{http://schema.broadsoft.com/xsi}PushNotificationDeviceOSType"/&gt;
 *         &lt;element name="deviceOSVersion" type="{http://schema.broadsoft.com/xsi}PushNotificationDeviceOSVersion"/&gt;
 *         &lt;element name="deviceTokenList" type="{http://schema.broadsoft.com/xsi}PushNotificationDeviceTokenList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PushNotificationRegistrationEntry", propOrder = {
    "applicationId",
    "applicationVersion",
    "registrationId",
    "deviceOSType",
    "deviceOSVersion",
    "deviceTokenList"
})
public class PushNotificationRegistrationEntry {

    @XmlElement(required = true)
    protected String applicationId;
    @XmlElement(required = true)
    protected String applicationVersion;
    @XmlElement(required = true)
    protected String registrationId;
    @XmlElement(required = true)
    protected String deviceOSType;
    @XmlElement(required = true)
    protected String deviceOSVersion;
    @XmlElement(required = true)
    protected PushNotificationDeviceTokenList deviceTokenList;

    /**
     * Ruft den Wert der applicationId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Legt den Wert der applicationId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationId(String value) {
        this.applicationId = value;
    }

    /**
     * Ruft den Wert der applicationVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationVersion() {
        return applicationVersion;
    }

    /**
     * Legt den Wert der applicationVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationVersion(String value) {
        this.applicationVersion = value;
    }

    /**
     * Ruft den Wert der registrationId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationId() {
        return registrationId;
    }

    /**
     * Legt den Wert der registrationId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationId(String value) {
        this.registrationId = value;
    }

    /**
     * Ruft den Wert der deviceOSType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceOSType() {
        return deviceOSType;
    }

    /**
     * Legt den Wert der deviceOSType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceOSType(String value) {
        this.deviceOSType = value;
    }

    /**
     * Ruft den Wert der deviceOSVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceOSVersion() {
        return deviceOSVersion;
    }

    /**
     * Legt den Wert der deviceOSVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceOSVersion(String value) {
        this.deviceOSVersion = value;
    }

    /**
     * Ruft den Wert der deviceTokenList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PushNotificationDeviceTokenList }
     *     
     */
    public PushNotificationDeviceTokenList getDeviceTokenList() {
        return deviceTokenList;
    }

    /**
     * Legt den Wert der deviceTokenList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PushNotificationDeviceTokenList }
     *     
     */
    public void setDeviceTokenList(PushNotificationDeviceTokenList value) {
        this.deviceTokenList = value;
    }

}
