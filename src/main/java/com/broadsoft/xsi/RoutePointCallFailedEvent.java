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
 *         The Route Point Call Failed event is sent in two cases:
 *         i) when the Route Point per call failure policy is triggered. This can
 *         happen for instance if no request is received for a call within
 *         the configurable time period after being added to the queue
 *         ii) when the Route Point failure policy is triggered. This can happen
 *         for instance when a remote application sends a Route Point Fail
 *         request and a call is queued at the Route Point. This can also
 *         occur when a call is received for a failed Route Point.
 * 
 *       
 * 
 * <p>Java-Klasse für RoutePointCallFailedEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RoutePointCallFailedEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}RoutePointEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="failureReason" type="{http://schema.broadsoft.com/xsi}RoutePointCallFailureReason"/&gt;
 *         &lt;element name="redirect" type="{http://schema.broadsoft.com/xsi}Redirect" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutePointCallFailedEvent", propOrder = {
    "failureReason",
    "redirect"
})
public class RoutePointCallFailedEvent
    extends RoutePointEvent
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected RoutePointCallFailureReason failureReason;
    protected Redirect redirect;

    /**
     * Ruft den Wert der failureReason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoutePointCallFailureReason }
     *     
     */
    public RoutePointCallFailureReason getFailureReason() {
        return failureReason;
    }

    /**
     * Legt den Wert der failureReason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutePointCallFailureReason }
     *     
     */
    public void setFailureReason(RoutePointCallFailureReason value) {
        this.failureReason = value;
    }

    /**
     * Ruft den Wert der redirect-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Redirect }
     *     
     */
    public Redirect getRedirect() {
        return redirect;
    }

    /**
     * Legt den Wert der redirect-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Redirect }
     *     
     */
    public void setRedirect(Redirect value) {
        this.redirect = value;
    }

}
