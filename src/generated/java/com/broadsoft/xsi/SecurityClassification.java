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
 *         &lt;element name="allowedLevels" type="{http://schema.broadsoft.com/xsi}SecurityClassificationLevels" minOccurs="0"/>
 *         &lt;element name="overrideLevel" type="{http://schema.broadsoft.com/xsi}NonEmptyToken"/>
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
    "allowedLevels",
    "overrideLevel"
})
@XmlRootElement(name = "SecurityClassification")
public class SecurityClassification {

    protected SecurityClassificationLevels allowedLevels;
    @XmlElement(required = true, nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String overrideLevel;

    /**
     * Ruft den Wert der allowedLevels-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SecurityClassificationLevels }
     *     
     */
    public SecurityClassificationLevels getAllowedLevels() {
        return allowedLevels;
    }

    /**
     * Legt den Wert der allowedLevels-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityClassificationLevels }
     *     
     */
    public void setAllowedLevels(SecurityClassificationLevels value) {
        this.allowedLevels = value;
    }

    /**
     * Ruft den Wert der overrideLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideLevel() {
        return overrideLevel;
    }

    /**
     * Legt den Wert der overrideLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideLevel(String value) {
        this.overrideLevel = value;
    }

}
