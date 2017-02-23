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
 * Alternate Number Entry.
 * 
 * <p>Java-Klasse für AlternateNumberEntry complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AlternateNumberEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alternateNumberId" type="{http://schema.broadsoft.com/xsi}AlternateNumbersIndex"/>
 *         &lt;element name="phoneNumber" type="{http://schema.broadsoft.com/xsi}DN" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://schema.broadsoft.com/xsi}Extension" minOccurs="0"/>
 *         &lt;element name="ringPattern" type="{http://schema.broadsoft.com/xsi}AlternateNumbersRingPatternEnum" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternateNumberEntry", propOrder = {
    "alternateNumberId",
    "phoneNumber",
    "extension",
    "ringPattern",
    "description"
})
public class AlternateNumberEntry {

    protected int alternateNumberId;
    @XmlElementRef(name = "phoneNumber", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phoneNumber;
    @XmlElementRef(name = "extension", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> extension;
    @XmlElementRef(name = "ringPattern", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<AlternateNumbersRingPatternEnum> ringPattern;
    @XmlElementRef(name = "description", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;

    /**
     * Ruft den Wert der alternateNumberId-Eigenschaft ab.
     * 
     */
    public int getAlternateNumberId() {
        return alternateNumberId;
    }

    /**
     * Legt den Wert der alternateNumberId-Eigenschaft fest.
     * 
     */
    public void setAlternateNumberId(int value) {
        this.alternateNumberId = value;
    }

    /**
     * Ruft den Wert der phoneNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Legt den Wert der phoneNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhoneNumber(JAXBElement<String> value) {
        this.phoneNumber = value;
    }

    /**
     * Ruft den Wert der extension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExtension() {
        return extension;
    }

    /**
     * Legt den Wert der extension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExtension(JAXBElement<String> value) {
        this.extension = value;
    }

    /**
     * Ruft den Wert der ringPattern-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AlternateNumbersRingPatternEnum }{@code >}
     *     
     */
    public JAXBElement<AlternateNumbersRingPatternEnum> getRingPattern() {
        return ringPattern;
    }

    /**
     * Legt den Wert der ringPattern-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AlternateNumbersRingPatternEnum }{@code >}
     *     
     */
    public void setRingPattern(JAXBElement<AlternateNumbersRingPatternEnum> value) {
        this.ringPattern = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

}
