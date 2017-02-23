//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="BroadWorksMobilityProfileIdentityEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="profileAlertingPolicy" type="{http://schema.broadsoft.com/xsi}BroadWorksMobilityAlertingPolicyInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
