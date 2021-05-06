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
 *         Contains the CommPilot Express service configuration data.
 *       
 * 
 * <p>Java-Klasse für CommPilotExpress complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CommPilotExpress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="profile" type="{http://schema.broadsoft.com/xsi}CommPilotExpressProfile" minOccurs="0"/&gt;
 *         &lt;element name="availableInOffice" type="{http://schema.broadsoft.com/xsi}CommPilotExpressAvailableInOffice" minOccurs="0"/&gt;
 *         &lt;element name="availableOutOfOffice" type="{http://schema.broadsoft.com/xsi}CommPilotExpressAvailableOutOfOffice" minOccurs="0"/&gt;
 *         &lt;element name="busy" type="{http://schema.broadsoft.com/xsi}CommPilotExpressBusy" minOccurs="0"/&gt;
 *         &lt;element name="unavailable" type="{http://schema.broadsoft.com/xsi}CommPilotExpressUnavailable" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
