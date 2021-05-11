//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         Criteria for services which define criteria for outgoing phone number.
 *         
 *         Change History:
 *         R19.0 - Added
 *       
 * 
 * <p>Java-Klasse für CriteriaWithToDn complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CriteriaWithToDn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}Criteria"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="criteriaToDn" type="{http://schema.broadsoft.com/xsi}CriteriaToDn" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CriteriaWithToDn", propOrder = {
    "criteriaToDn"
})
public class CriteriaWithToDn
    extends Criteria
{

    protected CriteriaToDn criteriaToDn;

    /**
     * Ruft den Wert der criteriaToDn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CriteriaToDn }
     *     
     */
    public CriteriaToDn getCriteriaToDn() {
        return criteriaToDn;
    }

    /**
     * Legt den Wert der criteriaToDn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CriteriaToDn }
     *     
     */
    public void setCriteriaToDn(CriteriaToDn value) {
        this.criteriaToDn = value;
    }

}
