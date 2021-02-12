//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="CallEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData">
 *       &lt;sequence>
 *         &lt;element name="call" type="{http://schema.broadsoft.com/xsi}Call"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallEvent", propOrder = {
    "call"
})
@XmlSeeAlso({
    CallRecordingResumedEvent.class,
    CallOriginatedEvent.class,
    PlayMusicOnHoldFailureEvent.class,
    CallOriginatingEvent.class,
    CallCollectingEvent.class,
    CallReleasingEvent.class,
    CallParkRetrievedEvent.class,
    CallRecordingStartedEvent.class,
    CallReleasedEvent.class,
    CallForwardedEvent.class,
    CallAnsweredEvent.class,
    CallDetachedEvent.class,
    CallReceivedEvent.class,
    CallTransferredEvent.class,
    CallBargedInEvent.class,
    CallUpdatedEvent.class,
    CallRecordingStartingEvent.class,
    CallMonitoredEvent.class,
    CallClientSessionInfoUpdatedEvent.class,
    CallPickedUpEvent.class,
    CallRecordingPausedEvent.class,
    CallSecurityClassificationUpdatedEvent.class,
    CallHeldEvent.class,
    CallRecordingStoppedEvent.class,
    CallRetrievedEvent.class
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
