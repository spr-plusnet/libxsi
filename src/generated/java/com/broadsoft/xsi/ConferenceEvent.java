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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ConferenceEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ConferenceEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conference" type="{http://schema.broadsoft.com/xsi}Conference"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConferenceEvent", propOrder = {
    "conference"
})
@XmlSeeAlso({
    ConferenceCallMadeDeafEvent.class,
    ConferenceCallMadeUnDeafEvent.class,
    ConferenceCallMutedEvent.class,
    ConferenceCallUnMutedEvent.class,
    ConferenceHeldEvent.class,
    ConferenceMutedEvent.class,
    ConferenceReleasedEvent.class,
    ConferenceRetrievedEvent.class,
    ConferenceStartedEvent.class,
    ConferenceUnmutedEvent.class,
    ConferenceUpdatedEvent.class
})
public class ConferenceEvent
    extends EventData
{

    @XmlElement(required = true)
    protected Conference conference;

    /**
     * Ruft den Wert der conference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Conference }
     *     
     */
    public Conference getConference() {
        return conference;
    }

    /**
     * Legt den Wert der conference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Conference }
     *     
     */
    public void setConference(Conference value) {
        this.conference = value;
    }

}
