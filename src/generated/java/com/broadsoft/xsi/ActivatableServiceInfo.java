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
 * &lt;complexType name="ActivatableServiceInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivatableServiceInfo", propOrder = {
    "active"
})
@XmlSeeAlso({
    CallingLineIDBlockingOverride.class,
    CallingLineIDDeliveryBlocking.class,
    CallingNameRetrieval.class,
    CallWaiting.class,
    ConnectedLineIdentificationPresentation.class,
    ConnectedLineIdentificationRestriction.class,
    DoNotDisturb.class,
    FlexibleSeatingGuest.class,
    HotelingGuest.class,
    InCallServiceActivation.class,
    IntegratedIMPService.class,
    MWIDeliveryToMobileEndpoint.class,
    PersonalAssistant.class,
    RemoteOffice.class,
    SilentAlerting.class,
    SimultaneousRingPersonal.class,
    CallForwarding.class,
    VoiceMessaging.class,
    ThirdPartyVoiceMailSupport.class,
    OutgoingMWI.class,
    MusicOnHold.class,
    LegacyAutomaticCallback.class,
    InternalCallingLineIDDelivery.class,
    InterceptUser.class,
    HotelingHost.class,
    FaxMessaging.class,
    ExternalCallingLineIDDelivery.class,
    CallMeNow.class,
    CallForwardingSelective.class,
    BroadWorksMobility.class,
    ACDForcedForwarding.class
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
