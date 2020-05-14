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
 *         Data that indicates whether a service is active.
 *         This can be extended
 *         by any activatable service.
 *       
 * 
 * <p>Java-Klasse für ActivatableServiceInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ActivatableServiceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivatableServiceInfo", propOrder = {
    "active"
})
@XmlSeeAlso({
    ConnectedLineIdentificationRestriction.class,
    CallingNameRetrieval.class,
    IntegratedIMPService.class,
    SilentAlerting.class,
    HotelingGuest.class,
    PersonalAssistant.class,
    RemoteOffice.class,
    CallingLineIDDeliveryBlocking.class,
    FlexibleSeatingGuest.class,
    CallWaiting.class,
    SimultaneousRingPersonal.class,
    InCallServiceActivation.class,
    ConnectedLineIdentificationPresentation.class,
    CallingLineIDBlockingOverride.class,
    MWIDeliveryToMobileEndpoint.class,
    DoNotDisturb.class,
    CallForwarding.class,
    ThirdPartyVoiceMailSupport.class,
    MusicOnHold.class,
    LegacyAutomaticCallback.class,
    InterceptUser.class,
    BroadWorksMobility.class,
    FaxMessaging.class,
    HotelingHost.class,
    CallMeNow.class,
    ACDForcedForwarding.class,
    InternalCallingLineIDDelivery.class,
    OutgoingMWI.class,
    CallForwardingSelective.class,
    OutlookIntegration.class,
    VoiceMessaging.class,
    ExternalCallingLineIDDelivery.class
})
public class ActivatableServiceInfo {

    protected Boolean active;

    /**
     * Ruft den Wert der active-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Legt den Wert der active-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

}
