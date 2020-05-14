//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="placed" type="{http://schema.broadsoft.com/xsi}CallLogsEntries" minOccurs="0"/>
 *         &lt;element name="received" type="{http://schema.broadsoft.com/xsi}CallLogsEntries" minOccurs="0"/>
 *         &lt;element name="missed" type="{http://schema.broadsoft.com/xsi}CallLogsEntries" minOccurs="0"/>
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
    "placed",
    "received",
    "missed"
})
@XmlRootElement(name = "CallLogs")
public class CallLogs {

    protected CallLogsEntries placed;
    protected CallLogsEntries received;
    protected CallLogsEntries missed;

    /**
     * Ruft den Wert der placed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CallLogsEntries }
     *     
     */
    public CallLogsEntries getPlaced() {
        return placed;
    }

    /**
     * Legt den Wert der placed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CallLogsEntries }
     *     
     */
    public void setPlaced(CallLogsEntries value) {
        this.placed = value;
    }

    /**
     * Ruft den Wert der received-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CallLogsEntries }
     *     
     */
    public CallLogsEntries getReceived() {
        return received;
    }

    /**
     * Legt den Wert der received-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CallLogsEntries }
     *     
     */
    public void setReceived(CallLogsEntries value) {
        this.received = value;
    }

    /**
     * Ruft den Wert der missed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CallLogsEntries }
     *     
     */
    public CallLogsEntries getMissed() {
        return missed;
    }

    /**
     * Legt den Wert der missed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CallLogsEntries }
     *     
     */
    public void setMissed(CallLogsEntries value) {
        this.missed = value;
    }

}
