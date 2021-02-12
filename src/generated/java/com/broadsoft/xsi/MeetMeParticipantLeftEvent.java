//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Sent when one or more participants leave a conference.
 *         
 *         Change History:
 *         19.0 - added.
 *       
 * 
 * <p>Java-Klasse für MeetMeParticipantLeftEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MeetMeParticipantLeftEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData">
 *       &lt;sequence>
 *         &lt;element name="callIds" type="{http://schema.broadsoft.com/xsi}MeetMeConferenceCallIdList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetMeParticipantLeftEvent", propOrder = {
    "callIds"
})
public class MeetMeParticipantLeftEvent
    extends EventData
{

    protected MeetMeConferenceCallIdList callIds;

    /**
     * Ruft den Wert der callIds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeetMeConferenceCallIdList }
     *     
     */
    public MeetMeConferenceCallIdList getCallIds() {
        return callIds;
    }

    /**
     * Legt den Wert der callIds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetMeConferenceCallIdList }
     *     
     */
    public void setCallIds(MeetMeConferenceCallIdList value) {
        this.callIds = value;
    }

}
