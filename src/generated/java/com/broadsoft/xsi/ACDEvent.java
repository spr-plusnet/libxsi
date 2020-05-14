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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="ACDEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData">
 *       &lt;sequence>
 *         &lt;element name="queueEntry" type="{http://schema.broadsoft.com/xsi}ACDQueueEntry"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACDEvent", propOrder = {
    "queueEntry"
})
@XmlSeeAlso({
    ACDCallOfferedToAgentEvent.class,
    ACDCallPromotedEvent.class,
    ACDCallStrandedEvent.class,
    ACDCallStrandedTreatementCompletedEvent.class,
    ACDCallTransferredEvent.class,
    ACDCallAnsweredByAgentEvent.class,
    ACDCallStrandedUnavailableEvent.class,
    ACDCallStrandedUnavailableTreatementCompletedEvent.class,
    ACDCallUpdatedEvent.class,
    ACDCallAbandonedEvent.class,
    ACDCallBouncedEvent.class,
    ACDCallReleasedEvent.class,
    ACDCallOverflowedTreatmentCompletedEvent.class,
    ACDCallAddedEvent.class,
    ACDCallOverflowedEvent.class,
    ACDWhisperStartedEvent.class,
    ACDCallReorderedEvent.class,
    ACDCallEscapedEvent.class
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
