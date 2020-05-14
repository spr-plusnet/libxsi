//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         DNIS Display Configuration.
 *       
 * 
 * <p>Java-Klasse für ACDDNISDisplaySetting complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ACDDNISDisplaySetting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="displayDNISNumber" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="displayDNISName" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACDDNISDisplaySetting", propOrder = {
    "displayDNISNumber",
    "displayDNISName"
})
public class ACDDNISDisplaySetting {

    protected boolean displayDNISNumber;
    protected boolean displayDNISName;

    /**
     * Ruft den Wert der displayDNISNumber-Eigenschaft ab.
     * 
     */
    public boolean isDisplayDNISNumber() {
        return displayDNISNumber;
    }

    /**
     * Legt den Wert der displayDNISNumber-Eigenschaft fest.
     * 
     */
    public void setDisplayDNISNumber(boolean value) {
        this.displayDNISNumber = value;
    }

    /**
     * Ruft den Wert der displayDNISName-Eigenschaft ab.
     * 
     */
    public boolean isDisplayDNISName() {
        return displayDNISName;
    }

    /**
     * Legt den Wert der displayDNISName-Eigenschaft fest.
     * 
     */
    public void setDisplayDNISName(boolean value) {
        this.displayDNISName = value;
    }

}
