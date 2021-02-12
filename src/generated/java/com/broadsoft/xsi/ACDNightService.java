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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="action" type="{http://schema.broadsoft.com/xsi}CallCenterScheduledServiceAction" minOccurs="0"/>
 *         &lt;element name="businessHours" type="{http://schema.broadsoft.com/xsi}ScheduleName" minOccurs="0"/>
 *         &lt;element name="forceNightService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowManualOverrideViaFAC" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="transferPhoneNumber" type="{http://schema.broadsoft.com/xsi}OutgoingDNorSIPURI" minOccurs="0"/>
 *         &lt;element name="playAnnouncementBeforeAction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="audioMessageSelection" type="{http://schema.broadsoft.com/xsi}ExtendedFileResourceSelection" minOccurs="0"/>
 *         &lt;element name="audioUrlList" type="{http://schema.broadsoft.com/xsi}CallCenterAnnouncementURLList" minOccurs="0"/>
 *         &lt;element name="audioFileList" type="{http://schema.broadsoft.com/xsi}CallCenterAnnouncementFileList" minOccurs="0"/>
 *         &lt;element name="videoMessageSelection" type="{http://schema.broadsoft.com/xsi}ExtendedFileResourceSelection" minOccurs="0"/>
 *         &lt;element name="videoUrlList" type="{http://schema.broadsoft.com/xsi}CallCenterAnnouncementURLList" minOccurs="0"/>
 *         &lt;element name="videoFileList" type="{http://schema.broadsoft.com/xsi}CallCenterAnnouncementFileList" minOccurs="0"/>
 *         &lt;element name="manualAnnouncementMode" type="{http://schema.broadsoft.com/xsi}CallCenterManualNightServiceAnnouncementMode" minOccurs="0"/>
 *         &lt;element name="manualAudioMessageSelection" type="{http://schema.broadsoft.com/xsi}ExtendedFileResourceSelection" minOccurs="0"/>
 *         &lt;element name="manualAudioUrlList" type="{http://schema.broadsoft.com/xsi}CallCenterAnnouncementURLList" minOccurs="0"/>
 *         &lt;element name="manualAudioFileList" type="{http://schema.broadsoft.com/xsi}CallCenterAnnouncementFileList" minOccurs="0"/>
 *         &lt;element name="manualVideoMessageSelection" type="{http://schema.broadsoft.com/xsi}ExtendedFileResourceSelection" minOccurs="0"/>
 *         &lt;element name="manualVideoUrlList" type="{http://schema.broadsoft.com/xsi}CallCenterAnnouncementURLList" minOccurs="0"/>
 *         &lt;element name="manualVideoFileList" type="{http://schema.broadsoft.com/xsi}CallCenterAnnouncementFileList" minOccurs="0"/>
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
    "action",
    "businessHours",
    "forceNightService",
    "allowManualOverrideViaFAC",
    "transferPhoneNumber",
    "playAnnouncementBeforeAction",
    "audioMessageSelection",
    "audioUrlList",
    "audioFileList",
    "videoMessageSelection",
    "videoUrlList",
    "videoFileList",
    "manualAnnouncementMode",
    "manualAudioMessageSelection",
    "manualAudioUrlList",
    "manualAudioFileList",
    "manualVideoMessageSelection",
    "manualVideoUrlList",
    "manualVideoFileList"
})
@XmlRootElement(name = "ACDNightService")
public class ACDNightService {

