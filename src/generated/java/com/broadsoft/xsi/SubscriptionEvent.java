//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         This represents event for a particular subscription.
 *         
 *         Change History:
 *         19.0 - added targetSubId element.
 *         23.0 - add choice of clientId for ownership identification
 *       
 * 
 * <p>Java-Klasse für SubscriptionEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}BaseEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eventID" type="{http://schema.broadsoft.com/xsi}EventId"/&gt;
 *         &lt;element name="sequenceNumber" type="{http://schema.broadsoft.com/xsi}PositiveInt"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="userId" type="{http://schema.broadsoft.com/xsi}UserId"/&gt;
 *           &lt;element name="clientId" type="{http://schema.broadsoft.com/xsi}ClientAppId"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="externalApplicationId" type="{http://schema.broadsoft.com/xsi}ExternalApplicationId"/&gt;
 *         &lt;element name="subscriptionId" type="{http://schema.broadsoft.com/xsi}SubscriptionId"/&gt;
 *         &lt;element name="sharedSubscriptionId" type="{http://schema.broadsoft.com/xsi}SubscriptionId" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="channelId" type="{http://schema.broadsoft.com/xsi}ChannelId" minOccurs="0"/&gt;
 *           &lt;element name="httpContact" type="{http://schema.broadsoft.com/xsi}ContactURL"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="targetId" type="{http://schema.broadsoft.com/xsi}UserId" minOccurs="0"/&gt;
 *         &lt;element name="targetSubId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventData" type="{http://schema.broadsoft.com/xsi}EventData"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionEvent", propOrder = {
    "eventID",
    "sequenceNumber",
    "userId",
    "clientId",
    "externalApplicationId",
    "subscriptionId",
    "sharedSubscriptionId",
    "channelId",
    "httpContact",
    "targetId",
    "targetSubId",
    "eventData"
})
public class SubscriptionEvent
    extends BaseEvent
{

    @XmlElement(required = true)
    protected String eventID;
    protected int sequenceNumber;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String userId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String clientId;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String externalApplicationId;
    @XmlElement(required = true)
    protected String subscriptionId;
    protected String sharedSubscriptionId;
    protected String channelId;
    protected ContactURL httpContact;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String targetId;
    protected String targetSubId;
    @XmlElement(required = true)
    protected EventData eventData;

    /**
     * Ruft den Wert der eventID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventID() {
        return eventID;
    }

    /**
     * Legt den Wert der eventID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventID(String value) {
        this.eventID = value;
    }

    /**
     * Ruft den Wert der sequenceNumber-Eigenschaft ab.
     * 
     */
    public int getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Legt den Wert der sequenceNumber-Eigenschaft fest.
     * 
     */
    public void setSequenceNumber(int value) {
        this.sequenceNumber = value;
    }

    /**
     * Ruft den Wert der userId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Legt den Wert der userId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
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
     * Ruft den Wert der externalApplicationId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalApplicationId() {
        return externalApplicationId;
    }

    /**
     * Legt den Wert der externalApplicationId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalApplicationId(String value) {
        this.externalApplicationId = value;
    }

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
     * Ruft den Wert der channelId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * Legt den Wert der channelId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelId(String value) {
        this.channelId = value;
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
     * Ruft den Wert der eventData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EventData }
     *     
     */
    public EventData getEventData() {
        return eventData;
    }

    /**
     * Legt den Wert der eventData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EventData }
     *     
     */
    public void setEventData(EventData value) {
        this.eventData = value;
    }

}
