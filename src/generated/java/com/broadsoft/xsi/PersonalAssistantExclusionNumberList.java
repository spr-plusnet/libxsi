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
import jakarta.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="PersonalAssistantExclusionNumberList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="exclusionNumber" type="{http://schema.broadsoft.com/xsi}PersonalAssistantExclusionNumberEntry" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
     * returned list will be present inside the Jakarta XML Binding object.
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
