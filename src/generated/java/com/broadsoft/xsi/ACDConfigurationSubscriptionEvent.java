//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="ACDConfigurationSubscriptionEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="forcedForwarding" type="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo" minOccurs="0"/&gt;
 *         &lt;element name="holidayService" type="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo" minOccurs="0"/&gt;
 *         &lt;element name="nightService" type="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo" minOccurs="0"/&gt;
 *         &lt;element name="forceNightService" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
