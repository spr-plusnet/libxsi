//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="commands" type="{http://schema.broadsoft.com/xsi}Commands"/&gt;
 *         &lt;element name="eventPackages" type="{http://schema.broadsoft.com/xsi}EventPackages" minOccurs="0"/&gt;
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
