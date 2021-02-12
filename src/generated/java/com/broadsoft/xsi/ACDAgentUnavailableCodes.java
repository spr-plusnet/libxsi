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
 *         &lt;element name="enableAgentUnavailableCodes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="defaultAgentUnavailableCodeOnDND" type="{http://schema.broadsoft.com/xsi}AgentUnavailableCode" minOccurs="0"/>
 *         &lt;element name="defaultAgentUnavailableCodeOnPersonalCalls" type="{http://schema.broadsoft.com/xsi}AgentUnavailableCode" minOccurs="0"/>
 *         &lt;element name="defaultAgentUnavailableCodeOnConsecutiveBounces" type="{http://schema.broadsoft.com/xsi}AgentUnavailableCode" minOccurs="0"/>
 *         &lt;element name="forceUseOfAgentUnavailableCodes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="unavailableCodes" type="{http://schema.broadsoft.com/xsi}ACDAgentUnavailableCodeList"/>
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
    "enableAgentUnavailableCodes",
    "defaultAgentUnavailableCodeOnDND",
    "defaultAgentUnavailableCodeOnPersonalCalls",
    "defaultAgentUnavailableCodeOnConsecutiveBounces",
    "forceUseOfAgentUnavailableCodes",
    "unavailableCodes"
})
@XmlRootElement(name = "ACDAgentUnavailableCodes")
public class ACDAgentUnavailableCodes {

    protected boolean enableAgentUnavailableCodes;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String defaultAgentUnavailableCodeOnDND;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String defaultAgentUnavailableCodeOnPersonalCalls;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String defaultAgentUnavailableCodeOnConsecutiveBounces;
    protected boolean forceUseOfAgentUnavailableCodes;
    @XmlElement(required = true)
    protected ACDAgentUnavailableCodeList unavailableCodes;

    /**
     * Ruft den Wert der enableAgentUnavailableCodes-Eigenschaft ab.
     * 
     */
    public boolean isEnableAgentUnavailableCodes() {
        return enableAgentUnavailableCodes;
    }

    /**
     * Legt den Wert der enableAgentUnavailableCodes-Eigenschaft fest.
     * 
     */
    public void setEnableAgentUnavailableCodes(boolean value) {
        this.enableAgentUnavailableCodes = value;
    }

    /**
     * Ruft den Wert der defaultAgentUnavailableCodeOnDND-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultAgentUnavailableCodeOnDND() {
        return defaultAgentUnavailableCodeOnDND;
    }

    /**
     * Legt den Wert der defaultAgentUnavailableCodeOnDND-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultAgentUnavailableCodeOnDND(String value) {
        this.defaultAgentUnavailableCodeOnDND = value;
    }

    /**
     * Ruft den Wert der defaultAgentUnavailableCodeOnPersonalCalls-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultAgentUnavailableCodeOnPersonalCalls() {
        return defaultAgentUnavailableCodeOnPersonalCalls;
    }

    /**
     * Legt den Wert der defaultAgentUnavailableCodeOnPersonalCalls-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultAgentUnavailableCodeOnPersonalCalls(String value) {
        this.defaultAgentUnavailableCodeOnPersonalCalls = value;
    }

    /**
     * Ruft den Wert der defaultAgentUnavailableCodeOnConsecutiveBounces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultAgentUnavailableCodeOnConsecutiveBounces() {
        return defaultAgentUnavailableCodeOnConsecutiveBounces;
    }

    /**
     * Legt den Wert der defaultAgentUnavailableCodeOnConsecutiveBounces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultAgentUnavailableCodeOnConsecutiveBounces(String value) {
        this.defaultAgentUnavailableCodeOnConsecutiveBounces = value;
    }

    /**
     * Ruft den Wert der forceUseOfAgentUnavailableCodes-Eigenschaft ab.
     * 
     */
    public boolean isForceUseOfAgentUnavailableCodes() {
        return forceUseOfAgentUnavailableCodes;
    }

    /**
     * Legt den Wert der forceUseOfAgentUnavailableCodes-Eigenschaft fest.
     * 
     */
    public void setForceUseOfAgentUnavailableCodes(boolean value) {
        this.forceUseOfAgentUnavailableCodes = value;
    }

    /**
     * Ruft den Wert der unavailableCodes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ACDAgentUnavailableCodeList }
     *     
     */
    public ACDAgentUnavailableCodeList getUnavailableCodes() {
        return unavailableCodes;
    }

    /**
     * Legt den Wert der unavailableCodes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ACDAgentUnavailableCodeList }
     *     
     */
    public void setUnavailableCodes(ACDAgentUnavailableCodeList value) {
        this.unavailableCodes = value;
    }

}
