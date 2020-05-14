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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         Contains the general information for a party.
 *       
 * 
 * <p>Java-Klasse für PartyInformation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PartyInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://schema.broadsoft.com/xsi}NonEmptyString" minOccurs="0"/>
 *         &lt;element name="address" type="{http://schema.broadsoft.com/xsi}Address" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://schema.broadsoft.com/xsi}UserId" minOccurs="0"/>
 *         &lt;element name="userDN" type="{http://schema.broadsoft.com/xsi}Address" minOccurs="0"/>
 *         &lt;element name="privacy" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/>
 *         &lt;element name="callType" type="{http://schema.broadsoft.com/xsi}CallType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyInformation", propOrder = {
    "name",
    "address",
    "userId",
    "userDN",
    "privacy",
    "callType"
})
public class PartyInformation {

    protected String name;
    protected Address address;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String userId;
    protected Address userDN;
    protected EmptyContent privacy;
    @XmlSchemaType(name = "token")
    protected CallType callType;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

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
     * Ruft den Wert der userId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Legt den Wert der userId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Ruft den Wert der userDN-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getUserDN() {
        return userDN;
    }

    /**
     * Legt den Wert der userDN-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setUserDN(Address value) {
        this.userDN = value;
    }

    /**
     * Ruft den Wert der privacy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getPrivacy() {
        return privacy;
    }

    /**
     * Legt den Wert der privacy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setPrivacy(EmptyContent value) {
        this.privacy = value;
    }

    /**
     * Ruft den Wert der callType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CallType }
     *     
     */
    public CallType getCallType() {
        return callType;
    }

    /**
     * Legt den Wert der callType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CallType }
     *     
     */
    public void setCallType(CallType value) {
        this.callType = value;
    }

}