    @XmlSchemaType(name = "token")
    protected CallCenterScheduledServiceAction action;
    @XmlElementRef(name = "businessHours", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessHours;
    protected Boolean forceNightService;
    protected Boolean allowManualOverrideViaFAC;
    @XmlElementRef(name = "transferPhoneNumber", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transferPhoneNumber;
    protected Boolean playAnnouncementBeforeAction;
    @XmlSchemaType(name = "token")
    protected ExtendedFileResourceSelection audioMessageSelection;
    protected CallCenterAnnouncementURLList audioUrlList;
    protected CallCenterAnnouncementFileList audioFileList;
    @XmlSchemaType(name = "token")
    protected ExtendedFileResourceSelection videoMessageSelection;
    protected CallCenterAnnouncementURLList videoUrlList;
    protected CallCenterAnnouncementFileList videoFileList;
    @XmlSchemaType(name = "token")
    protected CallCenterManualNightServiceAnnouncementMode manualAnnouncementMode;
    @XmlSchemaType(name = "token")
    protected ExtendedFileResourceSelection manualAudioMessageSelection;
    protected CallCenterAnnouncementURLList manualAudioUrlList;
    protected CallCenterAnnouncementFileList manualAudioFileList;
    @XmlSchemaType(name = "token")
    protected ExtendedFileResourceSelection manualVideoMessageSelection;
    protected CallCenterAnnouncementURLList manualVideoUrlList;
    protected CallCenterAnnouncementFileList manualVideoFileList;

    /**
     * Ruft den Wert der action-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CallCenterScheduledServiceAction }
     *     
     */
    public CallCenterScheduledServiceAction getAction() {
        return action;
    }

    /**
     * Legt den Wert der action-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CallCenterScheduledServiceAction }
     *     
     */
    public void setAction(CallCenterScheduledServiceAction value) {
        this.action = value;
    }

    /**
     * Ruft den Wert der businessHours-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessHours() {
        return businessHours;
    }

    /**
     * Legt den Wert der businessHours-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessHours(JAXBElement<String> value) {
        this.businessHours = value;
    }

    /**
     * Ruft den Wert der forceNightService-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceNightService() {
        return forceNightService;
    }

    /**
     * Legt den Wert der forceNightService-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceNightService(Boolean value) {
        this.forceNightService = value;
    }

    /**
     * Ruft den Wert der allowManualOverrideViaFAC-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowManualOverrideViaFAC() {
        return allowManualOverrideViaFAC;
    }

    /**
     * Legt den Wert der allowManualOverrideViaFAC-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowManualOverrideViaFAC(Boolean value) {
        this.allowManualOverrideViaFAC = value;
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
     * Ruft den Wert der playAnnouncementBeforeAction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlayAnnouncementBeforeAction() {
        return playAnnouncementBeforeAction;
    }

    /**
     * Legt den Wert der playAnnouncementBeforeAction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlayAnnouncementBeforeAction(Boolean value) {
        this.playAnnouncementBeforeAction = value;
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

    /**
     * Ruft den Wert der manualAnnouncementMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CallCenterManualNightServiceAnnouncementMode }
     *     
     */
    public CallCenterManualNightServiceAnnouncementMode getManualAnnouncementMode() {
        return manualAnnouncementMode;
    }

    /**
     * Legt den Wert der manualAnnouncementMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CallCenterManualNightServiceAnnouncementMode }
     *     
     */
    public void setManualAnnouncementMode(CallCenterManualNightServiceAnnouncementMode value) {
        this.manualAnnouncementMode = value;
    }

    /**
     * Ruft den Wert der manualAudioMessageSelection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedFileResourceSelection }
     *     
     */
    public ExtendedFileResourceSelection getManualAudioMessageSelection() {
        return manualAudioMessageSelection;
    }

    /**
     * Legt den Wert der manualAudioMessageSelection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedFileResourceSelection }
     *     
     */
    public void setManualAudioMessageSelection(ExtendedFileResourceSelection value) {
        this.manualAudioMessageSelection = value;
    }

    /**
     * Ruft den Wert der manualAudioUrlList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CallCenterAnnouncementURLList }
     *     
     */
    public CallCenterAnnouncementURLList getManualAudioUrlList() {
        return manualAudioUrlList;
    }

    /**
     * Legt den Wert der manualAudioUrlList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CallCenterAnnouncementURLList }
     *     
     */
    public void setManualAudioUrlList(CallCenterAnnouncementURLList value) {
        this.manualAudioUrlList = value;
    }

    /**
     * Ruft den Wert der manualAudioFileList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CallCenterAnnouncementFileList }
     *     
     */
    public CallCenterAnnouncementFileList getManualAudioFileList() {
        return manualAudioFileList;
    }

    /**
     * Legt den Wert der manualAudioFileList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CallCenterAnnouncementFileList }
     *     
     */
    public void setManualAudioFileList(CallCenterAnnouncementFileList value) {
        this.manualAudioFileList = value;
    }

    /**
     * Ruft den Wert der manualVideoMessageSelection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedFileResourceSelection }
     *     
     */
    public ExtendedFileResourceSelection getManualVideoMessageSelection() {
        return manualVideoMessageSelection;
    }

    /**
     * Legt den Wert der manualVideoMessageSelection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedFileResourceSelection }
     *     
     */
    public void setManualVideoMessageSelection(ExtendedFileResourceSelection value) {
        this.manualVideoMessageSelection = value;
    }

    /**
     * Ruft den Wert der manualVideoUrlList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CallCenterAnnouncementURLList }
     *     
     */
    public CallCenterAnnouncementURLList getManualVideoUrlList() {
        return manualVideoUrlList;
    }

    /**
     * Legt den Wert der manualVideoUrlList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CallCenterAnnouncementURLList }
     *     
     */
    public void setManualVideoUrlList(CallCenterAnnouncementURLList value) {
        this.manualVideoUrlList = value;
    }

    /**
     * Ruft den Wert der manualVideoFileList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CallCenterAnnouncementFileList }
     *     
     */
    public CallCenterAnnouncementFileList getManualVideoFileList() {
        return manualVideoFileList;
    }

    /**
     * Legt den Wert der manualVideoFileList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CallCenterAnnouncementFileList }
     *     
     */
    public void setManualVideoFileList(CallCenterAnnouncementFileList value) {
        this.manualVideoFileList = value;
    }

}
