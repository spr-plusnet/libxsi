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
 *         This is the base type for RoutePointEvents. 
 *             
 * 
 * <p>Java-Klasse für RoutePointEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RoutePointEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="queueEntry" type="{http://schema.broadsoft.com/xsi}RoutePointQueueEntry"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutePointEvent", propOrder = {
    "queueEntry"
})
@XmlSeeAlso({
    RoutePointBusyCompletedEvent.class,
    RoutePointBusyStartedEvent.class,
    RoutePointCallAbandonedEvent.class,
    RoutePointCallAddedEvent.class,
    RoutePointCallAnsweredByAgentEvent.class,
    RoutePointCallBouncedEvent.class,
    RoutePointCallFailedEvent.class,
    RoutePointCallOfferedToAgentEvent.class,
    RoutePointCallOverflowedEvent.class,
    RoutePointCallOverflowedTreatmentCompletedEvent.class,
    RoutePointCallReleasedEvent.class,
    RoutePointCallTransferredEvent.class,
    RoutePointCallUpdatedEvent.class,
    RoutePointMOHCompletedEvent.class,
    RoutePointMOHStartedEvent.class,
    RoutePointOutgoingCallAnsweredEvent.class,
    RoutePointOutgoingCallOriginatedEvent.class,
    RoutePointRingbackCompletedEvent.class,
    RoutePointRingbackStartedEvent.class,
    RoutePointSilenceCompletedEvent.class,
    RoutePointSilenceStartedEvent.class,
    RoutePointTreatmentCompletedEvent.class,
    RoutePointTreatmentStartedEvent.class,
    RoutePointWhisperStartedEvent.class,
    RoutePointConnectingToVoiceXMLEvent.class,
    RoutePointConnectedToVoiceXMLEvent.class,
    RoutePointFailedVoiceXMLEvent.class
})
public class RoutePointEvent
    extends EventData
{

    @XmlElement(required = true)
    protected RoutePointQueueEntry queueEntry;

    /**
     * Ruft den Wert der queueEntry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoutePointQueueEntry }
     *     
     */
    public RoutePointQueueEntry getQueueEntry() {
        return queueEntry;
    }

    /**
     * Legt den Wert der queueEntry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutePointQueueEntry }
     *     
     */
    public void setQueueEntry(RoutePointQueueEntry value) {
        this.queueEntry = value;
    }

}
