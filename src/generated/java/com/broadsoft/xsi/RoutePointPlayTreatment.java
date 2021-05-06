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
 *         &lt;element name="audioUrlList" type="{http://schema.broadsoft.com/xsi}RoutePointPlayTreatmentURIList"/&gt;
 *         &lt;element name="videoUrlList" type="{http://schema.broadsoft.com/xsi}RoutePointPlayTreatmentURIList" minOccurs="0"/&gt;
 *         &lt;element name="numberOfPlay" type="{http://schema.broadsoft.com/xsi}RoutePointPlayTreatmentNumberOfPlay" minOccurs="0"/&gt;
 *         &lt;element name="digitMap" type="{http://schema.broadsoft.com/xsi}MGCPDigitMap" minOccurs="0"/&gt;
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
    "videoUrlList",
    "numberOfPlay",
    "digitMap"
})
@XmlRootElement(name = "RoutePointPlayTreatment")
public class RoutePointPlayTreatment {

    @XmlElement(required = true)
    protected RoutePointPlayTreatmentURIList audioUrlList;
    protected RoutePointPlayTreatmentURIList videoUrlList;
    protected Integer numberOfPlay;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String digitMap;

    /**
     * Ruft den Wert der audioUrlList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoutePointPlayTreatmentURIList }
     *     
     */
    public RoutePointPlayTreatmentURIList getAudioUrlList() {
        return audioUrlList;
    }

    /**
     * Legt den Wert der audioUrlList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutePointPlayTreatmentURIList }
     *     
     */
    public void setAudioUrlList(RoutePointPlayTreatmentURIList value) {
        this.audioUrlList = value;
    }

    /**
     * Ruft den Wert der videoUrlList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoutePointPlayTreatmentURIList }
     *     
     */
    public RoutePointPlayTreatmentURIList getVideoUrlList() {
        return videoUrlList;
    }

    /**
     * Legt den Wert der videoUrlList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutePointPlayTreatmentURIList }
     *     
     */
    public void setVideoUrlList(RoutePointPlayTreatmentURIList value) {
        this.videoUrlList = value;
    }

    /**
     * Ruft den Wert der numberOfPlay-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfPlay() {
        return numberOfPlay;
    }

    /**
     * Legt den Wert der numberOfPlay-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfPlay(Integer value) {
        this.numberOfPlay = value;
    }

    /**
     * Ruft den Wert der digitMap-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitMap() {
        return digitMap;
    }

    /**
     * Legt den Wert der digitMap-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitMap(String value) {
        this.digitMap = value;
    }

}
