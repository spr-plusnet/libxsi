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
 *         A RoutePointQueueEntry provides information about each call
 *         maintained in a route point queue.
 *             
 * 
 * <p>Java-Klasse für RoutePointQueueEntry complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RoutePointQueueEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="callId" type="{http://schema.broadsoft.com/xsi}CallId"/>
 *         &lt;element name="extTrackingId" type="{http://schema.broadsoft.com/xsi}ExternalTrackingId"/>
 *         &lt;element name="remoteParty" type="{http://schema.broadsoft.com/xsi}PartyInformation"/>
 *         &lt;element name="addTime" type="{http://schema.broadsoft.com/xsi}Timestamp" minOccurs="0"/>
 *         &lt;element name="removeTime" type="{http://schema.broadsoft.com/xsi}Timestamp" minOccurs="0"/>
 *         &lt;element name="bounced" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/>
 *         &lt;element name="routePointName" type="{http://schema.broadsoft.com/xsi}NonEmptyString"/>
 *         &lt;element name="routePointNumber" type="{http://schema.broadsoft.com/xsi}Address"/>
 *         &lt;element name="playCollectInfo" type="{http://schema.broadsoft.com/xsi}PlayCollectInfo" minOccurs="0"/>
 *         &lt;element name="outgoingCall" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/>
 *         &lt;element name="outgoingCallAnswerTime" type="{http://schema.broadsoft.com/xsi}Timestamp" minOccurs="0"/>
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
@XmlType(name = "RoutePointQueueEntry", propOrder = {
    "callId",
    "extTrackingId",
    "remoteParty",
    "addTime",
    "removeTime",
    "bounced",
    "routePointName",
    "routePointNumber",
    "playCollectInfo",
    "outgoingCall",
    "outgoingCallAnswerTime",
    "answeringUserId",
    "answeringCallId",
    "answeringNetworkCallId"
})
public class RoutePointQueueEntry {

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
    protected Long addTime;
    protected Long removeTime;
    protected EmptyContent bounced;
    @XmlElement(required = true)
    protected String routePointName;
    @XmlElement(required = true)
    protected Address routePointNumber;
    protected PlayCollectInfo playCollectInfo;
    protected EmptyContent outgoingCall;
    protected Long outgoingCallAnswerTime;
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
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAddTime() {
        return addTime;
    }

    /**
     * Legt den Wert der addTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAddTime(Long value) {
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
     * Ruft den Wert der routePointName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutePointName() {
        return routePointName;
    }

    /**
     * Legt den Wert der routePointName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutePointName(String value) {
        this.routePointName = value;
    }

    /**
     * Ruft den Wert der routePointNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getRoutePointNumber() {
        return routePointNumber;
    }

    /**
     * Legt den Wert der routePointNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setRoutePointNumber(Address value) {
        this.routePointNumber = value;
    }

    /**
     * Ruft den Wert der playCollectInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PlayCollectInfo }
     *     
     */
    public PlayCollectInfo getPlayCollectInfo() {
        return playCollectInfo;
    }

    /**
     * Legt den Wert der playCollectInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PlayCollectInfo }
     *     
     */
    public void setPlayCollectInfo(PlayCollectInfo value) {
        this.playCollectInfo = value;
    }

    /**
     * Ruft den Wert der outgoingCall-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getOutgoingCall() {
        return outgoingCall;
    }

    /**
     * Legt den Wert der outgoingCall-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setOutgoingCall(EmptyContent value) {
        this.outgoingCall = value;
    }

    /**
     * Ruft den Wert der outgoingCallAnswerTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOutgoingCallAnswerTime() {
        return outgoingCallAnswerTime;
    }

    /**
     * Legt den Wert der outgoingCallAnswerTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOutgoingCallAnswerTime(Long value) {
        this.outgoingCallAnswerTime = value;
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
