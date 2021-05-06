//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="startIndex" type="{http://schema.broadsoft.com/xsi}PositiveInt"/&gt;
 *         &lt;element name="numberOfRecords" type="{http://schema.broadsoft.com/xsi}NonNegativeInt"/&gt;
 *         &lt;element name="totalAvailableRecords" type="{http://schema.broadsoft.com/xsi}NonNegativeInt"/&gt;
 *         &lt;element name="enterpriseDirectory" type="{http://schema.broadsoft.com/xsi}UserAdditionalDetailsList"/&gt;
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
    "startIndex",
    "numberOfRecords",
    "totalAvailableRecords",
    "enterpriseDirectory"
})
@XmlRootElement(name = "Enterprise")
public class Enterprise {

    protected int startIndex;
    protected int numberOfRecords;
    protected int totalAvailableRecords;
    @XmlElement(required = true)
    protected UserAdditionalDetailsList enterpriseDirectory;

    /**
     * Ruft den Wert der startIndex-Eigenschaft ab.
     * 
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * Legt den Wert der startIndex-Eigenschaft fest.
     * 
     */
    public void setStartIndex(int value) {
        this.startIndex = value;
    }

    /**
     * Ruft den Wert der numberOfRecords-Eigenschaft ab.
     * 
     */
    public int getNumberOfRecords() {
        return numberOfRecords;
    }

    /**
     * Legt den Wert der numberOfRecords-Eigenschaft fest.
     * 
     */
    public void setNumberOfRecords(int value) {
        this.numberOfRecords = value;
    }

    /**
     * Ruft den Wert der totalAvailableRecords-Eigenschaft ab.
     * 
     */
    public int getTotalAvailableRecords() {
        return totalAvailableRecords;
    }

    /**
     * Legt den Wert der totalAvailableRecords-Eigenschaft fest.
     * 
     */
    public void setTotalAvailableRecords(int value) {
        this.totalAvailableRecords = value;
    }

    /**
     * Ruft den Wert der enterpriseDirectory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserAdditionalDetailsList }
     *     
     */
    public UserAdditionalDetailsList getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    /**
     * Legt den Wert der enterpriseDirectory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAdditionalDetailsList }
     *     
     */
    public void setEnterpriseDirectory(UserAdditionalDetailsList value) {
        this.enterpriseDirectory = value;
    }

}
