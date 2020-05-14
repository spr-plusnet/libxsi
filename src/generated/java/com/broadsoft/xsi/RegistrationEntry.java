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
 *         Registration Entry
 * 
 *         Change History:
 *         R19.0 - Added publicIP, publicPort, privateIP, privatePort, and userAgent.
 *       
 * 
 * <p>Java-Klasse für RegistrationEntry complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RegistrationEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="endpointType" type="{http://schema.broadsoft.com/xsi}EndpointType" minOccurs="0"/>
 *         &lt;element name="uri" type="{http://schema.broadsoft.com/xsi}SIPURI" minOccurs="0"/>
 *         &lt;element name="expiration" type="{http://schema.broadsoft.com/xsi}NonEmptyString" minOccurs="0"/>
 *         &lt;element name="linePort" type="{http://schema.broadsoft.com/xsi}AccessDeviceEndpointLinePort" minOccurs="0"/>
 *         &lt;element name="publicIP" type="{http://schema.broadsoft.com/xsi}NetAddress" minOccurs="0"/>
 *         &lt;element name="publicPort" type="{http://schema.broadsoft.com/xsi}Port" minOccurs="0"/>
 *         &lt;element name="privateIP" type="{http://schema.broadsoft.com/xsi}NetAddress" minOccurs="0"/>
 *         &lt;element name="privatePort" type="{http://schema.broadsoft.com/xsi}Port" minOccurs="0"/>
 *         &lt;element name="userAgent" type="{http://schema.broadsoft.com/xsi}UserAgentSipHeader" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrationEntry", propOrder = {
    "endpointType",
    "uri",
    "expiration",
    "linePort",
    "publicIP",
    "publicPort",
    "privateIP",
    "privatePort",
    "userAgent"
})
public class RegistrationEntry {

    @XmlSchemaType(name = "token")
    protected EndpointType endpointType;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String uri;
    protected String expiration;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String linePort;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String publicIP;
    protected Integer publicPort;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String privateIP;
    protected Integer privatePort;
    protected String userAgent;

    /**
     * Ruft den Wert der endpointType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EndpointType }
     *     
     */
    public EndpointType getEndpointType() {
        return endpointType;
    }

    /**
     * Legt den Wert der endpointType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointType }
     *     
     */
    public void setEndpointType(EndpointType value) {
        this.endpointType = value;
    }

    /**
     * Ruft den Wert der uri-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Legt den Wert der uri-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
    }

    /**
     * Ruft den Wert der expiration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiration() {
        return expiration;
    }

    /**
     * Legt den Wert der expiration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiration(String value) {
        this.expiration = value;
    }

    /**
     * Ruft den Wert der linePort-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinePort() {
        return linePort;
    }

    /**
     * Legt den Wert der linePort-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinePort(String value) {
        this.linePort = value;
    }

    /**
     * Ruft den Wert der publicIP-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicIP() {
        return publicIP;
    }

    /**
     * Legt den Wert der publicIP-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicIP(String value) {
        this.publicIP = value;
    }

    /**
     * Ruft den Wert der publicPort-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPublicPort() {
        return publicPort;
    }

    /**
     * Legt den Wert der publicPort-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPublicPort(Integer value) {
        this.publicPort = value;
    }

    /**
     * Ruft den Wert der privateIP-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateIP() {
        return privateIP;
    }

    /**
     * Legt den Wert der privateIP-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateIP(String value) {
        this.privateIP = value;
    }

    /**
     * Ruft den Wert der privatePort-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrivatePort() {
        return privatePort;
    }

    /**
     * Legt den Wert der privatePort-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrivatePort(Integer value) {
        this.privatePort = value;
    }

    /**
     * Ruft den Wert der userAgent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * Legt den Wert der userAgent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAgent(String value) {
        this.userAgent = value;
    }

}
