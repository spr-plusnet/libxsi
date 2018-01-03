//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Collaborate room schedule duration.
 *       
 * 
 * <p>Java-Klasse für CollaborateRoomScheduleDuration complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CollaborateRoomScheduleDuration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hours" type="{http://schema.broadsoft.com/xsi}Hour"/>
 *         &lt;element name="minutes" type="{http://schema.broadsoft.com/xsi}CollaborateRoomScheduleDurationMinutes"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollaborateRoomScheduleDuration", propOrder = {
    "hours",
    "minutes"
})
public class CollaborateRoomScheduleDuration {

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
