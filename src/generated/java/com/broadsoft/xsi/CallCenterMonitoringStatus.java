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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The CallCenterMonitoringStatus maintains real-time information about the call center.
 *         
 *         Change History:
 *         19     - Modified: 
 *                   elements averageHandlingTime, expectedWaitTime, averageSpeedOfAnswer, 
 *                            longestWaitTime, numCallsInQueue
 *                    types changed from NonNegativeInt to NonNegativeIntWithSeverity        
 *       
 * 
 * <p>Java-Klasse für CallCenterMonitoringStatus complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CallCenterMonitoringStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="averageHandlingTime" type="{http://schema.broadsoft.com/xsi}NonNegativeIntWithSeverity" minOccurs="0"/>
 *         &lt;element name="expectedWaitTime" type="{http://schema.broadsoft.com/xsi}NonNegativeIntWithSeverity" minOccurs="0"/>
 *         &lt;element name="averageSpeedOfAnswer" type="{http://schema.broadsoft.com/xsi}NonNegativeIntWithSeverity"/>
 *         &lt;element name="longestWaitTime" type="{http://schema.broadsoft.com/xsi}NonNegativeIntWithSeverity"/>
 *         &lt;element name="numCallsInQueue" type="{http://schema.broadsoft.com/xsi}NonNegativeIntWithSeverity"/>
 *         &lt;element name="numAgentsAssigned" type="{http://schema.broadsoft.com/xsi}NonNegativeInt"/>
 *         &lt;element name="numAgentsStaffed" type="{http://schema.broadsoft.com/xsi}NonNegativeInt"/>
 *         &lt;element name="numStaffedAgentsIdle" type="{http://schema.broadsoft.com/xsi}NonNegativeInt"/>
 *         &lt;element name="numStaffedAgentsUnavailable" type="{http://schema.broadsoft.com/xsi}NonNegativeInt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallCenterMonitoringStatus", propOrder = {
    "averageHandlingTime",
    "expectedWaitTime",
    "averageSpeedOfAnswer",
    "longestWaitTime",
    "numCallsInQueue",
    "numAgentsAssigned",
    "numAgentsStaffed",
    "numStaffedAgentsIdle",
    "numStaffedAgentsUnavailable"
})
public class CallCenterMonitoringStatus {

    protected NonNegativeIntWithSeverity averageHandlingTime;
    protected NonNegativeIntWithSeverity expectedWaitTime;
    @XmlElement(required = true)
    protected NonNegativeIntWithSeverity averageSpeedOfAnswer;
    @XmlElement(required = true)
    protected NonNegativeIntWithSeverity longestWaitTime;
    @XmlElement(required = true)
    protected NonNegativeIntWithSeverity numCallsInQueue;
    protected int numAgentsAssigned;
    protected int numAgentsStaffed;
    protected int numStaffedAgentsIdle;
    protected int numStaffedAgentsUnavailable;

    /**
     * Ruft den Wert der averageHandlingTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeIntWithSeverity }
     *     
     */
    public NonNegativeIntWithSeverity getAverageHandlingTime() {
        return averageHandlingTime;
    }

    /**
     * Legt den Wert der averageHandlingTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeIntWithSeverity }
     *     
     */
    public void setAverageHandlingTime(NonNegativeIntWithSeverity value) {
        this.averageHandlingTime = value;
    }

    /**
     * Ruft den Wert der expectedWaitTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeIntWithSeverity }
     *     
     */
    public NonNegativeIntWithSeverity getExpectedWaitTime() {
        return expectedWaitTime;
    }

    /**
     * Legt den Wert der expectedWaitTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeIntWithSeverity }
     *     
     */
    public void setExpectedWaitTime(NonNegativeIntWithSeverity value) {
        this.expectedWaitTime = value;
    }

    /**
     * Ruft den Wert der averageSpeedOfAnswer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeIntWithSeverity }
     *     
     */
    public NonNegativeIntWithSeverity getAverageSpeedOfAnswer() {
        return averageSpeedOfAnswer;
    }

    /**
     * Legt den Wert der averageSpeedOfAnswer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeIntWithSeverity }
     *     
     */
    public void setAverageSpeedOfAnswer(NonNegativeIntWithSeverity value) {
        this.averageSpeedOfAnswer = value;
    }

    /**
     * Ruft den Wert der longestWaitTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeIntWithSeverity }
     *     
     */
    public NonNegativeIntWithSeverity getLongestWaitTime() {
        return longestWaitTime;
    }

    /**
     * Legt den Wert der longestWaitTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeIntWithSeverity }
     *     
     */
    public void setLongestWaitTime(NonNegativeIntWithSeverity value) {
        this.longestWaitTime = value;
    }

    /**
     * Ruft den Wert der numCallsInQueue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeIntWithSeverity }
     *     
     */
    public NonNegativeIntWithSeverity getNumCallsInQueue() {
        return numCallsInQueue;
    }

    /**
     * Legt den Wert der numCallsInQueue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeIntWithSeverity }
     *     
     */
    public void setNumCallsInQueue(NonNegativeIntWithSeverity value) {
        this.numCallsInQueue = value;
    }

    /**
     * Ruft den Wert der numAgentsAssigned-Eigenschaft ab.
     * 
     */
    public int getNumAgentsAssigned() {
        return numAgentsAssigned;
    }

    /**
     * Legt den Wert der numAgentsAssigned-Eigenschaft fest.
     * 
     */
    public void setNumAgentsAssigned(int value) {
        this.numAgentsAssigned = value;
    }

    /**
     * Ruft den Wert der numAgentsStaffed-Eigenschaft ab.
     * 
     */
    public int getNumAgentsStaffed() {
        return numAgentsStaffed;
    }

    /**
     * Legt den Wert der numAgentsStaffed-Eigenschaft fest.
     * 
     */
    public void setNumAgentsStaffed(int value) {
        this.numAgentsStaffed = value;
    }

    /**
     * Ruft den Wert der numStaffedAgentsIdle-Eigenschaft ab.
     * 
     */
    public int getNumStaffedAgentsIdle() {
        return numStaffedAgentsIdle;
    }

    /**
     * Legt den Wert der numStaffedAgentsIdle-Eigenschaft fest.
     * 
     */
    public void setNumStaffedAgentsIdle(int value) {
        this.numStaffedAgentsIdle = value;
    }

    /**
     * Ruft den Wert der numStaffedAgentsUnavailable-Eigenschaft ab.
     * 
     */
    public int getNumStaffedAgentsUnavailable() {
        return numStaffedAgentsUnavailable;
    }

    /**
     * Legt den Wert der numStaffedAgentsUnavailable-Eigenschaft fest.
     * 
     */
    public void setNumStaffedAgentsUnavailable(int value) {
        this.numStaffedAgentsUnavailable = value;
    }

}
