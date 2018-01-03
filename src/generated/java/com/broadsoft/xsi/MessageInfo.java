//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Detailed summary information for an individual voice message.
 *         
 *         Change History:
 *         R20.0 - Added              
 *       
 * 
 * <p>Java-Klasse für MessageInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MessageInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="duration" type="{http://schema.broadsoft.com/xsi}NonNegativeInt" minOccurs="0"/>
 *         &lt;element name="callingPartyInfo" type="{http://schema.broadsoft.com/xsi}VoiceMailPartyInformation" minOccurs="0"/>
 *         &lt;element name="read" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/>
 *         &lt;element name="urgent" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/>
 *         &lt;element name="confidential" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/>
 *         &lt;element name="video" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/>
 *         &lt;element name="fax" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/>
 *         &lt;element name="time" type="{http://schema.broadsoft.com/xsi}Timestamp"/>
 *         &lt;element name="faxPageCount" type="{http://schema.broadsoft.com/xsi}PositiveInt" minOccurs="0"/>
 *         &lt;element name="messageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageInfo", propOrder = {
    "duration",
    "callingPartyInfo",
    "read",
    "urgent",
    "confidential",
    "video",
    "fax",
    "time",
    "faxPageCount",
    "messageId"
})
public class MessageInfo {

    protected Integer duration;
    protected VoiceMailPartyInformation callingPartyInfo;
    protected EmptyContent read;
    protected EmptyContent urgent;
    protected EmptyContent confidential;
    protected EmptyContent video;
    protected EmptyContent fax;
    protected long time;
    protected Integer faxPageCount;
    protected String messageId;

    /**
     * Ruft den Wert der duration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Legt den Wert der duration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDuration(Integer value) {
        this.duration = value;
    }

    /**
     * Ruft den Wert der callingPartyInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VoiceMailPartyInformation }
     *     
     */
    public VoiceMailPartyInformation getCallingPartyInfo() {
        return callingPartyInfo;
    }

    /**
     * Legt den Wert der callingPartyInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VoiceMailPartyInformation }
     *     
     */
    public void setCallingPartyInfo(VoiceMailPartyInformation value) {
        this.callingPartyInfo = value;
    }

    /**
     * Ruft den Wert der read-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getRead() {
        return read;
    }

    /**
     * Legt den Wert der read-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setRead(EmptyContent value) {
        this.read = value;
    }

    /**
     * Ruft den Wert der urgent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getUrgent() {
        return urgent;
    }

    /**
     * Legt den Wert der urgent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setUrgent(EmptyContent value) {
        this.urgent = value;
    }

    /**
     * Ruft den Wert der confidential-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getConfidential() {
        return confidential;
    }

    /**
     * Legt den Wert der confidential-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setConfidential(EmptyContent value) {
        this.confidential = value;
    }

    /**
     * Ruft den Wert der video-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getVideo() {
        return video;
    }

    /**
     * Legt den Wert der video-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setVideo(EmptyContent value) {
        this.video = value;
    }

    /**
     * Ruft den Wert der fax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getFax() {
        return fax;
    }

    /**
     * Legt den Wert der fax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setFax(EmptyContent value) {
        this.fax = value;
    }

    /**
     * Ruft den Wert der time-Eigenschaft ab.
     * 
     */
    public long getTime() {
        return time;
    }

    /**
     * Legt den Wert der time-Eigenschaft fest.
     * 
     */
    public void setTime(long value) {
        this.time = value;
    }

    /**
     * Ruft den Wert der faxPageCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFaxPageCount() {
        return faxPageCount;
    }

    /**
     * Legt den Wert der faxPageCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFaxPageCount(Integer value) {
        this.faxPageCount = value;
    }

    /**
     * Ruft den Wert der messageId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Legt den Wert der messageId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

}
