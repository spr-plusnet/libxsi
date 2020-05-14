//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="serviceNetAddress" type="{http://schema.broadsoft.com/xsi}NetAddress" minOccurs="0"/>
 *         &lt;element name="servicePort" type="{http://schema.broadsoft.com/xsi}Port" minOccurs="0"/>
 *         &lt;element name="impUserId" type="{http://schema.broadsoft.com/xsi}IMPUserId" minOccurs="0"/>
 *         &lt;element name="boshURL" type="{http://schema.broadsoft.com/xsi}URL" minOccurs="0"/>
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
    "serviceNetAddress",
    "servicePort",
    "impUserId",
    "boshURL"
})
@XmlRootElement(name = "IMPProfile")
public class IMPProfile {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceNetAddress;
    protected Integer servicePort;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String impUserId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String boshURL;

    /**
     * Ruft den Wert der serviceNetAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceNetAddress() {
        return serviceNetAddress;
    }

    /**
     * Legt den Wert der serviceNetAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceNetAddress(String value) {
        this.serviceNetAddress = value;
    }

    /**
     * Ruft den Wert der servicePort-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServicePort() {
        return servicePort;
    }

    /**
     * Legt den Wert der servicePort-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServicePort(Integer value) {
        this.servicePort = value;
    }

    /**
     * Ruft den Wert der impUserId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpUserId() {
        return impUserId;
    }

    /**
     * Legt den Wert der impUserId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpUserId(String value) {
        this.impUserId = value;
    }

    /**
     * Ruft den Wert der boshURL-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoshURL() {
        return boshURL;
    }

    /**
     * Legt den Wert der boshURL-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoshURL(String value) {
        this.boshURL = value;
    }

}
