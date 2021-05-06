//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="agentACDState" type="{http://schema.broadsoft.com/xsi}AgentState" minOccurs="0"/&gt;
 *         &lt;element name="agentUnavailableCode" type="{http://schema.broadsoft.com/xsi}AgentUnavailableCode" minOccurs="0"/&gt;
 *         &lt;element name="useDefaultGuardTimer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="enableGuardTimer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="guardTimerSeconds" type="{http://schema.broadsoft.com/xsi}ACDGuardTimerSeconds" minOccurs="0"/&gt;
 *         &lt;element name="useSystemDefaultUnavailableSettings" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="forceAgentUnavailableOnDNDActivation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="forceUnavailableOnPersonalCalls" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="forceAgentUnavailableOnBouncedCallLimit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="numberConsecutiveBouncedCallsToForceAgentUnavailable" type="{http://schema.broadsoft.com/xsi}ACDConsecutiveBouncedCallsToForceAgentUnavailable" minOccurs="0"/&gt;
 *         &lt;element name="makeOutgoingCallsAsCallCenter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="outgoingCallDNIS" type="{http://schema.broadsoft.com/xsi}DNISKey" minOccurs="0"/&gt;
 *         &lt;element name="callCenterList" type="{http://schema.broadsoft.com/xsi}CallCenterList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "agentACDState",
    "agentUnavailableCode",
    "useDefaultGuardTimer",
    "enableGuardTimer",
    "guardTimerSeconds",
    "useSystemDefaultUnavailableSettings",
    "forceAgentUnavailableOnDNDActivation",
    "forceUnavailableOnPersonalCalls",
    "forceAgentUnavailableOnBouncedCallLimit",
    "numberConsecutiveBouncedCallsToForceAgentUnavailable",
    "makeOutgoingCallsAsCallCenter",
    "outgoingCallDNIS",
    "callCenterList"
})
@XmlRootElement(name = "CallCenter")
public class CallCenter {

