//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 * &lt;complexType name="VoiceMessagingAlternateNoAnswerGreeting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://schema.broadsoft.com/xsi}NetAddress"/>
 *         &lt;element name="audioFile" type="{http://schema.broadsoft.com/xsi}LabeledMediaFileResource" minOccurs="0"/>
 *         &lt;element name="videoFile" type="{http://schema.broadsoft.com/xsi}LabeledMediaFileResource" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
