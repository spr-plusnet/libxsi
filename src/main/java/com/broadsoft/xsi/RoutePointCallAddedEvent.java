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
 *         The Route Point Call Added event is sent when a new call is added to
 *         the Route Point queue.
 *         
 *         Change History:
 *         17.sp3 - "redirections" element added       
 *       
 * 
 * <p>Java-Klasse für RoutePointCallAddedEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RoutePointCallAddedEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}RoutePointEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="redirections" type="{http://schema.broadsoft.com/xsi}RedirectionList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutePointCallAddedEvent", propOrder = {
    "redirections"
})
public class RoutePointCallAddedEvent
    extends RoutePointEvent
{

    protected RedirectionList redirections;

    /**
     * Ruft den Wert der redirections-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RedirectionList }
     *     
     */
    public RedirectionList getRedirections() {
        return redirections;
    }

    /**
     * Legt den Wert der redirections-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RedirectionList }
     *     
     */
    public void setRedirections(RedirectionList value) {
        this.redirections = value;
    }

}
