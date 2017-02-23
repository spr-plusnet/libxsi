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
 *           Contains a list of URLs for modify.
 *         
 * 
 * <p>Java-Klasse für CallCenterAnnouncementURLList complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CallCenterAnnouncementURLList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="url1" type="{http://schema.broadsoft.com/xsi}URL" minOccurs="0"/>
 *         &lt;element name="url2" type="{http://schema.broadsoft.com/xsi}URL" minOccurs="0"/>
 *         &lt;element name="url3" type="{http://schema.broadsoft.com/xsi}URL" minOccurs="0"/>
 *         &lt;element name="url4" type="{http://schema.broadsoft.com/xsi}URL" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallCenterAnnouncementURLList", propOrder = {
    "url1",
    "url2",
    "url3",
    "url4"
})
public class CallCenterAnnouncementURLList {

    @XmlElementRef(name = "url1", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> url1;
    @XmlElementRef(name = "url2", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> url2;
    @XmlElementRef(name = "url3", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> url3;
    @XmlElementRef(name = "url4", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> url4;

    /**
     * Ruft den Wert der url1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUrl1() {
        return url1;
    }

    /**
     * Legt den Wert der url1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUrl1(JAXBElement<String> value) {
        this.url1 = value;
    }

    /**
     * Ruft den Wert der url2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUrl2() {
        return url2;
    }

    /**
     * Legt den Wert der url2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUrl2(JAXBElement<String> value) {
        this.url2 = value;
    }

    /**
     * Ruft den Wert der url3-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUrl3() {
        return url3;
    }

    /**
     * Legt den Wert der url3-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUrl3(JAXBElement<String> value) {
        this.url3 = value;
    }

    /**
     * Ruft den Wert der url4-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUrl4() {
        return url4;
    }

    /**
     * Legt den Wert der url4-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUrl4(JAXBElement<String> value) {
        this.url4 = value;
    }

}
