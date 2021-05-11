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
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="defaultForwardToPhoneNumber" type="{http://schema.broadsoft.com/xsi}OutgoingDNorSIPURI" minOccurs="0"/&gt;
 *         &lt;element name="playRingReminder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="criteriaActivations" type="{http://schema.broadsoft.com/xsi}CriteriaActivationList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