    @XmlSchemaType(name = "token")
    protected AgentState agentACDState;
    @XmlElementRef(name = "agentUnavailableCode", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> agentUnavailableCode;
    protected Boolean useDefaultGuardTimer;
    protected Boolean enableGuardTimer;
    protected Integer guardTimerSeconds;
    protected Boolean useSystemDefaultUnavailableSettings;
    protected Boolean forceAgentUnavailableOnDNDActivation;
    protected Boolean forceUnavailableOnPersonalCalls;
    protected Boolean forceAgentUnavailableOnBouncedCallLimit;
    protected Integer numberConsecutiveBouncedCallsToForceAgentUnavailable;
    protected Boolean makeOutgoingCallsAsCallCenter;
    @XmlElementRef(name = "outgoingCallDNIS", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<DNISKey> outgoingCallDNIS;
    protected CallCenterList callCenterList;

    /**
     * Ruft den Wert der agentACDState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AgentState }
     *     
     */
    public AgentState getAgentACDState() {
        return agentACDState;
    }

    /**
     * Legt den Wert der agentACDState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentState }
     *     
     */
    public void setAgentACDState(AgentState value) {
        this.agentACDState = value;
    }

    /**
     * Ruft den Wert der agentUnavailableCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAgentUnavailableCode() {
        return agentUnavailableCode;
    }

    /**
     * Legt den Wert der agentUnavailableCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAgentUnavailableCode(JAXBElement<String> value) {
        this.agentUnavailableCode = value;
    }

    /**
     * Ruft den Wert der useDefaultGuardTimer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseDefaultGuardTimer() {
        return useDefaultGuardTimer;
    }

    /**
     * Legt den Wert der useDefaultGuardTimer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseDefaultGuardTimer(Boolean value) {
        this.useDefaultGuardTimer = value;
    }

    /**
     * Ruft den Wert der enableGuardTimer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableGuardTimer() {
        return enableGuardTimer;
    }

    /**
     * Legt den Wert der enableGuardTimer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableGuardTimer(Boolean value) {
        this.enableGuardTimer = value;
    }

    /**
     * Ruft den Wert der guardTimerSeconds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGuardTimerSeconds() {
        return guardTimerSeconds;
    }

    /**
     * Legt den Wert der guardTimerSeconds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGuardTimerSeconds(Integer value) {
        this.guardTimerSeconds = value;
    }

    /**
     * Ruft den Wert der useSystemDefaultUnavailableSettings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseSystemDefaultUnavailableSettings() {
        return useSystemDefaultUnavailableSettings;
    }

    /**
     * Legt den Wert der useSystemDefaultUnavailableSettings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseSystemDefaultUnavailableSettings(Boolean value) {
        this.useSystemDefaultUnavailableSettings = value;
    }

    /**
     * Ruft den Wert der forceAgentUnavailableOnDNDActivation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceAgentUnavailableOnDNDActivation() {
        return forceAgentUnavailableOnDNDActivation;
    }

    /**
     * Legt den Wert der forceAgentUnavailableOnDNDActivation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceAgentUnavailableOnDNDActivation(Boolean value) {
        this.forceAgentUnavailableOnDNDActivation = value;
    }

    /**
     * Ruft den Wert der forceUnavailableOnPersonalCalls-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceUnavailableOnPersonalCalls() {
        return forceUnavailableOnPersonalCalls;
    }

    /**
     * Legt den Wert der forceUnavailableOnPersonalCalls-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceUnavailableOnPersonalCalls(Boolean value) {
        this.forceUnavailableOnPersonalCalls = value;
    }

    /**
     * Ruft den Wert der forceAgentUnavailableOnBouncedCallLimit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceAgentUnavailableOnBouncedCallLimit() {
        return forceAgentUnavailableOnBouncedCallLimit;
    }

    /**
     * Legt den Wert der forceAgentUnavailableOnBouncedCallLimit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceAgentUnavailableOnBouncedCallLimit(Boolean value) {
        this.forceAgentUnavailableOnBouncedCallLimit = value;
    }

    /**
     * Ruft den Wert der numberConsecutiveBouncedCallsToForceAgentUnavailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberConsecutiveBouncedCallsToForceAgentUnavailable() {
        return numberConsecutiveBouncedCallsToForceAgentUnavailable;
    }

    /**
     * Legt den Wert der numberConsecutiveBouncedCallsToForceAgentUnavailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberConsecutiveBouncedCallsToForceAgentUnavailable(Integer value) {
        this.numberConsecutiveBouncedCallsToForceAgentUnavailable = value;
    }

    /**
     * Ruft den Wert der makeOutgoingCallsAsCallCenter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMakeOutgoingCallsAsCallCenter() {
        return makeOutgoingCallsAsCallCenter;
    }

    /**
     * Legt den Wert der makeOutgoingCallsAsCallCenter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMakeOutgoingCallsAsCallCenter(Boolean value) {
        this.makeOutgoingCallsAsCallCenter = value;
    }

    /**
     * Ruft den Wert der outgoingCallDNIS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DNISKey }{@code >}
     *     
     */
    public JAXBElement<DNISKey> getOutgoingCallDNIS() {
        return outgoingCallDNIS;
    }

    /**
     * Legt den Wert der outgoingCallDNIS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DNISKey }{@code >}
     *     
     */
    public void setOutgoingCallDNIS(JAXBElement<DNISKey> value) {
        this.outgoingCallDNIS = value;
    }

    /**
     * Ruft den Wert der callCenterList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CallCenterList }
     *     
     */
    public CallCenterList getCallCenterList() {
        return callCenterList;
    }

    /**
     * Legt den Wert der callCenterList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CallCenterList }
     *     
     */
    public void setCallCenterList(CallCenterList value) {
        this.callCenterList = value;
    }

}
