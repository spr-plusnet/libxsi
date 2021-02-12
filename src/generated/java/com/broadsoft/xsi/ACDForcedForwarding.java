//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
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
 *         &lt;element name="forwardToPhoneNumber" type="{http://schema.broadsoft.com/xsi}OutgoingDNorSIPURI" minOccurs="0"/>
 *         &lt;element name="allowEnableViaFAC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="playAnnouncementBeforeForwarding" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="audioMessageSelection" type="{http://schema.broadsoft.com/xsi}ExtendedFileResourceSelection" minOccurs="0"/>
 *         &lt;element name="audioUrlList" type="{http://schema.broadsoft.com/xsi}CallCenterAnnouncementURLList" minOccurs="0"/>
 *         &lt;element name="audioFileList" type="{http://schema.broadsoft.com/xsi}CallCenterAnnouncementFileList" minOccurs="0"/>
 *         &lt;element name="videoMessageSelection" type="{http://schema.broadsoft.com/xsi}ExtendedFileResourceSelection" minOccurs="0"/>
 *         &lt;element name="videoUrlList" type="{http://schema.broadsoft.com/xsi}CallCenterAnnouncementURLList" minOccurs="0"/>
 *         &lt;element name="videoFileList" type="{http://schema.broadsoft.com/xsi}CallCenterAnnouncementFileList" minOccurs="0"/>
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
    "forwardToPhoneNumber",
    "allowEnableViaFAC",
    "playAnnouncementBeforeForwarding",
    "audioMessageSelection",
    "audioUrlList",
    "audioFileList",
    "videoMessageSelection",
    "videoUrlList",
    "videoFileList"
})
@XmlRootElement(name = "ACDForcedForwarding")
public class ACDForcedForwarding
    extends ActivatableServiceInfo
{

    @XmlElementRef(name = "forwardToPhoneNumber", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> forwardToPhoneNumber;
    protected Boolean allowEnableViaFAC;
    protected Boolean playAnnouncementBeforeForwarding;
    @XmlSchemaType(name = "token")
    protected ExtendedFileResourceSelection audioMessageSelection;
    protected CallCenterAnnouncementURLList audioUrlList;
    protected CallCenterAnnouncementFileList audioFileList;
    @XmlSchemaType(name = "token")
    protected ExtendedFileResourceSelection videoMessageSelection;
    protected CallCenterAnnouncementURLList videoUrlList;
    protected CallCenterAnnouncementFileList videoFileList;

    /**
     * Ruft den Wert der forwardToPhoneNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getForwardToPhoneNumber() {
        return forwardToPhoneNumber;
    }

    /**
     * Legt den Wert der forwardToPhoneNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setForwardToPhoneNumber(JAXBElement<String> value) {
        this.forwardToPhoneNumber = value;
    }

    /**
     * Ruft den Wert der allowEnableViaFAC-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowEnableViaFAC() {
        return allowEnableViaFAC;
    }

    /**
     * Legt den Wert der allowEnableViaFAC-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowEnableViaFAC(Boolean value) {
        this.allowEnableViaFAC = value;
    }

    /**
     * Ruft den Wert der playAnnouncementBeforeForwarding-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlayAnnouncementBeforeForwarding() {
        return playAnnouncementBeforeForwarding;
    }

    /**
     * Legt den Wert der playAnnouncementBeforeForwarding-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlayAnnouncementBeforeForwarding(Boolean value) {
        this.playAnnouncementBeforeForwarding = value;
    }

    /**
     * Ruft den Wert der audioMessageSelection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedFileResourceSelection }
     *     
     */
    public ExtendedFileResourceSelection getAudioMessageSelection() {
        return audioMessageSelection;
    }

    /**
     * Legt den Wert der audioMessageSelection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedFileResourceSelection }
     *     
     */
    public void setAudioMessageSelection(ExtendedFileResourceSelection value) {
        this.audioMessageSelection = value;
    }

    /**
     * Ruft den Wert der audioUrlList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CallCenterAnnouncementURLList }
     *     
     */
    public CallCenterAnnouncementURLList getAudioUrlList() {
        return audioUrlList;
    }

    /**
     * Legt den Wert der audioUrlList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CallCenterAnnouncementURLList }
     *     
     */
    public void setAudioUrlList(CallCenterAnnouncementURLList value) {
        this.audioUrlList = value;
    }

    /**
     * Ruft den Wert der audioFileList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CallCenterAnnouncementFileList }
     *     
     */
    public CallCenterAnnouncementFileList getAudioFileList() {
        return audioFileList;
    }

    /**
     * Legt den Wert der audioFileList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CallCenterAnnouncementFileList }
     *     
     */
    public void setAudioFileList(CallCenterAnnouncementFileList value) {
        this.audioFileList = value;
    }

    /**
     * Ruft den Wert der videoMessageSelection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedFileResourceSelection }
     *     
     */
    public ExtendedFileResourceSelection getVideoMessageSelection() {
        return videoMessageSelection;
    }

    /**
     * Legt den Wert der videoMessageSelection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedFileResourceSelection }
     *     
     */
    public void setVideoMessageSelection(ExtendedFileResourceSelection value) {
        this.videoMessageSelection = value;
    }

    /**
     * Ruft den Wert der videoUrlList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CallCenterAnnouncementURLList }
     *     
     */
    public CallCenterAnnouncementURLList getVideoUrlList() {
        return videoUrlList;
    }

    /**
     * Legt den Wert der videoUrlList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CallCenterAnnouncementURLList }
     *     
     */
    public void setVideoUrlList(CallCenterAnnouncementURLList value) {
        this.videoUrlList = value;
    }

    /**
     * Ruft den Wert der videoFileList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CallCenterAnnouncementFileList }
     *     
     */
    public CallCenterAnnouncementFileList getVideoFileList() {
        return videoFileList;
    }

    /**
     * Legt den Wert der videoFileList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CallCenterAnnouncementFileList }
     *     
     */
    public void setVideoFileList(CallCenterAnnouncementFileList value) {
        this.videoFileList = value;
    }

}
