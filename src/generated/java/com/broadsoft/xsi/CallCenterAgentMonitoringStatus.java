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
 *         The CallCenterAgentMonitoringStatus maintains real-time information about the agent.
 *         
 *         Change History: 
 *         19     - Modified: 
 *                   averageACDCallTime type changed from 
 *                     NonNegativeInt to NonNegativeIntWithSeverity
 *                   averageACDOutgoingCallTime type changed from 
 *                     NonNegativeInt to NonNegativeIntWithSeverity
 *         
 *       
 * 
 * <p>Java-Klasse für CallCenterAgentMonitoringStatus complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CallCenterAgentMonitoringStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="averageACDCallTime" type="{http://schema.broadsoft.com/xsi}NonNegativeIntWithSeverity" minOccurs="0"/>
 *         &lt;element name="averageACDOutgoingCallTime" type="{http://schema.broadsoft.com/xsi}NonNegativeIntWithSeverity"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallCenterAgentMonitoringStatus", propOrder = {
    "averageACDCallTime",
    "averageACDOutgoingCallTime"
})
public class CallCenterAgentMonitoringStatus {

    protected NonNegativeIntWithSeverity averageACDCallTime;
    @XmlElement(required = true)
    protected NonNegativeIntWithSeverity averageACDOutgoingCallTime;

    /**
     * Ruft den Wert der averageACDCallTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeIntWithSeverity }
     *     
     */
    public NonNegativeIntWithSeverity getAverageACDCallTime() {
        return averageACDCallTime;
    }

    /**
     * Legt den Wert der averageACDCallTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeIntWithSeverity }
     *     
     */
    public void setAverageACDCallTime(NonNegativeIntWithSeverity value) {
        this.averageACDCallTime = value;
    }

    /**
     * Ruft den Wert der averageACDOutgoingCallTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeIntWithSeverity }
     *     
     */
    public NonNegativeIntWithSeverity getAverageACDOutgoingCallTime() {
        return averageACDOutgoingCallTime;
    }

    /**
     * Legt den Wert der averageACDOutgoingCallTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeIntWithSeverity }
     *     
     */
    public void setAverageACDOutgoingCallTime(NonNegativeIntWithSeverity value) {
        this.averageACDOutgoingCallTime = value;
    }

}
