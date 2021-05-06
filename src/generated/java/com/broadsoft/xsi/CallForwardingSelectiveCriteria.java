//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="forwardToNumberSelection" type="{http://schema.broadsoft.com/xsi}CallForwardingSelectiveNumberSelection" minOccurs="0"/&gt;
 *         &lt;element name="forwardToPhoneNumber" type="{http://schema.broadsoft.com/xsi}OutgoingDNorSIPURI" minOccurs="0"/&gt;
 *         &lt;element name="criteria" type="{http://schema.broadsoft.com/xsi}CriteriaWithFromDnAndCallToNumber" minOccurs="0"/&gt;
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
    "forwardToNumberSelection",
    "forwardToPhoneNumber",
    "criteria"
})
@XmlRootElement(name = "CallForwardingSelectiveCriteria")
public class CallForwardingSelectiveCriteria {

    @XmlSchemaType(name = "token")
    protected CallForwardingSelectiveNumberSelection forwardToNumberSelection;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String forwardToPhoneNumber;
    protected CriteriaWithFromDnAndCallToNumber criteria;

    /**
     * Ruft den Wert der forwardToNumberSelection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CallForwardingSelectiveNumberSelection }
     *     
     */
    public CallForwardingSelectiveNumberSelection getForwardToNumberSelection() {
        return forwardToNumberSelection;
    }

    /**
     * Legt den Wert der forwardToNumberSelection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CallForwardingSelectiveNumberSelection }
     *     
     */
    public void setForwardToNumberSelection(CallForwardingSelectiveNumberSelection value) {
        this.forwardToNumberSelection = value;
    }

    /**
     * Ruft den Wert der forwardToPhoneNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForwardToPhoneNumber() {
        return forwardToPhoneNumber;
    }

    /**
     * Legt den Wert der forwardToPhoneNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForwardToPhoneNumber(String value) {
        this.forwardToPhoneNumber = value;
    }

    /**
     * Ruft den Wert der criteria-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CriteriaWithFromDnAndCallToNumber }
     *     
     */
    public CriteriaWithFromDnAndCallToNumber getCriteria() {
        return criteria;
    }

    /**
     * Legt den Wert der criteria-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CriteriaWithFromDnAndCallToNumber }
     *     
     */
    public void setCriteria(CriteriaWithFromDnAndCallToNumber value) {
        this.criteria = value;
    }

}
