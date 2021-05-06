//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element name="sendPushNotificationForClickToDial" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="sendPushNotificationForGroupPaging" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "sendPushNotificationForClickToDial",
    "sendPushNotificationForGroupPaging"
})
@XmlRootElement(name = "PushNotification")
public class PushNotification {

    protected Boolean sendPushNotificationForClickToDial;
    protected Boolean sendPushNotificationForGroupPaging;

    /**
     * Ruft den Wert der sendPushNotificationForClickToDial-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendPushNotificationForClickToDial() {
        return sendPushNotificationForClickToDial;
    }

    /**
     * Legt den Wert der sendPushNotificationForClickToDial-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendPushNotificationForClickToDial(Boolean value) {
        this.sendPushNotificationForClickToDial = value;
    }

    /**
     * Ruft den Wert der sendPushNotificationForGroupPaging-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendPushNotificationForGroupPaging() {
        return sendPushNotificationForGroupPaging;
    }

    /**
     * Legt den Wert der sendPushNotificationForGroupPaging-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendPushNotificationForGroupPaging(Boolean value) {
        this.sendPushNotificationForGroupPaging = value;
    }

}
