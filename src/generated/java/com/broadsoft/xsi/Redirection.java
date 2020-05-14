//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Contains the details for a redirection.
 *       
 * 
 * <p>Java-Klasse für Redirection complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Redirection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="party" type="{http://schema.broadsoft.com/xsi}PartyInformation" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://schema.broadsoft.com/xsi}RedirectReason" minOccurs="0"/>
 *         &lt;element name="counter" type="{http://schema.broadsoft.com/xsi}PositiveInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Redirection", propOrder = {
    "party",
    "reason",
    "counter"
})
public class Redirection {

    protected PartyInformation party;
    @XmlSchemaType(name = "token")
    protected RedirectReason reason;
    protected Integer counter;

    /**
     * Ruft den Wert der party-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PartyInformation }
     *     
     */
    public PartyInformation getParty() {
        return party;
    }

    /**
     * Legt den Wert der party-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyInformation }
     *     
     */
    public void setParty(PartyInformation value) {
        this.party = value;
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
     * Ruft den Wert der counter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCounter() {
        return counter;
    }

    /**
     * Legt den Wert der counter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCounter(Integer value) {
        this.counter = value;
    }

}
