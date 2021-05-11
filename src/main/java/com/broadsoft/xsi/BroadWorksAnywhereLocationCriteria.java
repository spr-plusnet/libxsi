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
 *         &lt;element name="blackListed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="criteria" type="{http://schema.broadsoft.com/xsi}CriteriaWithFromDnAndCallToNumber" minOccurs="0"/&gt;
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
    "blackListed",
    "criteria"
})
@XmlRootElement(name = "BroadWorksAnywhereLocationCriteria")
public class BroadWorksAnywhereLocationCriteria {

    protected Boolean blackListed;
    protected CriteriaWithFromDnAndCallToNumber criteria;

    /**
     * Ruft den Wert der blackListed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlackListed() {
        return blackListed;
    }

    /**
     * Legt den Wert der blackListed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlackListed(Boolean value) {
        this.blackListed = value;
    }

    /**
     * Ruft den Wert der criteria-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CriteriaWithFromDnAndCallToNumber }
     *     
     */
    public CriteriaWithFromDnAndCallToNumber getCriteria() {
        return criteria;
    }

    /**
     * Legt den Wert der criteria-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CriteriaWithFromDnAndCallToNumber }
     *     
     */
    public void setCriteria(CriteriaWithFromDnAndCallToNumber value) {
        this.criteria = value;
    }

}
