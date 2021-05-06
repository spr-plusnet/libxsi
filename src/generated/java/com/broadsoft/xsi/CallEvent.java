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
 *         The base event type for CallEvents
 *       
 * 
 * <p>Java-Klasse für CallEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CallEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="call" type="{http://schema.broadsoft.com/xsi}Call"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallEvent", propOrder = {
    "call"
})
@XmlSeeAlso({
    CallAnsweredEvent.class,
    CallBargedInEvent.class,
    CallClientSessionInfoUpdatedEvent.class,
    CallSecurityClassificationUpdatedEvent.class,
    CallCollectingEvent.class,
    CallDetachedEvent.class,
    CallForwardedEvent.class,
    CallHeldEvent.class,
    CallMonitoredEvent.class,
    CallOriginatedEvent.class,
    CallOriginatingEvent.class,
    CallPickedUpEvent.class,
    CallParkRetrievedEvent.class,
    CallReceivedEvent.class,
    CallRecordingStartingEvent.class,
    CallRecordingStartedEvent.class,
    CallRecordingPausedEvent.class,
    CallRecordingResumedEvent.class,
    CallRecordingStoppedEvent.class,
    CallReleasedEvent.class,
    CallReleasingEvent.class,
    CallRetrievedEvent.class,
    CallTransferredEvent.class,
    CallUpdatedEvent.class,
    PlayMusicOnHoldFailureEvent.class
})
public abstract class CallEvent
    extends EventData
{

    @XmlElement(required = true)
    protected Call call;

    /**
     * Ruft den Wert der call-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Call }
     *     
     */
    public Call getCall() {
        return call;
    }

    /**
     * Legt den Wert der call-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Call }
     *     
     */
    public void setCall(Call value) {
        this.call = value;
    }

}
