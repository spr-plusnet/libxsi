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
 *         &lt;element name="agentId" type="{http://schema.broadsoft.com/xsi}SubscriberId"/>
 *         &lt;element name="callingLineIdNumber" type="{http://schema.broadsoft.com/xsi}Address" minOccurs="0"/>
 *         &lt;element name="callingLineIdName" type="{http://schema.broadsoft.com/xsi}NonEmptyString" minOccurs="0"/>
 *         &lt;element name="timeInQueue" type="{http://schema.broadsoft.com/xsi}NonNegativeInt" minOccurs="0"/>
 *         &lt;element name="numberOfCallsInQueue" type="{http://schema.broadsoft.com/xsi}NonNegativeInt" minOccurs="0"/>
 *         &lt;element name="longestWaitTime" type="{http://schema.broadsoft.com/xsi}NonNegativeInt" minOccurs="0"/>
 *         &lt;element name="whisperMessageAudioUrl" type="{http://schema.broadsoft.com/xsi}NonEmptyURI" minOccurs="0"/>
 *         &lt;element name="whisperMessageVideoUrl" type="{http://schema.broadsoft.com/xsi}NonEmptyString" minOccurs="0"/>
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
