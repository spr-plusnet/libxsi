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
 * &lt;complexType name="PushNotificationRegistrationEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pushNotificationRegistrations" type="{http://schema.broadsoft.com/xsi}PushNotificationRegistrationEntryList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
