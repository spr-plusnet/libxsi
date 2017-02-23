//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="recordingMode" type="{http://schema.broadsoft.com/xsi}CallRecordingMode" minOccurs="0"/>
 *         &lt;element name="pauseResumeNotifyMethod" type="{http://schema.broadsoft.com/xsi}PauseResumeNotifyMethod" minOccurs="0"/>
 *         &lt;element name="recordVoiceMessaging" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="playCallRecordingStartStopAnnouncement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="playCallRecordingWarningTone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="playCallRecordingWarningToneSeconds" type="{http://schema.broadsoft.com/xsi}RecordCallRepeatWarningToneTimerSeconds" minOccurs="0"/>
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
    "recordingMode",
    "pauseResumeNotifyMethod",
    "recordVoiceMessaging",
    "playCallRecordingStartStopAnnouncement",
    "playCallRecordingWarningTone",
    "playCallRecordingWarningToneSeconds"
})
@XmlRootElement(name = "CallRecording")
public class CallRecording {

    @XmlSchemaType(name = "token")
    protected CallRecordingMode recordingMode;
    @XmlSchemaType(name = "token")
    protected PauseResumeNotifyMethod pauseResumeNotifyMethod;
    protected Boolean recordVoiceMessaging;
    protected Boolean playCallRecordingStartStopAnnouncement;
    protected Boolean playCallRecordingWarningTone;
    protected Integer playCallRecordingWarningToneSeconds;

    /**
     * Ruft den Wert der recordingMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CallRecordingMode }
     *     
     */
    public CallRecordingMode getRecordingMode() {
        return recordingMode;
    }

    /**
     * Legt den Wert der recordingMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CallRecordingMode }
     *     
     */
    public void setRecordingMode(CallRecordingMode value) {
        this.recordingMode = value;
    }

    /**
     * Ruft den Wert der pauseResumeNotifyMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PauseResumeNotifyMethod }
     *     
     */
    public PauseResumeNotifyMethod getPauseResumeNotifyMethod() {
        return pauseResumeNotifyMethod;
    }

    /**
     * Legt den Wert der pauseResumeNotifyMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PauseResumeNotifyMethod }
     *     
     */
    public void setPauseResumeNotifyMethod(PauseResumeNotifyMethod value) {
        this.pauseResumeNotifyMethod = value;
    }

    /**
     * Ruft den Wert der recordVoiceMessaging-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecordVoiceMessaging() {
        return recordVoiceMessaging;
    }

    /**
     * Legt den Wert der recordVoiceMessaging-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecordVoiceMessaging(Boolean value) {
        this.recordVoiceMessaging = value;
    }

    /**
     * Ruft den Wert der playCallRecordingStartStopAnnouncement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlayCallRecordingStartStopAnnouncement() {
        return playCallRecordingStartStopAnnouncement;
    }

    /**
     * Legt den Wert der playCallRecordingStartStopAnnouncement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlayCallRecordingStartStopAnnouncement(Boolean value) {
        this.playCallRecordingStartStopAnnouncement = value;
    }

    /**
     * Ruft den Wert der playCallRecordingWarningTone-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlayCallRecordingWarningTone() {
        return playCallRecordingWarningTone;
    }

    /**
     * Legt den Wert der playCallRecordingWarningTone-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlayCallRecordingWarningTone(Boolean value) {
        this.playCallRecordingWarningTone = value;
    }

    /**
     * Ruft den Wert der playCallRecordingWarningToneSeconds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlayCallRecordingWarningToneSeconds() {
        return playCallRecordingWarningToneSeconds;
    }

    /**
     * Legt den Wert der playCallRecordingWarningToneSeconds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlayCallRecordingWarningToneSeconds(Integer value) {
        this.playCallRecordingWarningToneSeconds = value;
    }

}
