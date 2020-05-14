//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceInstanceProfile" type="{http://schema.broadsoft.com/xsi}ServiceInstanceReadProfile" minOccurs="0"/>
 *         &lt;element name="type" type="{http://schema.broadsoft.com/xsi}ACDType" minOccurs="0"/>
 *         &lt;element name="routingType" type="{http://schema.broadsoft.com/xsi}ACDRouting" minOccurs="0"/>
 *         &lt;element name="policy" type="{http://schema.broadsoft.com/xsi}HuntPolicy" minOccurs="0"/>
 *         &lt;element name="enableVideo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="queueLength" type="{http://schema.broadsoft.com/xsi}ACDQueueLength" minOccurs="0"/>
 *         &lt;element name="allowCallerToDialEscapeDigit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="escapeDigit" type="{http://schema.broadsoft.com/xsi}DTMFDigit" minOccurs="0"/>
 *         &lt;element name="resetCallStatisticsUponEntryInQueue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowAgentLogoff" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowCallWaitingForAgents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowCallsToAgentsInWrapUp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="overrideAgentWrapUpTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="wrapUpSeconds" type="{http://schema.broadsoft.com/xsi}ACDWrapUpSeconds" minOccurs="0"/>
 *         &lt;element name="forceDeliveryOfCalls" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="forceDeliveryWaitTimeSeconds" type="{http://schema.broadsoft.com/xsi}ACDForceDeliveryWaitTimeSeconds" minOccurs="0"/>
 *         &lt;element name="enableAutomaticStateChangeForAgents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="agentStateAfterCall" type="{http://schema.broadsoft.com/xsi}AgentACDAutomaticState" minOccurs="0"/>
 *         &lt;element name="agentUnavailableCode" type="{http://schema.broadsoft.com/xsi}AgentUnavailableCode" minOccurs="0"/>
 *         &lt;element name="externalPreferredAudioCodec" type="{http://schema.broadsoft.com/xsi}AudioFileCodec" minOccurs="0"/>
 *         &lt;element name="internalPreferredAudioCodec" type="{http://schema.broadsoft.com/xsi}AudioFileCodec" minOccurs="0"/>
 *         &lt;element name="playRingingWhenOfferingCall" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="externalReporting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableThreshold" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serviceInstanceProfile",
    "type",
    "routingType",
    "policy",
    "enableVideo",
    "queueLength",
    "allowCallerToDialEscapeDigit",
    "escapeDigit",
    "resetCallStatisticsUponEntryInQueue",
    "allowAgentLogoff",
    "allowCallWaitingForAgents",
    "allowCallsToAgentsInWrapUp",
    "overrideAgentWrapUpTime",
    "wrapUpSeconds",
    "forceDeliveryOfCalls",
    "forceDeliveryWaitTimeSeconds",
    "enableAutomaticStateChangeForAgents",
    "agentStateAfterCall",
    "agentUnavailableCode",
    "externalPreferredAudioCodec",
    "internalPreferredAudioCodec",
    "playRingingWhenOfferingCall",
    "externalReporting",
    "enableThreshold"
})
@XmlRootElement(name = "ACDProfile")
public class ACDProfile {

    protected ServiceInstanceReadProfile serviceInstanceProfile;
    @XmlSchemaType(name = "token")
    protected ACDType type;
    @XmlSchemaType(name = "token")
    protected ACDRouting routingType;
    @XmlSchemaType(name = "token")
    protected HuntPolicy policy;
    protected Boolean enableVideo;
    protected Integer queueLength;
    protected Boolean allowCallerToDialEscapeDigit;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String escapeDigit;
    protected Boolean resetCallStatisticsUponEntryInQueue;
    protected Boolean allowAgentLogoff;
    protected Boolean allowCallWaitingForAgents;
    protected Boolean allowCallsToAgentsInWrapUp;
    protected Boolean overrideAgentWrapUpTime;
    protected Integer wrapUpSeconds;
    protected Boolean forceDeliveryOfCalls;
    protected Integer forceDeliveryWaitTimeSeconds;
    protected Boolean enableAutomaticStateChangeForAgents;
    @XmlSchemaType(name = "token")
    protected AgentACDAutomaticState agentStateAfterCall;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String agentUnavailableCode;
    protected String externalPreferredAudioCodec;
    protected String internalPreferredAudioCodec;
    protected Boolean playRingingWhenOfferingCall;
    protected Boolean externalReporting;
    protected Boolean enableThreshold;

    /**
     * Ruft den Wert der serviceInstanceProfile-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceInstanceReadProfile }
     *     
     */
    public ServiceInstanceReadProfile getServiceInstanceProfile() {
        return serviceInstanceProfile;
    }

    /**
     * Legt den Wert der serviceInstanceProfile-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInstanceReadProfile }
     *     
     */
    public void setServiceInstanceProfile(ServiceInstanceReadProfile value) {
        this.serviceInstanceProfile = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ACDType }
     *     
     */
    public ACDType getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ACDType }
     *     
     */
    public void setType(ACDType value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der routingType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ACDRouting }
     *     
     */
    public ACDRouting getRoutingType() {
        return routingType;
    }

    /**
     * Legt den Wert der routingType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ACDRouting }
     *     
     */
    public void setRoutingType(ACDRouting value) {
        this.routingType = value;
    }

    /**
     * Ruft den Wert der policy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HuntPolicy }
     *     
     */
    public HuntPolicy getPolicy() {
        return policy;
    }

    /**
     * Legt den Wert der policy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HuntPolicy }
     *     
     */
    public void setPolicy(HuntPolicy value) {
        this.policy = value;
    }

    /**
     * Ruft den Wert der enableVideo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableVideo() {
        return enableVideo;
    }

    /**
     * Legt den Wert der enableVideo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableVideo(Boolean value) {
        this.enableVideo = value;
    }

    /**
     * Ruft den Wert der queueLength-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQueueLength() {
        return queueLength;
    }

    /**
     * Legt den Wert der queueLength-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQueueLength(Integer value) {
        this.queueLength = value;
    }

    /**
     * Ruft den Wert der allowCallerToDialEscapeDigit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowCallerToDialEscapeDigit() {
        return allowCallerToDialEscapeDigit;
    }

    /**
     * Legt den Wert der allowCallerToDialEscapeDigit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowCallerToDialEscapeDigit(Boolean value) {
        this.allowCallerToDialEscapeDigit = value;
    }

    /**
     * Ruft den Wert der escapeDigit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscapeDigit() {
        return escapeDigit;
    }

    /**
     * Legt den Wert der escapeDigit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscapeDigit(String value) {
        this.escapeDigit = value;
    }

    /**
     * Ruft den Wert der resetCallStatisticsUponEntryInQueue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResetCallStatisticsUponEntryInQueue() {
        return resetCallStatisticsUponEntryInQueue;
    }

    /**
     * Legt den Wert der resetCallStatisticsUponEntryInQueue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResetCallStatisticsUponEntryInQueue(Boolean value) {
        this.resetCallStatisticsUponEntryInQueue = value;
    }

    /**
     * Ruft den Wert der allowAgentLogoff-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowAgentLogoff() {
        return allowAgentLogoff;
    }

    /**
     * Legt den Wert der allowAgentLogoff-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowAgentLogoff(Boolean value) {
        this.allowAgentLogoff = value;
    }

    /**
     * Ruft den Wert der allowCallWaitingForAgents-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowCallWaitingForAgents() {
        return allowCallWaitingForAgents;
    }

    /**
     * Legt den Wert der allowCallWaitingForAgents-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowCallWaitingForAgents(Boolean value) {
        this.allowCallWaitingForAgents = value;
    }

    /**
     * Ruft den Wert der allowCallsToAgentsInWrapUp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowCallsToAgentsInWrapUp() {
        return allowCallsToAgentsInWrapUp;
    }

    /**
     * Legt den Wert der allowCallsToAgentsInWrapUp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowCallsToAgentsInWrapUp(Boolean value) {
        this.allowCallsToAgentsInWrapUp = value;
    }

    /**
     * Ruft den Wert der overrideAgentWrapUpTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideAgentWrapUpTime() {
        return overrideAgentWrapUpTime;
    }

    /**
     * Legt den Wert der overrideAgentWrapUpTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideAgentWrapUpTime(Boolean value) {
        this.overrideAgentWrapUpTime = value;
    }

    /**
     * Ruft den Wert der wrapUpSeconds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWrapUpSeconds() {
        return wrapUpSeconds;
    }

    /**
     * Legt den Wert der wrapUpSeconds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWrapUpSeconds(Integer value) {
        this.wrapUpSeconds = value;
    }

    /**
     * Ruft den Wert der forceDeliveryOfCalls-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceDeliveryOfCalls() {
        return forceDeliveryOfCalls;
    }

    /**
     * Legt den Wert der forceDeliveryOfCalls-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceDeliveryOfCalls(Boolean value) {
        this.forceDeliveryOfCalls = value;
    }

    /**
     * Ruft den Wert der forceDeliveryWaitTimeSeconds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getForceDeliveryWaitTimeSeconds() {
        return forceDeliveryWaitTimeSeconds;
    }

    /**
     * Legt den Wert der forceDeliveryWaitTimeSeconds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setForceDeliveryWaitTimeSeconds(Integer value) {
        this.forceDeliveryWaitTimeSeconds = value;
    }

    /**
     * Ruft den Wert der enableAutomaticStateChangeForAgents-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableAutomaticStateChangeForAgents() {
        return enableAutomaticStateChangeForAgents;
    }

    /**
     * Legt den Wert der enableAutomaticStateChangeForAgents-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableAutomaticStateChangeForAgents(Boolean value) {
        this.enableAutomaticStateChangeForAgents = value;
    }

    /**
     * Ruft den Wert der agentStateAfterCall-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AgentACDAutomaticState }
     *     
     */
    public AgentACDAutomaticState getAgentStateAfterCall() {
        return agentStateAfterCall;
    }

    /**
     * Legt den Wert der agentStateAfterCall-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentACDAutomaticState }
     *     
     */
    public void setAgentStateAfterCall(AgentACDAutomaticState value) {
        this.agentStateAfterCall = value;
    }

    /**
     * Ruft den Wert der agentUnavailableCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentUnavailableCode() {
        return agentUnavailableCode;
    }

    /**
     * Legt den Wert der agentUnavailableCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentUnavailableCode(String value) {
        this.agentUnavailableCode = value;
    }

    /**
     * Ruft den Wert der externalPreferredAudioCodec-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalPreferredAudioCodec() {
        return externalPreferredAudioCodec;
    }

    /**
     * Legt den Wert der externalPreferredAudioCodec-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalPreferredAudioCodec(String value) {
        this.externalPreferredAudioCodec = value;
    }

    /**
     * Ruft den Wert der internalPreferredAudioCodec-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalPreferredAudioCodec() {
        return internalPreferredAudioCodec;
    }

    /**
     * Legt den Wert der internalPreferredAudioCodec-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalPreferredAudioCodec(String value) {
        this.internalPreferredAudioCodec = value;
    }

    /**
     * Ruft den Wert der playRingingWhenOfferingCall-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlayRingingWhenOfferingCall() {
        return playRingingWhenOfferingCall;
    }

    /**
     * Legt den Wert der playRingingWhenOfferingCall-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlayRingingWhenOfferingCall(Boolean value) {
        this.playRingingWhenOfferingCall = value;
    }

    /**
     * Ruft den Wert der externalReporting-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExternalReporting() {
        return externalReporting;
    }

    /**
     * Legt den Wert der externalReporting-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExternalReporting(Boolean value) {
        this.externalReporting = value;
    }

    /**
     * Ruft den Wert der enableThreshold-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableThreshold() {
        return enableThreshold;
    }

    /**
     * Legt den Wert der enableThreshold-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableThreshold(Boolean value) {
        this.enableThreshold = value;
    }

}
