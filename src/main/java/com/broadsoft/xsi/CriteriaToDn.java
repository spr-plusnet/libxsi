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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         The to dn criteria.
 *         
 *         Change History:
 *         R19.0 - Added
 *       
 * 
 * <p>Java-Klasse für CriteriaToDn complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CriteriaToDn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="toDnCriteriaSelection" type="{http://schema.broadsoft.com/xsi}CriteriaDnSelection"/&gt;
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
@XmlType(name = "CriteriaToDn", propOrder = {
    "toDnCriteriaSelection",
    "phoneNumberList"
})
public class CriteriaToDn {

    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected CriteriaDnSelection toDnCriteriaSelection;
    @XmlElementRef(name = "phoneNumberList", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<CriteriaPhoneNumberList> phoneNumberList;

    /**
     * Ruft den Wert der toDnCriteriaSelection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CriteriaDnSelection }
     *     
     */
    public CriteriaDnSelection getToDnCriteriaSelection() {
        return toDnCriteriaSelection;
    }

    /**
     * Legt den Wert der toDnCriteriaSelection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CriteriaDnSelection }
     *     
     */
    public void setToDnCriteriaSelection(CriteriaDnSelection value) {
        this.toDnCriteriaSelection = value;
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
