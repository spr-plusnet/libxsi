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
 *         This is the base type for RoutePointEvents. 
 *             
 * 
 * <p>Java-Klasse für RoutePointEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RoutePointEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData">
 *       &lt;sequence>
 *         &lt;element name="queueEntry" type="{http://schema.broadsoft.com/xsi}RoutePointQueueEntry"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutePointEvent", propOrder = {
    "queueEntry"
})
@XmlSeeAlso({
    RoutePointCallBouncedEvent.class,
    RoutePointWhisperStartedEvent.class,
    RoutePointCallTransferredEvent.class,
    RoutePointMOHCompletedEvent.class,
    RoutePointSilenceCompletedEvent.class,
    RoutePointRingbackCompletedEvent.class,
    RoutePointCallAnsweredByAgentEvent.class,
    RoutePointCallUpdatedEvent.class,
    RoutePointCallFailedEvent.class,
    RoutePointBusyStartedEvent.class,
    RoutePointSilenceStartedEvent.class,
    RoutePointBusyCompletedEvent.class,
    RoutePointCallOverflowedEvent.class,
    RoutePointCallReleasedEvent.class,
    RoutePointCallOverflowedTreatmentCompletedEvent.class,
    RoutePointCallAbandonedEvent.class,
    RoutePointCallOfferedToAgentEvent.class,
    RoutePointTreatmentStartedEvent.class,
    RoutePointOutgoingCallOriginatedEvent.class,
    RoutePointRingbackStartedEvent.class,
    RoutePointCallAddedEvent.class,
    RoutePointOutgoingCallAnsweredEvent.class,
    RoutePointMOHStartedEvent.class,
    RoutePointTreatmentCompletedEvent.class
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
