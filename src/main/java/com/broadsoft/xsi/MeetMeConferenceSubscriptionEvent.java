//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         Initial event sent for the MeetMe Conference event package.
 *         
 *         Change History:
 *         19.0 - added.
 *       
 * 
 * <p>Java-Klasse für MeetMeConferenceSubscriptionEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MeetMeConferenceSubscriptionEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conference" type="{http://schema.broadsoft.com/xsi}MeetMeConference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetMeConferenceSubscriptionEvent", propOrder = {
    "conference"
})
@XmlSeeAlso({
    MeetMeConferenceSubscriptionResyncEvent.class
})
public class MeetMeConferenceSubscriptionEvent
    extends EventData
{

    protected MeetMeConference conference;

    /**
     * Ruft den Wert der conference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeetMeConference }
     *     
     */
    public MeetMeConference getConference() {
        return conference;
    }

    /**
     * Legt den Wert der conference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetMeConference }
     *     
     */
    public void setConference(MeetMeConference value) {
        this.conference = value;
    }

}
