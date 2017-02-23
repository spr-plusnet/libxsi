//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="MeetMeConferenceClientSessionInfoUpdatedEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData">
 *       &lt;sequence>
 *         &lt;element name="conferenceInfo" type="{http://schema.broadsoft.com/xsi}MeetMeConferenceInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
