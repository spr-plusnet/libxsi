//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo">
 *       &lt;sequence>
 *         &lt;element name="defaultForwardToPhoneNumber" type="{http://schema.broadsoft.com/xsi}OutgoingDNorSIPURI" minOccurs="0"/>
 *         &lt;element name="playRingReminder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="criteriaActivations" type="{http://schema.broadsoft.com/xsi}CriteriaActivationList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "defaultForwardToPhoneNumber",
    "playRingReminder",
    "criteriaActivations"
})
@XmlRootElement(name = "CallForwardingSelective")
public class CallForwardingSelective
    extends ActivatableServiceInfo
{

    @XmlElementRef(name = "defaultForwardToPhoneNumber", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> defaultForwardToPhoneNumber;
    protected Boolean playRingReminder;
    protected CriteriaActivationList criteriaActivations;

    /**
     * Ruft den Wert der defaultForwardToPhoneNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDefaultForwardToPhoneNumber() {
        return defaultForwardToPhoneNumber;
    }

    /**
     * Legt den Wert der defaultForwardToPhoneNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDefaultForwardToPhoneNumber(JAXBElement<String> value) {
        this.defaultForwardToPhoneNumber = value;
    }

    /**
     * Ruft den Wert der playRingReminder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlayRingReminder() {
        return playRingReminder;
    }

    /**
     * Legt den Wert der playRingReminder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlayRingReminder(Boolean value) {
        this.playRingReminder = value;
    }

    /**
     * Ruft den Wert der criteriaActivations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CriteriaActivationList }
     *     
     */
    public CriteriaActivationList getCriteriaActivations() {
        return criteriaActivations;
    }

    /**
     * Legt den Wert der criteriaActivations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CriteriaActivationList }
     *     
     */
    public void setCriteriaActivations(CriteriaActivationList value) {
        this.criteriaActivations = value;
    }

}
