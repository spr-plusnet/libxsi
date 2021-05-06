//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         The configuration of a alternate no answer greeting.
 *         It is used when getting a user's voice messaging greeting.
 *         
 *         Change History:
 *         R19.0 - Added.        
 *       
 * 
 * <p>Java-Klasse für VoiceMessagingAlternateNoAnswerGreeting complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VoiceMessagingAlternateNoAnswerGreeting"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://schema.broadsoft.com/xsi}NetAddress"/&gt;
 *         &lt;element name="audioFile" type="{http://schema.broadsoft.com/xsi}LabeledMediaFileResource" minOccurs="0"/&gt;
 *         &lt;element name="videoFile" type="{http://schema.broadsoft.com/xsi}LabeledMediaFileResource" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoiceMessagingAlternateNoAnswerGreeting", propOrder = {
    "name",
    "audioFile",
    "videoFile"
})
public class VoiceMessagingAlternateNoAnswerGreeting {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    protected LabeledMediaFileResource audioFile;
    protected LabeledMediaFileResource videoFile;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der audioFile-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LabeledMediaFileResource }
     *     
     */
    public LabeledMediaFileResource getAudioFile() {
        return audioFile;
    }

    /**
     * Legt den Wert der audioFile-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LabeledMediaFileResource }
     *     
     */
    public void setAudioFile(LabeledMediaFileResource value) {
        this.audioFile = value;
    }

    /**
     * Ruft den Wert der videoFile-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LabeledMediaFileResource }
     *     
     */
    public LabeledMediaFileResource getVideoFile() {
        return videoFile;
    }

    /**
     * Legt den Wert der videoFile-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LabeledMediaFileResource }
     *     
     */
    public void setVideoFile(LabeledMediaFileResource value) {
        this.videoFile = value;
    }

}
