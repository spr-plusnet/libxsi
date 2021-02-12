//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="announcementSelection" type="{http://schema.broadsoft.com/xsi}AnnouncementSelection" minOccurs="0"/>
 *         &lt;element name="audioFileDescription" type="{http://schema.broadsoft.com/xsi}FileDescription" minOccurs="0"/>
 *         &lt;element name="audioMediaType" type="{http://schema.broadsoft.com/xsi}MediaFileType" minOccurs="0"/>
 *         &lt;element name="videoFileDescription" type="{http://schema.broadsoft.com/xsi}FileDescription" minOccurs="0"/>
 *         &lt;element name="videoMediaType" type="{http://schema.broadsoft.com/xsi}MediaFileType" minOccurs="0"/>
 *         &lt;element name="playNewPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="newPhoneNumber" type="{http://schema.broadsoft.com/xsi}DN" minOccurs="0"/>
 *         &lt;element name="transferOnZeroToPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="transferPhoneNumber" type="{http://schema.broadsoft.com/xsi}OutgoingDN" minOccurs="0"/>
 *         &lt;element name="rerouteOutboundCalls" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="outboundReroutePhoneNumber" type="{http://schema.broadsoft.com/xsi}Address" minOccurs="0"/>
 *         &lt;element name="exemptInboundMobilityCalls" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="exemptOutboundMobilityCalls" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="disableParallelRingingToNetworkLocations" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="outboundCallMode" type="{http://schema.broadsoft.com/xsi}InterceptOutboundCall"/>
 *         &lt;element name="inboundCallMode" type="{http://schema.broadsoft.com/xsi}InterceptInboundCall"/>
 *         &lt;element name="alternateBlockingAnnouncement" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="routeToVoiceMail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "announcementSelection",
    "audioFileDescription",
    "audioMediaType",
    "videoFileDescription",
    "videoMediaType",
    "playNewPhoneNumber",
    "newPhoneNumber",
    "transferOnZeroToPhoneNumber",
    "transferPhoneNumber",
    "rerouteOutboundCalls",
    "outboundReroutePhoneNumber",
    "exemptInboundMobilityCalls",
    "exemptOutboundMobilityCalls",
    "disableParallelRingingToNetworkLocations",
    "outboundCallMode",
    "inboundCallMode",
    "alternateBlockingAnnouncement",
    "routeToVoiceMail"
})
@XmlRootElement(name = "InterceptUser")
public class InterceptUser
    extends ActivatableServiceInfo
{

    @XmlElement(defaultValue = "Default")
    @XmlSchemaType(name = "token")
    protected AnnouncementSelection announcementSelection;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String audioFileDescription;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String audioMediaType;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String videoFileDescription;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String videoMediaType;
    protected boolean playNewPhoneNumber;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String newPhoneNumber;
    protected boolean transferOnZeroToPhoneNumber;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String transferPhoneNumber;
    protected boolean rerouteOutboundCalls;
    protected Address outboundReroutePhoneNumber;
    protected boolean exemptInboundMobilityCalls;
    protected boolean exemptOutboundMobilityCalls;
    protected boolean disableParallelRingingToNetworkLocations;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected InterceptOutboundCall outboundCallMode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected InterceptInboundCall inboundCallMode;
    protected boolean alternateBlockingAnnouncement;
    protected boolean routeToVoiceMail;

    /**
     * Ruft den Wert der announcementSelection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AnnouncementSelection }
     *     
     */
    public AnnouncementSelection getAnnouncementSelection() {
        return announcementSelection;
    }

    /**
     * Legt den Wert der announcementSelection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnouncementSelection }
     *     
     */
    public void setAnnouncementSelection(AnnouncementSelection value) {
        this.announcementSelection = value;
    }

    /**
     * Ruft den Wert der audioFileDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioFileDescription() {
        return audioFileDescription;
    }

    /**
     * Legt den Wert der audioFileDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioFileDescription(String value) {
        this.audioFileDescription = value;
    }

    /**
     * Ruft den Wert der audioMediaType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioMediaType() {
        return audioMediaType;
    }

    /**
     * Legt den Wert der audioMediaType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioMediaType(String value) {
        this.audioMediaType = value;
    }

    /**
     * Ruft den Wert der videoFileDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoFileDescription() {
        return videoFileDescription;
    }

    /**
     * Legt den Wert der videoFileDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoFileDescription(String value) {
        this.videoFileDescription = value;
    }

    /**
     * Ruft den Wert der videoMediaType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoMediaType() {
        return videoMediaType;
    }

    /**
     * Legt den Wert der videoMediaType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoMediaType(String value) {
        this.videoMediaType = value;
    }

    /**
     * Ruft den Wert der playNewPhoneNumber-Eigenschaft ab.
     * 
     */
    public boolean isPlayNewPhoneNumber() {
        return playNewPhoneNumber;
    }

    /**
     * Legt den Wert der playNewPhoneNumber-Eigenschaft fest.
     * 
     */
    public void setPlayNewPhoneNumber(boolean value) {
        this.playNewPhoneNumber = value;
    }

    /**
     * Ruft den Wert der newPhoneNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPhoneNumber() {
        return newPhoneNumber;
    }

    /**
     * Legt den Wert der newPhoneNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPhoneNumber(String value) {
        this.newPhoneNumber = value;
    }

    /**
     * Ruft den Wert der transferOnZeroToPhoneNumber-Eigenschaft ab.
     * 
     */
    public boolean isTransferOnZeroToPhoneNumber() {
        return transferOnZeroToPhoneNumber;
    }

    /**
     * Legt den Wert der transferOnZeroToPhoneNumber-Eigenschaft fest.
     * 
     */
    public void setTransferOnZeroToPhoneNumber(boolean value) {
        this.transferOnZeroToPhoneNumber = value;
    }

    /**
     * Ruft den Wert der transferPhoneNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferPhoneNumber() {
        return transferPhoneNumber;
    }

    /**
     * Legt den Wert der transferPhoneNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferPhoneNumber(String value) {
        this.transferPhoneNumber = value;
    }

    /**
     * Ruft den Wert der rerouteOutboundCalls-Eigenschaft ab.
     * 
     */
    public boolean isRerouteOutboundCalls() {
        return rerouteOutboundCalls;
    }

    /**
     * Legt den Wert der rerouteOutboundCalls-Eigenschaft fest.
     * 
     */
    public void setRerouteOutboundCalls(boolean value) {
        this.rerouteOutboundCalls = value;
    }

    /**
     * Ruft den Wert der outboundReroutePhoneNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getOutboundReroutePhoneNumber() {
        return outboundReroutePhoneNumber;
    }

    /**
     * Legt den Wert der outboundReroutePhoneNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setOutboundReroutePhoneNumber(Address value) {
        this.outboundReroutePhoneNumber = value;
    }

    /**
     * Ruft den Wert der exemptInboundMobilityCalls-Eigenschaft ab.
     * 
     */
    public boolean isExemptInboundMobilityCalls() {
        return exemptInboundMobilityCalls;
    }

    /**
     * Legt den Wert der exemptInboundMobilityCalls-Eigenschaft fest.
     * 
     */
    public void setExemptInboundMobilityCalls(boolean value) {
        this.exemptInboundMobilityCalls = value;
    }

    /**
     * Ruft den Wert der exemptOutboundMobilityCalls-Eigenschaft ab.
     * 
     */
    public boolean isExemptOutboundMobilityCalls() {
        return exemptOutboundMobilityCalls;
    }

    /**
     * Legt den Wert der exemptOutboundMobilityCalls-Eigenschaft fest.
     * 
     */
    public void setExemptOutboundMobilityCalls(boolean value) {
        this.exemptOutboundMobilityCalls = value;
    }

    /**
     * Ruft den Wert der disableParallelRingingToNetworkLocations-Eigenschaft ab.
     * 
     */
    public boolean isDisableParallelRingingToNetworkLocations() {
        return disableParallelRingingToNetworkLocations;
    }

    /**
     * Legt den Wert der disableParallelRingingToNetworkLocations-Eigenschaft fest.
     * 
     */
    public void setDisableParallelRingingToNetworkLocations(boolean value) {
        this.disableParallelRingingToNetworkLocations = value;
    }

    /**
     * Ruft den Wert der outboundCallMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InterceptOutboundCall }
     *     
     */
    public InterceptOutboundCall getOutboundCallMode() {
        return outboundCallMode;
    }

    /**
     * Legt den Wert der outboundCallMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InterceptOutboundCall }
     *     
     */
    public void setOutboundCallMode(InterceptOutboundCall value) {
        this.outboundCallMode = value;
    }

    /**
     * Ruft den Wert der inboundCallMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InterceptInboundCall }
     *     
     */
    public InterceptInboundCall getInboundCallMode() {
        return inboundCallMode;
    }

    /**
     * Legt den Wert der inboundCallMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InterceptInboundCall }
     *     
     */
    public void setInboundCallMode(InterceptInboundCall value) {
        this.inboundCallMode = value;
    }

    /**
     * Ruft den Wert der alternateBlockingAnnouncement-Eigenschaft ab.
     * 
     */
    public boolean isAlternateBlockingAnnouncement() {
        return alternateBlockingAnnouncement;
    }

    /**
     * Legt den Wert der alternateBlockingAnnouncement-Eigenschaft fest.
     * 
     */
    public void setAlternateBlockingAnnouncement(boolean value) {
        this.alternateBlockingAnnouncement = value;
    }

    /**
     * Ruft den Wert der routeToVoiceMail-Eigenschaft ab.
     * 
     */
    public boolean isRouteToVoiceMail() {
        return routeToVoiceMail;
    }

    /**
     * Legt den Wert der routeToVoiceMail-Eigenschaft fest.
     * 
     */
    public void setRouteToVoiceMail(boolean value) {
        this.routeToVoiceMail = value;
    }

}
