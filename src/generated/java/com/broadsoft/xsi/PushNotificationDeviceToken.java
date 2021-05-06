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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         The Push Notification Registration device token and its associated events.
 *         If the push network defines specific device tokens that correspond to
 *         specific push events, the registration allows for multiple token definitions.
 *         Change History:
 *         R22.0 - Added
 *         R24.0 - Modified (patched in R21.sp1.551, R22.0.1123, R23.0.1075)        
 *       
 * 
 * <p>Java-Klasse für PushNotificationDeviceToken complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PushNotificationDeviceToken"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="token" type="{http://schema.broadsoft.com/xsi}PushNotificationToken"/&gt;
 *         &lt;element name="type" type="{http://schema.broadsoft.com/xsi}PushNotificationType" minOccurs="0"/&gt;
 *         &lt;element name="pushNotificationEvents" type="{http://schema.broadsoft.com/xsi}PushNotificationEventList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PushNotificationDeviceToken", propOrder = {
    "token",
    "type",
    "pushNotificationEvents"
})
public class PushNotificationDeviceToken {

    @XmlElement(required = true)
    protected String token;
    @XmlSchemaType(name = "token")
    protected PushNotificationType type;
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
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PushNotificationType }
     *     
     */
    public PushNotificationType getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PushNotificationType }
     *     
     */
    public void setType(PushNotificationType value) {
        this.type = value;
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
