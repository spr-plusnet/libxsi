//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
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
 *         &lt;element name="forwardToNumberSelection" type="{http://schema.broadsoft.com/xsi}CallForwardingSelectiveNumberSelection" minOccurs="0"/>
 *         &lt;element name="forwardToPhoneNumber" type="{http://schema.broadsoft.com/xsi}OutgoingDNorSIPURI" minOccurs="0"/>
 *         &lt;element name="criteria" type="{http://schema.broadsoft.com/xsi}CriteriaWithFromDnAndCallToNumber" minOccurs="0"/>
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
