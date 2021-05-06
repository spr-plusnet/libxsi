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
 *         BroadWorks Mobility User's Profile Identity Entry.
 *         This allows retrieval and modification of profile identity related
 *         attributes.
 *         Change History:
 *         Rel 21: Added
 *       
 * 
 * <p>Java-Klasse für BroadWorksMobilityProfileIdentityEntry complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BroadWorksMobilityProfileIdentityEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="profileAlertingPolicy" type="{http://schema.broadsoft.com/xsi}BroadWorksMobilityAlertingPolicyInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BroadWorksMobilityProfileIdentityEntry", propOrder = {
    "profileAlertingPolicy"
})
public class BroadWorksMobilityProfileIdentityEntry {

    protected BroadWorksMobilityAlertingPolicyInfo profileAlertingPolicy;

    /**
     * Ruft den Wert der profileAlertingPolicy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BroadWorksMobilityAlertingPolicyInfo }
     *     
     */
    public BroadWorksMobilityAlertingPolicyInfo getProfileAlertingPolicy() {
        return profileAlertingPolicy;
    }

    /**
     * Legt den Wert der profileAlertingPolicy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BroadWorksMobilityAlertingPolicyInfo }
     *     
     */
    public void setProfileAlertingPolicy(BroadWorksMobilityAlertingPolicyInfo value) {
        this.profileAlertingPolicy = value;
    }

}
