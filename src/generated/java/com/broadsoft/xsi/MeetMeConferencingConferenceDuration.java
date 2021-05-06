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
 *         MeetMe Conference duration.
 *         Release Added:  R17.sp3
 *       
 * 
 * <p>Java-Klasse für MeetMeConferencingConferenceDuration complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MeetMeConferencingConferenceDuration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hours" type="{http://schema.broadsoft.com/xsi}Hour"/&gt;
 *         &lt;element name="minutes" type="{http://schema.broadsoft.com/xsi}MeetMeConferencingConferenceDurationMinutes"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetMeConferencingConferenceDuration", propOrder = {
    "hours",
    "minutes"
})
public class MeetMeConferencingConferenceDuration {

    protected int hours;
    protected int minutes;

    /**
     * Ruft den Wert der hours-Eigenschaft ab.
     * 
     */
    public int getHours() {
        return hours;
    }

    /**
     * Legt den Wert der hours-Eigenschaft fest.
     * 
     */
    public void setHours(int value) {
        this.hours = value;
    }

    /**
     * Ruft den Wert der minutes-Eigenschaft ab.
     * 
     */
    public int getMinutes() {
        return minutes;
    }

    /**
     * Legt den Wert der minutes-Eigenschaft fest.
     * 
     */
    public void setMinutes(int value) {
        this.minutes = value;
    }

}
