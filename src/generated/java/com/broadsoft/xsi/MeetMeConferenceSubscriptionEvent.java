//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="MeetMeConferenceSubscriptionEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData">
 *       &lt;sequence>
 *         &lt;element name="conference" type="{http://schema.broadsoft.com/xsi}MeetMeConference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
