//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         A Conference maintains information about a conference
 *       
 * 
 * <p>Java-Klasse für Conference complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Conference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="state" type="{http://schema.broadsoft.com/xsi}ConferenceState" minOccurs="0"/>
 *         &lt;element name="endpoint" type="{http://schema.broadsoft.com/xsi}Endpoint" minOccurs="0"/>
 *         &lt;element name="appearance" type="{http://schema.broadsoft.com/xsi}Appearance" minOccurs="0"/>
 *         &lt;element name="muted" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/>
 *         &lt;element name="conferenceType" type="{http://schema.broadsoft.com/xsi}ConferenceType" minOccurs="0"/>
 *         &lt;element name="conferenceParticipantList" type="{http://schema.broadsoft.com/xsi}ConferenceParticipantList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conference", propOrder = {
    "state",
    "endpoint",
    "appearance",
    "muted",
    "conferenceType",
    "conferenceParticipantList"
})
public class Conference {

    @XmlSchemaType(name = "token")
    protected ConferenceState state;
    protected Endpoint endpoint;
    protected Integer appearance;
    protected EmptyContent muted;
    @XmlSchemaType(name = "token")
    protected ConferenceType conferenceType;
    protected ConferenceParticipantList conferenceParticipantList;

    /**
     * Ruft den Wert der state-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConferenceState }
     *     
     */
    public ConferenceState getState() {
        return state;
    }

    /**
     * Legt den Wert der state-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConferenceState }
     *     
     */
    public void setState(ConferenceState value) {
        this.state = value;
    }

    /**
     * Ruft den Wert der endpoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Endpoint }
     *     
     */
    public Endpoint getEndpoint() {
        return endpoint;
    }

    /**
     * Legt den Wert der endpoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Endpoint }
     *     
     */
    public void setEndpoint(Endpoint value) {
        this.endpoint = value;
    }

    /**
     * Ruft den Wert der appearance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAppearance() {
        return appearance;
    }

    /**
     * Legt den Wert der appearance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAppearance(Integer value) {
        this.appearance = value;
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
     * Ruft den Wert der conferenceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConferenceType }
     *     
     */
    public ConferenceType getConferenceType() {
        return conferenceType;
    }

    /**
     * Legt den Wert der conferenceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConferenceType }
     *     
     */
    public void setConferenceType(ConferenceType value) {
        this.conferenceType = value;
    }

    /**
     * Ruft den Wert der conferenceParticipantList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConferenceParticipantList }
     *     
     */
    public ConferenceParticipantList getConferenceParticipantList() {
        return conferenceParticipantList;
    }

    /**
     * Legt den Wert der conferenceParticipantList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConferenceParticipantList }
     *     
     */
    public void setConferenceParticipantList(ConferenceParticipantList value) {
        this.conferenceParticipantList = value;
    }

}
