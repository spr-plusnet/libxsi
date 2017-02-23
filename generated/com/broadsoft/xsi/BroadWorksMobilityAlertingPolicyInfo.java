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


/**
 * 
 *         BroadWorks Mobility selection for phones to ring for an identity.
 *         These settings define the list of devices that are alerted when the
 *         call is made to that identity.
 *         If the devicesToRing is set to Mobile or Both, all the mobile numbers
 *         in
 *         mobileNumbersAlertList elements are also alerted.
 *         if the devicesToRing is set as Fixed or both, all fixed locations
 *         are alerted.
 *         Optionally other locations such as SCAs, BA and executive assistant
 *         locations can be selected.
 *         If the device to ring is set as Mobile, the mobile alert should not be
 *         cleared out.
 *         Change History:
 *         R21 - Added
 *       
 * 
 * <p>Java-Klasse für BroadWorksMobilityAlertingPolicyInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BroadWorksMobilityAlertingPolicyInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="devicesToRing" type="{http://schema.broadsoft.com/xsi}BroadWorksMobilityPhoneToRingSelection" minOccurs="0"/>
 *         &lt;element name="includeSharedCallAppearance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="includeBroadWorksAnywhere" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="includeExecutiveAssistant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="mobileNumbersAlertList" type="{http://schema.broadsoft.com/xsi}BroadWorksMobilityMobileNumbersAlertList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BroadWorksMobilityAlertingPolicyInfo", propOrder = {
    "devicesToRing",
    "includeSharedCallAppearance",
    "includeBroadWorksAnywhere",
    "includeExecutiveAssistant",
    "mobileNumbersAlertList"
})
public class BroadWorksMobilityAlertingPolicyInfo {

    @XmlSchemaType(name = "token")
    protected BroadWorksMobilityPhoneToRingSelection devicesToRing;
    protected Boolean includeSharedCallAppearance;
    protected Boolean includeBroadWorksAnywhere;
    protected Boolean includeExecutiveAssistant;
    @XmlElementRef(name = "mobileNumbersAlertList", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<BroadWorksMobilityMobileNumbersAlertList> mobileNumbersAlertList;

    /**
     * Ruft den Wert der devicesToRing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BroadWorksMobilityPhoneToRingSelection }
     *     
     */
    public BroadWorksMobilityPhoneToRingSelection getDevicesToRing() {
        return devicesToRing;
    }

    /**
     * Legt den Wert der devicesToRing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BroadWorksMobilityPhoneToRingSelection }
     *     
     */
    public void setDevicesToRing(BroadWorksMobilityPhoneToRingSelection value) {
        this.devicesToRing = value;
    }

    /**
     * Ruft den Wert der includeSharedCallAppearance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSharedCallAppearance() {
        return includeSharedCallAppearance;
    }

    /**
     * Legt den Wert der includeSharedCallAppearance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSharedCallAppearance(Boolean value) {
        this.includeSharedCallAppearance = value;
    }

    /**
     * Ruft den Wert der includeBroadWorksAnywhere-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeBroadWorksAnywhere() {
        return includeBroadWorksAnywhere;
    }

    /**
     * Legt den Wert der includeBroadWorksAnywhere-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeBroadWorksAnywhere(Boolean value) {
        this.includeBroadWorksAnywhere = value;
    }

    /**
     * Ruft den Wert der includeExecutiveAssistant-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeExecutiveAssistant() {
        return includeExecutiveAssistant;
    }

    /**
     * Legt den Wert der includeExecutiveAssistant-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeExecutiveAssistant(Boolean value) {
        this.includeExecutiveAssistant = value;
    }

    /**
     * Ruft den Wert der mobileNumbersAlertList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BroadWorksMobilityMobileNumbersAlertList }{@code >}
     *     
     */
    public JAXBElement<BroadWorksMobilityMobileNumbersAlertList> getMobileNumbersAlertList() {
        return mobileNumbersAlertList;
    }

    /**
     * Legt den Wert der mobileNumbersAlertList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BroadWorksMobilityMobileNumbersAlertList }{@code >}
     *     
     */
    public void setMobileNumbersAlertList(JAXBElement<BroadWorksMobilityMobileNumbersAlertList> value) {
        this.mobileNumbersAlertList = value;
    }

}
