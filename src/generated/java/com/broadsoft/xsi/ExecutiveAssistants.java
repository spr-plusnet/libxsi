//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="ExecutiveAssistants">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allowOptInOut" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="assignedUsers" type="{http://schema.broadsoft.com/xsi}ExecutiveAssistantDetailsList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
