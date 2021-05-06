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
 *         Abstract type for service notification.
 *       
 * 
 * <p>Java-Klasse für ServiceEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServiceEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="unassigned" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceEvent", propOrder = {
    "unassigned"
})
@XmlSeeAlso({
    BroadWorksAnywhereEvent.class,
    CallTransferEvent.class,
    CallWaitingEvent.class,
    CallForwardingAlwaysEvent.class,
    CallForwardingAlwaysSecondaryEvent.class,
    CallForwardingBusyEvent.class,
    CallForwardingNoAnswerEvent.class,
    CommPilotExpressEvent.class,
    DoNotDisturbEvent.class,
    HotelingGuestEvent.class,
    FlexibleSeatingGuestEvent.class,
    LastNumberRedialEvent.class,
    MusicOnHoldEvent.class,
    NWayCallEvent.class,
    PersonalAssistantEvent.class,
    RemoteOfficeEvent.class,
    SecurityClassificationEvent.class,
    SequentialRingEvent.class,
    SilentAlertingEvent.class,
    SimultaneousRingPersonalEvent.class,
    ThirdPartyVoiceMailSupportEvent.class,
    ThreeWayCallEvent.class,
    VoiceMessagingEvent.class
})
public abstract class ServiceEvent
    extends EventData
{

    protected EmptyContent unassigned;

    /**
     * Ruft den Wert der unassigned-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getUnassigned() {
        return unassigned;
    }

    /**
     * Legt den Wert der unassigned-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setUnassigned(EmptyContent value) {
        this.unassigned = value;
    }

}
