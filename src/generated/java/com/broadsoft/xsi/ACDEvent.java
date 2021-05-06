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
 * 
 *         The base event for ACD Events
 *       
 * 
 * <p>Java-Klasse für ACDEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ACDEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="queueEntry" type="{http://schema.broadsoft.com/xsi}ACDQueueEntry"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACDEvent", propOrder = {
    "queueEntry"
})
@XmlSeeAlso({
    ACDCallAbandonedEvent.class,
    ACDCallAddedEvent.class,
    ACDCallAnsweredByAgentEvent.class,
    ACDCallBouncedEvent.class,
    ACDCallEscapedEvent.class,
    ACDCallOfferedToAgentEvent.class,
    ACDCallOverflowedEvent.class,
    ACDCallOverflowedTreatmentCompletedEvent.class,
    ACDCallPromotedEvent.class,
    ACDCallReleasedEvent.class,
    ACDCallReorderedEvent.class,
    ACDCallStrandedEvent.class,
    ACDCallStrandedTreatementCompletedEvent.class,
    ACDCallStrandedUnavailableEvent.class,
    ACDCallStrandedUnavailableTreatementCompletedEvent.class,
    ACDCallTransferredEvent.class,
    ACDCallUpdatedEvent.class,
    ACDWhisperStartedEvent.class
})
public class ACDEvent
    extends EventData
{

    @XmlElement(required = true)
    protected ACDQueueEntry queueEntry;

    /**
     * Ruft den Wert der queueEntry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ACDQueueEntry }
     *     
     */
    public ACDQueueEntry getQueueEntry() {
        return queueEntry;
    }

    /**
     * Legt den Wert der queueEntry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ACDQueueEntry }
     *     
     */
    public void setQueueEntry(ACDQueueEntry value) {
        this.queueEntry = value;
    }

}
