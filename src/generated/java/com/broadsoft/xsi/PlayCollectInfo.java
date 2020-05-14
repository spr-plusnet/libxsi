//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
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
 *         A PlayCollectInfo provides information on the play collection
 *         operation in progress. 
 *                     
 * 
 * <p>Java-Klasse für PlayCollectInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PlayCollectInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="playCollectId" type="{http://schema.broadsoft.com/xsi}PlayCollectId"/>
 *         &lt;element name="playCollectType" type="{http://schema.broadsoft.com/xsi}PlayCollectType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlayCollectInfo", propOrder = {
    "playCollectId",
    "playCollectType"
})
public class PlayCollectInfo {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String playCollectId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected PlayCollectType playCollectType;

    /**
     * Ruft den Wert der playCollectId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlayCollectId() {
        return playCollectId;
    }

    /**
     * Legt den Wert der playCollectId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlayCollectId(String value) {
        this.playCollectId = value;
    }

    /**
     * Ruft den Wert der playCollectType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PlayCollectType }
     *     
     */
    public PlayCollectType getPlayCollectType() {
        return playCollectType;
    }

    /**
     * Legt den Wert der playCollectType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PlayCollectType }
     *     
     */
    public void setPlayCollectType(PlayCollectType value) {
        this.playCollectType = value;
    }

}
