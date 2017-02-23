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
 *        The ACDCallForwardedTreatmentCompletedEvent is sent when the annoucement
 *        is completed for a call treated according to the Forced Forwarding policy.
 *        
 *        Change History:
 *        17.sp3 - Added        
 *       
 * 
 * <p>Java-Klasse für ACDCallForwardedTreatmentCompletedEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ACDCallForwardedTreatmentCompletedEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData">
 *       &lt;sequence>
 *         &lt;element name="callId" type="{http://schema.broadsoft.com/xsi}CallId"/>
 *         &lt;element name="extTrackingId" type="{http://schema.broadsoft.com/xsi}ExternalTrackingId"/>
 *         &lt;element name="acdName" type="{http://schema.broadsoft.com/xsi}NonEmptyString"/>
 *         &lt;element name="acdNumber" type="{http://schema.broadsoft.com/xsi}Address"/>
 *         &lt;element name="remoteParty" type="{http://schema.broadsoft.com/xsi}PartyInformation"/>
 *         &lt;element name="redirect" type="{http://schema.broadsoft.com/xsi}Redirect" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://schema.broadsoft.com/xsi}TreatmentCompletionReason"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACDCallForwardedTreatmentCompletedEvent", propOrder = {
    "callId",
    "extTrackingId",
    "acdName",
    "acdNumber",
    "remoteParty",
    "redirect",
    "reason"
})
public class ACDCallForwardedTreatmentCompletedEvent
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
    protected String acdName;
    @XmlElement(required = true)
    protected Address acdNumber;
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
     * Ruft den Wert der acdName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcdName() {
        return acdName;
    }

    /**
     * Legt den Wert der acdName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcdName(String value) {
        this.acdName = value;
    }

    /**
     * Ruft den Wert der acdNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAcdNumber() {
        return acdNumber;
    }

    /**
     * Legt den Wert der acdNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAcdNumber(Address value) {
        this.acdNumber = value;
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
