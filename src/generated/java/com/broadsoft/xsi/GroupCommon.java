//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="commonPhoneEntry" type="{http://schema.broadsoft.com/xsi}PersonalEntry" maxOccurs="unbounded" minOccurs="0"/>
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
    "commonPhoneEntry"
})
@XmlRootElement(name = "GroupCommon")
public class GroupCommon {

    protected int startIndex;
    protected int numberOfRecords;
    protected int totalAvailableRecords;
    protected List<PersonalEntry> commonPhoneEntry;

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
     * Gets the value of the commonPhoneEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commonPhoneEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommonPhoneEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonalEntry }
     * 
     * 
     */
    public List<PersonalEntry> getCommonPhoneEntry() {
        if (commonPhoneEntry == null) {
            commonPhoneEntry = new ArrayList<PersonalEntry>();
        }
        return this.commonPhoneEntry;
    }

}
