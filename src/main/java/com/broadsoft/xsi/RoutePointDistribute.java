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
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="agentId" type="{http://schema.broadsoft.com/xsi}SubscriberId"/&gt;
 *         &lt;element name="callingLineIdNumber" type="{http://schema.broadsoft.com/xsi}Address" minOccurs="0"/&gt;
 *         &lt;element name="callingLineIdName" type="{http://schema.broadsoft.com/xsi}NonEmptyString" minOccurs="0"/&gt;
 *         &lt;element name="timeInQueue" type="{http://schema.broadsoft.com/xsi}NonNegativeInt" minOccurs="0"/&gt;
 *         &lt;element name="numberOfCallsInQueue" type="{http://schema.broadsoft.com/xsi}NonNegativeInt" minOccurs="0"/&gt;
 *         &lt;element name="longestWaitTime" type="{http://schema.broadsoft.com/xsi}NonNegativeInt" minOccurs="0"/&gt;
 *         &lt;element name="whisperMessageAudioUrl" type="{http://schema.broadsoft.com/xsi}NonEmptyURI" minOccurs="0"/&gt;
 *         &lt;element name="whisperMessageVideoUrl" type="{http://schema.broadsoft.com/xsi}NonEmptyString" minOccurs="0"/&gt;
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
    "agentId",
    "callingLineIdNumber",
    "callingLineIdName",
    "timeInQueue",
    "numberOfCallsInQueue",
    "longestWaitTime",
    "whisperMessageAudioUrl",
    "whisperMessageVideoUrl"
})
@XmlRootElement(name = "RoutePointDistribute")
public class RoutePointDistribute {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String agentId;
    protected Address callingLineIdNumber;
    protected String callingLineIdName;
    protected Integer timeInQueue;
    protected Integer numberOfCallsInQueue;
    protected Integer longestWaitTime;
    @XmlSchemaType(name = "anyURI")
    protected String whisperMessageAudioUrl;
    protected String whisperMessageVideoUrl;

    /**
     * Ruft den Wert der agentId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentId() {
        return agentId;
    }

    /**
     * Legt den Wert der agentId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentId(String value) {
        this.agentId = value;
    }

    /**
     * Ruft den Wert der callingLineIdNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getCallingLineIdNumber() {
        return callingLineIdNumber;
    }

    /**
     * Legt den Wert der callingLineIdNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setCallingLineIdNumber(Address value) {
        this.callingLineIdNumber = value;
    }

    /**
     * Ruft den Wert der callingLineIdName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingLineIdName() {
        return callingLineIdName;
    }

    /**
     * Legt den Wert der callingLineIdName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingLineIdName(String value) {
        this.callingLineIdName = value;
    }

    /**
     * Ruft den Wert der timeInQueue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeInQueue() {
        return timeInQueue;
    }

    /**
     * Legt den Wert der timeInQueue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeInQueue(Integer value) {
        this.timeInQueue = value;
    }

    /**
     * Ruft den Wert der numberOfCallsInQueue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfCallsInQueue() {
        return numberOfCallsInQueue;
    }

    /**
     * Legt den Wert der numberOfCallsInQueue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfCallsInQueue(Integer value) {
        this.numberOfCallsInQueue = value;
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
     * Ruft den Wert der whisperMessageAudioUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhisperMessageAudioUrl() {
        return whisperMessageAudioUrl;
    }

    /**
     * Legt den Wert der whisperMessageAudioUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhisperMessageAudioUrl(String value) {
        this.whisperMessageAudioUrl = value;
    }

    /**
     * Ruft den Wert der whisperMessageVideoUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhisperMessageVideoUrl() {
        return whisperMessageVideoUrl;
    }

    /**
     * Legt den Wert der whisperMessageVideoUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhisperMessageVideoUrl(String value) {
        this.whisperMessageVideoUrl = value;
    }

}
