//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         Contains the details to create/modify the MeetMe conference.
 *         Release 19: Optional parameters "requireSecurityPin", "securityPin" added. 
 *                     accountCode element made nillable.
 *         Release Added: R17.sp3
 *       
 * 
 * <p>Java-Klasse für MeetMeConferencingConference complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MeetMeConferencingConference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conferenceTitle" type="{http://schema.broadsoft.com/xsi}MeetMeConferencingConferenceTitle" minOccurs="0"/>
 *         &lt;element name="estimatedParticipants" type="{http://schema.broadsoft.com/xsi}MeetMeConferencingNumberOfParticipants" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="restrictParticipants" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="maxParticipants" type="{http://schema.broadsoft.com/xsi}MeetMeConferencingNumberOfParticipants"/>
 *         &lt;/choice>
 *         &lt;element name="accountCode" type="{http://schema.broadsoft.com/xsi}MeetMeConferencingConferenceAccountCode" minOccurs="0"/>
 *         &lt;element name="muteAllAttendeesOnEntry" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="endConferenceOnModeratorExit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="moderatorRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="requireSecurityPin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowUniqueIdentifier " type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="attendeeNotification" type="{http://schema.broadsoft.com/xsi}MeetMeConferencingConferenceAttendeeNotification" minOccurs="0"/>
 *         &lt;element name="conferenceSchedule" type="{http://schema.broadsoft.com/xsi}MeetMeConferencingConferenceSchedule" minOccurs="0"/>
 *         &lt;element name="moderatorPin" type="{http://schema.broadsoft.com/xsi}MeetMeConferencingConferencePassCode" minOccurs="0"/>
 *         &lt;element name="securityPin" type="{http://schema.broadsoft.com/xsi}MeetMeConferencingConferenceSecurityPin" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetMeConferencingConference", propOrder = {
    "conferenceTitle",
    "estimatedParticipants",
    "restrictParticipants",
    "maxParticipants",
    "accountCode",
    "muteAllAttendeesOnEntry",
    "endConferenceOnModeratorExit",
    "moderatorRequired",
    "requireSecurityPin",
    "allowUniqueIdentifier0020",
    "attendeeNotification",
    "conferenceSchedule",
    "moderatorPin",
    "securityPin"
})
public class MeetMeConferencingConference {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String conferenceTitle;
    protected Integer estimatedParticipants;
    protected Boolean restrictParticipants;
    protected Integer maxParticipants;
    @XmlElementRef(name = "accountCode", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountCode;
    protected Boolean muteAllAttendeesOnEntry;
    protected Boolean endConferenceOnModeratorExit;
    protected Boolean moderatorRequired;
    protected Boolean requireSecurityPin;
    @XmlElement(name = "allowUniqueIdentifier ")
    protected Boolean allowUniqueIdentifier0020;
    @XmlSchemaType(name = "token")
    protected MeetMeConferencingConferenceAttendeeNotification attendeeNotification;
    protected MeetMeConferencingConferenceSchedule conferenceSchedule;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String moderatorPin;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String securityPin;

    /**
     * Ruft den Wert der conferenceTitle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConferenceTitle() {
        return conferenceTitle;
    }

    /**
     * Legt den Wert der conferenceTitle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConferenceTitle(String value) {
        this.conferenceTitle = value;
    }

    /**
     * Ruft den Wert der estimatedParticipants-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEstimatedParticipants() {
        return estimatedParticipants;
    }

    /**
     * Legt den Wert der estimatedParticipants-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEstimatedParticipants(Integer value) {
        this.estimatedParticipants = value;
    }

    /**
     * Ruft den Wert der restrictParticipants-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictParticipants() {
        return restrictParticipants;
    }

    /**
     * Legt den Wert der restrictParticipants-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictParticipants(Boolean value) {
        this.restrictParticipants = value;
    }

    /**
     * Ruft den Wert der maxParticipants-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxParticipants() {
        return maxParticipants;
    }

    /**
     * Legt den Wert der maxParticipants-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxParticipants(Integer value) {
        this.maxParticipants = value;
    }

    /**
     * Ruft den Wert der accountCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountCode() {
        return accountCode;
    }

    /**
     * Legt den Wert der accountCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountCode(JAXBElement<String> value) {
        this.accountCode = value;
    }

    /**
     * Ruft den Wert der muteAllAttendeesOnEntry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMuteAllAttendeesOnEntry() {
        return muteAllAttendeesOnEntry;
    }

    /**
     * Legt den Wert der muteAllAttendeesOnEntry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMuteAllAttendeesOnEntry(Boolean value) {
        this.muteAllAttendeesOnEntry = value;
    }

    /**
     * Ruft den Wert der endConferenceOnModeratorExit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndConferenceOnModeratorExit() {
        return endConferenceOnModeratorExit;
    }

    /**
     * Legt den Wert der endConferenceOnModeratorExit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndConferenceOnModeratorExit(Boolean value) {
        this.endConferenceOnModeratorExit = value;
    }

    /**
     * Ruft den Wert der moderatorRequired-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModeratorRequired() {
        return moderatorRequired;
    }

    /**
     * Legt den Wert der moderatorRequired-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModeratorRequired(Boolean value) {
        this.moderatorRequired = value;
    }

    /**
     * Ruft den Wert der requireSecurityPin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequireSecurityPin() {
        return requireSecurityPin;
    }

    /**
     * Legt den Wert der requireSecurityPin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequireSecurityPin(Boolean value) {
        this.requireSecurityPin = value;
    }

    /**
     * Ruft den Wert der allowUniqueIdentifier0020-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowUniqueIdentifier_0020() {
        return allowUniqueIdentifier0020;
    }

    /**
     * Legt den Wert der allowUniqueIdentifier0020-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowUniqueIdentifier_0020(Boolean value) {
        this.allowUniqueIdentifier0020 = value;
    }

    /**
     * Ruft den Wert der attendeeNotification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeetMeConferencingConferenceAttendeeNotification }
     *     
     */
    public MeetMeConferencingConferenceAttendeeNotification getAttendeeNotification() {
        return attendeeNotification;
    }

    /**
     * Legt den Wert der attendeeNotification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetMeConferencingConferenceAttendeeNotification }
     *     
     */
    public void setAttendeeNotification(MeetMeConferencingConferenceAttendeeNotification value) {
        this.attendeeNotification = value;
    }

    /**
     * Ruft den Wert der conferenceSchedule-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeetMeConferencingConferenceSchedule }
     *     
     */
    public MeetMeConferencingConferenceSchedule getConferenceSchedule() {
        return conferenceSchedule;
    }

    /**
     * Legt den Wert der conferenceSchedule-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetMeConferencingConferenceSchedule }
     *     
     */
    public void setConferenceSchedule(MeetMeConferencingConferenceSchedule value) {
        this.conferenceSchedule = value;
    }

    /**
     * Ruft den Wert der moderatorPin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeratorPin() {
        return moderatorPin;
    }

    /**
     * Legt den Wert der moderatorPin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeratorPin(String value) {
        this.moderatorPin = value;
    }

    /**
     * Ruft den Wert der securityPin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityPin() {
        return securityPin;
    }

    /**
     * Legt den Wert der securityPin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityPin(String value) {
        this.securityPin = value;
    }

}
