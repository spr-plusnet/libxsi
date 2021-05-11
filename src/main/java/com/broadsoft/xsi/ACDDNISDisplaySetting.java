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
 *         DNIS Display Configuration.
 *       
 * 
 * <p>Java-Klasse für ACDDNISDisplaySetting complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ACDDNISDisplaySetting"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="displayDNISNumber" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="displayDNISName" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
