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
 *         A PlayCollectInfo provides information on the play collection
 *         operation in progress. 
 *                     
 * 
 * <p>Java-Klasse für PlayCollectInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PlayCollectInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="playCollectId" type="{http://schema.broadsoft.com/xsi}PlayCollectId"/&gt;
 *         &lt;element name="playCollectType" type="{http://schema.broadsoft.com/xsi}PlayCollectType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
