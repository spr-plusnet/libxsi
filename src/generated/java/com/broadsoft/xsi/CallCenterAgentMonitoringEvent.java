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
 *         The Call Center Agent Monitoring event is sent when an 
 *         ACD call to an agent ends or is transferred.
 *       
 * 
 * <p>Java-Klasse für CallCenterAgentMonitoringEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CallCenterAgentMonitoringEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData">
 *       &lt;sequence>
 *         &lt;element name="monitoringStatus" type="{http://schema.broadsoft.com/xsi}CallCenterAgentMonitoringStatus"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallCenterAgentMonitoringEvent", propOrder = {
    "monitoringStatus"
})
public class CallCenterAgentMonitoringEvent
    extends EventData
{

    @XmlElement(required = true)
    protected CallCenterAgentMonitoringStatus monitoringStatus;

    /**
     * Ruft den Wert der monitoringStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CallCenterAgentMonitoringStatus }
     *     
     */
    public CallCenterAgentMonitoringStatus getMonitoringStatus() {
        return monitoringStatus;
    }

    /**
     * Legt den Wert der monitoringStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CallCenterAgentMonitoringStatus }
     *     
     */
    public void setMonitoringStatus(CallCenterAgentMonitoringStatus value) {
        this.monitoringStatus = value;
    }

}
