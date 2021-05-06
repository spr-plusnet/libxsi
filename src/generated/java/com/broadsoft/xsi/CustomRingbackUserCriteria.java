//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="criteria" type="{http://schema.broadsoft.com/xsi}CriteriaWithFromDnAndCallToNumber" minOccurs="0"/&gt;
 *         &lt;element name="blackListed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="audioFileDetails" type="{http://schema.broadsoft.com/xsi}AudioFileDetails" minOccurs="0"/&gt;
 *         &lt;element name="videoFileDetails" type="{http://schema.broadsoft.com/xsi}VideoFileDetails" minOccurs="0"/&gt;
 *         &lt;element name="callWaitingAudioFileDetails" type="{http://schema.broadsoft.com/xsi}AudioFileDetails" minOccurs="0"/&gt;
 *         &lt;element name="callWaitingVideoFileDetails" type="{http://schema.broadsoft.com/xsi}VideoFileDetails" minOccurs="0"/&gt;
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
