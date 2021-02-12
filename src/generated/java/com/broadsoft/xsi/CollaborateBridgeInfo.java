//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
//


package com.broadsoft.xsi;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         Contains the details of the Collaborate Bridge that can be used to host a room.
 *       
 * 
 * <p>Java-Klasse für CollaborateBridgeInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CollaborateBridgeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bridgeID" type="{http://schema.broadsoft.com/xsi}UserId"/>
 *         &lt;element name="phonenumber" type="{http://schema.broadsoft.com/xsi}DN" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://schema.broadsoft.com/xsi}Extension" minOccurs="0"/>
 *         &lt;element name="maxParticipants" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="alternateNumbers" type="{http://schema.broadsoft.com/xsi}AlternateNumbersList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollaborateBridgeInfo", propOrder = {
    "bridgeID",
    "phonenumber",
    "extension",
    "maxParticipants",
    "alternateNumbers"
})
public class CollaborateBridgeInfo {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bridgeID;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String phonenumber;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String extension;
    @XmlElement(required = true)
    protected BigInteger maxParticipants;
    protected AlternateNumbersList alternateNumbers;

    /**
     * Ruft den Wert der bridgeID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBridgeID() {
        return bridgeID;
    }

    /**
     * Legt den Wert der bridgeID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBridgeID(String value) {
        this.bridgeID = value;
    }

    /**
     * Ruft den Wert der phonenumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhonenumber() {
        return phonenumber;
    }

    /**
     * Legt den Wert der phonenumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhonenumber(String value) {
        this.phonenumber = value;
    }

    /**
     * Ruft den Wert der extension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Legt den Wert der extension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * Ruft den Wert der maxParticipants-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxParticipants() {
        return maxParticipants;
    }

    /**
     * Legt den Wert der maxParticipants-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxParticipants(BigInteger value) {
        this.maxParticipants = value;
    }

    /**
     * Ruft den Wert der alternateNumbers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AlternateNumbersList }
     *     
     */
    public AlternateNumbersList getAlternateNumbers() {
        return alternateNumbers;
    }

    /**
     * Legt den Wert der alternateNumbers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateNumbersList }
     *     
     */
    public void setAlternateNumbers(AlternateNumbersList value) {
        this.alternateNumbers = value;
    }

}
