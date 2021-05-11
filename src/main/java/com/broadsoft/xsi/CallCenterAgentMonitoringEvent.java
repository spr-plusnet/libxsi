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
 *         The Call Center Agent Monitoring event is sent when an 
 *         ACD call to an agent ends or is transferred.
 *       
 * 
 * <p>Java-Klasse für CallCenterAgentMonitoringEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CallCenterAgentMonitoringEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="monitoringStatus" type="{http://schema.broadsoft.com/xsi}CallCenterAgentMonitoringStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
