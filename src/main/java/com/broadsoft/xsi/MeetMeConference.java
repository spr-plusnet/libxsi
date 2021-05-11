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
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         This schema defines the information of a 
 *         Conference which is active.It will give current state of the   
 *         conference including the list of participants and moderators.
 *         Release Added: R17.sp3
 *       
 * 
 * <p>Java-Klasse für MeetMeConference complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MeetMeConference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conferenceInfo" type="{http://schema.broadsoft.com/xsi}MeetMeConferenceInfo"/&gt;
 *         &lt;element name="conferenceParticipants" type="{http://schema.broadsoft.com/xsi}MeetMeConferenceParticipants"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetMeConference", propOrder = {
    "conferenceInfo",
    "conferenceParticipants"
})
public class MeetMeConference {

    @XmlElement(required = true)
    protected MeetMeConferenceInfo conferenceInfo;
    @XmlElement(required = true)
    protected MeetMeConferenceParticipants conferenceParticipants;

    /**
     * Ruft den Wert der conferenceInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeetMeConferenceInfo }
     *     
     */
    public MeetMeConferenceInfo getConferenceInfo() {
        return conferenceInfo;
    }

    /**
     * Legt den Wert der conferenceInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetMeConferenceInfo }
     *     
     */
    public void setConferenceInfo(MeetMeConferenceInfo value) {
        this.conferenceInfo = value;
    }

    /**
     * Ruft den Wert der conferenceParticipants-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeetMeConferenceParticipants }
     *     
     */
    public MeetMeConferenceParticipants getConferenceParticipants() {
        return conferenceParticipants;
    }

    /**
     * Legt den Wert der conferenceParticipants-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetMeConferenceParticipants }
     *     
     */
    public void setConferenceParticipants(MeetMeConferenceParticipants value) {
        this.conferenceParticipants = value;
    }

}
