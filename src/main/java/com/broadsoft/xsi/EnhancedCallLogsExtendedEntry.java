//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         Enhanced Call Log extended entry describing a placed, received, 
 *         or missed call.
 *         Following elements(fields) are provided in the entry 
 *         depending on the call log entry type.
 * 
 *         Change History:
 *         R17.sp4 - Added
 *                 - Modified: "callAuthorizationCode" element added
 *         R20.0   - Modified: "securityClassification" element added                
 *       
 * 
 * <p>Java-Klasse für EnhancedCallLogsExtendedEntry complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EnhancedCallLogsExtendedEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="countryCode" type="{http://schema.broadsoft.com/xsi}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="callLogId" type="{http://schema.broadsoft.com/xsi}CallLogId"/&gt;
 *         &lt;element name="callId" type="{http://schema.broadsoft.com/xsi}CallId"/&gt;
 *         &lt;element name="subscriberType" type="{http://schema.broadsoft.com/xsi}EnhancedCallLogsSubscriberType"/&gt;
 *         &lt;element name="dialedNumber" type="{http://schema.broadsoft.com/xsi}OutgoingDNorSIPURI" minOccurs="0"/&gt;
 *         &lt;element name="calledNumber" type="{http://schema.broadsoft.com/xsi}OutgoingDNorSIPURI" minOccurs="0"/&gt;
 *         &lt;element name="networkTranslatedAddress" type="{http://schema.broadsoft.com/xsi}OutgoingDNorSIPURI" minOccurs="0"/&gt;
 *         &lt;element name="callingAssertedNumber" type="{http://schema.broadsoft.com/xsi}OutgoingDNorSIPURI" minOccurs="0"/&gt;
 *         &lt;element name="callingPresentationNumber" type="{http://schema.broadsoft.com/xsi}OutgoingDNorSIPURI" minOccurs="0"/&gt;
 *         &lt;element name="callingPresentationNumberSource" type="{http://schema.broadsoft.com/xsi}CallingPresentationNumberSource" minOccurs="0"/&gt;
 *         &lt;element name="callingPresentationName" type="{http://schema.broadsoft.com/xsi}CallLogsEntryName" minOccurs="0"/&gt;
 *         &lt;element name="callingPresentationIndicator" type="{http://schema.broadsoft.com/xsi}PresentationIndicator"/&gt;
 *         &lt;element name="callingGroupId" type="{http://schema.broadsoft.com/xsi}GroupId" minOccurs="0"/&gt;
 *         &lt;element name="calledDirectoryName" type="{http://schema.broadsoft.com/xsi}CallLogsEntryName" minOccurs="0"/&gt;
 *         &lt;element name="calledGroupId" type="{http://schema.broadsoft.com/xsi}GroupId" minOccurs="0"/&gt;
 *         &lt;element name="connectedNumber" type="{http://schema.broadsoft.com/xsi}OutgoingDNorSIPURI" minOccurs="0"/&gt;
 *         &lt;element name="connectedNumberSource" type="{http://schema.broadsoft.com/xsi}ConnectedNumberSource" minOccurs="0"/&gt;
 *         &lt;element name="connectedName" type="{http://schema.broadsoft.com/xsi}CallLogsEntryName" minOccurs="0"/&gt;
 *         &lt;element name="connectedPresentationIndicator" type="{http://schema.broadsoft.com/xsi}PresentationIndicator" minOccurs="0"/&gt;
 *         &lt;element name="connectedGroupId" type="{http://schema.broadsoft.com/xsi}GroupId" minOccurs="0"/&gt;
 *         &lt;element name="typeOfNetwork" type="{http://schema.broadsoft.com/xsi}NetworkType" minOccurs="0"/&gt;
 *         &lt;element name="callCategory" type="{http://schema.broadsoft.com/xsi}CallCategory" minOccurs="0"/&gt;
 *         &lt;element name="basicCallType" type="{http://schema.broadsoft.com/xsi}BasicCallType"/&gt;
 *         &lt;element name="configurableCallType" type="{http://schema.broadsoft.com/xsi}CommunicationBarringCallType" minOccurs="0"/&gt;
 *         &lt;element name="alternateCallIndicator" type="{http://schema.broadsoft.com/xsi}CommunicationBarringAlternateCallIndicator" minOccurs="0"/&gt;
 *         &lt;element name="virtualOnNetCallType" type="{http://schema.broadsoft.com/xsi}VirtualOnNetCallTypeName" minOccurs="0"/&gt;
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="startTime" type="{http://schema.broadsoft.com/xsi}Timestamp"/&gt;
 *         &lt;element name="answerTime" type="{http://schema.broadsoft.com/xsi}Timestamp" minOccurs="0"/&gt;
 *         &lt;element name="releaseTime" type="{http://schema.broadsoft.com/xsi}Timestamp" minOccurs="0"/&gt;
 *         &lt;element name="detachedTime" type="{http://schema.broadsoft.com/xsi}Timestamp" minOccurs="0"/&gt;
 *         &lt;element name="detachedAnswerTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="outgoingDnis" type="{http://schema.broadsoft.com/xsi}EnhancedCallLogsOutgoingDnis" minOccurs="0"/&gt;
 *         &lt;element name="serviceInvocationDisposition" type="{http://schema.broadsoft.com/xsi}ServiceInvocationDisposition" minOccurs="0"/&gt;
 *         &lt;element name="serviceInvocationDialedNumber" type="{http://schema.broadsoft.com/xsi}OutgoingDNorSIPURI" minOccurs="0"/&gt;
 *         &lt;element name="serviceInvocationCalledNumber" type="{http://schema.broadsoft.com/xsi}OutgoingDNorSIPURI" minOccurs="0"/&gt;
 *         &lt;element name="serviceInvocationNetworkTranslatedAddress" type="{http://schema.broadsoft.com/xsi}OutgoingDNorSIPURI" minOccurs="0"/&gt;
 *         &lt;element name="serviceInvocationTypeOfNetwork" type="{http://schema.broadsoft.com/xsi}NetworkType" minOccurs="0"/&gt;
 *         &lt;element name="serviceInvocationCallCategory" type="{http://schema.broadsoft.com/xsi}CallCategory" minOccurs="0"/&gt;
 *         &lt;element name="serviceInvocationBasicCallType" type="{http://schema.broadsoft.com/xsi}ServiceInvocationBasicCallType" minOccurs="0"/&gt;
 *         &lt;element name="serviceInvocationConfigurableCallType" type="{http://schema.broadsoft.com/xsi}CommunicationBarringCallType" minOccurs="0"/&gt;
 *         &lt;element name="serviceInvocationAlternateCallIndicator" type="{http://schema.broadsoft.com/xsi}CommunicationBarringAlternateCallIndicator" minOccurs="0"/&gt;
 *         &lt;element name="serviceInvocationVirtualOnNetCallType" type="{http://schema.broadsoft.com/xsi}VirtualOnNetCallTypeName" minOccurs="0"/&gt;
 *         &lt;element name="serviceInvocationCalledDirectoryName" type="{http://schema.broadsoft.com/xsi}CallLogsEntryName" minOccurs="0"/&gt;
 *         &lt;element name="serviceInvocationCalledGroupId" type="{http://schema.broadsoft.com/xsi}GroupId" minOccurs="0"/&gt;
 *         &lt;element name="redirectingNumber" type="{http://schema.broadsoft.com/xsi}OutgoingDNorSIPURI" minOccurs="0"/&gt;
 *         &lt;element name="redirectingName" type="{http://schema.broadsoft.com/xsi}CallLogsEntryName" minOccurs="0"/&gt;
 *         &lt;element name="redirectingPresentationIndicator" type="{http://schema.broadsoft.com/xsi}RedirectingPresentationIndicator" minOccurs="0"/&gt;
 *         &lt;element name="redirectingReason" type="{http://schema.broadsoft.com/xsi}RedirectingReason" minOccurs="0"/&gt;
 *         &lt;element name="accountAuthorizationCode" type="{http://schema.broadsoft.com/xsi}OutgoingCallingPlanAuthorizationCode" minOccurs="0"/&gt;
 *         &lt;element name="callAuthorizationCode" type="{http://schema.broadsoft.com/xsi}OutgoingCallingPlanAuthorizationCode" minOccurs="0"/&gt;
 *         &lt;element name="securityClassification" type="{http://schema.broadsoft.com/xsi}NonEmptyToken" minOccurs="0"/&gt;
 *         &lt;element name="directRouteNumber" type="{http://schema.broadsoft.com/xsi}OutgoingDNorSIPURI" minOccurs="0"/&gt;
 *         &lt;element name="routeListNumber" type="{http://schema.broadsoft.com/xsi}DN" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnhancedCallLogsExtendedEntry", propOrder = {
    "countryCode",
    "callLogId",
    "callId",
    "subscriberType",
    "dialedNumber",
    "calledNumber",
    "networkTranslatedAddress",
    "callingAssertedNumber",
    "callingPresentationNumber",
    "callingPresentationNumberSource",
    "callingPresentationName",
    "callingPresentationIndicator",
    "callingGroupId",
    "calledDirectoryName",
    "calledGroupId",
    "connectedNumber",
    "connectedNumberSource",
    "connectedName",
    "connectedPresentationIndicator",
    "connectedGroupId",
    "typeOfNetwork",
    "callCategory",
    "basicCallType",
    "configurableCallType",
    "alternateCallIndicator",
    "virtualOnNetCallType",
    "time",
    "startTime",
    "answerTime",
    "releaseTime",
    "detachedTime",
    "detachedAnswerTime",
    "outgoingDnis",
    "serviceInvocationDisposition",
    "serviceInvocationDialedNumber",
    "serviceInvocationCalledNumber",
    "serviceInvocationNetworkTranslatedAddress",
    "serviceInvocationTypeOfNetwork",
    "serviceInvocationCallCategory",
    "serviceInvocationBasicCallType",
    "serviceInvocationConfigurableCallType",
    "serviceInvocationAlternateCallIndicator",
    "serviceInvocationVirtualOnNetCallType",
    "serviceInvocationCalledDirectoryName",
    "serviceInvocationCalledGroupId",
    "redirectingNumber",
    "redirectingName",
    "redirectingPresentationIndicator",
    "redirectingReason",
    "accountAuthorizationCode",
    "callAuthorizationCode",
    "securityClassification",
    "directRouteNumber",
    "routeListNumber"
})
public class EnhancedCallLogsExtendedEntry {

