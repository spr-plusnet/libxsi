//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         Get the alerting setting of an executive.
 *         Change History:
 *         R20.0 – Added.
 *       
 * 
 * <p>Java-Klasse für ExecutiveAlerting complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ExecutiveAlerting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alertingMode" type="{http://schema.broadsoft.com/xsi}ExecutiveAlertingMode" minOccurs="0"/>
 *         &lt;element name="alertingCallingLineIdNameMode" type="{http://schema.broadsoft.com/xsi}ExecutiveAlertingCallingLineIdNameMode" minOccurs="0"/>
 *         &lt;element name="alertingCustomCallingLineIdName" type="{http://schema.broadsoft.com/xsi}ExecutiveAlertingCustomCallingLineIdName" minOccurs="0"/>
 *         &lt;element name="unicodeAlertingCustomCallingLineIdName" type="{http://schema.broadsoft.com/xsi}ExecutiveAlertingCustomCallingLineIdName" minOccurs="0"/>
 *         &lt;element name="alertingCallingLineIdPhoneNumberMode" type="{http://schema.broadsoft.com/xsi}ExecutiveAlertingCallingLineIdPhoneNumberMode" minOccurs="0"/>
 *         &lt;element name="alertingCustomCallingLineIdPhoneNumber" type="{http://schema.broadsoft.com/xsi}DN" minOccurs="0"/>
 *         &lt;element name="callPushRecallNumberOfRings" type="{http://schema.broadsoft.com/xsi}NumberOfRingsTwoToTwenty" minOccurs="0"/>
 *         &lt;element name="nextAssistantNumberOfRings" type="{http://schema.broadsoft.com/xsi}NumberOfRingsTwoToTwenty" minOccurs="0"/>
 *         &lt;element name="enableRollover" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rolloverWaitTimeSeconds" type="{http://schema.broadsoft.com/xsi}ExecutiveRolloverWaitTimeSeconds" minOccurs="0"/>
 *         &lt;element name="rolloverAction" type="{http://schema.broadsoft.com/xsi}ExecutiveRolloverActionType" minOccurs="0"/>
 *         &lt;element name="rolloverForwardToPhoneNumber" type="{http://schema.broadsoft.com/xsi}OutgoingDNorSIPURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecutiveAlerting", propOrder = {
    "alertingMode",
    "alertingCallingLineIdNameMode",
    "alertingCustomCallingLineIdName",
    "unicodeAlertingCustomCallingLineIdName",
    "alertingCallingLineIdPhoneNumberMode",
    "alertingCustomCallingLineIdPhoneNumber",
    "callPushRecallNumberOfRings",
    "nextAssistantNumberOfRings",
    "enableRollover",
    "rolloverWaitTimeSeconds",
    "rolloverAction",
    "rolloverForwardToPhoneNumber"
})
public class ExecutiveAlerting {

    @XmlSchemaType(name = "token")
    protected ExecutiveAlertingMode alertingMode;
    @XmlSchemaType(name = "token")
    protected ExecutiveAlertingCallingLineIdNameMode alertingCallingLineIdNameMode;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String alertingCustomCallingLineIdName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String unicodeAlertingCustomCallingLineIdName;
    @XmlSchemaType(name = "token")
    protected ExecutiveAlertingCallingLineIdPhoneNumberMode alertingCallingLineIdPhoneNumberMode;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String alertingCustomCallingLineIdPhoneNumber;
    protected Integer callPushRecallNumberOfRings;
    protected Integer nextAssistantNumberOfRings;
    protected Boolean enableRollover;
    protected Integer rolloverWaitTimeSeconds;
    @XmlSchemaType(name = "token")
    protected ExecutiveRolloverActionType rolloverAction;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String rolloverForwardToPhoneNumber;

    /**
     * Ruft den Wert der alertingMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExecutiveAlertingMode }
     *     
     */
    public ExecutiveAlertingMode getAlertingMode() {
        return alertingMode;
    }

    /**
     * Legt den Wert der alertingMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutiveAlertingMode }
     *     
     */
    public void setAlertingMode(ExecutiveAlertingMode value) {
        this.alertingMode = value;
    }

    /**
     * Ruft den Wert der alertingCallingLineIdNameMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExecutiveAlertingCallingLineIdNameMode }
     *     
     */
    public ExecutiveAlertingCallingLineIdNameMode getAlertingCallingLineIdNameMode() {
        return alertingCallingLineIdNameMode;
    }

    /**
     * Legt den Wert der alertingCallingLineIdNameMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutiveAlertingCallingLineIdNameMode }
     *     
     */
    public void setAlertingCallingLineIdNameMode(ExecutiveAlertingCallingLineIdNameMode value) {
        this.alertingCallingLineIdNameMode = value;
    }

    /**
     * Ruft den Wert der alertingCustomCallingLineIdName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertingCustomCallingLineIdName() {
        return alertingCustomCallingLineIdName;
    }

    /**
     * Legt den Wert der alertingCustomCallingLineIdName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertingCustomCallingLineIdName(String value) {
        this.alertingCustomCallingLineIdName = value;
    }

    /**
     * Ruft den Wert der unicodeAlertingCustomCallingLineIdName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnicodeAlertingCustomCallingLineIdName() {
        return unicodeAlertingCustomCallingLineIdName;
    }

    /**
     * Legt den Wert der unicodeAlertingCustomCallingLineIdName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnicodeAlertingCustomCallingLineIdName(String value) {
        this.unicodeAlertingCustomCallingLineIdName = value;
    }

    /**
     * Ruft den Wert der alertingCallingLineIdPhoneNumberMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExecutiveAlertingCallingLineIdPhoneNumberMode }
     *     
     */
    public ExecutiveAlertingCallingLineIdPhoneNumberMode getAlertingCallingLineIdPhoneNumberMode() {
        return alertingCallingLineIdPhoneNumberMode;
    }

    /**
     * Legt den Wert der alertingCallingLineIdPhoneNumberMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutiveAlertingCallingLineIdPhoneNumberMode }
     *     
     */
    public void setAlertingCallingLineIdPhoneNumberMode(ExecutiveAlertingCallingLineIdPhoneNumberMode value) {
        this.alertingCallingLineIdPhoneNumberMode = value;
    }

    /**
     * Ruft den Wert der alertingCustomCallingLineIdPhoneNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertingCustomCallingLineIdPhoneNumber() {
        return alertingCustomCallingLineIdPhoneNumber;
    }

    /**
     * Legt den Wert der alertingCustomCallingLineIdPhoneNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertingCustomCallingLineIdPhoneNumber(String value) {
        this.alertingCustomCallingLineIdPhoneNumber = value;
    }

    /**
     * Ruft den Wert der callPushRecallNumberOfRings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCallPushRecallNumberOfRings() {
        return callPushRecallNumberOfRings;
    }

    /**
     * Legt den Wert der callPushRecallNumberOfRings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCallPushRecallNumberOfRings(Integer value) {
        this.callPushRecallNumberOfRings = value;
    }

    /**
     * Ruft den Wert der nextAssistantNumberOfRings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNextAssistantNumberOfRings() {
        return nextAssistantNumberOfRings;
    }

    /**
     * Legt den Wert der nextAssistantNumberOfRings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNextAssistantNumberOfRings(Integer value) {
        this.nextAssistantNumberOfRings = value;
    }

    /**
     * Ruft den Wert der enableRollover-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableRollover() {
        return enableRollover;
    }

    /**
     * Legt den Wert der enableRollover-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableRollover(Boolean value) {
        this.enableRollover = value;
    }

    /**
     * Ruft den Wert der rolloverWaitTimeSeconds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRolloverWaitTimeSeconds() {
        return rolloverWaitTimeSeconds;
    }

    /**
     * Legt den Wert der rolloverWaitTimeSeconds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRolloverWaitTimeSeconds(Integer value) {
        this.rolloverWaitTimeSeconds = value;
    }

    /**
     * Ruft den Wert der rolloverAction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExecutiveRolloverActionType }
     *     
     */
    public ExecutiveRolloverActionType getRolloverAction() {
        return rolloverAction;
    }

    /**
     * Legt den Wert der rolloverAction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutiveRolloverActionType }
     *     
     */
    public void setRolloverAction(ExecutiveRolloverActionType value) {
        this.rolloverAction = value;
    }

    /**
     * Ruft den Wert der rolloverForwardToPhoneNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRolloverForwardToPhoneNumber() {
        return rolloverForwardToPhoneNumber;
    }

    /**
     * Legt den Wert der rolloverForwardToPhoneNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRolloverForwardToPhoneNumber(String value) {
        this.rolloverForwardToPhoneNumber = value;
    }

}
