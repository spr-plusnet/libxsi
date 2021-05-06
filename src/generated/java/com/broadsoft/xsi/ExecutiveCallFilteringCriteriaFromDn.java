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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         The from dn criteria used within an executive filtering criteria add/get request.
 *         
 *         Change History:
 *         R20.0 – Added.
 *         R21.0 - Modified to include criteriaCallToNumber
 *       
 * 
 * <p>Java-Klasse für ExecutiveCallFilteringCriteriaFromDn complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ExecutiveCallFilteringCriteriaFromDn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fromDnCriteriaSelection" type="{http://schema.broadsoft.com/xsi}ExecutiveCallFilteringCriteriaDnSelection" minOccurs="0"/&gt;
 *         &lt;element name="includeAnonymousCallers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="includeUnavailableCallers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="phoneNumberList" type="{http://schema.broadsoft.com/xsi}CriteriaPhoneNumberList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecutiveCallFilteringCriteriaFromDn", propOrder = {
    "fromDnCriteriaSelection",
    "includeAnonymousCallers",
    "includeUnavailableCallers",
    "phoneNumberList"
})
public class ExecutiveCallFilteringCriteriaFromDn {

    @XmlSchemaType(name = "token")
    protected ExecutiveCallFilteringCriteriaDnSelection fromDnCriteriaSelection;
    protected Boolean includeAnonymousCallers;
    protected Boolean includeUnavailableCallers;
    @XmlElementRef(name = "phoneNumberList", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<CriteriaPhoneNumberList> phoneNumberList;

    /**
     * Ruft den Wert der fromDnCriteriaSelection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExecutiveCallFilteringCriteriaDnSelection }
     *     
     */
    public ExecutiveCallFilteringCriteriaDnSelection getFromDnCriteriaSelection() {
        return fromDnCriteriaSelection;
    }

    /**
     * Legt den Wert der fromDnCriteriaSelection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutiveCallFilteringCriteriaDnSelection }
     *     
     */
    public void setFromDnCriteriaSelection(ExecutiveCallFilteringCriteriaDnSelection value) {
        this.fromDnCriteriaSelection = value;
    }

    /**
     * Ruft den Wert der includeAnonymousCallers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeAnonymousCallers() {
        return includeAnonymousCallers;
    }

    /**
     * Legt den Wert der includeAnonymousCallers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeAnonymousCallers(Boolean value) {
        this.includeAnonymousCallers = value;
    }

    /**
     * Ruft den Wert der includeUnavailableCallers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeUnavailableCallers() {
        return includeUnavailableCallers;
    }

    /**
     * Legt den Wert der includeUnavailableCallers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeUnavailableCallers(Boolean value) {
        this.includeUnavailableCallers = value;
    }

    /**
     * Ruft den Wert der phoneNumberList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CriteriaPhoneNumberList }{@code >}
     *     
     */
    public JAXBElement<CriteriaPhoneNumberList> getPhoneNumberList() {
        return phoneNumberList;
    }

    /**
     * Legt den Wert der phoneNumberList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CriteriaPhoneNumberList }{@code >}
     *     
     */
    public void setPhoneNumberList(JAXBElement<CriteriaPhoneNumberList> value) {
        this.phoneNumberList = value;
    }

}
