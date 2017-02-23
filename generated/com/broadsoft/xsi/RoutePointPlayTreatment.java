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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="audioUrlList" type="{http://schema.broadsoft.com/xsi}RoutePointPlayTreatmentURIList"/>
 *         &lt;element name="videoUrlList" type="{http://schema.broadsoft.com/xsi}RoutePointPlayTreatmentURIList" minOccurs="0"/>
 *         &lt;element name="numberOfPlay" type="{http://schema.broadsoft.com/xsi}RoutePointPlayTreatmentNumberOfPlay" minOccurs="0"/>
 *         &lt;element name="digitMap" type="{http://schema.broadsoft.com/xsi}MGCPDigitMap" minOccurs="0"/>
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
