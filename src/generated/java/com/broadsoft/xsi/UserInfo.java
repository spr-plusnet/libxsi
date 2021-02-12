//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         Basic information about a User.
 *         Change History:
 *         23.5 - added externalId element
 *       
 * 
 * <p>Java-Klasse für UserInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UserInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userId" type="{http://schema.broadsoft.com/xsi}UserId"/>
 *         &lt;element name="externalId" type="{http://schema.broadsoft.com/xsi}ExternalUserIdentityId" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://schema.broadsoft.com/xsi}FirstName" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://schema.broadsoft.com/xsi}LastName" minOccurs="0"/>
 *         &lt;element name="hiranganaLastName" type="{http://schema.broadsoft.com/xsi}HiraganaLastName" minOccurs="0"/>
 *         &lt;element name="hiranganaFirstName" type="{http://schema.broadsoft.com/xsi}HiraganaFirstName" minOccurs="0"/>
 *         &lt;element name="nameDialingName" type="{http://schema.broadsoft.com/xsi}NameDialingName" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserInfo", propOrder = {
    "userId",
    "externalId",
    "firstName",
    "lastName",
    "hiranganaLastName",
    "hiranganaFirstName",
    "nameDialingName"
})
@XmlSeeAlso({
    UserDetails.class
})
public class UserInfo {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String userId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String externalId;
    @XmlElementRef(name = "firstName", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstName;
    @XmlElementRef(name = "lastName", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastName;
    @XmlElementRef(name = "hiranganaLastName", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hiranganaLastName;
    @XmlElementRef(name = "hiranganaFirstName", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hiranganaFirstName;
    protected NameDialingName nameDialingName;

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
     * Ruft den Wert der externalId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Legt den Wert der externalId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

    /**
     * Ruft den Wert der firstName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstName() {
        return firstName;
    }

    /**
     * Legt den Wert der firstName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstName(JAXBElement<String> value) {
        this.firstName = value;
    }

    /**
     * Ruft den Wert der lastName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastName() {
        return lastName;
    }

    /**
     * Legt den Wert der lastName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastName(JAXBElement<String> value) {
        this.lastName = value;
    }

    /**
     * Ruft den Wert der hiranganaLastName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHiranganaLastName() {
        return hiranganaLastName;
    }

    /**
     * Legt den Wert der hiranganaLastName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHiranganaLastName(JAXBElement<String> value) {
        this.hiranganaLastName = value;
    }

    /**
     * Ruft den Wert der hiranganaFirstName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHiranganaFirstName() {
        return hiranganaFirstName;
    }

    /**
     * Legt den Wert der hiranganaFirstName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHiranganaFirstName(JAXBElement<String> value) {
        this.hiranganaFirstName = value;
    }

    /**
     * Ruft den Wert der nameDialingName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NameDialingName }
     *     
     */
    public NameDialingName getNameDialingName() {
        return nameDialingName;
    }

    /**
     * Legt den Wert der nameDialingName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NameDialingName }
     *     
     */
    public void setNameDialingName(NameDialingName value) {
        this.nameDialingName = value;
    }

}
