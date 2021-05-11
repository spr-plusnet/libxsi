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
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element name="usePersonalizedName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="voicePortalAutoLogin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="personalizedNameAudioFile" type="{http://schema.broadsoft.com/xsi}LabeledMediaFileResource" minOccurs="0"/&gt;
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
