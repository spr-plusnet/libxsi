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
 *                 Notification with the current configuration status for the Simultaneous Ring Personal service.
 * 
 * 
 *             
 * 
 * <p>Java-Klasse für SimultaneousRingPersonalEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SimultaneousRingPersonalEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}ServiceEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="info" type="{http://schema.broadsoft.com/xsi}SimultaneousRingPersonal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimultaneousRingPersonalEvent", propOrder = {
    "info"
})
public class SimultaneousRingPersonalEvent
    extends ServiceEvent
{

    protected SimultaneousRingPersonal info;

    /**
     * Ruft den Wert der info-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SimultaneousRingPersonal }
     *     
     */
    public SimultaneousRingPersonal getInfo() {
        return info;
    }

    /**
     * Legt den Wert der info-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SimultaneousRingPersonal }
     *     
     */
    public void setInfo(SimultaneousRingPersonal value) {
        this.info = value;
    }

}
