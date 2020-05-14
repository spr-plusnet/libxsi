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
 * &lt;complexType name="ACDNightServiceEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData">
 *       &lt;sequence>
 *         &lt;element name="active" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/>
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
