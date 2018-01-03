//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usePersonalizedName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="voicePortalAutoLogin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="personalizedNameAudioFile" type="{http://schema.broadsoft.com/xsi}LabeledMediaFileResource" minOccurs="0"/>
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
    "usePersonalizedName",
    "voicePortalAutoLogin",
    "personalizedNameAudioFile"
})
@XmlRootElement(name = "VoicePortal")
public class VoicePortal {

    protected Boolean usePersonalizedName;
    protected Boolean voicePortalAutoLogin;
    protected LabeledMediaFileResource personalizedNameAudioFile;

    /**
     * Ruft den Wert der usePersonalizedName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsePersonalizedName() {
        return usePersonalizedName;
    }

    /**
     * Legt den Wert der usePersonalizedName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsePersonalizedName(Boolean value) {
        this.usePersonalizedName = value;
    }

    /**
     * Ruft den Wert der voicePortalAutoLogin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVoicePortalAutoLogin() {
        return voicePortalAutoLogin;
    }

    /**
     * Legt den Wert der voicePortalAutoLogin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVoicePortalAutoLogin(Boolean value) {
        this.voicePortalAutoLogin = value;
    }

    /**
     * Ruft den Wert der personalizedNameAudioFile-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LabeledMediaFileResource }
     *     
     */
    public LabeledMediaFileResource getPersonalizedNameAudioFile() {
        return personalizedNameAudioFile;
    }

    /**
     * Legt den Wert der personalizedNameAudioFile-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LabeledMediaFileResource }
     *     
     */
    public void setPersonalizedNameAudioFile(LabeledMediaFileResource value) {
        this.personalizedNameAudioFile = value;
    }

}
