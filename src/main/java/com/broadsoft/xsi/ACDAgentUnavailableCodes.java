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
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enableAgentUnavailableCodes" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="defaultAgentUnavailableCodeOnDND" type="{http://schema.broadsoft.com/xsi}AgentUnavailableCode" minOccurs="0"/&gt;
 *         &lt;element name="defaultAgentUnavailableCodeOnPersonalCalls" type="{http://schema.broadsoft.com/xsi}AgentUnavailableCode" minOccurs="0"/&gt;
 *         &lt;element name="defaultAgentUnavailableCodeOnConsecutiveBounces" type="{http://schema.broadsoft.com/xsi}AgentUnavailableCode" minOccurs="0"/&gt;
 *         &lt;element name="forceUseOfAgentUnavailableCodes" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="unavailableCodes" type="{http://schema.broadsoft.com/xsi}ACDAgentUnavailableCodeList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
