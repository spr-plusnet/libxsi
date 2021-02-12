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
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="enableCallDispositionCodes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="includeOrganizationCodes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="forceUseOfCallDispositionCodes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dispositionCodes" type="{http://schema.broadsoft.com/xsi}ACDCallDispositionCodeList"/>
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
    "enableCallDispositionCodes",
    "includeOrganizationCodes",
    "forceUseOfCallDispositionCodes",
    "dispositionCodes"
})
@XmlRootElement(name = "ACDCallDispostionCodes")
public class ACDCallDispostionCodes {

    protected boolean enableCallDispositionCodes;
    protected boolean includeOrganizationCodes;
    protected boolean forceUseOfCallDispositionCodes;
    @XmlElement(required = true)
    protected ACDCallDispositionCodeList dispositionCodes;

    /**
     * Ruft den Wert der enableCallDispositionCodes-Eigenschaft ab.
     * 
     */
    public boolean isEnableCallDispositionCodes() {
        return enableCallDispositionCodes;
    }

    /**
     * Legt den Wert der enableCallDispositionCodes-Eigenschaft fest.
     * 
     */
    public void setEnableCallDispositionCodes(boolean value) {
        this.enableCallDispositionCodes = value;
    }

    /**
     * Ruft den Wert der includeOrganizationCodes-Eigenschaft ab.
     * 
     */
    public boolean isIncludeOrganizationCodes() {
        return includeOrganizationCodes;
    }

    /**
     * Legt den Wert der includeOrganizationCodes-Eigenschaft fest.
     * 
     */
    public void setIncludeOrganizationCodes(boolean value) {
        this.includeOrganizationCodes = value;
    }

    /**
     * Ruft den Wert der forceUseOfCallDispositionCodes-Eigenschaft ab.
     * 
     */
    public boolean isForceUseOfCallDispositionCodes() {
        return forceUseOfCallDispositionCodes;
    }

    /**
     * Legt den Wert der forceUseOfCallDispositionCodes-Eigenschaft fest.
     * 
     */
    public void setForceUseOfCallDispositionCodes(boolean value) {
        this.forceUseOfCallDispositionCodes = value;
    }

    /**
     * Ruft den Wert der dispositionCodes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ACDCallDispositionCodeList }
     *     
     */
    public ACDCallDispositionCodeList getDispositionCodes() {
        return dispositionCodes;
    }

    /**
     * Legt den Wert der dispositionCodes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ACDCallDispositionCodeList }
     *     
     */
    public void setDispositionCodes(ACDCallDispositionCodeList value) {
        this.dispositionCodes = value;
    }

}
