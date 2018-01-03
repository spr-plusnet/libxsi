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
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="busyAnnouncementSelection" type="{http://schema.broadsoft.com/xsi}AnnouncementSelection" minOccurs="0"/>
 *         &lt;element name="busyPersonalAudioFile" type="{http://schema.broadsoft.com/xsi}LabeledMediaFileResource" minOccurs="0"/>
 *         &lt;element name="busyPersonalVideoFile" type="{http://schema.broadsoft.com/xsi}LabeledMediaFileResource" minOccurs="0"/>
 *         &lt;element name="noAnswerAnnouncementSelection" type="{http://schema.broadsoft.com/xsi}VoiceMessagingNoAnswerGreetingSelection" minOccurs="0"/>
 *         &lt;element name="noAnswerPersonalAudioFile" type="{http://schema.broadsoft.com/xsi}LabeledMediaFileResource" minOccurs="0"/>
 *         &lt;element name="noAnswerPersonalVideoFile" type="{http://schema.broadsoft.com/xsi}LabeledMediaFileResource" minOccurs="0"/>
 *         &lt;element name="disableExtendedAwayMessageDeposit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableExtendedAwayGreeting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="noAnswerExtendedAwayAudioFile" type="{http://schema.broadsoft.com/xsi}LabeledMediaFileResource" minOccurs="0"/>
 *         &lt;element name="noAnswerExtendedAwayVideoFile" type="{http://schema.broadsoft.com/xsi}LabeledMediaFileResource" minOccurs="0"/>
 *         &lt;element name="noAnswerAlternateGreeting01" type="{http://schema.broadsoft.com/xsi}VoiceMessagingAlternateNoAnswerGreeting" minOccurs="0"/>
 *         &lt;element name="noAnswerAlternateGreeting02" type="{http://schema.broadsoft.com/xsi}VoiceMessagingAlternateNoAnswerGreeting" minOccurs="0"/>
 *         &lt;element name="noAnswerAlternateGreeting03" type="{http://schema.broadsoft.com/xsi}VoiceMessagingAlternateNoAnswerGreeting" minOccurs="0"/>
 *         &lt;element name="noAnswerNumberOfRings" type="{http://schema.broadsoft.com/xsi}NumberOfRingsZeroToTwentyExcludeOne" minOccurs="0"/>
 *         &lt;element name="disableMessageDeposit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="disableMessageDepositAction" type="{http://schema.broadsoft.com/xsi}VoiceMessagingDisableMessageDepositSelection" minOccurs="0"/>
 *         &lt;element name="greetingOnlyForwardDestination" type="{http://schema.broadsoft.com/xsi}OutgoingDNorSIPURI" minOccurs="0"/>
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
    "busyAnnouncementSelection",
    "busyPersonalAudioFile",
    "busyPersonalVideoFile",
    "noAnswerAnnouncementSelection",
    "noAnswerPersonalAudioFile",
    "noAnswerPersonalVideoFile",
    "disableExtendedAwayMessageDeposit",
    "enableExtendedAwayGreeting",
    "noAnswerExtendedAwayAudioFile",
    "noAnswerExtendedAwayVideoFile",
    "noAnswerAlternateGreeting01",
    "noAnswerAlternateGreeting02",
    "noAnswerAlternateGreeting03",
    "noAnswerNumberOfRings",
    "disableMessageDeposit",
    "disableMessageDepositAction",
    "greetingOnlyForwardDestination"
})
@XmlRootElement(name = "VoiceMessagingGreetings")
public class VoiceMessagingGreetings {

