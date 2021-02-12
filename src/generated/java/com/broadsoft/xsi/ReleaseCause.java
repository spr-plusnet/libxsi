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
 * &lt;complexType name="ReleaseCause">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="internalReleaseCause" type="{http://schema.broadsoft.com/xsi}InternalReleaseCause"/>
 *         &lt;element name="q850Cause" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sipStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdrTerminationCause" type="{http://schema.broadsoft.com/xsi}CDRTerminationCause" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
