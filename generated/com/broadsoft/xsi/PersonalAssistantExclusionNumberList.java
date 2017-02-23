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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Contains the Personal Assistant configuration
 *         data - Exclusion List.
 * 
 *         Change History:
 *         21.0 – Added.
 *       
 * 
 * <p>Java-Klasse für PersonalAssistantExclusionNumberList complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PersonalAssistantExclusionNumberList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exclusionNumber" type="{http://schema.broadsoft.com/xsi}PersonalAssistantExclusionNumberEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonalAssistantExclusionNumberList", propOrder = {
    "exclusionNumber"
})
public class PersonalAssistantExclusionNumberList {

    protected List<PersonalAssistantExclusionNumberEntry> exclusionNumber;

    /**
     * Gets the value of the exclusionNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exclusionNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExclusionNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonalAssistantExclusionNumberEntry }
     * 
     * 
     */
    public List<PersonalAssistantExclusionNumberEntry> getExclusionNumber() {
        if (exclusionNumber == null) {
            exclusionNumber = new ArrayList<PersonalAssistantExclusionNumberEntry>();
        }
        return this.exclusionNumber;
    }

}
