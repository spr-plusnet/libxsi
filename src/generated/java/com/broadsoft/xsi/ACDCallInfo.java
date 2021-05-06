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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         An ACDCallInformation is provided when a call is
 *         offered to an agent
 *         by an ACD.
 *       
 * 
 * <p>Java-Klasse für ACDCallInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ACDCallInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acdUserId" type="{http://schema.broadsoft.com/xsi}UserId"/&gt;
 *         &lt;element name="acdName" type="{http://schema.broadsoft.com/xsi}NonEmptyString"/&gt;
 *         &lt;element name="acdNumber" type="{http://schema.broadsoft.com/xsi}Address"/&gt;
 *         &lt;element name="numCallsInQueue" type="{http://schema.broadsoft.com/xsi}NonNegativeInt"/&gt;
 *         &lt;element name="waitTime" type="{http://schema.broadsoft.com/xsi}NonNegativeInt"/&gt;
 *         &lt;element name="longestWaitTime" type="{http://schema.broadsoft.com/xsi}NonNegativeInt" minOccurs="0"/&gt;
 *         &lt;element name="holdReminder" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/&gt;
 *         &lt;element name="callingPartyInfo" type="{http://schema.broadsoft.com/xsi}PartyInformation"/&gt;
 *         &lt;element name="routePoint" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/&gt;
 *         &lt;element name="dispositionCode" type="{http://schema.broadsoft.com/xsi}AgentDispositionCode" minOccurs="0"/&gt;
 *         &lt;element name="postCallAgentState" type="{http://schema.broadsoft.com/xsi}NonEmptyString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACDCallInfo", propOrder = {
    "acdUserId",
    "acdName",
    "acdNumber",
    "numCallsInQueue",
    "waitTime",
    "longestWaitTime",
    "holdReminder",
    "callingPartyInfo",
    "routePoint",
    "dispositionCode",
    "postCallAgentState"
})
public class ACDCallInfo {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String acdUserId;
    @XmlElement(required = true)
    protected String acdName;
    @XmlElement(required = true)
    protected Address acdNumber;
    protected int numCallsInQueue;
    protected int waitTime;
    protected Integer longestWaitTime;
    protected EmptyContent holdReminder;
    @XmlElement(required = true)
    protected PartyInformation callingPartyInfo;
    protected EmptyContent routePoint;
    protected String dispositionCode;
    protected String postCallAgentState;

    /**
     * Ruft den Wert der acdUserId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcdUserId() {
        return acdUserId;
    }

    /**
     * Legt den Wert der acdUserId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcdUserId(String value) {
        this.acdUserId = value;
    }

    /**
     * Ruft den Wert der acdName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcdName() {
        return acdName;
    }

    /**
     * Legt den Wert der acdName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcdName(String value) {
        this.acdName = value;
    }

    /**
     * Ruft den Wert der acdNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAcdNumber() {
        return acdNumber;
    }

    /**
     * Legt den Wert der acdNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAcdNumber(Address value) {
        this.acdNumber = value;
    }

    /**
     * Ruft den Wert der numCallsInQueue-Eigenschaft ab.
     * 
     */
    public int getNumCallsInQueue() {
        return numCallsInQueue;
    }

    /**
     * Legt den Wert der numCallsInQueue-Eigenschaft fest.
     * 
     */
    public void setNumCallsInQueue(int value) {
        this.numCallsInQueue = value;
    }

    /**
     * Ruft den Wert der waitTime-Eigenschaft ab.
     * 
     */
    public int getWaitTime() {
        return waitTime;
    }

    /**
     * Legt den Wert der waitTime-Eigenschaft fest.
     * 
     */
    public void setWaitTime(int value) {
        this.waitTime = value;
    }

    /**
     * Ruft den Wert der longestWaitTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLongestWaitTime() {
        return longestWaitTime;
    }

    /**
     * Legt den Wert der longestWaitTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLongestWaitTime(Integer value) {
        this.longestWaitTime = value;
    }

    /**
     * Ruft den Wert der holdReminder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getHoldReminder() {
        return holdReminder;
    }

    /**
     * Legt den Wert der holdReminder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setHoldReminder(EmptyContent value) {
        this.holdReminder = value;
    }

    /**
     * Ruft den Wert der callingPartyInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PartyInformation }
     *     
     */
    public PartyInformation getCallingPartyInfo() {
        return callingPartyInfo;
    }

    /**
     * Legt den Wert der callingPartyInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyInformation }
     *     
     */
    public void setCallingPartyInfo(PartyInformation value) {
        this.callingPartyInfo = value;
    }

    /**
     * Ruft den Wert der routePoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getRoutePoint() {
        return routePoint;
    }

    /**
     * Legt den Wert der routePoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setRoutePoint(EmptyContent value) {
        this.routePoint = value;
    }

    /**
     * Ruft den Wert der dispositionCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispositionCode() {
        return dispositionCode;
    }

    /**
     * Legt den Wert der dispositionCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispositionCode(String value) {
        this.dispositionCode = value;
    }

    /**
     * Ruft den Wert der postCallAgentState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCallAgentState() {
        return postCallAgentState;
    }

    /**
     * Legt den Wert der postCallAgentState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCallAgentState(String value) {
        this.postCallAgentState = value;
    }

}