    protected Integer countryCode;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String callLogId;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String callId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected EnhancedCallLogsSubscriberType subscriberType;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String dialedNumber;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String calledNumber;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String networkTranslatedAddress;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String callingAssertedNumber;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String callingPresentationNumber;
    @XmlSchemaType(name = "token")
    protected CallingPresentationNumberSource callingPresentationNumberSource;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String callingPresentationName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected PresentationIndicator callingPresentationIndicator;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String callingGroupId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String calledDirectoryName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String calledGroupId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String connectedNumber;
    @XmlSchemaType(name = "token")
    protected ConnectedNumberSource connectedNumberSource;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String connectedName;
    @XmlSchemaType(name = "token")
    protected PresentationIndicator connectedPresentationIndicator;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String connectedGroupId;
    @XmlSchemaType(name = "token")
    protected NetworkType typeOfNetwork;
    @XmlSchemaType(name = "token")
    protected CallCategory callCategory;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected BasicCallType basicCallType;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String configurableCallType;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String alternateCallIndicator;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String virtualOnNetCallType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar time;
    protected long startTime;
    protected Long answerTime;
    protected Long releaseTime;
    protected Long detachedTime;
    protected Long detachedAnswerTime;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String outgoingDnis;
    @XmlSchemaType(name = "token")
    protected ServiceInvocationDisposition serviceInvocationDisposition;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceInvocationDialedNumber;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceInvocationCalledNumber;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceInvocationNetworkTranslatedAddress;
    @XmlSchemaType(name = "token")
    protected NetworkType serviceInvocationTypeOfNetwork;
    @XmlSchemaType(name = "token")
    protected CallCategory serviceInvocationCallCategory;
    @XmlSchemaType(name = "token")
    protected ServiceInvocationBasicCallType serviceInvocationBasicCallType;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceInvocationConfigurableCallType;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceInvocationAlternateCallIndicator;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceInvocationVirtualOnNetCallType;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceInvocationCalledDirectoryName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceInvocationCalledGroupId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String redirectingNumber;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String redirectingName;
    @XmlSchemaType(name = "token")
    protected RedirectingPresentationIndicator redirectingPresentationIndicator;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String redirectingReason;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String accountAuthorizationCode;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String callAuthorizationCode;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String securityClassification;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String directRouteNumber;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String routeListNumber;

