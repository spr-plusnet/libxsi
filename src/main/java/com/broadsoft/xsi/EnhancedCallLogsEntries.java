//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         Enhanced Call Log entries describing single/multiple placed 
 *         or received or missed calls. 
 *         
 *         This type supports paging.  
 *         
 *         Release Modified: 17sp4. 
 *         In this release the enhanced call log entry can be an an 
 *         extended entry with more information. The entry is a now a 
 *         choice bewteen regular enhanced call log entry or enhanced 
 *         call log extended entry.
 *    
 * 
 * <p>Java-Klasse für EnhancedCallLogsEntries complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EnhancedCallLogsEntries"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="startIndex" type="{http://schema.broadsoft.com/xsi}PositiveInt" minOccurs="0"/&gt;
 *         &lt;element name="numberOfRecords" type="{http://schema.broadsoft.com/xsi}NonNegativeInt" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="enhancedCallLogsEntry" type="{http://schema.broadsoft.com/xsi}EnhancedCallLogsEntry" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="enhancedCallLogsExtendedEntry" type="{http://schema.broadsoft.com/xsi}EnhancedCallLogsExtendedEntry" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnhancedCallLogsEntries", propOrder = {
    "startIndex",
    "numberOfRecords",
    "enhancedCallLogsEntry",
    "enhancedCallLogsExtendedEntry"
})
public class EnhancedCallLogsEntries {

    protected Integer startIndex;
    protected Integer numberOfRecords;
    protected List<EnhancedCallLogsEntry> enhancedCallLogsEntry;
    protected List<EnhancedCallLogsExtendedEntry> enhancedCallLogsExtendedEntry;

    /**
     * Ruft den Wert der startIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartIndex() {
        return startIndex;
    }

    /**
     * Legt den Wert der startIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartIndex(Integer value) {
        this.startIndex = value;
    }

    /**
     * Ruft den Wert der numberOfRecords-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfRecords() {
        return numberOfRecords;
    }

    /**
     * Legt den Wert der numberOfRecords-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfRecords(Integer value) {
        this.numberOfRecords = value;
    }

    /**
     * Gets the value of the enhancedCallLogsEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the enhancedCallLogsEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnhancedCallLogsEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnhancedCallLogsEntry }
     * 
     * 
     */
    public List<EnhancedCallLogsEntry> getEnhancedCallLogsEntry() {
        if (enhancedCallLogsEntry == null) {
            enhancedCallLogsEntry = new ArrayList<EnhancedCallLogsEntry>();
        }
        return this.enhancedCallLogsEntry;
    }

    /**
     * Gets the value of the enhancedCallLogsExtendedEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the enhancedCallLogsExtendedEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnhancedCallLogsExtendedEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnhancedCallLogsExtendedEntry }
     * 
     * 
     */
    public List<EnhancedCallLogsExtendedEntry> getEnhancedCallLogsExtendedEntry() {
        if (enhancedCallLogsExtendedEntry == null) {
            enhancedCallLogsExtendedEntry = new ArrayList<EnhancedCallLogsExtendedEntry>();
        }
        return this.enhancedCallLogsExtendedEntry;
    }

}
