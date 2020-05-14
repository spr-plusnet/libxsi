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
 *         Provides details for filtering assigned to the Executive.
 *         Change History:
 *         R20.0 – Added.
 *       
 * 
 * <p>Java-Klasse für ExecutiveFilteringCriteria complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ExecutiveFilteringCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="criteria" type="{http://schema.broadsoft.com/xsi}CriteriaWithExecutiveFiltering" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecutiveFilteringCriteria", propOrder = {
    "filter",
    "criteria"
})
public class ExecutiveFilteringCriteria {

    protected Boolean filter;
    protected CriteriaWithExecutiveFiltering criteria;

    /**
     * Ruft den Wert der filter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFilter() {
        return filter;
    }

    /**
     * Legt den Wert der filter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFilter(Boolean value) {
        this.filter = value;
    }

    /**
     * Ruft den Wert der criteria-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CriteriaWithExecutiveFiltering }
     *     
     */
    public CriteriaWithExecutiveFiltering getCriteria() {
        return criteria;
    }

    /**
     * Legt den Wert der criteria-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CriteriaWithExecutiveFiltering }
     *     
     */
    public void setCriteria(CriteriaWithExecutiveFiltering value) {
        this.criteria = value;
    }

}
