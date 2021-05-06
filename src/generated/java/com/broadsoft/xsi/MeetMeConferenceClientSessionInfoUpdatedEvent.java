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
 *         Initial event sent for the MeetMe Conference event package.
 *         Event is sent if ClientSessionInfo is changed for the conference.
 *         
 *         Change History:
 *         20.0 - added.
 *       
 * 
 * <p>Java-Klasse für MeetMeConferenceClientSessionInfoUpdatedEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MeetMeConferenceClientSessionInfoUpdatedEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conferenceInfo" type="{http://schema.broadsoft.com/xsi}MeetMeConferenceInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetMeConferenceClientSessionInfoUpdatedEvent", propOrder = {
    "conferenceInfo"
})
public class MeetMeConferenceClientSessionInfoUpdatedEvent
    extends EventData
{

    protected MeetMeConferenceInfo conferenceInfo;

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

}
