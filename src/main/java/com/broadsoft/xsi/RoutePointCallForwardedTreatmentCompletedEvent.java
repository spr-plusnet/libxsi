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
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         The RoutePointCallForwardedTreatmentCompletedEvent is sent
 *         when the annoucement is completed for a call treated according to the
 *         Holiday policy.     
 * 
 *         Change History:
 *         17.sp3 - Added                         
 *       
 * 
 * <p>Java-Klasse für RoutePointCallForwardedTreatmentCompletedEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RoutePointCallForwardedTreatmentCompletedEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callId" type="{http://schema.broadsoft.com/xsi}CallId"/&gt;
 *         &lt;element name="extTrackingId" type="{http://schema.broadsoft.com/xsi}ExternalTrackingId"/&gt;
 *         &lt;element name="routePointName" type="{http://schema.broadsoft.com/xsi}NonEmptyString"/&gt;
 *         &lt;element name="routePointNumber" type="{http://schema.broadsoft.com/xsi}Address"/&gt;
 *         &lt;element name="remoteParty" type="{http://schema.broadsoft.com/xsi}PartyInformation"/&gt;
 *         &lt;element name="redirect" type="{http://schema.broadsoft.com/xsi}Redirect" minOccurs="0"/&gt;
 *         &lt;element name="reason" type="{http://schema.broadsoft.com/xsi}TreatmentCompletionReason"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutePointCallForwardedTreatmentCompletedEvent", propOrder = {
    "callId",
    "extTrackingId",
    "routePointName",
    "routePointNumber",
    "remoteParty",
    "redirect",
    "reason"
})
public class RoutePointCallForwardedTreatmentCompletedEvent
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
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected TreatmentCompletionReason reason;

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
     * Ruft den Wert der reason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TreatmentCompletionReason }
     *     
     */
    public TreatmentCompletionReason getReason() {
        return reason;
    }

    /**
     * Legt den Wert der reason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TreatmentCompletionReason }
     *     
     */
    public void setReason(TreatmentCompletionReason value) {
        this.reason = value;
    }

}
