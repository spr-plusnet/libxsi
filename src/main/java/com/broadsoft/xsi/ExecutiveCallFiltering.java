//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         Provides details for filtering assigned to the Executive.
 *         Change History:
 *         R20.0 – Added.
 *       
 * 
 * <p>Java-Klasse für ExecutiveCallFiltering complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ExecutiveCallFiltering"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enableFiltering" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="filteringMode" type="{http://schema.broadsoft.com/xsi}ExecutiveCallFilteringMode" minOccurs="0"/&gt;
 *         &lt;element name="simpleFilterType" type="{http://schema.broadsoft.com/xsi}ExecutiveCallSimpleFilterType" minOccurs="0"/&gt;
 *         &lt;element name="criteriaActivations" type="{http://schema.broadsoft.com/xsi}CriteriaActivationList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecutiveCallFiltering", propOrder = {
    "enableFiltering",
    "filteringMode",
    "simpleFilterType",
    "criteriaActivations"
})
public class ExecutiveCallFiltering {

    protected Boolean enableFiltering;
    @XmlSchemaType(name = "token")
    protected ExecutiveCallFilteringMode filteringMode;
    @XmlSchemaType(name = "token")
    protected ExecutiveCallSimpleFilterType simpleFilterType;
    protected CriteriaActivationList criteriaActivations;

    /**
     * Ruft den Wert der enableFiltering-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableFiltering() {
        return enableFiltering;
    }

    /**
     * Legt den Wert der enableFiltering-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableFiltering(Boolean value) {
        this.enableFiltering = value;
    }

    /**
     * Ruft den Wert der filteringMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExecutiveCallFilteringMode }
     *     
     */
    public ExecutiveCallFilteringMode getFilteringMode() {
        return filteringMode;
    }

    /**
     * Legt den Wert der filteringMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutiveCallFilteringMode }
     *     
     */
    public void setFilteringMode(ExecutiveCallFilteringMode value) {
        this.filteringMode = value;
    }

    /**
     * Ruft den Wert der simpleFilterType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExecutiveCallSimpleFilterType }
     *     
     */
    public ExecutiveCallSimpleFilterType getSimpleFilterType() {
        return simpleFilterType;
    }

    /**
     * Legt den Wert der simpleFilterType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutiveCallSimpleFilterType }
     *     
     */
    public void setSimpleFilterType(ExecutiveCallSimpleFilterType value) {
        this.simpleFilterType = value;
    }

    /**
     * Ruft den Wert der criteriaActivations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CriteriaActivationList }
     *     
     */
    public CriteriaActivationList getCriteriaActivations() {
        return criteriaActivations;
    }

    /**
     * Legt den Wert der criteriaActivations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CriteriaActivationList }
     *     
     */
    public void setCriteriaActivations(CriteriaActivationList value) {
        this.criteriaActivations = value;
    }

}
