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
 * &lt;complexType name="MeetMeConferenceRecordingStoppedEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData">
 *       &lt;sequence>
 *         &lt;element name="conferenceParticipant" type="{http://schema.broadsoft.com/xsi}MeetMeConferenceParticipant" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://schema.broadsoft.com/xsi}MeetMeConferenceRecordingStoppedReason"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
