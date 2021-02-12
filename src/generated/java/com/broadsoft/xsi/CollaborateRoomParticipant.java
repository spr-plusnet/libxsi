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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         Contains the details for a Collaborate Room Participant
 *         Release Added: R21.0
 *       
 * 
 * <p>Java-Klasse für CollaborateRoomParticipant complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CollaborateRoomParticipant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="callId" type="{http://schema.broadsoft.com/xsi}CallId"/>
 *         &lt;element name="partyInformation" type="{http://schema.broadsoft.com/xsi}PartyInformation"/>
 *         &lt;element name="activeTalker" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/>
 *         &lt;element name="muted" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollaborateRoomParticipant", propOrder = {
    "callId",
    "partyInformation",
    "activeTalker",
    "owner",
    "muted"
})
public class CollaborateRoomParticipant {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String callId;
    @XmlElement(required = true)
    protected PartyInformation partyInformation;
    protected EmptyContent activeTalker;
    protected EmptyContent owner;
    protected EmptyContent muted;

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
     * Ruft den Wert der owner-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getOwner() {
        return owner;
    }

    /**
     * Legt den Wert der owner-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setOwner(EmptyContent value) {
        this.owner = value;
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

}
