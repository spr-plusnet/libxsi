//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         An AgentStateInformation maintains information about the agent state.
 *         
 *         Change History:
 *         19     - Modified: 
 *                   stateTimestamp type changed from 
 *                     Timestamp to TimestampWithSeverity
 *                   averageWrapUpTime type changed from 
 *                     NonNegativeInt to NonNegativeIntWithSeverity
 *         
 *         17.sp3 - Modified by adding element "wrapUpCallCenterUserId"      
 *       
 * 
 * <p>Java-Klasse für AgentStateInformation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AgentStateInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="state" type="{http://schema.broadsoft.com/xsi}AgentState"/>
 *         &lt;element name="stateTimestamp" type="{http://schema.broadsoft.com/xsi}TimestampWithSeverity"/>
 *         &lt;element name="unavailableCode" type="{http://schema.broadsoft.com/xsi}AgentUnavailableCode" minOccurs="0"/>
 *         &lt;element name="wrapUpCallId" type="{http://schema.broadsoft.com/xsi}CallId" minOccurs="0"/>
 *         &lt;element name="signInTimestamp" type="{http://schema.broadsoft.com/xsi}Timestamp" minOccurs="0"/>
 *         &lt;element name="totalAvailableTime" type="{http://schema.broadsoft.com/xsi}NonNegativeInt" minOccurs="0"/>
 *         &lt;element name="averageWrapUpTime" type="{http://schema.broadsoft.com/xsi}NonNegativeIntWithSeverity" minOccurs="0"/>
 *         &lt;element name="wrapUpCallCenterUserId" type="{http://schema.broadsoft.com/xsi}UserId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentStateInformation", propOrder = {
    "state",
    "stateTimestamp",
    "unavailableCode",
    "wrapUpCallId",
    "signInTimestamp",
    "totalAvailableTime",
    "averageWrapUpTime",
    "wrapUpCallCenterUserId"
})
public class AgentStateInformation {

    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected AgentState state;
    @XmlElement(required = true)
    protected TimestampWithSeverity stateTimestamp;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String unavailableCode;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String wrapUpCallId;
    protected Long signInTimestamp;
    protected Integer totalAvailableTime;
    protected NonNegativeIntWithSeverity averageWrapUpTime;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String wrapUpCallCenterUserId;

    /**
     * Ruft den Wert der state-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AgentState }
     *     
     */
    public AgentState getState() {
        return state;
    }

    /**
     * Legt den Wert der state-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentState }
     *     
     */
    public void setState(AgentState value) {
        this.state = value;
    }

    /**
     * Ruft den Wert der stateTimestamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimestampWithSeverity }
     *     
     */
    public TimestampWithSeverity getStateTimestamp() {
        return stateTimestamp;
    }

    /**
     * Legt den Wert der stateTimestamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimestampWithSeverity }
     *     
     */
    public void setStateTimestamp(TimestampWithSeverity value) {
        this.stateTimestamp = value;
    }

    /**
     * Ruft den Wert der unavailableCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnavailableCode() {
        return unavailableCode;
    }

    /**
     * Legt den Wert der unavailableCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnavailableCode(String value) {
        this.unavailableCode = value;
    }

    /**
     * Ruft den Wert der wrapUpCallId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrapUpCallId() {
        return wrapUpCallId;
    }

    /**
     * Legt den Wert der wrapUpCallId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrapUpCallId(String value) {
        this.wrapUpCallId = value;
    }

    /**
     * Ruft den Wert der signInTimestamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSignInTimestamp() {
        return signInTimestamp;
    }

    /**
     * Legt den Wert der signInTimestamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSignInTimestamp(Long value) {
        this.signInTimestamp = value;
    }

    /**
     * Ruft den Wert der totalAvailableTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalAvailableTime() {
        return totalAvailableTime;
    }

    /**
     * Legt den Wert der totalAvailableTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalAvailableTime(Integer value) {
        this.totalAvailableTime = value;
    }

    /**
     * Ruft den Wert der averageWrapUpTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeIntWithSeverity }
     *     
     */
    public NonNegativeIntWithSeverity getAverageWrapUpTime() {
        return averageWrapUpTime;
    }

    /**
     * Legt den Wert der averageWrapUpTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeIntWithSeverity }
     *     
     */
    public void setAverageWrapUpTime(NonNegativeIntWithSeverity value) {
        this.averageWrapUpTime = value;
    }

    /**
     * Ruft den Wert der wrapUpCallCenterUserId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrapUpCallCenterUserId() {
        return wrapUpCallCenterUserId;
    }

    /**
     * Legt den Wert der wrapUpCallCenterUserId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrapUpCallCenterUserId(String value) {
        this.wrapUpCallCenterUserId = value;
    }

}
