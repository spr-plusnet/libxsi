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
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element name="enableCallDispositionCodes" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="includeOrganizationCodes" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="forceUseOfCallDispositionCodes" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="dispositionCodes" type="{http://schema.broadsoft.com/xsi}ACDCallDispositionCodeList"/&gt;
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
