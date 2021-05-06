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
 *         Sent when a conference's recording service is stopped.
 * 
 *         Change History:
 *         19.0 - added.
 *       
 * 
 * <p>Java-Klasse für MeetMeConferenceRecordingStoppedEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MeetMeConferenceRecordingStoppedEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conferenceParticipant" type="{http://schema.broadsoft.com/xsi}MeetMeConferenceParticipant" minOccurs="0"/&gt;
 *         &lt;element name="reason" type="{http://schema.broadsoft.com/xsi}MeetMeConferenceRecordingStoppedReason"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetMeConferenceRecordingStoppedEvent", propOrder = {
    "conferenceParticipant",
    "reason"
})
public class MeetMeConferenceRecordingStoppedEvent
    extends EventData
{

    protected MeetMeConferenceParticipant conferenceParticipant;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected MeetMeConferenceRecordingStoppedReason reason;

    /**
     * Ruft den Wert der conferenceParticipant-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeetMeConferenceParticipant }
     *     
     */
    public MeetMeConferenceParticipant getConferenceParticipant() {
        return conferenceParticipant;
    }

    /**
     * Legt den Wert der conferenceParticipant-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetMeConferenceParticipant }
     *     
     */
    public void setConferenceParticipant(MeetMeConferenceParticipant value) {
        this.conferenceParticipant = value;
    }

    /**
     * Ruft den Wert der reason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeetMeConferenceRecordingStoppedReason }
     *     
     */
    public MeetMeConferenceRecordingStoppedReason getReason() {
        return reason;
    }

    /**
     * Legt den Wert der reason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetMeConferenceRecordingStoppedReason }
     *     
     */
    public void setReason(MeetMeConferenceRecordingStoppedReason value) {
        this.reason = value;
    }

}
