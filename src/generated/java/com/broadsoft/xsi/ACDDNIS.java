//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dnisDisplaySetting" type="{http://schema.broadsoft.com/xsi}ACDDNISDisplaySetting" minOccurs="0"/&gt;
 *         &lt;element name="dnisPrioritySetting" type="{http://schema.broadsoft.com/xsi}ACDDNISPrioritySetting" minOccurs="0"/&gt;
 *         &lt;element name="dnisInfoList" type="{http://schema.broadsoft.com/xsi}ACDDNISInfoList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dnisDisplaySetting",
    "dnisPrioritySetting",
    "dnisInfoList"
})
@XmlRootElement(name = "ACDDNIS")
public class ACDDNIS {

    protected ACDDNISDisplaySetting dnisDisplaySetting;
    protected ACDDNISPrioritySetting dnisPrioritySetting;
    protected ACDDNISInfoList dnisInfoList;

    /**
     * Ruft den Wert der dnisDisplaySetting-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ACDDNISDisplaySetting }
     *     
     */
    public ACDDNISDisplaySetting getDnisDisplaySetting() {
        return dnisDisplaySetting;
    }

    /**
     * Legt den Wert der dnisDisplaySetting-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ACDDNISDisplaySetting }
     *     
     */
    public void setDnisDisplaySetting(ACDDNISDisplaySetting value) {
        this.dnisDisplaySetting = value;
    }

    /**
     * Ruft den Wert der dnisPrioritySetting-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ACDDNISPrioritySetting }
     *     
     */
    public ACDDNISPrioritySetting getDnisPrioritySetting() {
        return dnisPrioritySetting;
    }

    /**
     * Legt den Wert der dnisPrioritySetting-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ACDDNISPrioritySetting }
     *     
     */
    public void setDnisPrioritySetting(ACDDNISPrioritySetting value) {
        this.dnisPrioritySetting = value;
    }

    /**
     * Ruft den Wert der dnisInfoList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ACDDNISInfoList }
     *     
     */
    public ACDDNISInfoList getDnisInfoList() {
        return dnisInfoList;
    }

    /**
     * Legt den Wert der dnisInfoList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ACDDNISInfoList }
     *     
     */
    public void setDnisInfoList(ACDDNISInfoList value) {
        this.dnisInfoList = value;
    }

}