    /**
     * Ruft den Wert der countryCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCountryCode() {
        return countryCode;
    }

    /**
     * Legt den Wert der countryCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountryCode(Integer value) {
        this.countryCode = value;
    }

    /**
     * Ruft den Wert der callLogId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallLogId() {
        return callLogId;
    }

    /**
     * Legt den Wert der callLogId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallLogId(String value) {
        this.callLogId = value;
    }

    /**
     * Ruft den Wert der callId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallId() {
        return callId;
    }

    /**
     * Legt den Wert der callId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallId(String value) {
        this.callId = value;
    }

    /**
     * Ruft den Wert der subscriberType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnhancedCallLogsSubscriberType }
     *     
     */
    public EnhancedCallLogsSubscriberType getSubscriberType() {
        return subscriberType;
    }

    /**
     * Legt den Wert der subscriberType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnhancedCallLogsSubscriberType }
     *     
     */
    public void setSubscriberType(EnhancedCallLogsSubscriberType value) {
        this.subscriberType = value;
    }

    /**
     * Ruft den Wert der dialedNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialedNumber() {
        return dialedNumber;
    }

    /**
     * Legt den Wert der dialedNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialedNumber(String value) {
        this.dialedNumber = value;
    }

    /**
     * Ruft den Wert der calledNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledNumber() {
        return calledNumber;
    }

    /**
     * Legt den Wert der calledNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledNumber(String value) {
        this.calledNumber = value;
    }

    /**
     * Ruft den Wert der networkTranslatedAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkTranslatedAddress() {
        return networkTranslatedAddress;
    }

    /**
     * Legt den Wert der networkTranslatedAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkTranslatedAddress(String value) {
        this.networkTranslatedAddress = value;
    }

    /**
     * Ruft den Wert der callingAssertedNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingAssertedNumber() {
        return callingAssertedNumber;
    }

    /**
     * Legt den Wert der callingAssertedNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingAssertedNumber(String value) {
        this.callingAssertedNumber = value;
    }

    /**
     * Ruft den Wert der callingPresentationNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingPresentationNumber() {
        return callingPresentationNumber;
    }

    /**
     * Legt den Wert der callingPresentationNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingPresentationNumber(String value) {
        this.callingPresentationNumber = value;
    }

    /**
     * Ruft den Wert der callingPresentationNumberSource-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CallingPresentationNumberSource }
     *     
     */
    public CallingPresentationNumberSource getCallingPresentationNumberSource() {
        return callingPresentationNumberSource;
    }

