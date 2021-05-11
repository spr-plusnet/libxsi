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
 *         &lt;element name="isCallCenterBasicAssigned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isCallCenterStandardAssigned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isCallCenterPremiumAssigned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "isCallCenterBasicAssigned",
    "isCallCenterStandardAssigned",
    "isCallCenterPremiumAssigned"
})
@XmlRootElement(name = "AgentCallCenterAssignedStatus")
public class AgentCallCenterAssignedStatus {

    protected Boolean isCallCenterBasicAssigned;
    protected Boolean isCallCenterStandardAssigned;
    protected Boolean isCallCenterPremiumAssigned;

    /**
     * Ruft den Wert der isCallCenterBasicAssigned-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCallCenterBasicAssigned() {
        return isCallCenterBasicAssigned;
    }

    /**
     * Legt den Wert der isCallCenterBasicAssigned-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCallCenterBasicAssigned(Boolean value) {
        this.isCallCenterBasicAssigned = value;
    }

    /**
     * Ruft den Wert der isCallCenterStandardAssigned-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCallCenterStandardAssigned() {
        return isCallCenterStandardAssigned;
    }

    /**
     * Legt den Wert der isCallCenterStandardAssigned-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCallCenterStandardAssigned(Boolean value) {
        this.isCallCenterStandardAssigned = value;
    }

    /**
     * Ruft den Wert der isCallCenterPremiumAssigned-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCallCenterPremiumAssigned() {
        return isCallCenterPremiumAssigned;
    }

    /**
     * Legt den Wert der isCallCenterPremiumAssigned-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCallCenterPremiumAssigned(Boolean value) {
        this.isCallCenterPremiumAssigned = value;
    }

}
