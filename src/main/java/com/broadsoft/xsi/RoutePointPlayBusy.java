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
 *         &lt;element name="duration" type="{http://schema.broadsoft.com/xsi}PositiveInt" minOccurs="0"/&gt;
 *         &lt;element name="busyPattern" type="{http://schema.broadsoft.com/xsi}BusyPattern"/&gt;
 *         &lt;element name="playCollectId" type="{http://schema.broadsoft.com/xsi}PlayCollectId" minOccurs="0"/&gt;
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
    "duration",
    "busyPattern",
    "playCollectId"
})
@XmlRootElement(name = "RoutePointPlayBusy")
public class RoutePointPlayBusy {

    protected Integer duration;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected BusyPattern busyPattern;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String playCollectId;

    /**
     * Ruft den Wert der duration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Legt den Wert der duration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDuration(Integer value) {
        this.duration = value;
    }

    /**
     * Ruft den Wert der busyPattern-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BusyPattern }
     *     
     */
    public BusyPattern getBusyPattern() {
        return busyPattern;
    }

    /**
     * Legt den Wert der busyPattern-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BusyPattern }
     *     
     */
    public void setBusyPattern(BusyPattern value) {
        this.busyPattern = value;
    }

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

}
