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
 *         The PushNotificationRegistrationEvent is generated upon subscription 
 *         and it is sent whenever a user’s Push Notification Registration is
 *         added, updated, or deleted. The event contains a complete picture of
 *         the user's Push Notification Registrations stored on the server.        
 *         Change History:
 *         R22.0 - Added        
 *       
 * 
 * <p>Java-Klasse für PushNotificationRegistrationEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PushNotificationRegistrationEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData">
 *       &lt;sequence>
 *         &lt;element name="pushNotificationRegistrations" type="{http://schema.broadsoft.com/xsi}PushNotificationRegistrationEntryList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PushNotificationRegistrationEvent", propOrder = {
    "pushNotificationRegistrations"
})
public class PushNotificationRegistrationEvent
    extends EventData
{

    @XmlElement(required = true)
    protected PushNotificationRegistrationEntryList pushNotificationRegistrations;

    /**
     * Ruft den Wert der pushNotificationRegistrations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PushNotificationRegistrationEntryList }
     *     
     */
    public PushNotificationRegistrationEntryList getPushNotificationRegistrations() {
        return pushNotificationRegistrations;
    }

    /**
     * Legt den Wert der pushNotificationRegistrations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PushNotificationRegistrationEntryList }
     *     
     */
    public void setPushNotificationRegistrations(PushNotificationRegistrationEntryList value) {
        this.pushNotificationRegistrations = value;
    }

}
