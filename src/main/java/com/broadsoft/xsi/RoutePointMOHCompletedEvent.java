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
 *         The RoutePointMOHCompletedEventEvent is sent when a Route Point Play MOH
 *         is completed.
 *             
 * 
 * <p>Java-Klasse für RoutePointMOHCompletedEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RoutePointMOHCompletedEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}RoutePointEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="playCollectResult" type="{http://schema.broadsoft.com/xsi}PlayCollectResult"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutePointMOHCompletedEvent", propOrder = {
    "playCollectResult"
})
public class RoutePointMOHCompletedEvent
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
