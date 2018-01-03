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
import javax.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="CommPilotExpressAvailableInOffice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionalPhoneNumberToRing" type="{http://schema.broadsoft.com/xsi}Address" minOccurs="0"/>
 *         &lt;element name="busySetting" type="{http://schema.broadsoft.com/xsi}CommPilotExpressRedirection" minOccurs="0"/>
 *         &lt;element name="noAnswerSetting" type="{http://schema.broadsoft.com/xsi}CommPilotExpressRedirection" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
