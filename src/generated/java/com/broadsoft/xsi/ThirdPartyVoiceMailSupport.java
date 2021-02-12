//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="busyRedirectToVoiceMail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="noAnswerRedirectToVoiceMail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="alwaysRedirectToVoiceMail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="outOfPrimaryZoneRedirectToVoiceMail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="noAnswerNumberOfRings" type="{http://schema.broadsoft.com/xsi}NumberOfRingsZeroToTwentyExcludeOne" minOccurs="0"/>
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
    "busyRedirectToVoiceMail",
    "noAnswerRedirectToVoiceMail",
    "alwaysRedirectToVoiceMail",
    "outOfPrimaryZoneRedirectToVoiceMail",
    "noAnswerNumberOfRings"
})
@XmlRootElement(name = "ThirdPartyVoiceMailSupport")
public class ThirdPartyVoiceMailSupport
    extends ActivatableServiceInfo
{

    protected Boolean busyRedirectToVoiceMail;
    protected Boolean noAnswerRedirectToVoiceMail;
    protected Boolean alwaysRedirectToVoiceMail;
    protected Boolean outOfPrimaryZoneRedirectToVoiceMail;
    protected Integer noAnswerNumberOfRings;

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

}
