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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="CriteriaToDn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="toDnCriteriaSelection" type="{http://schema.broadsoft.com/xsi}CriteriaDnSelection"/>
 *         &lt;element name="phoneNumberList" type="{http://schema.broadsoft.com/xsi}CriteriaPhoneNumberList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
