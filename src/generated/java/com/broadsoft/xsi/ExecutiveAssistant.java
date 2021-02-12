//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Provides details for a user assigned the Executive Assistant Service.
 *         Contains the executive assistant setting and a table of executives this assistant has been assigned to.
 *         Change History:
 *         R20.0 – Added.
 *         R22.0 - Changed enableDivert and executives to be optional for PUT,
 *                 and divertToPhoneNumber to be nillable for PUT.
 *       
 * 
 * <p>Java-Klasse für ExecutiveAssistant complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ExecutiveAssistant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enableDivert" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="divertToPhoneNumber" type="{http://schema.broadsoft.com/xsi}OutgoingDNorSIPURI" minOccurs="0"/>
 *         &lt;element name="executives" type="{http://schema.broadsoft.com/xsi}ExecutiveDetailsList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecutiveAssistant", propOrder = {
    "enableDivert",
    "divertToPhoneNumber",
    "executives"
})
public class ExecutiveAssistant {

    protected Boolean enableDivert;
    @XmlElementRef(name = "divertToPhoneNumber", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> divertToPhoneNumber;
    protected ExecutiveDetailsList executives;

    /**
     * Ruft den Wert der enableDivert-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableDivert() {
        return enableDivert;
    }

    /**
     * Legt den Wert der enableDivert-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableDivert(Boolean value) {
        this.enableDivert = value;
    }

    /**
     * Ruft den Wert der divertToPhoneNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDivertToPhoneNumber() {
        return divertToPhoneNumber;
    }

    /**
     * Legt den Wert der divertToPhoneNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDivertToPhoneNumber(JAXBElement<String> value) {
        this.divertToPhoneNumber = value;
    }

    /**
     * Ruft den Wert der executives-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExecutiveDetailsList }
     *     
     */
    public ExecutiveDetailsList getExecutives() {
        return executives;
    }

    /**
     * Legt den Wert der executives-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutiveDetailsList }
     *     
     */
    public void setExecutives(ExecutiveDetailsList value) {
        this.executives = value;
    }

}
