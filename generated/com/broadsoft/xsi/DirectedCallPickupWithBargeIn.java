//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="enableBargeInWarningTone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableAutomaticTargetSelection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "enableBargeInWarningTone",
    "enableAutomaticTargetSelection"
})
@XmlRootElement(name = "DirectedCallPickupWithBargeIn")
public class DirectedCallPickupWithBargeIn {

    protected Boolean enableBargeInWarningTone;
    protected Boolean enableAutomaticTargetSelection;

    /**
     * Ruft den Wert der enableBargeInWarningTone-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableBargeInWarningTone() {
        return enableBargeInWarningTone;
    }

    /**
     * Legt den Wert der enableBargeInWarningTone-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableBargeInWarningTone(Boolean value) {
        this.enableBargeInWarningTone = value;
    }

    /**
     * Ruft den Wert der enableAutomaticTargetSelection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableAutomaticTargetSelection() {
        return enableAutomaticTargetSelection;
    }

    /**
     * Legt den Wert der enableAutomaticTargetSelection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableAutomaticTargetSelection(Boolean value) {
        this.enableAutomaticTargetSelection = value;
    }

}
