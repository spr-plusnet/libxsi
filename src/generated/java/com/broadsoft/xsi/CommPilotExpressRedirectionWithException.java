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
 *         CommPilot Express type to transfer to voice mail or forward to a
 *         number with certain exceptions.
 *         
 *         Change History:
 *         R19.0 - excludedAddress1, excludedAddress2, excludedAddress3 and 
 *                 forwardToAddress elements made nillable.
 *       
 * 
 * <p>Java-Klasse für CommPilotExpressRedirectionWithException complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CommPilotExpressRedirectionWithException"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sendCallsToVoiceMailExceptExcludedAddresses" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="excludedAddress1" type="{http://schema.broadsoft.com/xsi}Address" minOccurs="0"/&gt;
 *         &lt;element name="excludedAddress2" type="{http://schema.broadsoft.com/xsi}Address" minOccurs="0"/&gt;
 *         &lt;element name="excludedAddress3" type="{http://schema.broadsoft.com/xsi}Address" minOccurs="0"/&gt;
 *         &lt;element name="forwardToAddress" type="{http://schema.broadsoft.com/xsi}Address" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommPilotExpressRedirectionWithException", propOrder = {
    "sendCallsToVoiceMailExceptExcludedAddresses",
    "excludedAddress1",
    "excludedAddress2",
    "excludedAddress3",
    "forwardToAddress"
})
public class CommPilotExpressRedirectionWithException {

    protected Boolean sendCallsToVoiceMailExceptExcludedAddresses;
    @XmlElementRef(name = "excludedAddress1", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<Address> excludedAddress1;
    @XmlElementRef(name = "excludedAddress2", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<Address> excludedAddress2;
    @XmlElementRef(name = "excludedAddress3", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<Address> excludedAddress3;
    @XmlElementRef(name = "forwardToAddress", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<Address> forwardToAddress;

    /**
     * Ruft den Wert der sendCallsToVoiceMailExceptExcludedAddresses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendCallsToVoiceMailExceptExcludedAddresses() {
        return sendCallsToVoiceMailExceptExcludedAddresses;
    }

    /**
     * Legt den Wert der sendCallsToVoiceMailExceptExcludedAddresses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendCallsToVoiceMailExceptExcludedAddresses(Boolean value) {
        this.sendCallsToVoiceMailExceptExcludedAddresses = value;
    }

    /**
     * Ruft den Wert der excludedAddress1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public JAXBElement<Address> getExcludedAddress1() {
        return excludedAddress1;
    }

    /**
     * Legt den Wert der excludedAddress1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public void setExcludedAddress1(JAXBElement<Address> value) {
        this.excludedAddress1 = value;
    }

    /**
     * Ruft den Wert der excludedAddress2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public JAXBElement<Address> getExcludedAddress2() {
        return excludedAddress2;
    }

    /**
     * Legt den Wert der excludedAddress2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public void setExcludedAddress2(JAXBElement<Address> value) {
        this.excludedAddress2 = value;
    }

    /**
     * Ruft den Wert der excludedAddress3-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public JAXBElement<Address> getExcludedAddress3() {
        return excludedAddress3;
    }

    /**
     * Legt den Wert der excludedAddress3-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public void setExcludedAddress3(JAXBElement<Address> value) {
        this.excludedAddress3 = value;
    }

    /**
     * Ruft den Wert der forwardToAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public JAXBElement<Address> getForwardToAddress() {
        return forwardToAddress;
    }

    /**
     * Legt den Wert der forwardToAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public void setForwardToAddress(JAXBElement<Address> value) {
        this.forwardToAddress = value;
    }

}
