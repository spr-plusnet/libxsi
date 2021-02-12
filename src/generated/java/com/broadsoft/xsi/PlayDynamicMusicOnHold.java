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
 *         &lt;element name="audioUrlList" type="{http://schema.broadsoft.com/xsi}MusicOnHoldURIList"/>
 *         &lt;element name="videoUrlList" type="{http://schema.broadsoft.com/xsi}MusicOnHoldURIList" minOccurs="0"/>
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
    "audioUrlList",
    "videoUrlList"
})
@XmlRootElement(name = "PlayDynamicMusicOnHold")
public class PlayDynamicMusicOnHold {

    @XmlElement(required = true)
    protected MusicOnHoldURIList audioUrlList;
    protected MusicOnHoldURIList videoUrlList;

    /**
     * Ruft den Wert der audioUrlList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MusicOnHoldURIList }
     *     
     */
    public MusicOnHoldURIList getAudioUrlList() {
        return audioUrlList;
    }

    /**
     * Legt den Wert der audioUrlList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MusicOnHoldURIList }
     *     
     */
    public void setAudioUrlList(MusicOnHoldURIList value) {
        this.audioUrlList = value;
    }

    /**
     * Ruft den Wert der videoUrlList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MusicOnHoldURIList }
     *     
     */
    public MusicOnHoldURIList getVideoUrlList() {
        return videoUrlList;
    }

    /**
     * Legt den Wert der videoUrlList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MusicOnHoldURIList }
     *     
     */
    public void setVideoUrlList(MusicOnHoldURIList value) {
        this.videoUrlList = value;
    }

}
