//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element name="placed" type="{http://schema.broadsoft.com/xsi}CallLogsEntries" minOccurs="0"/&gt;
 *         &lt;element name="received" type="{http://schema.broadsoft.com/xsi}CallLogsEntries" minOccurs="0"/&gt;
 *         &lt;element name="missed" type="{http://schema.broadsoft.com/xsi}CallLogsEntries" minOccurs="0"/&gt;
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
