//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         A ACDQueueEntry provides information about each call
 *         maintained in a ACD queue.
 *       
 * 
 * <p>Java-Klasse für ACDQueueEntry complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ACDQueueEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="callId" type="{http://schema.broadsoft.com/xsi}CallId"/>
 *         &lt;element name="extTrackingId" type="{http://schema.broadsoft.com/xsi}ExternalTrackingId"/>
 *         &lt;element name="remoteParty" type="{http://schema.broadsoft.com/xsi}PartyInformation"/>
 *         &lt;element name="addTime" type="{http://schema.broadsoft.com/xsi}Timestamp"/>
 *         &lt;element name="removeTime" type="{http://schema.broadsoft.com/xsi}Timestamp" minOccurs="0"/>
 *         &lt;element name="mandatoryEntrance" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/>
 *         &lt;element name="bounced" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/>
 *         &lt;element name="reordered" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/>
 *         &lt;element name="preservedWaitTime" type="{http://schema.broadsoft.com/xsi}PositiveInt" minOccurs="0"/>
 *         &lt;element name="acdName" type="{http://schema.broadsoft.com/xsi}NonEmptyString"/>
 *         &lt;element name="acdNumber" type="{http://schema.broadsoft.com/xsi}Address"/>
 *         &lt;element name="acdPriority" type="{http://schema.broadsoft.com/xsi}ACDPriorityType" minOccurs="0"/>
 *         &lt;element name="addTimeInPriorityBucket" type="{http://schema.broadsoft.com/xsi}Timestamp" minOccurs="0"/>
 *         &lt;element name="preservedWaitTimeInPriorityBucket" type="{http://schema.broadsoft.com/xsi}PositiveInt" minOccurs="0"/>
 *         &lt;element name="answeringUserId" type="{http://schema.broadsoft.com/xsi}UserId" minOccurs="0"/>
 *         &lt;element name="answeringCallId" type="{http://schema.broadsoft.com/xsi}CallId" minOccurs="0"/>
 *         &lt;element name="answeringNetworkCallId" type="{http://schema.broadsoft.com/xsi}NonEmptyToken" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACDQueueEntry", propOrder = {
    "callId",
    "extTrackingId",
    "remoteParty",
    "addTime",
    "removeTime",
    "mandatoryEntrance",
    "bounced",
    "reordered",
    "preservedWaitTime",
    "acdName",
    "acdNumber",
    "acdPriority",
    "addTimeInPriorityBucket",
    "preservedWaitTimeInPriorityBucket",
    "answeringUserId",
    "answeringCallId",
    "answeringNetworkCallId"
})
public class ACDQueueEntry {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String callId;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String extTrackingId;
    @XmlElement(required = true)
    protected PartyInformation remoteParty;
    protected long addTime;
    protected Long removeTime;
    protected EmptyContent mandatoryEntrance;
    protected EmptyContent bounced;
    protected EmptyContent reordered;
    protected Integer preservedWaitTime;
    @XmlElement(required = true)
    protected String acdName;
    @XmlElement(required = true)
    protected Address acdNumber;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String acdPriority;
    protected Long addTimeInPriorityBucket;
    protected Integer preservedWaitTimeInPriorityBucket;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String answeringUserId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String answeringCallId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String answeringNetworkCallId;

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
     * Ruft den Wert der extTrackingId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtTrackingId() {
        return extTrackingId;
    }

    /**
     * Legt den Wert der extTrackingId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtTrackingId(String value) {
        this.extTrackingId = value;
    }

    /**
     * Ruft den Wert der remoteParty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PartyInformation }
     *     
     */
    public PartyInformation getRemoteParty() {
        return remoteParty;
    }

    /**
     * Legt den Wert der remoteParty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyInformation }
     *     
     */
    public void setRemoteParty(PartyInformation value) {
        this.remoteParty = value;
    }

    /**
     * Ruft den Wert der addTime-Eigenschaft ab.
     * 
     */
    public long getAddTime() {
        return addTime;
    }

    /**
     * Legt den Wert der addTime-Eigenschaft fest.
     * 
     */
    public void setAddTime(long value) {
        this.addTime = value;
    }

    /**
     * Ruft den Wert der removeTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRemoveTime() {
        return removeTime;
    }

    /**
     * Legt den Wert der removeTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRemoveTime(Long value) {
        this.removeTime = value;
    }

    /**
     * Ruft den Wert der mandatoryEntrance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getMandatoryEntrance() {
        return mandatoryEntrance;
    }

    /**
     * Legt den Wert der mandatoryEntrance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setMandatoryEntrance(EmptyContent value) {
        this.mandatoryEntrance = value;
    }

    /**
     * Ruft den Wert der bounced-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getBounced() {
        return bounced;
    }

    /**
     * Legt den Wert der bounced-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setBounced(EmptyContent value) {
        this.bounced = value;
    }

    /**
     * Ruft den Wert der reordered-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getReordered() {
        return reordered;
    }

    /**
     * Legt den Wert der reordered-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setReordered(EmptyContent value) {
        this.reordered = value;
    }

    /**
     * Ruft den Wert der preservedWaitTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPreservedWaitTime() {
        return preservedWaitTime;
    }

    /**
     * Legt den Wert der preservedWaitTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPreservedWaitTime(Integer value) {
        this.preservedWaitTime = value;
    }

    /**
     * Ruft den Wert der acdName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcdName() {
        return acdName;
    }

    /**
     * Legt den Wert der acdName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcdName(String value) {
        this.acdName = value;
    }

    /**
     * Ruft den Wert der acdNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAcdNumber() {
        return acdNumber;
    }

    /**
     * Legt den Wert der acdNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAcdNumber(Address value) {
        this.acdNumber = value;
    }

    /**
     * Ruft den Wert der acdPriority-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcdPriority() {
        return acdPriority;
    }

    /**
     * Legt den Wert der acdPriority-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcdPriority(String value) {
        this.acdPriority = value;
    }

    /**
     * Ruft den Wert der addTimeInPriorityBucket-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAddTimeInPriorityBucket() {
        return addTimeInPriorityBucket;
    }

    /**
     * Legt den Wert der addTimeInPriorityBucket-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAddTimeInPriorityBucket(Long value) {
        this.addTimeInPriorityBucket = value;
    }

    /**
     * Ruft den Wert der preservedWaitTimeInPriorityBucket-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPreservedWaitTimeInPriorityBucket() {
        return preservedWaitTimeInPriorityBucket;
    }

    /**
     * Legt den Wert der preservedWaitTimeInPriorityBucket-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPreservedWaitTimeInPriorityBucket(Integer value) {
        this.preservedWaitTimeInPriorityBucket = value;
    }

    /**
     * Ruft den Wert der answeringUserId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnsweringUserId() {
        return answeringUserId;
    }

    /**
     * Legt den Wert der answeringUserId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnsweringUserId(String value) {
        this.answeringUserId = value;
    }

    /**
     * Ruft den Wert der answeringCallId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnsweringCallId() {
        return answeringCallId;
    }

    /**
     * Legt den Wert der answeringCallId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnsweringCallId(String value) {
        this.answeringCallId = value;
    }

    /**
     * Ruft den Wert der answeringNetworkCallId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnsweringNetworkCallId() {
        return answeringNetworkCallId;
    }

    /**
     * Legt den Wert der answeringNetworkCallId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnsweringNetworkCallId(String value) {
        this.answeringNetworkCallId = value;
    }

}
