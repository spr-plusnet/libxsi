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
 *         &lt;element name="recordingMode" type="{http://schema.broadsoft.com/xsi}CallRecordingMode" minOccurs="0"/&gt;
 *         &lt;element name="pauseResumeNotifyMethod" type="{http://schema.broadsoft.com/xsi}PauseResumeNotifyMethod" minOccurs="0"/&gt;
 *         &lt;element name="recordVoiceMessaging" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="playCallRecordingStartStopAnnouncement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="playCallRecordingWarningTone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="playCallRecordingWarningToneSeconds" type="{http://schema.broadsoft.com/xsi}RecordCallRepeatWarningToneTimerSeconds" minOccurs="0"/&gt;
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
