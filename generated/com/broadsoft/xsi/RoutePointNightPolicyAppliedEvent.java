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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *        The RoutePointNightPolicyAppliedEvent event is sent when the 
 *        Night policy is triggered.
 *                     
 *        Change History:
 *        17.sp3 - "treatmentStarted" element added 
 *                 "redirections" element added             
 *       
 * 
 * <p>Java-Klasse für RoutePointNightPolicyAppliedEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RoutePointNightPolicyAppliedEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData">
 *       &lt;sequence>
 *         &lt;element name="callId" type="{http://schema.broadsoft.com/xsi}CallId"/>
 *         &lt;element name="extTrackingId" type="{http://schema.broadsoft.com/xsi}ExternalTrackingId"/>
 *         &lt;element name="routePointName" type="{http://schema.broadsoft.com/xsi}NonEmptyString"/>
 *         &lt;element name="routePointNumber" type="{http://schema.broadsoft.com/xsi}Address"/>
 *         &lt;element name="remoteParty" type="{http://schema.broadsoft.com/xsi}PartyInformation"/>
 *         &lt;element name="redirect" type="{http://schema.broadsoft.com/xsi}Redirect" minOccurs="0"/>
 *         &lt;element name="treatmentStarted" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/>
 *         &lt;element name="redirections" type="{http://schema.broadsoft.com/xsi}RedirectionList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutePointNightPolicyAppliedEvent", propOrder = {
    "callId",
    "extTrackingId",
    "routePointName",
    "routePointNumber",
    "remoteParty",
    "redirect",
    "treatmentStarted",
    "redirections"
})
public class RoutePointNightPolicyAppliedEvent
    extends EventData
{

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String callId;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String extTrackingId;
    @XmlElement(required = true)
    protected String routePointName;
    @XmlElement(required = true)
    protected Address routePointNumber;
    @XmlElement(required = true)
    protected PartyInformation remoteParty;
    protected Redirect redirect;
    protected EmptyContent treatmentStarted;
    protected RedirectionList redirections;

    /**
     * Ruft den Wert der callId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallId() {
        return callId;
    }

    /**
     * Legt den Wert der callId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallId(String value) {
        this.callId = value;
    }

    /**
     * Ruft den Wert der extTrackingId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtTrackingId() {
        return extTrackingId;
    }

    /**
     * Legt den Wert der extTrackingId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtTrackingId(String value) {
        this.extTrackingId = value;
    }

    /**
     * Ruft den Wert der routePointName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutePointName() {
        return routePointName;
    }

    /**
     * Legt den Wert der routePointName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutePointName(String value) {
        this.routePointName = value;
    }

    /**
     * Ruft den Wert der routePointNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getRoutePointNumber() {
        return routePointNumber;
    }

    /**
     * Legt den Wert der routePointNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setRoutePointNumber(Address value) {
        this.routePointNumber = value;
    }

    /**
     * Ruft den Wert der remoteParty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PartyInformation }
     *     
     */
    public PartyInformation getRemoteParty() {
        return remoteParty;
    }

    /**
     * Legt den Wert der remoteParty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyInformation }
     *     
     */
    public void setRemoteParty(PartyInformation value) {
        this.remoteParty = value;
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

    /**
     * Ruft den Wert der treatmentStarted-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getTreatmentStarted() {
        return treatmentStarted;
    }

    /**
     * Legt den Wert der treatmentStarted-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setTreatmentStarted(EmptyContent value) {
        this.treatmentStarted = value;
    }

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
