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
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo">
 *       &lt;sequence>
 *         &lt;element name="processing" type="{http://schema.broadsoft.com/xsi}VoiceMessagingMessageProcessing" minOccurs="0"/>
 *         &lt;element name="voiceMessageDeliveryEmailAddress" type="{http://schema.broadsoft.com/xsi}EmailAddress" minOccurs="0"/>
 *         &lt;element name="usePhoneMessageWaitingIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sendVoiceMessageNotifyEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="voiceMessageNotifyEmailAddress" type="{http://schema.broadsoft.com/xsi}EmailAddress" minOccurs="0"/>
 *         &lt;element name="sendCarbonCopyVoiceMessage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="voiceMessageCarbonCopyEmailAddress" type="{http://schema.broadsoft.com/xsi}EmailAddress" minOccurs="0"/>
 *         &lt;element name="transferOnZeroToPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="transferPhoneNumber" type="{http://schema.broadsoft.com/xsi}OutgoingDN" minOccurs="0"/>
 *         &lt;element name="alwaysRedirectToVoiceMail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="busyRedirectToVoiceMail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="noAnswerRedirectToVoiceMail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="outOfPrimaryZoneRedirectToVoiceMail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "processing",
    "voiceMessageDeliveryEmailAddress",
    "usePhoneMessageWaitingIndicator",
    "sendVoiceMessageNotifyEmail",
    "voiceMessageNotifyEmailAddress",
    "sendCarbonCopyVoiceMessage",
    "voiceMessageCarbonCopyEmailAddress",
    "transferOnZeroToPhoneNumber",
    "transferPhoneNumber",
    "alwaysRedirectToVoiceMail",
    "busyRedirectToVoiceMail",
    "noAnswerRedirectToVoiceMail",
    "outOfPrimaryZoneRedirectToVoiceMail"
})
@XmlRootElement(name = "VoiceMessaging")
public class VoiceMessaging
    extends ActivatableServiceInfo
{

    @XmlSchemaType(name = "token")
    protected VoiceMessagingMessageProcessing processing;
    @XmlElementRef(name = "voiceMessageDeliveryEmailAddress", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> voiceMessageDeliveryEmailAddress;
    protected Boolean usePhoneMessageWaitingIndicator;
    protected Boolean sendVoiceMessageNotifyEmail;
    @XmlElementRef(name = "voiceMessageNotifyEmailAddress", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> voiceMessageNotifyEmailAddress;
    protected Boolean sendCarbonCopyVoiceMessage;
    @XmlElementRef(name = "voiceMessageCarbonCopyEmailAddress", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> voiceMessageCarbonCopyEmailAddress;
    protected Boolean transferOnZeroToPhoneNumber;
    @XmlElementRef(name = "transferPhoneNumber", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transferPhoneNumber;
    protected Boolean alwaysRedirectToVoiceMail;
    protected Boolean busyRedirectToVoiceMail;
    protected Boolean noAnswerRedirectToVoiceMail;
    protected Boolean outOfPrimaryZoneRedirectToVoiceMail;

    /**
     * Ruft den Wert der processing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VoiceMessagingMessageProcessing }
     *     
     */
    public VoiceMessagingMessageProcessing getProcessing() {
        return processing;
    }

    /**
     * Legt den Wert der processing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VoiceMessagingMessageProcessing }
     *     
     */
    public void setProcessing(VoiceMessagingMessageProcessing value) {
        this.processing = value;
    }

    /**
     * Ruft den Wert der voiceMessageDeliveryEmailAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVoiceMessageDeliveryEmailAddress() {
        return voiceMessageDeliveryEmailAddress;
    }

    /**
     * Legt den Wert der voiceMessageDeliveryEmailAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVoiceMessageDeliveryEmailAddress(JAXBElement<String> value) {
        this.voiceMessageDeliveryEmailAddress = value;
    }

    /**
     * Ruft den Wert der usePhoneMessageWaitingIndicator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsePhoneMessageWaitingIndicator() {
        return usePhoneMessageWaitingIndicator;
    }

    /**
     * Legt den Wert der usePhoneMessageWaitingIndicator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsePhoneMessageWaitingIndicator(Boolean value) {
        this.usePhoneMessageWaitingIndicator = value;
    }

    /**
     * Ruft den Wert der sendVoiceMessageNotifyEmail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendVoiceMessageNotifyEmail() {
        return sendVoiceMessageNotifyEmail;
    }

    /**
     * Legt den Wert der sendVoiceMessageNotifyEmail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendVoiceMessageNotifyEmail(Boolean value) {
        this.sendVoiceMessageNotifyEmail = value;
    }

    /**
     * Ruft den Wert der voiceMessageNotifyEmailAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVoiceMessageNotifyEmailAddress() {
        return voiceMessageNotifyEmailAddress;
    }

    /**
     * Legt den Wert der voiceMessageNotifyEmailAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVoiceMessageNotifyEmailAddress(JAXBElement<String> value) {
        this.voiceMessageNotifyEmailAddress = value;
    }

    /**
     * Ruft den Wert der sendCarbonCopyVoiceMessage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendCarbonCopyVoiceMessage() {
        return sendCarbonCopyVoiceMessage;
    }

    /**
     * Legt den Wert der sendCarbonCopyVoiceMessage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendCarbonCopyVoiceMessage(Boolean value) {
        this.sendCarbonCopyVoiceMessage = value;
    }

    /**
     * Ruft den Wert der voiceMessageCarbonCopyEmailAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVoiceMessageCarbonCopyEmailAddress() {
        return voiceMessageCarbonCopyEmailAddress;
    }

    /**
     * Legt den Wert der voiceMessageCarbonCopyEmailAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVoiceMessageCarbonCopyEmailAddress(JAXBElement<String> value) {
        this.voiceMessageCarbonCopyEmailAddress = value;
    }

    /**
     * Ruft den Wert der transferOnZeroToPhoneNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransferOnZeroToPhoneNumber() {
        return transferOnZeroToPhoneNumber;
    }

    /**
     * Legt den Wert der transferOnZeroToPhoneNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransferOnZeroToPhoneNumber(Boolean value) {
        this.transferOnZeroToPhoneNumber = value;
    }

    /**
     * Ruft den Wert der transferPhoneNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransferPhoneNumber() {
        return transferPhoneNumber;
    }

    /**
     * Legt den Wert der transferPhoneNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransferPhoneNumber(JAXBElement<String> value) {
        this.transferPhoneNumber = value;
    }

    /**
     * Ruft den Wert der alwaysRedirectToVoiceMail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlwaysRedirectToVoiceMail() {
        return alwaysRedirectToVoiceMail;
    }

    /**
     * Legt den Wert der alwaysRedirectToVoiceMail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlwaysRedirectToVoiceMail(Boolean value) {
        this.alwaysRedirectToVoiceMail = value;
    }

    /**
     * Ruft den Wert der busyRedirectToVoiceMail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBusyRedirectToVoiceMail() {
        return busyRedirectToVoiceMail;
    }

    /**
     * Legt den Wert der busyRedirectToVoiceMail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBusyRedirectToVoiceMail(Boolean value) {
        this.busyRedirectToVoiceMail = value;
    }

    /**
     * Ruft den Wert der noAnswerRedirectToVoiceMail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoAnswerRedirectToVoiceMail() {
        return noAnswerRedirectToVoiceMail;
    }

    /**
     * Legt den Wert der noAnswerRedirectToVoiceMail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoAnswerRedirectToVoiceMail(Boolean value) {
        this.noAnswerRedirectToVoiceMail = value;
    }

    /**
     * Ruft den Wert der outOfPrimaryZoneRedirectToVoiceMail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutOfPrimaryZoneRedirectToVoiceMail() {
        return outOfPrimaryZoneRedirectToVoiceMail;
    }

    /**
     * Legt den Wert der outOfPrimaryZoneRedirectToVoiceMail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutOfPrimaryZoneRedirectToVoiceMail(Boolean value) {
        this.outOfPrimaryZoneRedirectToVoiceMail = value;
    }

}
