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
 *           Contains a list of URLs for modify.
 *         
 * 
 * <p>Java-Klasse für CallCenterAnnouncementURLList complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CallCenterAnnouncementURLList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="url1" type="{http://schema.broadsoft.com/xsi}URL" minOccurs="0"/&gt;
 *         &lt;element name="url2" type="{http://schema.broadsoft.com/xsi}URL" minOccurs="0"/&gt;
 *         &lt;element name="url3" type="{http://schema.broadsoft.com/xsi}URL" minOccurs="0"/&gt;
 *         &lt;element name="url4" type="{http://schema.broadsoft.com/xsi}URL" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
