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
 *         &lt;element name="audioUrlList" type="{http://schema.broadsoft.com/xsi}MusicOnHoldURIList"/&gt;
 *         &lt;element name="videoUrlList" type="{http://schema.broadsoft.com/xsi}MusicOnHoldURIList" minOccurs="0"/&gt;
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
