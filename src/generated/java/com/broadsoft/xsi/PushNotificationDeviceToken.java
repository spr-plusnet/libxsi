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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The Push Notification Registration device token and its associated events.
 *         If the push network defines specific device tokens that correspond to
 *         specific push events, the registration allows for multiple token definitions.
 *         Change History:
 *         R22.0 - Added        
 *       
 * 
 * <p>Java-Klasse für PushNotificationDeviceToken complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PushNotificationDeviceToken">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://schema.broadsoft.com/xsi}PushNotificationToken"/>
 *         &lt;element name="pushNotificationEvents" type="{http://schema.broadsoft.com/xsi}PushNotificationEventList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PushNotificationDeviceToken", propOrder = {
    "token",
    "pushNotificationEvents"
})
public class PushNotificationDeviceToken {

    @XmlElement(required = true)
    protected String token;
    @XmlElement(required = true)
    protected PushNotificationEventList pushNotificationEvents;

    /**
     * Ruft den Wert der token-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Legt den Wert der token-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Ruft den Wert der pushNotificationEvents-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PushNotificationEventList }
     *     
     */
    public PushNotificationEventList getPushNotificationEvents() {
        return pushNotificationEvents;
    }

    /**
     * Legt den Wert der pushNotificationEvents-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PushNotificationEventList }
     *     
     */
    public void setPushNotificationEvents(PushNotificationEventList value) {
        this.pushNotificationEvents = value;
    }

}
