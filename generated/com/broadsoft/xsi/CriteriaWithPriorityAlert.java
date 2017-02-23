//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="CriteriaWithPriorityAlert">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}Criteria">
 *       &lt;sequence>
 *         &lt;element name="criteriaFromDn" type="{http://schema.broadsoft.com/xsi}PriorityAlertCriteriaFromDn" minOccurs="0"/>
 *         &lt;element name="criteriaCallToNumber" type="{http://schema.broadsoft.com/xsi}CallToNumberList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
