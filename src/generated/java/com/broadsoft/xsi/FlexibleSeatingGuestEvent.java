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
 *                 Notification with the current configuration status for the Flexible Seating
 *                 Guest service.
 * 
 *                 Change History:
 *                 R20.0 - Added.
 *       
 * 
 * <p>Java-Klasse für FlexibleSeatingGuestEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FlexibleSeatingGuestEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}ServiceEvent">
 *       &lt;sequence>
 *         &lt;element name="info" type="{http://schema.broadsoft.com/xsi}FlexibleSeatingGuest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlexibleSeatingGuestEvent", propOrder = {
    "info"
})
public class FlexibleSeatingGuestEvent
    extends ServiceEvent
{

    protected FlexibleSeatingGuest info;

    /**
     * Ruft den Wert der info-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlexibleSeatingGuest }
     *     
     */
    public FlexibleSeatingGuest getInfo() {
        return info;
    }

    /**
     * Legt den Wert der info-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexibleSeatingGuest }
     *     
     */
    public void setInfo(FlexibleSeatingGuest value) {
        this.info = value;
    }

}
