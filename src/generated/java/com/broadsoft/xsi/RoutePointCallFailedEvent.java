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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="RoutePointCallFailedEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}RoutePointEvent">
 *       &lt;sequence>
 *         &lt;element name="failureReason" type="{http://schema.broadsoft.com/xsi}RoutePointCallFailureReason"/>
 *         &lt;element name="redirect" type="{http://schema.broadsoft.com/xsi}Redirect" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
