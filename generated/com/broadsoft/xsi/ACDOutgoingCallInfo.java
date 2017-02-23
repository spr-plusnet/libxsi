//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
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
 *         Contains the details of a ACD outgoing call.
 *       
 * 
 * <p>Java-Klasse für ACDOutgoingCallInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ACDOutgoingCallInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acdUserId" type="{http://schema.broadsoft.com/xsi}UserId"/>
 *         &lt;element name="acdName" type="{http://schema.broadsoft.com/xsi}NonEmptyString"/>
 *         &lt;element name="acdNumber" type="{http://schema.broadsoft.com/xsi}Address"/>
 *         &lt;element name="routePoint" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/>
 *         &lt;element name="dispositionCode" type="{http://schema.broadsoft.com/xsi}AgentDispositionCode" minOccurs="0"/>
 *         &lt;element name="postCallAgentState" type="{http://schema.broadsoft.com/xsi}NonEmptyString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACDOutgoingCallInfo", propOrder = {
    "acdUserId",
    "acdName",
    "acdNumber",
    "routePoint",
    "dispositionCode",
    "postCallAgentState"
})
public class ACDOutgoingCallInfo {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String acdUserId;
    @XmlElement(required = true)
    protected String acdName;
    @XmlElement(required = true)
    protected Address acdNumber;
    protected EmptyContent routePoint;
    protected String dispositionCode;
    protected String postCallAgentState;

    /**
     * Ruft den Wert der acdUserId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcdUserId() {
        return acdUserId;
    }

    /**
     * Legt den Wert der acdUserId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcdUserId(String value) {
        this.acdUserId = value;
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
     * Ruft den Wert der routePoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getRoutePoint() {
        return routePoint;
    }

    /**
     * Legt den Wert der routePoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setRoutePoint(EmptyContent value) {
        this.routePoint = value;
    }

    /**
     * Ruft den Wert der dispositionCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispositionCode() {
        return dispositionCode;
    }

    /**
     * Legt den Wert der dispositionCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispositionCode(String value) {
        this.dispositionCode = value;
    }

    /**
     * Ruft den Wert der postCallAgentState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCallAgentState() {
        return postCallAgentState;
    }

    /**
     * Legt den Wert der postCallAgentState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCallAgentState(String value) {
        this.postCallAgentState = value;
    }

}
