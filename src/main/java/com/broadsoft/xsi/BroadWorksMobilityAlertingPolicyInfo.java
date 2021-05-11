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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="BroadWorksMobilityAlertingPolicyInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="devicesToRing" type="{http://schema.broadsoft.com/xsi}BroadWorksMobilityPhoneToRingSelection" minOccurs="0"/&gt;
 *         &lt;element name="includeSharedCallAppearance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="includeBroadWorksAnywhere" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="includeExecutiveAssistant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="mobileNumbersAlertList" type="{http://schema.broadsoft.com/xsi}BroadWorksMobilityMobileNumbersAlertList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
