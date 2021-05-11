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
 * &lt;complexType name="MeetMeParticipantLeftEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callIds" type="{http://schema.broadsoft.com/xsi}MeetMeConferenceCallIdList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
