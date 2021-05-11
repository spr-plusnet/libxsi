//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         Sent whenever the lecture mode of a conference is stopped by a moderator.
 *         
 *         Change History:
 *         19.0 - added.
 *       
 * 
 * <p>Java-Klasse für MeetMeLectureModeStoppedEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MeetMeLectureModeStoppedEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conferenceParticipant" type="{http://schema.broadsoft.com/xsi}MeetMeConferenceParticipant" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetMeLectureModeStoppedEvent", propOrder = {
    "conferenceParticipant"
})
public class MeetMeLectureModeStoppedEvent
    extends EventData
{

    protected MeetMeConferenceParticipant conferenceParticipant;

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

}
