//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="MessageSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="newMessages" type="{http://schema.broadsoft.com/xsi}PositiveInt" minOccurs="0"/>
 *         &lt;element name="oldMessages" type="{http://schema.broadsoft.com/xsi}PositiveInt" minOccurs="0"/>
 *         &lt;element name="newUrgentMessages" type="{http://schema.broadsoft.com/xsi}PositiveInt" minOccurs="0"/>
 *         &lt;element name="oldUrgentMessages" type="{http://schema.broadsoft.com/xsi}PositiveInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
