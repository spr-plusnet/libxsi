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
 *         Subscription represents a single Subscription.
 *         
 *         Change History:
 *         19.0 - added targetSubId element.
 *         19.0 - changed expires element type to SubscriptionExpiration
 *         23.0 - added eventPackageList element.
 *       
 * 
 * <p>Java-Klasse für Subscription complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Subscription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subscriptionId" type="{http://schema.broadsoft.com/xsi}SubscriptionId" minOccurs="0"/>
 *         &lt;element name="sharedSubscriptionId" type="{http://schema.broadsoft.com/xsi}SubscriptionId" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="subscriberId" type="{http://schema.broadsoft.com/xsi}UserId" minOccurs="0"/>
 *           &lt;element name="clientId" type="{http://schema.broadsoft.com/xsi}ClientAppId" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="targetIdType" type="{http://schema.broadsoft.com/xsi}EntityType" minOccurs="0"/>
 *         &lt;element name="targetGrpParentId" type="{http://schema.broadsoft.com/xsi}NonEmptyString" minOccurs="0"/>
 *         &lt;element name="targetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetSubId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="event" type="{http://schema.broadsoft.com/xsi}EventPackage" minOccurs="0"/>
 *           &lt;element name="eventPackageList" type="{http://schema.broadsoft.com/xsi}EventPackageList" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="expires" type="{http://schema.broadsoft.com/xsi}SubscriptionExpiration" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="httpContact" type="{http://schema.broadsoft.com/xsi}ContactURL" minOccurs="0"/>
 *           &lt;element name="channelSetId" type="{http://schema.broadsoft.com/xsi}ChannelSetId" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="applicationId" type="{http://schema.broadsoft.com/xsi}ExternalApplicationId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subscription", propOrder = {
    "subscriptionId",
    "sharedSubscriptionId",
    "subscriberId",
    "clientId",
    "targetIdType",
    "targetGrpParentId",
    "targetId",
    "targetSubId",
    "event",
    "eventPackageList",
    "expires",
    "httpContact",
    "channelSetId",
    "applicationId"
})
public class Subscription {

    protected String subscriptionId;
    protected String sharedSubscriptionId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String subscriberId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String clientId;
    @XmlSchemaType(name = "token")
    protected EntityType targetIdType;
    protected String targetGrpParentId;
    protected String targetId;
    protected String targetSubId;
    @XmlSchemaType(name = "token")
    protected EventPackage event;
    protected EventPackageList eventPackageList;
    protected Integer expires;
    protected ContactURL httpContact;
    protected String channelSetId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String applicationId;

    /**
     * Ruft den Wert der subscriptionId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Legt den Wert der subscriptionId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionId(String value) {
        this.subscriptionId = value;
    }

    /**
     * Ruft den Wert der sharedSubscriptionId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedSubscriptionId() {
        return sharedSubscriptionId;
    }

    /**
     * Legt den Wert der sharedSubscriptionId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedSubscriptionId(String value) {
        this.sharedSubscriptionId = value;
    }

    /**
     * Ruft den Wert der subscriberId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberId() {
        return subscriberId;
    }

    /**
     * Legt den Wert der subscriberId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberId(String value) {
        this.subscriberId = value;
    }

    /**
     * Ruft den Wert der clientId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Legt den Wert der clientId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientId(String value) {
        this.clientId = value;
    }

    /**
     * Ruft den Wert der targetIdType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EntityType }
     *     
     */
    public EntityType getTargetIdType() {
        return targetIdType;
    }

    /**
     * Legt den Wert der targetIdType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType }
     *     
     */
    public void setTargetIdType(EntityType value) {
        this.targetIdType = value;
    }

    /**
     * Ruft den Wert der targetGrpParentId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetGrpParentId() {
        return targetGrpParentId;
    }

    /**
     * Legt den Wert der targetGrpParentId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetGrpParentId(String value) {
        this.targetGrpParentId = value;
    }

    /**
     * Ruft den Wert der targetId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetId() {
        return targetId;
    }

    /**
     * Legt den Wert der targetId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetId(String value) {
        this.targetId = value;
    }

    /**
     * Ruft den Wert der targetSubId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetSubId() {
        return targetSubId;
    }

    /**
     * Legt den Wert der targetSubId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetSubId(String value) {
        this.targetSubId = value;
    }

    /**
     * Ruft den Wert der event-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EventPackage }
     *     
     */
    public EventPackage getEvent() {
        return event;
    }

    /**
     * Legt den Wert der event-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EventPackage }
     *     
     */
    public void setEvent(EventPackage value) {
        this.event = value;
    }

    /**
     * Ruft den Wert der eventPackageList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EventPackageList }
     *     
     */
    public EventPackageList getEventPackageList() {
        return eventPackageList;
    }

    /**
     * Legt den Wert der eventPackageList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EventPackageList }
     *     
     */
    public void setEventPackageList(EventPackageList value) {
        this.eventPackageList = value;
    }

    /**
     * Ruft den Wert der expires-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpires() {
        return expires;
    }

    /**
     * Legt den Wert der expires-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpires(Integer value) {
        this.expires = value;
    }

    /**
     * Ruft den Wert der httpContact-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContactURL }
     *     
     */
    public ContactURL getHttpContact() {
        return httpContact;
    }

    /**
     * Legt den Wert der httpContact-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactURL }
     *     
     */
    public void setHttpContact(ContactURL value) {
        this.httpContact = value;
    }

    /**
     * Ruft den Wert der channelSetId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelSetId() {
        return channelSetId;
    }

    /**
     * Legt den Wert der channelSetId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelSetId(String value) {
        this.channelSetId = value;
    }

    /**
     * Ruft den Wert der applicationId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Legt den Wert der applicationId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationId(String value) {
        this.applicationId = value;
    }

}
