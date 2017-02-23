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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mobileNumber" type="{http://schema.broadsoft.com/xsi}DN" minOccurs="0"/>
 *         &lt;element name="description" type="{http://schema.broadsoft.com/xsi}BroadWorksMobilityMobileIdentityDescription" minOccurs="0"/>
 *         &lt;element name="enableAlerting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="primary" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="alertAgentCalls" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="alertClickToDialCalls" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="alertGroupPagingCalls" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="useMobilityCallingLineID" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="useDiversionInhibitor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="answerConfirmationRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="broadworksCallControl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="mobileAlertingPolicy" type="{http://schema.broadsoft.com/xsi}BroadWorksMobilityAlertingPolicyInfo" minOccurs="0"/>
 *         &lt;element name="mobileCallAnchoringPolicy" type="{http://schema.broadsoft.com/xsi}BroadWorksMobilityCallAnchoringPolicy" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mobileNumber",
    "description",
    "enableAlerting",
    "primary",
    "alertAgentCalls",
    "alertClickToDialCalls",
    "alertGroupPagingCalls",
    "useMobilityCallingLineID",
    "useDiversionInhibitor",
    "answerConfirmationRequired",
    "broadworksCallControl",
    "mobileAlertingPolicy",
    "mobileCallAnchoringPolicy"
})
@XmlRootElement(name = "BroadWorksMobilityMobileIdentity")
public class BroadWorksMobilityMobileIdentity {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String mobileNumber;
    @XmlElementRef(name = "description", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    protected Boolean enableAlerting;
    protected Boolean primary;
    protected Boolean alertAgentCalls;
    protected Boolean alertClickToDialCalls;
    protected Boolean alertGroupPagingCalls;
    protected Boolean useMobilityCallingLineID;
    protected Boolean useDiversionInhibitor;
    protected Boolean answerConfirmationRequired;
    protected Boolean broadworksCallControl;
    protected BroadWorksMobilityAlertingPolicyInfo mobileAlertingPolicy;
    protected BroadWorksMobilityCallAnchoringPolicy mobileCallAnchoringPolicy;

    /**
     * Ruft den Wert der mobileNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Legt den Wert der mobileNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNumber(String value) {
        this.mobileNumber = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der enableAlerting-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableAlerting() {
        return enableAlerting;
    }

    /**
     * Legt den Wert der enableAlerting-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableAlerting(Boolean value) {
        this.enableAlerting = value;
    }

    /**
     * Ruft den Wert der primary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimary() {
        return primary;
    }

    /**
     * Legt den Wert der primary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimary(Boolean value) {
        this.primary = value;
    }

    /**
     * Ruft den Wert der alertAgentCalls-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlertAgentCalls() {
        return alertAgentCalls;
    }

    /**
     * Legt den Wert der alertAgentCalls-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlertAgentCalls(Boolean value) {
        this.alertAgentCalls = value;
    }

    /**
     * Ruft den Wert der alertClickToDialCalls-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlertClickToDialCalls() {
        return alertClickToDialCalls;
    }

    /**
     * Legt den Wert der alertClickToDialCalls-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlertClickToDialCalls(Boolean value) {
        this.alertClickToDialCalls = value;
    }

    /**
     * Ruft den Wert der alertGroupPagingCalls-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlertGroupPagingCalls() {
        return alertGroupPagingCalls;
    }

    /**
     * Legt den Wert der alertGroupPagingCalls-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlertGroupPagingCalls(Boolean value) {
        this.alertGroupPagingCalls = value;
    }

    /**
     * Ruft den Wert der useMobilityCallingLineID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseMobilityCallingLineID() {
        return useMobilityCallingLineID;
    }

    /**
     * Legt den Wert der useMobilityCallingLineID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseMobilityCallingLineID(Boolean value) {
        this.useMobilityCallingLineID = value;
    }

    /**
     * Ruft den Wert der useDiversionInhibitor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseDiversionInhibitor() {
        return useDiversionInhibitor;
    }

    /**
     * Legt den Wert der useDiversionInhibitor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseDiversionInhibitor(Boolean value) {
        this.useDiversionInhibitor = value;
    }

    /**
     * Ruft den Wert der answerConfirmationRequired-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnswerConfirmationRequired() {
        return answerConfirmationRequired;
    }

    /**
     * Legt den Wert der answerConfirmationRequired-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnswerConfirmationRequired(Boolean value) {
        this.answerConfirmationRequired = value;
    }

    /**
     * Ruft den Wert der broadworksCallControl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBroadworksCallControl() {
        return broadworksCallControl;
    }

    /**
     * Legt den Wert der broadworksCallControl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBroadworksCallControl(Boolean value) {
        this.broadworksCallControl = value;
    }

    /**
     * Ruft den Wert der mobileAlertingPolicy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BroadWorksMobilityAlertingPolicyInfo }
     *     
     */
    public BroadWorksMobilityAlertingPolicyInfo getMobileAlertingPolicy() {
        return mobileAlertingPolicy;
    }

    /**
     * Legt den Wert der mobileAlertingPolicy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BroadWorksMobilityAlertingPolicyInfo }
     *     
     */
    public void setMobileAlertingPolicy(BroadWorksMobilityAlertingPolicyInfo value) {
        this.mobileAlertingPolicy = value;
    }

    /**
     * Ruft den Wert der mobileCallAnchoringPolicy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BroadWorksMobilityCallAnchoringPolicy }
     *     
     */
    public BroadWorksMobilityCallAnchoringPolicy getMobileCallAnchoringPolicy() {
        return mobileCallAnchoringPolicy;
    }

    /**
     * Legt den Wert der mobileCallAnchoringPolicy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BroadWorksMobilityCallAnchoringPolicy }
     *     
     */
    public void setMobileCallAnchoringPolicy(BroadWorksMobilityCallAnchoringPolicy value) {
        this.mobileCallAnchoringPolicy = value;
    }

}
