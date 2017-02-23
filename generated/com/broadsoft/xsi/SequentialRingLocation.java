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
 *         Defines pieces of information for each Sequential Ring location.
 *       
 * 
 * <p>Java-Klasse für SequentialRingLocation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SequentialRingLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://schema.broadsoft.com/xsi}Address" minOccurs="0"/>
 *         &lt;element name="numberOfRings" type="{http://schema.broadsoft.com/xsi}NumberOfRingsZeroToTwentyExcludeOne" minOccurs="0"/>
 *         &lt;element name="answerConfirmationRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SequentialRingLocation", propOrder = {
    "address",
    "numberOfRings",
    "answerConfirmationRequired"
})
public class SequentialRingLocation {

    @XmlElementRef(name = "address", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<Address> address;
    protected Integer numberOfRings;
    protected Boolean answerConfirmationRequired;

    /**
     * Ruft den Wert der address-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public JAXBElement<Address> getAddress() {
        return address;
    }

    /**
     * Legt den Wert der address-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public void setAddress(JAXBElement<Address> value) {
        this.address = value;
    }

    /**
     * Ruft den Wert der numberOfRings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfRings() {
        return numberOfRings;
    }

    /**
     * Legt den Wert der numberOfRings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfRings(Integer value) {
        this.numberOfRings = value;
    }

    /**
     * Ruft den Wert der answerConfirmationRequired-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnswerConfirmationRequired() {
        return answerConfirmationRequired;
    }

    /**
     * Legt den Wert der answerConfirmationRequired-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnswerConfirmationRequired(Boolean value) {
        this.answerConfirmationRequired = value;
    }

}
