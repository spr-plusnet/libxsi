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
import javax.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="MeetMeConference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conferenceInfo" type="{http://schema.broadsoft.com/xsi}MeetMeConferenceInfo"/>
 *         &lt;element name="conferenceParticipants" type="{http://schema.broadsoft.com/xsi}MeetMeConferenceParticipants"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
