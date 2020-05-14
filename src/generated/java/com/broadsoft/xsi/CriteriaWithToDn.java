//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="CriteriaWithToDn">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}Criteria">
 *       &lt;sequence>
 *         &lt;element name="criteriaToDn" type="{http://schema.broadsoft.com/xsi}CriteriaToDn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
