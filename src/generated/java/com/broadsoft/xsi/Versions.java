//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="commands" type="{http://schema.broadsoft.com/xsi}Commands"/>
 *         &lt;element name="eventPackages" type="{http://schema.broadsoft.com/xsi}EventPackages" minOccurs="0"/>
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
    "commands",
    "eventPackages"
})
@XmlRootElement(name = "Versions")
public class Versions {

    @XmlElement(required = true)
    protected Commands commands;
    protected EventPackages eventPackages;

    /**
     * Ruft den Wert der commands-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Commands }
     *     
     */
    public Commands getCommands() {
        return commands;
    }

    /**
     * Legt den Wert der commands-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Commands }
     *     
     */
    public void setCommands(Commands value) {
        this.commands = value;
    }

    /**
     * Ruft den Wert der eventPackages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EventPackages }
     *     
     */
    public EventPackages getEventPackages() {
        return eventPackages;
    }

    /**
     * Legt den Wert der eventPackages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EventPackages }
     *     
     */
    public void setEventPackages(EventPackages value) {
        this.eventPackages = value;
    }

}
