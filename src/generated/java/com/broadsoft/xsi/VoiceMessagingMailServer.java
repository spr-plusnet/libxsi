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
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="mailServerSelection" type="{http://schema.broadsoft.com/xsi}VoiceMessagingUserMailServerSelection" minOccurs="0"/&gt;
 *         &lt;element name="groupMailServerEmailAddress" type="{http://schema.broadsoft.com/xsi}EmailAddress" minOccurs="0"/&gt;
 *         &lt;element name="groupMailServerUserId" type="{http://schema.broadsoft.com/xsi}VoiceMessagingMailServerUserId" minOccurs="0"/&gt;
 *         &lt;element name="groupMailServerPassword" type="{http://schema.broadsoft.com/xsi}Password" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="useGroupDefaultMailServerFullMailboxLimit" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *           &lt;element name="groupMailServerFullMailboxLimit" type="{http://schema.broadsoft.com/xsi}VoiceMessagingMailboxLengthMinutes"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="personalMailServerNetAddress" type="{http://schema.broadsoft.com/xsi}NetAddress" minOccurs="0"/&gt;
 *         &lt;element name="personalMailServerProtocol" type="{http://schema.broadsoft.com/xsi}VoiceMessagingMailServerProtocol" minOccurs="0"/&gt;
 *         &lt;element name="personalMailServerRealDeleteForImap" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="personalMailServerEmailAddress" type="{http://schema.broadsoft.com/xsi}EmailAddress" minOccurs="0"/&gt;
 *         &lt;element name="personalMailServerUserId" type="{http://schema.broadsoft.com/xsi}VoiceMessagingMailServerUserId" minOccurs="0"/&gt;
 *         &lt;element name="personalMailServerPassword" type="{http://schema.broadsoft.com/xsi}Password" minOccurs="0"/&gt;
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
    "mailServerSelection",
    "groupMailServerEmailAddress",
    "groupMailServerUserId",
    "groupMailServerPassword",
    "useGroupDefaultMailServerFullMailboxLimit",
    "groupMailServerFullMailboxLimit",
    "personalMailServerNetAddress",
    "personalMailServerProtocol",
    "personalMailServerRealDeleteForImap",
    "personalMailServerEmailAddress",
    "personalMailServerUserId",
    "personalMailServerPassword"
})
@XmlRootElement(name = "VoiceMessagingMailServer")
public class VoiceMessagingMailServer {

    @XmlSchemaType(name = "token")
    protected VoiceMessagingUserMailServerSelection mailServerSelection;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String groupMailServerEmailAddress;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String groupMailServerUserId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String groupMailServerPassword;
    protected Boolean useGroupDefaultMailServerFullMailboxLimit;
    protected Integer groupMailServerFullMailboxLimit;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String personalMailServerNetAddress;
    @XmlSchemaType(name = "token")
    protected VoiceMessagingMailServerProtocol personalMailServerProtocol;
    protected Boolean personalMailServerRealDeleteForImap;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String personalMailServerEmailAddress;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String personalMailServerUserId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String personalMailServerPassword;

    /**
     * Ruft den Wert der mailServerSelection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VoiceMessagingUserMailServerSelection }
     *     
     */
    public VoiceMessagingUserMailServerSelection getMailServerSelection() {
        return mailServerSelection;
    }

    /**
     * Legt den Wert der mailServerSelection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VoiceMessagingUserMailServerSelection }
     *     
     */
    public void setMailServerSelection(VoiceMessagingUserMailServerSelection value) {
        this.mailServerSelection = value;
    }

    /**
     * Ruft den Wert der groupMailServerEmailAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupMailServerEmailAddress() {
        return groupMailServerEmailAddress;
    }

    /**
     * Legt den Wert der groupMailServerEmailAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupMailServerEmailAddress(String value) {
        this.groupMailServerEmailAddress = value;
    }

    /**
     * Ruft den Wert der groupMailServerUserId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupMailServerUserId() {
        return groupMailServerUserId;
    }

    /**
     * Legt den Wert der groupMailServerUserId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupMailServerUserId(String value) {
        this.groupMailServerUserId = value;
    }

    /**
     * Ruft den Wert der groupMailServerPassword-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupMailServerPassword() {
        return groupMailServerPassword;
    }

    /**
     * Legt den Wert der groupMailServerPassword-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupMailServerPassword(String value) {
        this.groupMailServerPassword = value;
    }

    /**
     * Ruft den Wert der useGroupDefaultMailServerFullMailboxLimit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseGroupDefaultMailServerFullMailboxLimit() {
        return useGroupDefaultMailServerFullMailboxLimit;
    }

    /**
     * Legt den Wert der useGroupDefaultMailServerFullMailboxLimit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseGroupDefaultMailServerFullMailboxLimit(Boolean value) {
        this.useGroupDefaultMailServerFullMailboxLimit = value;
    }

    /**
     * Ruft den Wert der groupMailServerFullMailboxLimit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGroupMailServerFullMailboxLimit() {
        return groupMailServerFullMailboxLimit;
    }

    /**
     * Legt den Wert der groupMailServerFullMailboxLimit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGroupMailServerFullMailboxLimit(Integer value) {
        this.groupMailServerFullMailboxLimit = value;
    }

    /**
     * Ruft den Wert der personalMailServerNetAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalMailServerNetAddress() {
        return personalMailServerNetAddress;
    }

    /**
     * Legt den Wert der personalMailServerNetAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalMailServerNetAddress(String value) {
        this.personalMailServerNetAddress = value;
    }

    /**
     * Ruft den Wert der personalMailServerProtocol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VoiceMessagingMailServerProtocol }
     *     
     */
    public VoiceMessagingMailServerProtocol getPersonalMailServerProtocol() {
        return personalMailServerProtocol;
    }

    /**
     * Legt den Wert der personalMailServerProtocol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VoiceMessagingMailServerProtocol }
     *     
     */
    public void setPersonalMailServerProtocol(VoiceMessagingMailServerProtocol value) {
        this.personalMailServerProtocol = value;
    }

    /**
     * Ruft den Wert der personalMailServerRealDeleteForImap-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPersonalMailServerRealDeleteForImap() {
        return personalMailServerRealDeleteForImap;
    }

    /**
     * Legt den Wert der personalMailServerRealDeleteForImap-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPersonalMailServerRealDeleteForImap(Boolean value) {
        this.personalMailServerRealDeleteForImap = value;
    }

    /**
     * Ruft den Wert der personalMailServerEmailAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalMailServerEmailAddress() {
        return personalMailServerEmailAddress;
    }

    /**
     * Legt den Wert der personalMailServerEmailAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalMailServerEmailAddress(String value) {
        this.personalMailServerEmailAddress = value;
    }

    /**
     * Ruft den Wert der personalMailServerUserId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalMailServerUserId() {
        return personalMailServerUserId;
    }

    /**
     * Legt den Wert der personalMailServerUserId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalMailServerUserId(String value) {
        this.personalMailServerUserId = value;
    }

    /**
     * Ruft den Wert der personalMailServerPassword-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalMailServerPassword() {
        return personalMailServerPassword;
    }

    /**
     * Legt den Wert der personalMailServerPassword-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalMailServerPassword(String value) {
        this.personalMailServerPassword = value;
    }

}
