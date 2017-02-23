//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The Route Point Busy Completed event is sent when a Route Point Play
 *         Busy is completed.
 *             
 * 
 * <p>Java-Klasse für RoutePointBusyCompletedEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RoutePointBusyCompletedEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}RoutePointEvent">
 *       &lt;sequence>
 *         &lt;element name="playCollectResult" type="{http://schema.broadsoft.com/xsi}PlayCollectResult"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutePointBusyCompletedEvent", propOrder = {
    "playCollectResult"
})
public class RoutePointBusyCompletedEvent
    extends RoutePointEvent
{

    @XmlElement(required = true)
    protected PlayCollectResult playCollectResult;

    /**
     * Ruft den Wert der playCollectResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PlayCollectResult }
     *     
     */
    public PlayCollectResult getPlayCollectResult() {
        return playCollectResult;
    }

    /**
     * Legt den Wert der playCollectResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PlayCollectResult }
     *     
     */
    public void setPlayCollectResult(PlayCollectResult value) {
        this.playCollectResult = value;
    }

}
