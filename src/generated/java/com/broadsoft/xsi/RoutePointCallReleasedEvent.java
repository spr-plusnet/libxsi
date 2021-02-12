//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="RoutePointCallReleasedEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}RoutePointEvent">
 *       &lt;sequence>
 *         &lt;element name="releaseReason" type="{http://schema.broadsoft.com/xsi}RoutePointCallReleaseReason"/>
 *         &lt;element name="outgoingCallReleaseCause" type="{http://schema.broadsoft.com/xsi}ReleaseCause" minOccurs="0"/>
 *         &lt;element name="cpdResult" type="{http://schema.broadsoft.com/xsi}CPDResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