    @XmlSchemaType(name = "token")
    protected AnnouncementSelection busyAnnouncementSelection;
    protected LabeledMediaFileResource busyPersonalAudioFile;
    protected LabeledMediaFileResource busyPersonalVideoFile;
    @XmlSchemaType(name = "token")
    protected VoiceMessagingNoAnswerGreetingSelection noAnswerAnnouncementSelection;
    protected LabeledMediaFileResource noAnswerPersonalAudioFile;
    protected LabeledMediaFileResource noAnswerPersonalVideoFile;
    protected Boolean disableExtendedAwayMessageDeposit;
    protected Boolean enableExtendedAwayGreeting;
    protected LabeledMediaFileResource noAnswerExtendedAwayAudioFile;
    protected LabeledMediaFileResource noAnswerExtendedAwayVideoFile;
    protected VoiceMessagingAlternateNoAnswerGreeting noAnswerAlternateGreeting01;
    protected VoiceMessagingAlternateNoAnswerGreeting noAnswerAlternateGreeting02;
    protected VoiceMessagingAlternateNoAnswerGreeting noAnswerAlternateGreeting03;
    protected Integer noAnswerNumberOfRings;
    protected Boolean disableMessageDeposit;
    @XmlSchemaType(name = "token")
    protected VoiceMessagingDisableMessageDepositSelection disableMessageDepositAction;
    @XmlElementRef(name = "greetingOnlyForwardDestination", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> greetingOnlyForwardDestination;

    /**
     * Ruft den Wert der busyAnnouncementSelection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AnnouncementSelection }
     *     
     */
    public AnnouncementSelection getBusyAnnouncementSelection() {
        return busyAnnouncementSelection;
    }

    /**
     * Legt den Wert der busyAnnouncementSelection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnouncementSelection }
     *     
     */
    public void setBusyAnnouncementSelection(AnnouncementSelection value) {
        this.busyAnnouncementSelection = value;
    }

    /**
     * Ruft den Wert der busyPersonalAudioFile-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LabeledMediaFileResource }
     *     
     */
    public LabeledMediaFileResource getBusyPersonalAudioFile() {
        return busyPersonalAudioFile;
    }

    /**
     * Legt den Wert der busyPersonalAudioFile-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LabeledMediaFileResource }
     *     
     */
    public void setBusyPersonalAudioFile(LabeledMediaFileResource value) {
        this.busyPersonalAudioFile = value;
    }

    /**
     * Ruft den Wert der busyPersonalVideoFile-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LabeledMediaFileResource }
     *     
     */
    public LabeledMediaFileResource getBusyPersonalVideoFile() {
        return busyPersonalVideoFile;
    }

    /**
     * Legt den Wert der busyPersonalVideoFile-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LabeledMediaFileResource }
     *     
     */
    public void setBusyPersonalVideoFile(LabeledMediaFileResource value) {
        this.busyPersonalVideoFile = value;
    }

    /**
     * Ruft den Wert der noAnswerAnnouncementSelection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VoiceMessagingNoAnswerGreetingSelection }
     *     
     */
    public VoiceMessagingNoAnswerGreetingSelection getNoAnswerAnnouncementSelection() {
        return noAnswerAnnouncementSelection;
    }

    /**
     * Legt den Wert der noAnswerAnnouncementSelection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VoiceMessagingNoAnswerGreetingSelection }
     *     
     */
    public void setNoAnswerAnnouncementSelection(VoiceMessagingNoAnswerGreetingSelection value) {
        this.noAnswerAnnouncementSelection = value;
    }

    /**
     * Ruft den Wert der noAnswerPersonalAudioFile-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LabeledMediaFileResource }
     *     
     */
    public LabeledMediaFileResource getNoAnswerPersonalAudioFile() {
        return noAnswerPersonalAudioFile;
    }

    /**
     * Legt den Wert der noAnswerPersonalAudioFile-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LabeledMediaFileResource }
     *     
     */
    public void setNoAnswerPersonalAudioFile(LabeledMediaFileResource value) {
        this.noAnswerPersonalAudioFile = value;
    }

    /**
     * Ruft den Wert der noAnswerPersonalVideoFile-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LabeledMediaFileResource }
     *     
     */
    public LabeledMediaFileResource getNoAnswerPersonalVideoFile() {
        return noAnswerPersonalVideoFile;
    }

    /**
     * Legt den Wert der noAnswerPersonalVideoFile-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LabeledMediaFileResource }
     *     
     */
    public void setNoAnswerPersonalVideoFile(LabeledMediaFileResource value) {
        this.noAnswerPersonalVideoFile = value;
    }

    /**
     * Ruft den Wert der disableExtendedAwayMessageDeposit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableExtendedAwayMessageDeposit() {
        return disableExtendedAwayMessageDeposit;
    }

    /**
     * Legt den Wert der disableExtendedAwayMessageDeposit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableExtendedAwayMessageDeposit(Boolean value) {
        this.disableExtendedAwayMessageDeposit = value;
    }

    /**
     * Ruft den Wert der enableExtendedAwayGreeting-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableExtendedAwayGreeting() {
        return enableExtendedAwayGreeting;
    }

    /**
     * Legt den Wert der enableExtendedAwayGreeting-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableExtendedAwayGreeting(Boolean value) {
        this.enableExtendedAwayGreeting = value;
    }

    /**
     * Ruft den Wert der noAnswerExtendedAwayAudioFile-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LabeledMediaFileResource }
     *     
     */
    public LabeledMediaFileResource getNoAnswerExtendedAwayAudioFile() {
        return noAnswerExtendedAwayAudioFile;
    }

    /**
     * Legt den Wert der noAnswerExtendedAwayAudioFile-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LabeledMediaFileResource }
     *     
     */
    public void setNoAnswerExtendedAwayAudioFile(LabeledMediaFileResource value) {
        this.noAnswerExtendedAwayAudioFile = value;
    }

    /**
     * Ruft den Wert der noAnswerExtendedAwayVideoFile-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LabeledMediaFileResource }
     *     
     */
    public LabeledMediaFileResource getNoAnswerExtendedAwayVideoFile() {
        return noAnswerExtendedAwayVideoFile;
    }

    /**
     * Legt den Wert der noAnswerExtendedAwayVideoFile-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LabeledMediaFileResource }
     *     
     */
    public void setNoAnswerExtendedAwayVideoFile(LabeledMediaFileResource value) {
        this.noAnswerExtendedAwayVideoFile = value;
    }

    /**
     * Ruft den Wert der noAnswerAlternateGreeting01-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VoiceMessagingAlternateNoAnswerGreeting }
     *     
     */
    public VoiceMessagingAlternateNoAnswerGreeting getNoAnswerAlternateGreeting01() {
        return noAnswerAlternateGreeting01;
    }

    /**
     * Legt den Wert der noAnswerAlternateGreeting01-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VoiceMessagingAlternateNoAnswerGreeting }
     *     
     */
    public void setNoAnswerAlternateGreeting01(VoiceMessagingAlternateNoAnswerGreeting value) {
        this.noAnswerAlternateGreeting01 = value;
    }

    /**
     * Ruft den Wert der noAnswerAlternateGreeting02-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VoiceMessagingAlternateNoAnswerGreeting }
     *     
     */
    public VoiceMessagingAlternateNoAnswerGreeting getNoAnswerAlternateGreeting02() {
        return noAnswerAlternateGreeting02;
    }

    /**
     * Legt den Wert der noAnswerAlternateGreeting02-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VoiceMessagingAlternateNoAnswerGreeting }
     *     
     */
    public void setNoAnswerAlternateGreeting02(VoiceMessagingAlternateNoAnswerGreeting value) {
        this.noAnswerAlternateGreeting02 = value;
    }

    /**
     * Ruft den Wert der noAnswerAlternateGreeting03-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VoiceMessagingAlternateNoAnswerGreeting }
     *     
     */
    public VoiceMessagingAlternateNoAnswerGreeting getNoAnswerAlternateGreeting03() {
        return noAnswerAlternateGreeting03;
    }

    /**
     * Legt den Wert der noAnswerAlternateGreeting03-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VoiceMessagingAlternateNoAnswerGreeting }
     *     
     */
    public void setNoAnswerAlternateGreeting03(VoiceMessagingAlternateNoAnswerGreeting value) {
        this.noAnswerAlternateGreeting03 = value;
    }

    /**
     * Ruft den Wert der noAnswerNumberOfRings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNoAnswerNumberOfRings() {
        return noAnswerNumberOfRings;
    }

    /**
     * Legt den Wert der noAnswerNumberOfRings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNoAnswerNumberOfRings(Integer value) {
        this.noAnswerNumberOfRings = value;
    }

    /**
     * Ruft den Wert der disableMessageDeposit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableMessageDeposit() {
        return disableMessageDeposit;
    }

    /**
     * Legt den Wert der disableMessageDeposit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableMessageDeposit(Boolean value) {
        this.disableMessageDeposit = value;
    }

    /**
     * Ruft den Wert der disableMessageDepositAction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VoiceMessagingDisableMessageDepositSelection }
     *     
     */
    public VoiceMessagingDisableMessageDepositSelection getDisableMessageDepositAction() {
        return disableMessageDepositAction;
    }

    /**
     * Legt den Wert der disableMessageDepositAction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VoiceMessagingDisableMessageDepositSelection }
     *     
     */
    public void setDisableMessageDepositAction(VoiceMessagingDisableMessageDepositSelection value) {
        this.disableMessageDepositAction = value;
    }

    /**
     * Ruft den Wert der greetingOnlyForwardDestination-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGreetingOnlyForwardDestination() {
        return greetingOnlyForwardDestination;
    }

    /**
     * Legt den Wert der greetingOnlyForwardDestination-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGreetingOnlyForwardDestination(JAXBElement<String> value) {
        this.greetingOnlyForwardDestination = value;
    }

}
