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
 * 			Unavailable Code List for a call center.
 *         
 * 
 * <p>Java-Klasse für ACDAgentUnavailableCodeList complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ACDAgentUnavailableCodeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unavailableCodeDetail" type="{http://schema.broadsoft.com/xsi}ACDAgentUnavailableCodeDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACDAgentUnavailableCodeList", propOrder = {
    "unavailableCodeDetail"
})
public class ACDAgentUnavailableCodeList {

    protected List<ACDAgentUnavailableCodeDetail> unavailableCodeDetail;

    /**
     * Gets the value of the unavailableCodeDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unavailableCodeDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnavailableCodeDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ACDAgentUnavailableCodeDetail }
     * 
     * 
     */
    public List<ACDAgentUnavailableCodeDetail> getUnavailableCodeDetail() {
        if (unavailableCodeDetail == null) {
            unavailableCodeDetail = new ArrayList<ACDAgentUnavailableCodeDetail>();
        }
        return this.unavailableCodeDetail;
    }

}
