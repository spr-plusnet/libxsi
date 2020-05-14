//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java-Klasse für SelectiveCallRejectionCriteriaFromDn complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SelectiveCallRejectionCriteriaFromDn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fromDnCriteriaSelection" type="{http://schema.broadsoft.com/xsi}SelectiveCallRejectionCriteriaCallTypeSelection" minOccurs="0"/>
 *         &lt;element name="includeAnonymousCallers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="includeUnavailableCallers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "SelectiveCallRejectionCriteriaFromDn", propOrder = {
    "fromDnCriteriaSelection",
    "includeAnonymousCallers",
    "includeUnavailableCallers",
    "phoneNumberList"
})
public class SelectiveCallRejectionCriteriaFromDn {

    @XmlSchemaType(name = "token")
    protected SelectiveCallRejectionCriteriaCallTypeSelection fromDnCriteriaSelection;
    protected Boolean includeAnonymousCallers;
    protected Boolean includeUnavailableCallers;
    @XmlElementRef(name = "phoneNumberList", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<CriteriaPhoneNumberList> phoneNumberList;

    /**
     * Ruft den Wert der fromDnCriteriaSelection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SelectiveCallRejectionCriteriaCallTypeSelection }
     *     
     */
    public SelectiveCallRejectionCriteriaCallTypeSelection getFromDnCriteriaSelection() {
        return fromDnCriteriaSelection;
    }

    /**
     * Legt den Wert der fromDnCriteriaSelection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectiveCallRejectionCriteriaCallTypeSelection }
     *     
     */
    public void setFromDnCriteriaSelection(SelectiveCallRejectionCriteriaCallTypeSelection value) {
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
