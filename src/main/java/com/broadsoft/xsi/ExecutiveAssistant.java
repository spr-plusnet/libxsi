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
 * &lt;complexType name="ExecutiveAssistant"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enableDivert" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="divertToPhoneNumber" type="{http://schema.broadsoft.com/xsi}OutgoingDNorSIPURI" minOccurs="0"/&gt;
 *         &lt;element name="executives" type="{http://schema.broadsoft.com/xsi}ExecutiveDetailsList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
