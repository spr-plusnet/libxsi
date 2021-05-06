//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="allowCallAnchoringControl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="preventCallsToOwnMobiles" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="profileIdentity" type="{http://schema.broadsoft.com/xsi}BroadWorksMobilityProfileIdentityEntry" minOccurs="0"/&gt;
 *         &lt;element name="mobileIdentity" type="{http://schema.broadsoft.com/xsi}BroadWorksMobilityMobileIdentityEntry" maxOccurs="10" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "allowCallAnchoringControl",
    "preventCallsToOwnMobiles",
    "profileIdentity",
    "mobileIdentity"
})
@XmlRootElement(name = "BroadWorksMobility")
public class BroadWorksMobility
    extends ActivatableServiceInfo
{

    protected Boolean allowCallAnchoringControl;
    protected Boolean preventCallsToOwnMobiles;
    protected BroadWorksMobilityProfileIdentityEntry profileIdentity;
    protected List<BroadWorksMobilityMobileIdentityEntry> mobileIdentity;

    /**
     * Ruft den Wert der allowCallAnchoringControl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowCallAnchoringControl() {
        return allowCallAnchoringControl;
    }

    /**
     * Legt den Wert der allowCallAnchoringControl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowCallAnchoringControl(Boolean value) {
        this.allowCallAnchoringControl = value;
    }

    /**
     * Ruft den Wert der preventCallsToOwnMobiles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreventCallsToOwnMobiles() {
        return preventCallsToOwnMobiles;
    }

    /**
     * Legt den Wert der preventCallsToOwnMobiles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreventCallsToOwnMobiles(Boolean value) {
        this.preventCallsToOwnMobiles = value;
    }

    /**
     * Ruft den Wert der profileIdentity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BroadWorksMobilityProfileIdentityEntry }
     *     
     */
    public BroadWorksMobilityProfileIdentityEntry getProfileIdentity() {
        return profileIdentity;
    }

    /**
     * Legt den Wert der profileIdentity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BroadWorksMobilityProfileIdentityEntry }
     *     
     */
    public void setProfileIdentity(BroadWorksMobilityProfileIdentityEntry value) {
        this.profileIdentity = value;
    }

    /**
     * Gets the value of the mobileIdentity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the mobileIdentity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMobileIdentity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BroadWorksMobilityMobileIdentityEntry }
     * 
     * 
     */
    public List<BroadWorksMobilityMobileIdentityEntry> getMobileIdentity() {
        if (mobileIdentity == null) {
            mobileIdentity = new ArrayList<BroadWorksMobilityMobileIdentityEntry>();
        }
        return this.mobileIdentity;
    }

}
