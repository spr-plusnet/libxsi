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
 *         The Route Point Call Released event is sent in two cases:
 *         i)following a Route Point Release Call request,
 *         ii)when an outgoing call is released during call setup in which case the
 *         CPD result is provided (if available).
 * 
 *         The removeTime is set to the time the call was released.
 * 
 *       
 * 
 * <p>Java-Klasse für RoutePointCallReleasedEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RoutePointCallReleasedEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}RoutePointEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="releaseReason" type="{http://schema.broadsoft.com/xsi}RoutePointCallReleaseReason"/&gt;
 *         &lt;element name="outgoingCallReleaseCause" type="{http://schema.broadsoft.com/xsi}ReleaseCause" minOccurs="0"/&gt;
 *         &lt;element name="cpdResult" type="{http://schema.broadsoft.com/xsi}CPDResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutePointCallReleasedEvent", propOrder = {
    "releaseReason",
    "outgoingCallReleaseCause",
    "cpdResult"
})
public class RoutePointCallReleasedEvent
    extends RoutePointEvent
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected RoutePointCallReleaseReason releaseReason;
    protected ReleaseCause outgoingCallReleaseCause;
    @XmlSchemaType(name = "token")
    protected CPDResult cpdResult;

    /**
     * Ruft den Wert der releaseReason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoutePointCallReleaseReason }
     *     
     */
    public RoutePointCallReleaseReason getReleaseReason() {
        return releaseReason;
    }

    /**
     * Legt den Wert der releaseReason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutePointCallReleaseReason }
     *     
     */
    public void setReleaseReason(RoutePointCallReleaseReason value) {
        this.releaseReason = value;
    }

    /**
     * Ruft den Wert der outgoingCallReleaseCause-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReleaseCause }
     *     
     */
    public ReleaseCause getOutgoingCallReleaseCause() {
        return outgoingCallReleaseCause;
    }

    /**
     * Legt den Wert der outgoingCallReleaseCause-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReleaseCause }
     *     
     */
    public void setOutgoingCallReleaseCause(ReleaseCause value) {
        this.outgoingCallReleaseCause = value;
    }

    /**
     * Ruft den Wert der cpdResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CPDResult }
     *     
     */
    public CPDResult getCpdResult() {
        return cpdResult;
    }

    /**
     * Legt den Wert der cpdResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CPDResult }
     *     
     */
    public void setCpdResult(CPDResult value) {
        this.cpdResult = value;
    }

}