    /**
     * Legt den Wert der callingPresentationNumberSource-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CallingPresentationNumberSource }
     *     
     */
    public void setCallingPresentationNumberSource(CallingPresentationNumberSource value) {
        this.callingPresentationNumberSource = value;
    }

    /**
     * Ruft den Wert der callingPresentationName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingPresentationName() {
        return callingPresentationName;
    }

    /**
     * Legt den Wert der callingPresentationName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingPresentationName(String value) {
        this.callingPresentationName = value;
    }

    /**
     * Ruft den Wert der callingPresentationIndicator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PresentationIndicator }
     *     
     */
    public PresentationIndicator getCallingPresentationIndicator() {
        return callingPresentationIndicator;
    }

    /**
     * Legt den Wert der callingPresentationIndicator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentationIndicator }
     *     
     */
    public void setCallingPresentationIndicator(PresentationIndicator value) {
        this.callingPresentationIndicator = value;
    }

    /**
     * Ruft den Wert der callingGroupId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingGroupId() {
        return callingGroupId;
    }

    /**
     * Legt den Wert der callingGroupId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingGroupId(String value) {
        this.callingGroupId = value;
    }

    /**
     * Ruft den Wert der calledDirectoryName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledDirectoryName() {
        return calledDirectoryName;
    }

    /**
     * Legt den Wert der calledDirectoryName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledDirectoryName(String value) {
        this.calledDirectoryName = value;
    }

    /**
     * Ruft den Wert der calledGroupId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalledGroupId() {
        return calledGroupId;
    }

    /**
     * Legt den Wert der calledGroupId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalledGroupId(String value) {
        this.calledGroupId = value;
    }

    /**
     * Ruft den Wert der connectedNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectedNumber() {
        return connectedNumber;
    }

    /**
     * Legt den Wert der connectedNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectedNumber(String value) {
        this.connectedNumber = value;
    }

    /**
     * Ruft den Wert der connectedNumberSource-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConnectedNumberSource }
     *     
     */
    public ConnectedNumberSource getConnectedNumberSource() {
        return connectedNumberSource;
    }

