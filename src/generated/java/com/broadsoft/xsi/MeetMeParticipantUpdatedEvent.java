//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Sent when one or more participants have their participant
 *         information updated.
 * 
 *         Change History:
 *         19.0 - added Meet Me Conference event package
 *       
 * 
 * <p>Java-Klasse für MeetMeParticipantUpdatedEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MeetMeParticipantUpdatedEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData">
 *       &lt;sequence>
 *         &lt;element name="conferenceParticipants" type="{http://schema.broadsoft.com/xsi}MeetMeConferenceParticipants"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetMeParticipantUpdatedEvent", propOrder = {
    "conferenceParticipants"
})
public class MeetMeParticipantUpdatedEvent
    extends EventData
{

    @XmlElement(required = true)
    protected MeetMeConferenceParticipants conferenceParticipants;

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
