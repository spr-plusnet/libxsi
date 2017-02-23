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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *         The user level data associated with the Personal
 *         Assistant service
 * 
 *         Change History:
 *         21.0 – Added.
 *       
 * 
 * <p>Java-Klasse für PersonalAssistant complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PersonalAssistant">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo">
 *       &lt;sequence>
 *         &lt;element name="presence" type="{http://schema.broadsoft.com/xsi}PersonalAssistantPresence" minOccurs="0"/>
 *         &lt;element name="enableExpirationTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="expirationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="enableTransferToAttendant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="attendantNumber" type="{http://schema.broadsoft.com/xsi}OutgoingDNorSIPURI" minOccurs="0"/>
 *         &lt;element name="ringSplash" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="callToNumberList" type="{http://schema.broadsoft.com/xsi}CallToNumberList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonalAssistant", propOrder = {
    "presence",
    "enableExpirationTime",
    "expirationTime",
    "enableTransferToAttendant",
    "attendantNumber",
    "ringSplash",
    "callToNumberList"
})
public class PersonalAssistant
    extends ActivatableServiceInfo
{

    @XmlSchemaType(name = "token")
    protected PersonalAssistantPresence presence;
    protected Boolean enableExpirationTime;
    @XmlElementRef(name = "expirationTime", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> expirationTime;
    protected Boolean enableTransferToAttendant;
    @XmlElementRef(name = "attendantNumber", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attendantNumber;
    protected Boolean ringSplash;
    @XmlElementRef(name = "callToNumberList", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<CallToNumberList> callToNumberList;

    /**
     * Ruft den Wert der presence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PersonalAssistantPresence }
     *     
     */
    public PersonalAssistantPresence getPresence() {
        return presence;
    }

    /**
     * Legt den Wert der presence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalAssistantPresence }
     *     
     */
    public void setPresence(PersonalAssistantPresence value) {
        this.presence = value;
    }

    /**
     * Ruft den Wert der enableExpirationTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableExpirationTime() {
        return enableExpirationTime;
    }

    /**
     * Legt den Wert der enableExpirationTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableExpirationTime(Boolean value) {
        this.enableExpirationTime = value;
    }

    /**
     * Ruft den Wert der expirationTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExpirationTime() {
        return expirationTime;
    }

    /**
     * Legt den Wert der expirationTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExpirationTime(JAXBElement<XMLGregorianCalendar> value) {
        this.expirationTime = value;
    }

    /**
     * Ruft den Wert der enableTransferToAttendant-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableTransferToAttendant() {
        return enableTransferToAttendant;
    }

    /**
     * Legt den Wert der enableTransferToAttendant-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableTransferToAttendant(Boolean value) {
        this.enableTransferToAttendant = value;
    }

    /**
     * Ruft den Wert der attendantNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttendantNumber() {
        return attendantNumber;
    }

    /**
     * Legt den Wert der attendantNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttendantNumber(JAXBElement<String> value) {
        this.attendantNumber = value;
    }

    /**
     * Ruft den Wert der ringSplash-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRingSplash() {
        return ringSplash;
    }

    /**
     * Legt den Wert der ringSplash-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRingSplash(Boolean value) {
        this.ringSplash = value;
    }

    /**
     * Ruft den Wert der callToNumberList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CallToNumberList }{@code >}
     *     
     */
    public JAXBElement<CallToNumberList> getCallToNumberList() {
        return callToNumberList;
    }

    /**
     * Legt den Wert der callToNumberList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CallToNumberList }{@code >}
     *     
     */
    public void setCallToNumberList(JAXBElement<CallToNumberList> value) {
        this.callToNumberList = value;
    }

}
