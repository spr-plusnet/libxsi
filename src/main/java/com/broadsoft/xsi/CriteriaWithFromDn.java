//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="CriteriaWithFromDn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}Criteria"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="criteriaFromDn" type="{http://schema.broadsoft.com/xsi}CriteriaFromDn" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
