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
 *         Contains the details for a MeetMe Conference Participant
 *         Release Added: R17.sp3
 *       
 * 
 * <p>Java-Klasse für MeetMeConferenceParticipant complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MeetMeConferenceParticipant"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callId" type="{http://schema.broadsoft.com/xsi}CallId"/&gt;
 *         &lt;element name="partyInformation" type="{http://schema.broadsoft.com/xsi}PartyInformation"/&gt;
 *         &lt;element name="activeTalker" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/&gt;
 *         &lt;element name="held" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/&gt;
 *         &lt;element name="moderator" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/&gt;
 *         &lt;element name="muted" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/&gt;
 *         &lt;element name="uniqueIdentifier" type="{http://schema.broadsoft.com/xsi}MeetMeConferenceUniqueIdentifier" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetMeConferenceParticipant", propOrder = {
    "callId",
    "partyInformation",
    "activeTalker",
    "held",
    "moderator",
    "muted",
    "uniqueIdentifier"
})
public class MeetMeConferenceParticipant {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String callId;
    @XmlElement(required = true)
    protected PartyInformation partyInformation;
    protected EmptyContent activeTalker;
    protected EmptyContent held;
    protected EmptyContent moderator;
    protected EmptyContent muted;
    protected String uniqueIdentifier;

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
     * Ruft den Wert der partyInformation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PartyInformation }
     *     
     */
    public PartyInformation getPartyInformation() {
        return partyInformation;
    }

    /**
     * Legt den Wert der partyInformation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyInformation }
     *     
     */
    public void setPartyInformation(PartyInformation value) {
        this.partyInformation = value;
    }

    /**
     * Ruft den Wert der activeTalker-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getActiveTalker() {
        return activeTalker;
    }

    /**
     * Legt den Wert der activeTalker-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setActiveTalker(EmptyContent value) {
        this.activeTalker = value;
    }

    /**
     * Ruft den Wert der held-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getHeld() {
        return held;
    }

    /**
     * Legt den Wert der held-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setHeld(EmptyContent value) {
        this.held = value;
    }

    /**
     * Ruft den Wert der moderator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getModerator() {
        return moderator;
    }

    /**
     * Legt den Wert der moderator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setModerator(EmptyContent value) {
        this.moderator = value;
    }

    /**
     * Ruft den Wert der muted-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getMuted() {
        return muted;
    }

    /**
     * Legt den Wert der muted-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setMuted(EmptyContent value) {
        this.muted = value;
    }

    /**
     * Ruft den Wert der uniqueIdentifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    /**
     * Legt den Wert der uniqueIdentifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueIdentifier(String value) {
        this.uniqueIdentifier = value;
    }

}
