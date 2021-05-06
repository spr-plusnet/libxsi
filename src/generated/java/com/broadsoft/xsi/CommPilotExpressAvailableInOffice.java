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
 *         CommPilot Express Available In Office Settings.
 *         
 *         Change History:
 *         R19.0 - additionalPhoneNumberToRing element made nillable.       
 *       
 * 
 * <p>Java-Klasse für CommPilotExpressAvailableInOffice complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CommPilotExpressAvailableInOffice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="additionalPhoneNumberToRing" type="{http://schema.broadsoft.com/xsi}Address" minOccurs="0"/&gt;
 *         &lt;element name="busySetting" type="{http://schema.broadsoft.com/xsi}CommPilotExpressRedirection" minOccurs="0"/&gt;
 *         &lt;element name="noAnswerSetting" type="{http://schema.broadsoft.com/xsi}CommPilotExpressRedirection" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommPilotExpressAvailableInOffice", propOrder = {
    "additionalPhoneNumberToRing",
    "busySetting",
    "noAnswerSetting"
})
public class CommPilotExpressAvailableInOffice {

    @XmlElementRef(name = "additionalPhoneNumberToRing", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<Address> additionalPhoneNumberToRing;
    protected CommPilotExpressRedirection busySetting;
    protected CommPilotExpressRedirection noAnswerSetting;

    /**
     * Ruft den Wert der additionalPhoneNumberToRing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public JAXBElement<Address> getAdditionalPhoneNumberToRing() {
        return additionalPhoneNumberToRing;
    }

    /**
     * Legt den Wert der additionalPhoneNumberToRing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public void setAdditionalPhoneNumberToRing(JAXBElement<Address> value) {
        this.additionalPhoneNumberToRing = value;
    }

    /**
     * Ruft den Wert der busySetting-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CommPilotExpressRedirection }
     *     
     */
    public CommPilotExpressRedirection getBusySetting() {
        return busySetting;
    }

    /**
     * Legt den Wert der busySetting-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CommPilotExpressRedirection }
     *     
     */
    public void setBusySetting(CommPilotExpressRedirection value) {
        this.busySetting = value;
    }

    /**
     * Ruft den Wert der noAnswerSetting-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CommPilotExpressRedirection }
     *     
     */
    public CommPilotExpressRedirection getNoAnswerSetting() {
        return noAnswerSetting;
    }

    /**
     * Legt den Wert der noAnswerSetting-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CommPilotExpressRedirection }
     *     
     */
    public void setNoAnswerSetting(CommPilotExpressRedirection value) {
        this.noAnswerSetting = value;
    }

}
