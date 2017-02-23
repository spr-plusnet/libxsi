//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="ServiceEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData">
 *       &lt;sequence>
 *         &lt;element name="unassigned" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceEvent", propOrder = {
    "unassigned"
})
@XmlSeeAlso({
    CallWaitingEvent.class,
    MusicOnHoldEvent.class,
    HotelingGuestEvent.class,
    SimultaneousRingPersonalEvent.class,
    CallForwardingAlwaysSecondaryEvent.class,
    ThirdPartyVoiceMailSupportEvent.class,
    BroadWorksAnywhereEvent.class,
    DoNotDisturbEvent.class,
    CallForwardingBusyEvent.class,
    FlexibleSeatingGuestEvent.class,
    SilentAlertingEvent.class,
    CommPilotExpressEvent.class,
    ThreeWayCallEvent.class,
    PersonalAssistantEvent.class,
    SecurityClassificationEvent.class,
    RemoteOfficeEvent.class,
    VoiceMessagingEvent.class,
    CallTransferEvent.class,
    CallForwardingNoAnswerEvent.class,
    NWayCallEvent.class,
    SequentialRingEvent.class,
    LastNumberRedialEvent.class,
    CallForwardingAlwaysEvent.class
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
