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
 *         &lt;element name="isCallCenterBasicAssigned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isCallCenterStandardAssigned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isCallCenterPremiumAssigned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
