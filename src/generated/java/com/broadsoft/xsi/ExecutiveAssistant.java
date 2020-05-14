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
 *         Provides details for a user assigned the Executive Assistant Service.
 *         Contains the executive assistant setting and a table of executives this assistant has been assigned to.
 *         Change History:
 *         R20.0 – Added.
 *       
 * 
 * <p>Java-Klasse für ExecutiveAssistant complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ExecutiveAssistant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enableDivert" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="divertToPhoneNumber" type="{http://schema.broadsoft.com/xsi}OutgoingDNorSIPURI" minOccurs="0"/>
 *         &lt;element name="executives" type="{http://schema.broadsoft.com/xsi}ExecutiveDetailsList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecutiveAssistant", propOrder = {
    "enableDivert",
    "divertToPhoneNumber",
    "executives"
})
public class ExecutiveAssistant {

    protected boolean enableDivert;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String divertToPhoneNumber;
    protected ExecutiveDetailsList executives;

    /**
     * Ruft den Wert der enableDivert-Eigenschaft ab.
     * 
     */
    public boolean isEnableDivert() {
        return enableDivert;
    }

    /**
     * Legt den Wert der enableDivert-Eigenschaft fest.
     * 
     */
    public void setEnableDivert(boolean value) {
        this.enableDivert = value;
    }

    /**
     * Ruft den Wert der divertToPhoneNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivertToPhoneNumber() {
        return divertToPhoneNumber;
    }

    /**
     * Legt den Wert der divertToPhoneNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivertToPhoneNumber(String value) {
        this.divertToPhoneNumber = value;
    }

    /**
     * Ruft den Wert der executives-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExecutiveDetailsList }
     *     
     */
    public ExecutiveDetailsList getExecutives() {
        return executives;
    }

    /**
     * Legt den Wert der executives-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutiveDetailsList }
     *     
     */
    public void setExecutives(ExecutiveDetailsList value) {
        this.executives = value;
    }

}