    /**
     * Legt den Wert der connectedNumberSource-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectedNumberSource }
     *     
     */
    public void setConnectedNumberSource(ConnectedNumberSource value) {
        this.connectedNumberSource = value;
    }

    /**
     * Ruft den Wert der connectedName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectedName() {
        return connectedName;
    }

    /**
     * Legt den Wert der connectedName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectedName(String value) {
        this.connectedName = value;
    }

    /**
     * Ruft den Wert der connectedPresentationIndicator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PresentationIndicator }
     *     
     */
    public PresentationIndicator getConnectedPresentationIndicator() {
        return connectedPresentationIndicator;
    }

    /**
     * Legt den Wert der connectedPresentationIndicator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentationIndicator }
     *     
     */
    public void setConnectedPresentationIndicator(PresentationIndicator value) {
        this.connectedPresentationIndicator = value;
    }

    /**
     * Ruft den Wert der connectedGroupId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectedGroupId() {
        return connectedGroupId;
    }

    /**
     * Legt den Wert der connectedGroupId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectedGroupId(String value) {
        this.connectedGroupId = value;
    }

    /**
     * Ruft den Wert der typeOfNetwork-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NetworkType }
     *     
     */
    public NetworkType getTypeOfNetwork() {
        return typeOfNetwork;
    }

    /**
     * Legt den Wert der typeOfNetwork-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkType }
     *     
     */
    public void setTypeOfNetwork(NetworkType value) {
        this.typeOfNetwork = value;
    }

    /**
     * Ruft den Wert der callCategory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CallCategory }
     *     
     */
    public CallCategory getCallCategory() {
        return callCategory;
    }

    /**
     * Legt den Wert der callCategory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CallCategory }
     *     
     */
    public void setCallCategory(CallCategory value) {
        this.callCategory = value;
    }

    /**
     * Ruft den Wert der basicCallType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BasicCallType }
     *     
     */
    public BasicCallType getBasicCallType() {
        return basicCallType;
    }

    /**
     * Legt den Wert der basicCallType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicCallType }
     *     
     */
    public void setBasicCallType(BasicCallType value) {
        this.basicCallType = value;
    }

    /**
     * Ruft den Wert der configurableCallType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigurableCallType() {
        return configurableCallType;
    }

    /**
     * Legt den Wert der configurableCallType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigurableCallType(String value) {
        this.configurableCallType = value;
    }

    /**
     * Ruft den Wert der alternateCallIndicator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateCallIndicator() {
        return alternateCallIndicator;
    }

    /**
     * Legt den Wert der alternateCallIndicator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateCallIndicator(String value) {
        this.alternateCallIndicator = value;
    }

    /**
     * Ruft den Wert der virtualOnNetCallType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtualOnNetCallType() {
        return virtualOnNetCallType;
    }

    /**
     * Legt den Wert der virtualOnNetCallType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtualOnNetCallType(String value) {
        this.virtualOnNetCallType = value;
    }

    /**
     * Ruft den Wert der time-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Legt den Wert der time-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * Ruft den Wert der startTime-Eigenschaft ab.
     * 
     */
    public long getStartTime() {
        return startTime;
    }

    /**
     * Legt den Wert der startTime-Eigenschaft fest.
     * 
     */
    public void setStartTime(long value) {
        this.startTime = value;
    }

