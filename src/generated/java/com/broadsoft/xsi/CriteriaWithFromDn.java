//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Criteria for services which define criteria for incoming phone number.
 *         
 *         Change History:
 *         R19.0 - Added
 *       
 * 
 * <p>Java-Klasse für CriteriaWithFromDn complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CriteriaWithFromDn">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}Criteria">
 *       &lt;sequence>
 *         &lt;element name="criteriaFromDn" type="{http://schema.broadsoft.com/xsi}CriteriaFromDn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CriteriaWithFromDn", propOrder = {
    "criteriaFromDn"
})
@XmlSeeAlso({
    CriteriaWithFromDnAndCallToNumber.class
})
public class CriteriaWithFromDn
    extends Criteria
{

    protected CriteriaFromDn criteriaFromDn;

    /**
     * Ruft den Wert der criteriaFromDn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CriteriaFromDn }
     *     
     */
    public CriteriaFromDn getCriteriaFromDn() {
        return criteriaFromDn;
    }

    /**
     * Legt den Wert der criteriaFromDn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CriteriaFromDn }
     *     
     */
    public void setCriteriaFromDn(CriteriaFromDn value) {
        this.criteriaFromDn = value;
    }

}
