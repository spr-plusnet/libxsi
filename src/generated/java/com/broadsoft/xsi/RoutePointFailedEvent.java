//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The Route Point Failed event is sent when a Route Point enters the
 *         failed state.
 *             
 * 
 * <p>Java-Klasse für RoutePointFailedEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RoutePointFailedEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData">
 *       &lt;sequence>
 *         &lt;element name="stateChangeReason" type="{http://schema.broadsoft.com/xsi}RoutePointStateChangeReason"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutePointFailedEvent", propOrder = {
    "stateChangeReason"
})
public class RoutePointFailedEvent
    extends EventData
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected RoutePointStateChangeReason stateChangeReason;

    /**
     * Ruft den Wert der stateChangeReason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoutePointStateChangeReason }
     *     
     */
    public RoutePointStateChangeReason getStateChangeReason() {
        return stateChangeReason;
    }

    /**
     * Legt den Wert der stateChangeReason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutePointStateChangeReason }
     *     
     */
    public void setStateChangeReason(RoutePointStateChangeReason value) {
        this.stateChangeReason = value;
    }

}
