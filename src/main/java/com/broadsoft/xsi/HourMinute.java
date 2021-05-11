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
 *         Represents a specific time with hour and minute
 *         granularity
 *       
 * 
 * <p>Java-Klasse für HourMinute complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HourMinute"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hour" type="{http://schema.broadsoft.com/xsi}Hour"/&gt;
 *         &lt;element name="minute" type="{http://schema.broadsoft.com/xsi}Minute"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
