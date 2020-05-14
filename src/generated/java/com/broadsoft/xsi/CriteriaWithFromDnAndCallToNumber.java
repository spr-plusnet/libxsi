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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Criteria for services which define criteria for incoming
 *         calling number table and incoming called number table.
 *         
 *         Change History:
 *         R21.0 - Added
 *       
 * 
 * <p>Java-Klasse für CriteriaWithFromDnAndCallToNumber complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CriteriaWithFromDnAndCallToNumber">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}CriteriaWithFromDn">
 *       &lt;sequence>
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
@XmlType(name = "CriteriaWithFromDnAndCallToNumber", propOrder = {
    "criteriaCallToNumber"
})
public class CriteriaWithFromDnAndCallToNumber
    extends CriteriaWithFromDn
{

    @XmlElementRef(name = "criteriaCallToNumber", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<CallToNumberList> criteriaCallToNumber;

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
