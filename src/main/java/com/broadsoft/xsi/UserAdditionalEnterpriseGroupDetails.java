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
 *         UserAdditional Details with User Details.
 *       
 * 
 * <p>Java-Klasse für UserAdditionalEnterpriseGroupDetails complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UserAdditionalEnterpriseGroupDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}UserDetails"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="additionalDetails" type="{http://schema.broadsoft.com/xsi}UserAdditionalDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
