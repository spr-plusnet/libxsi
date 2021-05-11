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
 *         A PlayCollectResult provides information regarding the completion of
 *         a play-collect operation.
 *                     
 * 
 * <p>Java-Klasse für PlayCollectResult complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PlayCollectResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="playCollectId" type="{http://schema.broadsoft.com/xsi}PlayCollectId"/&gt;
 *         &lt;element name="completionReason" type="{http://schema.broadsoft.com/xsi}PlayCompletionReason"/&gt;
 *         &lt;element name="digits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="errorReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
