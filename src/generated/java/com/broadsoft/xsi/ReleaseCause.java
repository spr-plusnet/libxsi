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
 *         A ReleaseCause maintains information about the
 *         release of a call. A
 *         ReleaseCause is only set if
 *         the call is being
 *         released due to a failure of some kind.
 *         Note that it can be
 *         present for calls that have not yet been released such as calls
 *         receiving treatment
 *         and Detached calls.
 *       
 * 
 * <p>Java-Klasse für ReleaseCause complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ReleaseCause"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="internalReleaseCause" type="{http://schema.broadsoft.com/xsi}InternalReleaseCause"/&gt;
 *         &lt;element name="q850Cause" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sipStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cdrTerminationCause" type="{http://schema.broadsoft.com/xsi}CDRTerminationCause" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReleaseCause", propOrder = {
    "internalReleaseCause",
    "q850Cause",
    "sipStatus",
    "cdrTerminationCause"
})
public class ReleaseCause {

    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected InternalReleaseCause internalReleaseCause;
    protected String q850Cause;
    protected String sipStatus;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cdrTerminationCause;

    /**
     * Ruft den Wert der internalReleaseCause-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternalReleaseCause }
     *     
     */
    public InternalReleaseCause getInternalReleaseCause() {
        return internalReleaseCause;
    }

    /**
     * Legt den Wert der internalReleaseCause-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalReleaseCause }
     *     
     */
    public void setInternalReleaseCause(InternalReleaseCause value) {
        this.internalReleaseCause = value;
    }

    /**
     * Ruft den Wert der q850Cause-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQ850Cause() {
        return q850Cause;
    }

    /**
     * Legt den Wert der q850Cause-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQ850Cause(String value) {
        this.q850Cause = value;
    }

    /**
     * Ruft den Wert der sipStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSipStatus() {
        return sipStatus;
    }

    /**
     * Legt den Wert der sipStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSipStatus(String value) {
        this.sipStatus = value;
    }

    /**
     * Ruft den Wert der cdrTerminationCause-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdrTerminationCause() {
        return cdrTerminationCause;
    }

    /**
     * Legt den Wert der cdrTerminationCause-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdrTerminationCause(String value) {
        this.cdrTerminationCause = value;
    }

}
