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
 *          A measurement can be assigned a severity based
 *          on assigned threshold values. 
 *   
 *          Change History:
 *          19     - Added 
 *   
 *       
 * 
 * <p>Java-Klasse für TimestampWithSeverity complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimestampWithSeverity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://schema.broadsoft.com/xsi}Timestamp"/>
 *         &lt;element name="severity" type="{http://schema.broadsoft.com/xsi}SimpleThresholdBasedSeverity" minOccurs="0"/>
 *         &lt;element name="prevSeverity" type="{http://schema.broadsoft.com/xsi}SimpleThresholdBasedSeverity" minOccurs="0"/>
 *         &lt;element name="threshold" type="{http://schema.broadsoft.com/xsi}NonNegativeInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimestampWithSeverity", propOrder = {
    "value",
    "severity",
    "prevSeverity",
    "threshold"
})
public class TimestampWithSeverity {

    protected long value;
    protected Integer severity;
    protected Integer prevSeverity;
    protected Integer threshold;

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     */
    public long getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     */
    public void setValue(long value) {
        this.value = value;
    }

    /**
     * Ruft den Wert der severity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeverity() {
        return severity;
    }

    /**
     * Legt den Wert der severity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeverity(Integer value) {
        this.severity = value;
    }

    /**
     * Ruft den Wert der prevSeverity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrevSeverity() {
        return prevSeverity;
    }

    /**
     * Legt den Wert der prevSeverity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrevSeverity(Integer value) {
        this.prevSeverity = value;
    }

    /**
     * Ruft den Wert der threshold-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThreshold() {
        return threshold;
    }

    /**
     * Legt den Wert der threshold-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThreshold(Integer value) {
        this.threshold = value;
    }

}
