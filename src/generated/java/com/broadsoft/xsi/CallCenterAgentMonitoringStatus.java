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
 * &lt;complexType name="CallCenterAgentMonitoringStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="averageACDCallTime" type="{http://schema.broadsoft.com/xsi}NonNegativeIntWithSeverity" minOccurs="0"/&gt;
 *         &lt;element name="averageACDOutgoingCallTime" type="{http://schema.broadsoft.com/xsi}NonNegativeIntWithSeverity"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
