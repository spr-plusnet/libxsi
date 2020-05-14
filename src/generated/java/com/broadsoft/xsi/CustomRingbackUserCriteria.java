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
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="criteria" type="{http://schema.broadsoft.com/xsi}CriteriaWithFromDnAndCallToNumber" minOccurs="0"/>
 *         &lt;element name="blackListed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="audioFileDetails" type="{http://schema.broadsoft.com/xsi}AudioFileDetails" minOccurs="0"/>
 *         &lt;element name="videoFileDetails" type="{http://schema.broadsoft.com/xsi}VideoFileDetails" minOccurs="0"/>
 *         &lt;element name="callWaitingAudioFileDetails" type="{http://schema.broadsoft.com/xsi}AudioFileDetails" minOccurs="0"/>
 *         &lt;element name="callWaitingVideoFileDetails" type="{http://schema.broadsoft.com/xsi}VideoFileDetails" minOccurs="0"/>
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
    "criteria",
    "blackListed",
    "audioFileDetails",
    "videoFileDetails",
    "callWaitingAudioFileDetails",
    "callWaitingVideoFileDetails"
})
@XmlRootElement(name = "CustomRingbackUserCriteria")
public class CustomRingbackUserCriteria {

    protected CriteriaWithFromDnAndCallToNumber criteria;
    protected Boolean blackListed;
    protected AudioFileDetails audioFileDetails;
    protected VideoFileDetails videoFileDetails;
    protected AudioFileDetails callWaitingAudioFileDetails;
    protected VideoFileDetails callWaitingVideoFileDetails;

    /**
     * Ruft den Wert der criteria-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CriteriaWithFromDnAndCallToNumber }
     *     
     */
    public CriteriaWithFromDnAndCallToNumber getCriteria() {
        return criteria;
    }

    /**
     * Legt den Wert der criteria-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CriteriaWithFromDnAndCallToNumber }
     *     
     */
    public void setCriteria(CriteriaWithFromDnAndCallToNumber value) {
        this.criteria = value;
    }

    /**
     * Ruft den Wert der blackListed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlackListed() {
        return blackListed;
    }

    /**
     * Legt den Wert der blackListed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlackListed(Boolean value) {
        this.blackListed = value;
    }

    /**
     * Ruft den Wert der audioFileDetails-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AudioFileDetails }
     *     
     */
    public AudioFileDetails getAudioFileDetails() {
        return audioFileDetails;
    }

    /**
     * Legt den Wert der audioFileDetails-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioFileDetails }
     *     
     */
    public void setAudioFileDetails(AudioFileDetails value) {
        this.audioFileDetails = value;
    }

    /**
     * Ruft den Wert der videoFileDetails-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VideoFileDetails }
     *     
     */
    public VideoFileDetails getVideoFileDetails() {
        return videoFileDetails;
    }

    /**
     * Legt den Wert der videoFileDetails-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoFileDetails }
     *     
     */
    public void setVideoFileDetails(VideoFileDetails value) {
        this.videoFileDetails = value;
    }

    /**
     * Ruft den Wert der callWaitingAudioFileDetails-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AudioFileDetails }
     *     
     */
    public AudioFileDetails getCallWaitingAudioFileDetails() {
        return callWaitingAudioFileDetails;
    }

    /**
     * Legt den Wert der callWaitingAudioFileDetails-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioFileDetails }
     *     
     */
    public void setCallWaitingAudioFileDetails(AudioFileDetails value) {
        this.callWaitingAudioFileDetails = value;
    }

    /**
     * Ruft den Wert der callWaitingVideoFileDetails-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VideoFileDetails }
     *     
     */
    public VideoFileDetails getCallWaitingVideoFileDetails() {
        return callWaitingVideoFileDetails;
    }

    /**
     * Legt den Wert der callWaitingVideoFileDetails-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoFileDetails }
     *     
     */
    public void setCallWaitingVideoFileDetails(VideoFileDetails value) {
        this.callWaitingVideoFileDetails = value;
    }

}
