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
 *         The user level data associated with the Personal Assistant service
 * 
 *         Change History:
 *         21.0 – Added.
 *       
 * 
 * <p>Java-Klasse für PersonalAssistantAssignedCallToNumbers complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PersonalAssistantAssignedCallToNumbers"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callToNumberList" type="{http://schema.broadsoft.com/xsi}CallToNumberList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonalAssistantAssignedCallToNumbers", propOrder = {
    "callToNumberList"
})
public class PersonalAssistantAssignedCallToNumbers {

    @XmlElementRef(name = "callToNumberList", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<CallToNumberList> callToNumberList;

    /**
     * Ruft den Wert der callToNumberList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CallToNumberList }{@code >}
     *     
     */
    public JAXBElement<CallToNumberList> getCallToNumberList() {
        return callToNumberList;
    }

    /**
     * Legt den Wert der callToNumberList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CallToNumberList }{@code >}
     *     
     */
    public void setCallToNumberList(JAXBElement<CallToNumberList> value) {
        this.callToNumberList = value;
    }

}