    /**
     * Ruft den Wert der answerTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAnswerTime() {
        return answerTime;
    }

    /**
     * Legt den Wert der answerTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAnswerTime(Long value) {
        this.answerTime = value;
    }

    /**
     * Ruft den Wert der releaseTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReleaseTime() {
        return releaseTime;
    }

    /**
     * Legt den Wert der releaseTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReleaseTime(Long value) {
        this.releaseTime = value;
    }

    /**
     * Ruft den Wert der detachedTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDetachedTime() {
        return detachedTime;
    }

    /**
     * Legt den Wert der detachedTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDetachedTime(Long value) {
        this.detachedTime = value;
    }

    /**
     * Ruft den Wert der detachedAnswerTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDetachedAnswerTime() {
        return detachedAnswerTime;
    }

    /**
     * Legt den Wert der detachedAnswerTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDetachedAnswerTime(Long value) {
        this.detachedAnswerTime = value;
    }

    /**
     * Ruft den Wert der outgoingDnis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutgoingDnis() {
        return outgoingDnis;
    }

    /**
     * Legt den Wert der outgoingDnis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutgoingDnis(String value) {
        this.outgoingDnis = value;
    }

    /**
     * Ruft den Wert der serviceInvocationDisposition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceInvocationDisposition }
     *     
     */
    public ServiceInvocationDisposition getServiceInvocationDisposition() {
        return serviceInvocationDisposition;
    }

    /**
     * Legt den Wert der serviceInvocationDisposition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInvocationDisposition }
     *     
     */
    public void setServiceInvocationDisposition(ServiceInvocationDisposition value) {
        this.serviceInvocationDisposition = value;
    }

    /**
     * Ruft den Wert der serviceInvocationDialedNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceInvocationDialedNumber() {
        return serviceInvocationDialedNumber;
    }

    /**
     * Legt den Wert der serviceInvocationDialedNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceInvocationDialedNumber(String value) {
        this.serviceInvocationDialedNumber = value;
    }

    /**
     * Ruft den Wert der serviceInvocationCalledNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceInvocationCalledNumber() {
        return serviceInvocationCalledNumber;
    }

    /**
     * Legt den Wert der serviceInvocationCalledNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceInvocationCalledNumber(String value) {
        this.serviceInvocationCalledNumber = value;
    }

    /**
     * Ruft den Wert der serviceInvocationNetworkTranslatedAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceInvocationNetworkTranslatedAddress() {
        return serviceInvocationNetworkTranslatedAddress;
    }

    /**
     * Legt den Wert der serviceInvocationNetworkTranslatedAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceInvocationNetworkTranslatedAddress(String value) {
        this.serviceInvocationNetworkTranslatedAddress = value;
    }

    /**
     * Ruft den Wert der serviceInvocationTypeOfNetwork-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NetworkType }
     *     
     */
    public NetworkType getServiceInvocationTypeOfNetwork() {
        return serviceInvocationTypeOfNetwork;
    }

    /**
     * Legt den Wert der serviceInvocationTypeOfNetwork-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkType }
     *     
     */
    public void setServiceInvocationTypeOfNetwork(NetworkType value) {
        this.serviceInvocationTypeOfNetwork = value;
    }

    /**
     * Ruft den Wert der serviceInvocationCallCategory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CallCategory }
     *     
     */
    public CallCategory getServiceInvocationCallCategory() {
        return serviceInvocationCallCategory;
    }

    /**
     * Legt den Wert der serviceInvocationCallCategory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CallCategory }
     *     
     */
    public void setServiceInvocationCallCategory(CallCategory value) {
        this.serviceInvocationCallCategory = value;
    }

    /**
     * Ruft den Wert der serviceInvocationBasicCallType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceInvocationBasicCallType }
     *     
     */
    public ServiceInvocationBasicCallType getServiceInvocationBasicCallType() {
        return serviceInvocationBasicCallType;
    }

    /**
     * Legt den Wert der serviceInvocationBasicCallType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInvocationBasicCallType }
     *     
     */
    public void setServiceInvocationBasicCallType(ServiceInvocationBasicCallType value) {
        this.serviceInvocationBasicCallType = value;
    }

