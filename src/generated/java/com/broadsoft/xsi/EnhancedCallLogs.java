//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
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
 *         &lt;element name="startIndex" type="{http://schema.broadsoft.com/xsi}PositiveInt"/>
 *         &lt;element name="numberOfRecords" type="{http://schema.broadsoft.com/xsi}NonNegativeInt"/>
 *         &lt;element name="placed" type="{http://schema.broadsoft.com/xsi}EnhancedCallLogsEntries" minOccurs="0"/>
 *         &lt;element name="received" type="{http://schema.broadsoft.com/xsi}EnhancedCallLogsEntries" minOccurs="0"/>
 *         &lt;element name="missed" type="{http://schema.broadsoft.com/xsi}EnhancedCallLogsEntries" minOccurs="0"/>
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
    "startIndex",
    "numberOfRecords",
    "placed",
    "received",
    "missed"
})
@XmlRootElement(name = "EnhancedCallLogs")
public class EnhancedCallLogs {

    protected int startIndex;
    protected int numberOfRecords;
    protected EnhancedCallLogsEntries placed;
    protected EnhancedCallLogsEntries received;
    protected EnhancedCallLogsEntries missed;

    /**
     * Ruft den Wert der startIndex-Eigenschaft ab.
     * 
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * Legt den Wert der startIndex-Eigenschaft fest.
     * 
     */
    public void setStartIndex(int value) {
        this.startIndex = value;
    }

    /**
     * Ruft den Wert der numberOfRecords-Eigenschaft ab.
     * 
     */
    public int getNumberOfRecords() {
        return numberOfRecords;
    }

    /**
     * Legt den Wert der numberOfRecords-Eigenschaft fest.
     * 
     */
    public void setNumberOfRecords(int value) {
        this.numberOfRecords = value;
    }

    /**
     * Ruft den Wert der placed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnhancedCallLogsEntries }
     *     
     */
    public EnhancedCallLogsEntries getPlaced() {
        return placed;
    }

    /**
     * Legt den Wert der placed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnhancedCallLogsEntries }
     *     
     */
    public void setPlaced(EnhancedCallLogsEntries value) {
        this.placed = value;
    }

    /**
     * Ruft den Wert der received-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnhancedCallLogsEntries }
     *     
     */
    public EnhancedCallLogsEntries getReceived() {
        return received;
    }

    /**
     * Legt den Wert der received-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnhancedCallLogsEntries }
     *     
     */
    public void setReceived(EnhancedCallLogsEntries value) {
        this.received = value;
    }

    /**
     * Ruft den Wert der missed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnhancedCallLogsEntries }
     *     
     */
    public EnhancedCallLogsEntries getMissed() {
        return missed;
    }

    /**
     * Legt den Wert der missed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnhancedCallLogsEntries }
     *     
     */
    public void setMissed(EnhancedCallLogsEntries value) {
        this.missed = value;
    }

}
