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
 * <p>Java-Klasse für SecurityClassificationInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SecurityClassificationInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="allowedLevels" type="{http://schema.broadsoft.com/xsi}SecurityClassificationLevels" minOccurs="0"/&gt;
 *         &lt;element name="overrideLevel" type="{http://schema.broadsoft.com/xsi}NonEmptyToken"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityClassificationInfo", propOrder = {
    "allowedLevels",
    "overrideLevel"
})
public class SecurityClassificationInfo {

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