    /**
     * Ruft den Wert der serviceInvocationConfigurableCallType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceInvocationConfigurableCallType() {
        return serviceInvocationConfigurableCallType;
    }

    /**
     * Legt den Wert der serviceInvocationConfigurableCallType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceInvocationConfigurableCallType(String value) {
        this.serviceInvocationConfigurableCallType = value;
    }

    /**
     * Ruft den Wert der serviceInvocationAlternateCallIndicator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceInvocationAlternateCallIndicator() {
        return serviceInvocationAlternateCallIndicator;
    }

    /**
     * Legt den Wert der serviceInvocationAlternateCallIndicator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceInvocationAlternateCallIndicator(String value) {
        this.serviceInvocationAlternateCallIndicator = value;
    }

    /**
     * Ruft den Wert der serviceInvocationVirtualOnNetCallType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceInvocationVirtualOnNetCallType() {
        return serviceInvocationVirtualOnNetCallType;
    }

    /**
     * Legt den Wert der serviceInvocationVirtualOnNetCallType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceInvocationVirtualOnNetCallType(String value) {
        this.serviceInvocationVirtualOnNetCallType = value;
    }

    /**
     * Ruft den Wert der serviceInvocationCalledDirectoryName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceInvocationCalledDirectoryName() {
        return serviceInvocationCalledDirectoryName;
    }

    /**
     * Legt den Wert der serviceInvocationCalledDirectoryName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceInvocationCalledDirectoryName(String value) {
        this.serviceInvocationCalledDirectoryName = value;
    }

    /**
     * Ruft den Wert der serviceInvocationCalledGroupId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceInvocationCalledGroupId() {
        return serviceInvocationCalledGroupId;
    }

    /**
     * Legt den Wert der serviceInvocationCalledGroupId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceInvocationCalledGroupId(String value) {
        this.serviceInvocationCalledGroupId = value;
    }

    /**
     * Ruft den Wert der redirectingNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectingNumber() {
        return redirectingNumber;
    }

    /**
     * Legt den Wert der redirectingNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectingNumber(String value) {
        this.redirectingNumber = value;
    }

    /**
     * Ruft den Wert der redirectingName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectingName() {
        return redirectingName;
    }

    /**
     * Legt den Wert der redirectingName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectingName(String value) {
        this.redirectingName = value;
    }

    /**
     * Ruft den Wert der redirectingPresentationIndicator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RedirectingPresentationIndicator }
     *     
     */
    public RedirectingPresentationIndicator getRedirectingPresentationIndicator() {
        return redirectingPresentationIndicator;
    }

    /**
     * Legt den Wert der redirectingPresentationIndicator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RedirectingPresentationIndicator }
     *     
     */
    public void setRedirectingPresentationIndicator(RedirectingPresentationIndicator value) {
        this.redirectingPresentationIndicator = value;
    }

    /**
     * Ruft den Wert der redirectingReason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectingReason() {
        return redirectingReason;
    }

    /**
     * Legt den Wert der redirectingReason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectingReason(String value) {
        this.redirectingReason = value;
    }

    /**
     * Ruft den Wert der accountAuthorizationCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountAuthorizationCode() {
        return accountAuthorizationCode;
    }

    /**
     * Legt den Wert der accountAuthorizationCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountAuthorizationCode(String value) {
        this.accountAuthorizationCode = value;
    }

    /**
     * Ruft den Wert der callAuthorizationCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallAuthorizationCode() {
        return callAuthorizationCode;
    }

    /**
     * Legt den Wert der callAuthorizationCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallAuthorizationCode(String value) {
        this.callAuthorizationCode = value;
    }

    /**
     * Ruft den Wert der securityClassification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityClassification() {
        return securityClassification;
    }

    /**
     * Legt den Wert der securityClassification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityClassification(String value) {
        this.securityClassification = value;
    }

    /**
     * Ruft den Wert der directRouteNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectRouteNumber() {
        return directRouteNumber;
    }

    /**
     * Legt den Wert der directRouteNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectRouteNumber(String value) {
        this.directRouteNumber = value;
    }

    /**
     * Ruft den Wert der routeListNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteListNumber() {
        return routeListNumber;
    }

    /**
     * Legt den Wert der routeListNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteListNumber(String value) {
        this.routeListNumber = value;
    }

}
