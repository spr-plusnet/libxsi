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
 *         UserAdditional Details with User Details.
 *       
 * 
 * <p>Java-Klasse für UserAdditionalEnterpriseGroupDetails complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UserAdditionalEnterpriseGroupDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}UserDetails">
 *       &lt;sequence>
 *         &lt;element name="additionalDetails" type="{http://schema.broadsoft.com/xsi}UserAdditionalDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserAdditionalEnterpriseGroupDetails", propOrder = {
    "additionalDetails"
})
public class UserAdditionalEnterpriseGroupDetails
    extends UserDetails
{

    protected UserAdditionalDetails additionalDetails;

    /**
     * Ruft den Wert der additionalDetails-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserAdditionalDetails }
     *     
     */
    public UserAdditionalDetails getAdditionalDetails() {
        return additionalDetails;
    }

    /**
     * Legt den Wert der additionalDetails-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAdditionalDetails }
     *     
     */
    public void setAdditionalDetails(UserAdditionalDetails value) {
        this.additionalDetails = value;
    }

}
