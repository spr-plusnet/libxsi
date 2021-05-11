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
 *         Notification with the configuration status of Night Service for the ACD.
 *         Change History:
 *         R17.sp3 - Added forceNightService element.            
 *         R20.sp1 - "active" element type changed to EmptyContent            
 *       
 * 
 * <p>Java-Klasse für ACDNightServiceEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ACDNightServiceEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="active" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/&gt;
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
@XmlType(name = "ACDNightServiceEvent", propOrder = {
    "active",
    "forceNightService"
})
public class ACDNightServiceEvent
    extends EventData
{

    protected EmptyContent active;
    protected EmptyContent forceNightService;

    /**
     * Ruft den Wert der active-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getActive() {
        return active;
    }

    /**
     * Legt den Wert der active-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setActive(EmptyContent value) {
        this.active = value;
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
