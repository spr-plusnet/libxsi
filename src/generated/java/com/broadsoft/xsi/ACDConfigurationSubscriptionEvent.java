//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Initial event sent for the CallCenterConfiguration event package.
 *         Change History:
 *         R17.sp3 - Added forceNightService element. 
 *       
 * 
 * <p>Java-Klasse für ACDConfigurationSubscriptionEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ACDConfigurationSubscriptionEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData">
 *       &lt;sequence>
 *         &lt;element name="forcedForwarding" type="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo" minOccurs="0"/>
 *         &lt;element name="holidayService" type="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo" minOccurs="0"/>
 *         &lt;element name="nightService" type="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo" minOccurs="0"/>
 *         &lt;element name="forceNightService" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACDConfigurationSubscriptionEvent", propOrder = {
    "forcedForwarding",
    "holidayService",
    "nightService",
    "forceNightService"
})
public class ACDConfigurationSubscriptionEvent
    extends EventData
{

    protected ActivatableServiceInfo forcedForwarding;
    protected ActivatableServiceInfo holidayService;
    protected ActivatableServiceInfo nightService;
    protected EmptyContent forceNightService;

    /**
     * Ruft den Wert der forcedForwarding-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActivatableServiceInfo }
     *     
     */
    public ActivatableServiceInfo getForcedForwarding() {
        return forcedForwarding;
    }

    /**
     * Legt den Wert der forcedForwarding-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivatableServiceInfo }
     *     
     */
    public void setForcedForwarding(ActivatableServiceInfo value) {
        this.forcedForwarding = value;
    }

    /**
     * Ruft den Wert der holidayService-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActivatableServiceInfo }
     *     
     */
    public ActivatableServiceInfo getHolidayService() {
        return holidayService;
    }

    /**
     * Legt den Wert der holidayService-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivatableServiceInfo }
     *     
     */
    public void setHolidayService(ActivatableServiceInfo value) {
        this.holidayService = value;
    }

    /**
     * Ruft den Wert der nightService-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActivatableServiceInfo }
     *     
     */
    public ActivatableServiceInfo getNightService() {
        return nightService;
    }

    /**
     * Legt den Wert der nightService-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivatableServiceInfo }
     *     
     */
    public void setNightService(ActivatableServiceInfo value) {
        this.nightService = value;
    }

    /**
     * Ruft den Wert der forceNightService-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getForceNightService() {
        return forceNightService;
    }

    /**
     * Legt den Wert der forceNightService-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setForceNightService(EmptyContent value) {
        this.forceNightService = value;
    }

}
