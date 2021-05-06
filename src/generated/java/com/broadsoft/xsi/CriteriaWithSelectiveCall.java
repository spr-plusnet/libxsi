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
 *         Criteria for Selective Call Rejection service.
 *   
 *         Change History:
 *         R19.0 - Added
 *         R21.0 - Modified to include criteriaCallToNumber
 *       
 * 
 * <p>Java-Klasse für CriteriaWithSelectiveCall complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CriteriaWithSelectiveCall"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}Criteria"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="criteriaFromDn" type="{http://schema.broadsoft.com/xsi}SelectiveCallRejectionCriteriaFromDn" minOccurs="0"/&gt;
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
@XmlType(name = "CriteriaWithSelectiveCall", propOrder = {
    "criteriaFromDn",
    "criteriaCallToNumber"
})
public class CriteriaWithSelectiveCall
    extends Criteria
{

    protected SelectiveCallRejectionCriteriaFromDn criteriaFromDn;
    @XmlElementRef(name = "criteriaCallToNumber", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<CallToNumberList> criteriaCallToNumber;

    /**
     * Ruft den Wert der criteriaFromDn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SelectiveCallRejectionCriteriaFromDn }
     *     
     */
    public SelectiveCallRejectionCriteriaFromDn getCriteriaFromDn() {
        return criteriaFromDn;
    }

    /**
     * Legt den Wert der criteriaFromDn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectiveCallRejectionCriteriaFromDn }
     *     
     */
    public void setCriteriaFromDn(SelectiveCallRejectionCriteriaFromDn value) {
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
