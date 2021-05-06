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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="RoutePointFailedEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="stateChangeReason" type="{http://schema.broadsoft.com/xsi}RoutePointStateChangeReason"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
