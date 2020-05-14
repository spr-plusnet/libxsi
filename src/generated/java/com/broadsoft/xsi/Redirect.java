//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Contains the details for a redirect.
 *       
 * 
 * <p>Java-Klasse für Redirect complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Redirect">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://schema.broadsoft.com/xsi}Address" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://schema.broadsoft.com/xsi}RedirectReason"/>
 *         &lt;element name="redirectTime" type="{http://schema.broadsoft.com/xsi}Timestamp"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Redirect", propOrder = {
    "address",
    "reason",
    "redirectTime"
})
public class Redirect {

    protected Address address;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected RedirectReason reason;
    protected long redirectTime;

    /**
     * Ruft den Wert der address-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Legt den Wert der address-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Ruft den Wert der reason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RedirectReason }
     *     
     */
    public RedirectReason getReason() {
        return reason;
    }

    /**
     * Legt den Wert der reason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RedirectReason }
     *     
     */
    public void setReason(RedirectReason value) {
        this.reason = value;
    }

    /**
     * Ruft den Wert der redirectTime-Eigenschaft ab.
     * 
     */
    public long getRedirectTime() {
        return redirectTime;
    }

    /**
     * Legt den Wert der redirectTime-Eigenschaft fest.
     * 
     */
    public void setRedirectTime(long value) {
        this.redirectTime = value;
    }

}
