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
 *         Defines the details of an instance of an active MeetMe 
 *         Conference. This will nto have the information of a participants
 *         in the conference.   
 *         Release Added:  R17.sp3
 *         Release Modified R19.0
 *         Change History:
 *         20.0 - Added clientSessionInfo element
 *       
 * 
 * <p>Java-Klasse für MeetMeConferenceInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MeetMeConferenceInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lectureMode" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/&gt;
 *         &lt;element name="automaticLectureMode" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/&gt;
 *         &lt;element name="lock" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/&gt;
 *         &lt;element name="recordingState" type="{http://schema.broadsoft.com/xsi}MeetMeConferenceRecordingState"/&gt;
 *         &lt;element name="securityClassification" type="{http://schema.broadsoft.com/xsi}NonEmptyToken" minOccurs="0"/&gt;
 *         &lt;element name="clientSessionInfo" type="{http://schema.broadsoft.com/xsi}ClientSessionInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetMeConferenceInfo", propOrder = {
    "lectureMode",
    "automaticLectureMode",
    "lock",
    "recordingState",
    "securityClassification",
    "clientSessionInfo"
})
public class MeetMeConferenceInfo {

    protected EmptyContent lectureMode;
    protected EmptyContent automaticLectureMode;
    protected EmptyContent lock;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected MeetMeConferenceRecordingState recordingState;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String securityClassification;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String clientSessionInfo;

    /**
     * Ruft den Wert der lectureMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getLectureMode() {
        return lectureMode;
    }

    /**
     * Legt den Wert der lectureMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setLectureMode(EmptyContent value) {
        this.lectureMode = value;
    }

    /**
     * Ruft den Wert der automaticLectureMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getAutomaticLectureMode() {
        return automaticLectureMode;
    }

    /**
     * Legt den Wert der automaticLectureMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setAutomaticLectureMode(EmptyContent value) {
        this.automaticLectureMode = value;
    }

    /**
     * Ruft den Wert der lock-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getLock() {
        return lock;
    }

    /**
     * Legt den Wert der lock-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setLock(EmptyContent value) {
        this.lock = value;
    }

    /**
     * Ruft den Wert der recordingState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeetMeConferenceRecordingState }
     *     
     */
    public MeetMeConferenceRecordingState getRecordingState() {
        return recordingState;
    }

    /**
     * Legt den Wert der recordingState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetMeConferenceRecordingState }
     *     
     */
    public void setRecordingState(MeetMeConferenceRecordingState value) {
        this.recordingState = value;
    }

    /**
     * Ruft den Wert der securityClassification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityClassification() {
        return securityClassification;
    }

    /**
     * Legt den Wert der securityClassification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityClassification(String value) {
        this.securityClassification = value;
    }

    /**
     * Ruft den Wert der clientSessionInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientSessionInfo() {
        return clientSessionInfo;
    }

    /**
     * Legt den Wert der clientSessionInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientSessionInfo(String value) {
        this.clientSessionInfo = value;
    }

}
