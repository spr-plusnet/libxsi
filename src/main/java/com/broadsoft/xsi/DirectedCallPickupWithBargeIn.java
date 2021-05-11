//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="enableBargeInWarningTone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="enableAutomaticTargetSelection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
