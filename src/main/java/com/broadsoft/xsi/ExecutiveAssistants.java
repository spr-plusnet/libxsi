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
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         Provides details for the list of assistants assigned to the executive.
 *       
 * 
 * <p>Java-Klasse für ExecutiveAssistants complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ExecutiveAssistants"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="allowOptInOut" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="assignedUsers" type="{http://schema.broadsoft.com/xsi}ExecutiveAssistantDetailsList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecutiveAssistants", propOrder = {
    "allowOptInOut",
    "assignedUsers"
})
public class ExecutiveAssistants {

    protected boolean allowOptInOut;
    @XmlElement(required = true)
    protected ExecutiveAssistantDetailsList assignedUsers;

    /**
     * Ruft den Wert der allowOptInOut-Eigenschaft ab.
     * 
     */
    public boolean isAllowOptInOut() {
        return allowOptInOut;
    }

    /**
     * Legt den Wert der allowOptInOut-Eigenschaft fest.
     * 
     */
    public void setAllowOptInOut(boolean value) {
        this.allowOptInOut = value;
    }

    /**
     * Ruft den Wert der assignedUsers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExecutiveAssistantDetailsList }
     *     
     */
    public ExecutiveAssistantDetailsList getAssignedUsers() {
        return assignedUsers;
    }

    /**
     * Legt den Wert der assignedUsers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutiveAssistantDetailsList }
     *     
     */
    public void setAssignedUsers(ExecutiveAssistantDetailsList value) {
        this.assignedUsers = value;
    }

}
