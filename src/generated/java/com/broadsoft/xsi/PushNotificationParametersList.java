//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         A list of parameters that define additional data specific to iOS, Android, and/or the
 *         client application.    
 *         Change History:
 *         R24.0 - Added (patched in R21.sp1.551, R22.0.1123, R23.0.1075)
 *       
 * 
 * <p>Java-Klasse für PushNotificationParametersList complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PushNotificationParametersList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iOSParam" type="{http://schema.broadsoft.com/xsi}PushNotificationParamList" minOccurs="0"/>
 *         &lt;element name="androidParam" type="{http://schema.broadsoft.com/xsi}PushNotificationParamList" minOccurs="0"/>
 *         &lt;element name="appDataParam" type="{http://schema.broadsoft.com/xsi}PushNotificationParamList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PushNotificationParametersList", propOrder = {
    "iosParam",
    "androidParam",
    "appDataParam"
})
public class PushNotificationParametersList {

    @XmlElement(name = "iOSParam")
    protected PushNotificationParamList iosParam;
    protected PushNotificationParamList androidParam;
    protected PushNotificationParamList appDataParam;

    /**
     * Ruft den Wert der iosParam-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PushNotificationParamList }
     *     
     */
    public PushNotificationParamList getIOSParam() {
        return iosParam;
    }

    /**
     * Legt den Wert der iosParam-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PushNotificationParamList }
     *     
     */
    public void setIOSParam(PushNotificationParamList value) {
        this.iosParam = value;
    }

    /**
     * Ruft den Wert der androidParam-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PushNotificationParamList }
     *     
     */
    public PushNotificationParamList getAndroidParam() {
        return androidParam;
    }

    /**
     * Legt den Wert der androidParam-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PushNotificationParamList }
     *     
     */
    public void setAndroidParam(PushNotificationParamList value) {
        this.androidParam = value;
    }

    /**
     * Ruft den Wert der appDataParam-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PushNotificationParamList }
     *     
     */
    public PushNotificationParamList getAppDataParam() {
        return appDataParam;
    }

    /**
     * Legt den Wert der appDataParam-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PushNotificationParamList }
     *     
     */
    public void setAppDataParam(PushNotificationParamList value) {
        this.appDataParam = value;
    }

}
