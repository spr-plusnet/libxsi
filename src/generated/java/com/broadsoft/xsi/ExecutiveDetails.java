//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
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
 *         Details regarding an executive. 
 *         Column headings are: "User Id", "Last Name", "First Name" and "Opt In".
 *         Change History:
 *         R20.0 – Added.
 *       
 * 
 * <p>Java-Klasse für ExecutiveDetails complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ExecutiveDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="executiveUserId" type="{http://schema.broadsoft.com/xsi}UserId"/>
 *         &lt;element name="executiveLastName" type="{http://schema.broadsoft.com/xsi}LastName" minOccurs="0"/>
 *         &lt;element name="executiveFirstName" type="{http://schema.broadsoft.com/xsi}FirstName" minOccurs="0"/>
 *         &lt;element name="optIn" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="executiveUri" type="{http://schema.broadsoft.com/xsi}URL" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecutiveDetails", propOrder = {
    "executiveUserId",
    "executiveLastName",
    "executiveFirstName",
    "optIn",
    "executiveUri"
})
public class ExecutiveDetails {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String executiveUserId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String executiveLastName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String executiveFirstName;
    protected boolean optIn;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String executiveUri;

    /**
     * Ruft den Wert der executiveUserId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutiveUserId() {
        return executiveUserId;
    }

    /**
     * Legt den Wert der executiveUserId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutiveUserId(String value) {
        this.executiveUserId = value;
    }

    /**
     * Ruft den Wert der executiveLastName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutiveLastName() {
        return executiveLastName;
    }

    /**
     * Legt den Wert der executiveLastName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutiveLastName(String value) {
        this.executiveLastName = value;
    }

    /**
     * Ruft den Wert der executiveFirstName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutiveFirstName() {
        return executiveFirstName;
    }

    /**
     * Legt den Wert der executiveFirstName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutiveFirstName(String value) {
        this.executiveFirstName = value;
    }

    /**
     * Ruft den Wert der optIn-Eigenschaft ab.
     * 
     */
    public boolean isOptIn() {
        return optIn;
    }

    /**
     * Legt den Wert der optIn-Eigenschaft fest.
     * 
     */
    public void setOptIn(boolean value) {
        this.optIn = value;
    }

    /**
     * Ruft den Wert der executiveUri-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutiveUri() {
        return executiveUri;
    }

    /**
     * Legt den Wert der executiveUri-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutiveUri(String value) {
        this.executiveUri = value;
    }

}
