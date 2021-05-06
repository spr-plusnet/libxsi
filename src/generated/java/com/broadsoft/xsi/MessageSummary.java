//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         Contains the message summary details for a service. 
 *       
 * 
 * <p>Java-Klasse für MessageSummary complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MessageSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="newMessages" type="{http://schema.broadsoft.com/xsi}PositiveInt" minOccurs="0"/&gt;
 *         &lt;element name="oldMessages" type="{http://schema.broadsoft.com/xsi}PositiveInt" minOccurs="0"/&gt;
 *         &lt;element name="newUrgentMessages" type="{http://schema.broadsoft.com/xsi}PositiveInt" minOccurs="0"/&gt;
 *         &lt;element name="oldUrgentMessages" type="{http://schema.broadsoft.com/xsi}PositiveInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageSummary", propOrder = {
    "newMessages",
    "oldMessages",
    "newUrgentMessages",
    "oldUrgentMessages"
})
public class MessageSummary {

    protected Integer newMessages;
    protected Integer oldMessages;
    protected Integer newUrgentMessages;
    protected Integer oldUrgentMessages;

    /**
     * Ruft den Wert der newMessages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewMessages() {
        return newMessages;
    }

    /**
     * Legt den Wert der newMessages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewMessages(Integer value) {
        this.newMessages = value;
    }

    /**
     * Ruft den Wert der oldMessages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOldMessages() {
        return oldMessages;
    }

    /**
     * Legt den Wert der oldMessages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOldMessages(Integer value) {
        this.oldMessages = value;
    }

    /**
     * Ruft den Wert der newUrgentMessages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewUrgentMessages() {
        return newUrgentMessages;
    }

    /**
     * Legt den Wert der newUrgentMessages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewUrgentMessages(Integer value) {
        this.newUrgentMessages = value;
    }

    /**
     * Ruft den Wert der oldUrgentMessages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOldUrgentMessages() {
        return oldUrgentMessages;
    }

    /**
     * Legt den Wert der oldUrgentMessages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOldUrgentMessages(Integer value) {
        this.oldUrgentMessages = value;
    }

}
