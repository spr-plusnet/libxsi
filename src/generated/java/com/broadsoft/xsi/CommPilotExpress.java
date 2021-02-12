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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Contains the CommPilot Express service configuration data.
 *       
 * 
 * <p>Java-Klasse für CommPilotExpress complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CommPilotExpress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="profile" type="{http://schema.broadsoft.com/xsi}CommPilotExpressProfile" minOccurs="0"/>
 *         &lt;element name="availableInOffice" type="{http://schema.broadsoft.com/xsi}CommPilotExpressAvailableInOffice" minOccurs="0"/>
 *         &lt;element name="availableOutOfOffice" type="{http://schema.broadsoft.com/xsi}CommPilotExpressAvailableOutOfOffice" minOccurs="0"/>
 *         &lt;element name="busy" type="{http://schema.broadsoft.com/xsi}CommPilotExpressBusy" minOccurs="0"/>
 *         &lt;element name="unavailable" type="{http://schema.broadsoft.com/xsi}CommPilotExpressUnavailable" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommPilotExpress", propOrder = {
    "profile",
    "availableInOffice",
    "availableOutOfOffice",
    "busy",
    "unavailable"
})
public class CommPilotExpress {

    @XmlElementRef(name = "profile", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<CommPilotExpressProfile> profile;
    protected CommPilotExpressAvailableInOffice availableInOffice;
    protected CommPilotExpressAvailableOutOfOffice availableOutOfOffice;
    protected CommPilotExpressBusy busy;
    protected CommPilotExpressUnavailable unavailable;

    /**
     * Ruft den Wert der profile-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CommPilotExpressProfile }{@code >}
     *     
     */
    public JAXBElement<CommPilotExpressProfile> getProfile() {
        return profile;
    }

    /**
     * Legt den Wert der profile-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CommPilotExpressProfile }{@code >}
     *     
     */
    public void setProfile(JAXBElement<CommPilotExpressProfile> value) {
        this.profile = value;
    }

    /**
     * Ruft den Wert der availableInOffice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CommPilotExpressAvailableInOffice }
     *     
     */
    public CommPilotExpressAvailableInOffice getAvailableInOffice() {
        return availableInOffice;
    }

    /**
     * Legt den Wert der availableInOffice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CommPilotExpressAvailableInOffice }
     *     
     */
    public void setAvailableInOffice(CommPilotExpressAvailableInOffice value) {
        this.availableInOffice = value;
    }

    /**
     * Ruft den Wert der availableOutOfOffice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CommPilotExpressAvailableOutOfOffice }
     *     
     */
    public CommPilotExpressAvailableOutOfOffice getAvailableOutOfOffice() {
        return availableOutOfOffice;
    }

    /**
     * Legt den Wert der availableOutOfOffice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CommPilotExpressAvailableOutOfOffice }
     *     
     */
    public void setAvailableOutOfOffice(CommPilotExpressAvailableOutOfOffice value) {
        this.availableOutOfOffice = value;
    }

    /**
     * Ruft den Wert der busy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CommPilotExpressBusy }
     *     
     */
    public CommPilotExpressBusy getBusy() {
        return busy;
    }

    /**
     * Legt den Wert der busy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CommPilotExpressBusy }
     *     
     */
    public void setBusy(CommPilotExpressBusy value) {
        this.busy = value;
    }

    /**
     * Ruft den Wert der unavailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CommPilotExpressUnavailable }
     *     
     */
    public CommPilotExpressUnavailable getUnavailable() {
        return unavailable;
    }

    /**
     * Legt den Wert der unavailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CommPilotExpressUnavailable }
     *     
     */
    public void setUnavailable(CommPilotExpressUnavailable value) {
        this.unavailable = value;
    }

}
