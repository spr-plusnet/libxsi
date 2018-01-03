//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="startIndex" type="{http://schema.broadsoft.com/xsi}PositiveInt"/>
 *         &lt;element name="numberOfRecords" type="{http://schema.broadsoft.com/xsi}NonNegativeInt"/>
 *         &lt;element name="totalAvailableRecords" type="{http://schema.broadsoft.com/xsi}NonNegativeInt"/>
 *         &lt;element name="groupDirectory" type="{http://schema.broadsoft.com/xsi}UserAdditionalDetailsList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "startIndex",
    "numberOfRecords",
    "totalAvailableRecords",
    "groupDirectory"
})
@XmlRootElement(name = "Group")
public class Group {

    protected int startIndex;
    protected int numberOfRecords;
    protected int totalAvailableRecords;
    @XmlElement(required = true)
    protected UserAdditionalDetailsList groupDirectory;

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
     * Ruft den Wert der groupDirectory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserAdditionalDetailsList }
     *     
     */
    public UserAdditionalDetailsList getGroupDirectory() {
        return groupDirectory;
    }

    /**
     * Legt den Wert der groupDirectory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAdditionalDetailsList }
     *     
     */
    public void setGroupDirectory(UserAdditionalDetailsList value) {
        this.groupDirectory = value;
    }

}
