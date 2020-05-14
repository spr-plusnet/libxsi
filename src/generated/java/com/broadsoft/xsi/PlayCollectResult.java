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
 *         A PlayCollectResult provides information regarding the completion of
 *         a play-collect operation.
 *                     
 * 
 * <p>Java-Klasse für PlayCollectResult complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PlayCollectResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="playCollectId" type="{http://schema.broadsoft.com/xsi}PlayCollectId"/>
 *         &lt;element name="completionReason" type="{http://schema.broadsoft.com/xsi}PlayCompletionReason"/>
 *         &lt;element name="digits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlayCollectResult", propOrder = {
    "playCollectId",
    "completionReason",
    "digits",
    "errorReason"
})
public class PlayCollectResult {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String playCollectId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected PlayCompletionReason completionReason;
    protected String digits;
    protected String errorReason;

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
     * Ruft den Wert der completionReason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PlayCompletionReason }
     *     
     */
    public PlayCompletionReason getCompletionReason() {
        return completionReason;
    }

    /**
     * Legt den Wert der completionReason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PlayCompletionReason }
     *     
     */
    public void setCompletionReason(PlayCompletionReason value) {
        this.completionReason = value;
    }

    /**
     * Ruft den Wert der digits-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigits() {
        return digits;
    }

    /**
     * Legt den Wert der digits-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigits(String value) {
        this.digits = value;
    }

    /**
     * Ruft den Wert der errorReason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorReason() {
        return errorReason;
    }

    /**
     * Legt den Wert der errorReason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorReason(String value) {
        this.errorReason = value;
    }

}
