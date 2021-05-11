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
 * &lt;complexType name="ExecutiveDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="executiveUserId" type="{http://schema.broadsoft.com/xsi}UserId"/&gt;
 *         &lt;element name="executiveLastName" type="{http://schema.broadsoft.com/xsi}LastName" minOccurs="0"/&gt;
 *         &lt;element name="executiveFirstName" type="{http://schema.broadsoft.com/xsi}FirstName" minOccurs="0"/&gt;
 *         &lt;element name="optIn" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="executiveUri" type="{http://schema.broadsoft.com/xsi}URL" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
