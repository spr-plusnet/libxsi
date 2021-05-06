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
 * &lt;complexType name="PushNotificationParametersList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="iOSParam" type="{http://schema.broadsoft.com/xsi}PushNotificationParamList" minOccurs="0"/&gt;
 *         &lt;element name="androidParam" type="{http://schema.broadsoft.com/xsi}PushNotificationParamList" minOccurs="0"/&gt;
 *         &lt;element name="appDataParam" type="{http://schema.broadsoft.com/xsi}PushNotificationParamList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
