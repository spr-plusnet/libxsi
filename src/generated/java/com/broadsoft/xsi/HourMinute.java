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
 *         Represents a specific time with hour and minute
 *         granularity
 *       
 * 
 * <p>Java-Klasse für HourMinute complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HourMinute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hour" type="{http://schema.broadsoft.com/xsi}Hour"/>
 *         &lt;element name="minute" type="{http://schema.broadsoft.com/xsi}Minute"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HourMinute", propOrder = {
    "hour",
    "minute"
})
public class HourMinute {

    protected int hour;
    protected int minute;

    /**
     * Ruft den Wert der hour-Eigenschaft ab.
     * 
     */
    public int getHour() {
        return hour;
    }

    /**
     * Legt den Wert der hour-Eigenschaft fest.
     * 
     */
    public void setHour(int value) {
        this.hour = value;
    }

    /**
     * Ruft den Wert der minute-Eigenschaft ab.
     * 
     */
    public int getMinute() {
        return minute;
    }

    /**
     * Legt den Wert der minute-Eigenschaft fest.
     * 
     */
    public void setMinute(int value) {
        this.minute = value;
    }

}
