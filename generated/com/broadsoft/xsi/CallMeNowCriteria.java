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
 *         &lt;element name="blackListed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="criteria" type="{http://schema.broadsoft.com/xsi}CriteriaWithToDn" minOccurs="0"/>
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
    "blackListed",
    "criteria"
})
@XmlRootElement(name = "CallMeNowCriteria")
public class CallMeNowCriteria {

    protected boolean blackListed;
    protected CriteriaWithToDn criteria;

    /**
     * Ruft den Wert der blackListed-Eigenschaft ab.
     * 
     */
    public boolean isBlackListed() {
        return blackListed;
    }

    /**
     * Legt den Wert der blackListed-Eigenschaft fest.
     * 
     */
    public void setBlackListed(boolean value) {
        this.blackListed = value;
    }

    /**
     * Ruft den Wert der criteria-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CriteriaWithToDn }
     *     
     */
    public CriteriaWithToDn getCriteria() {
        return criteria;
    }

    /**
     * Legt den Wert der criteria-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CriteriaWithToDn }
     *     
     */
    public void setCriteria(CriteriaWithToDn value) {
        this.criteria = value;
    }

}
