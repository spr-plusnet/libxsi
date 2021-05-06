//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="Redirect"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://schema.broadsoft.com/xsi}Address" minOccurs="0"/&gt;
 *         &lt;element name="reason" type="{http://schema.broadsoft.com/xsi}RedirectReason"/&gt;
 *         &lt;element name="redirectTime" type="{http://schema.broadsoft.com/xsi}Timestamp"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
