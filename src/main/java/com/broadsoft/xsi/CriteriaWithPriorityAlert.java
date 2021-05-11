//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         Criteria for Priority Alert service.
 *   
 *         Change History:
 *         R19.0 - Added
 *         R21.0 - Modified to include criteriaCallToNumber
 *       
 * 
 * <p>Java-Klasse für CriteriaWithPriorityAlert complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CriteriaWithPriorityAlert"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}Criteria"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="criteriaFromDn" type="{http://schema.broadsoft.com/xsi}PriorityAlertCriteriaFromDn" minOccurs="0"/&gt;
 *         &lt;element name="criteriaCallToNumber" type="{http://schema.broadsoft.com/xsi}CallToNumberList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CriteriaWithPriorityAlert", propOrder = {
    "criteriaFromDn",
    "criteriaCallToNumber"
})
public class CriteriaWithPriorityAlert
    extends Criteria
{

    protected PriorityAlertCriteriaFromDn criteriaFromDn;
    @XmlElementRef(name = "criteriaCallToNumber", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<CallToNumberList> criteriaCallToNumber;

    /**
     * Ruft den Wert der criteriaFromDn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PriorityAlertCriteriaFromDn }
     *     
     */
    public PriorityAlertCriteriaFromDn getCriteriaFromDn() {
        return criteriaFromDn;
    }

    /**
     * Legt den Wert der criteriaFromDn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityAlertCriteriaFromDn }
     *     
     */
    public void setCriteriaFromDn(PriorityAlertCriteriaFromDn value) {
        this.criteriaFromDn = value;
    }

    /**
     * Ruft den Wert der criteriaCallToNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CallToNumberList }{@code >}
     *     
     */
    public JAXBElement<CallToNumberList> getCriteriaCallToNumber() {
        return criteriaCallToNumber;
    }

    /**
     * Legt den Wert der criteriaCallToNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CallToNumberList }{@code >}
     *     
     */
    public void setCriteriaCallToNumber(JAXBElement<CallToNumberList> value) {
        this.criteriaCallToNumber = value;
    }

}
