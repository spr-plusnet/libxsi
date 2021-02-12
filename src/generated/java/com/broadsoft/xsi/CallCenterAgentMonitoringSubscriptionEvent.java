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
 *         The Call Center Agent Monitoring Subscription Event is the initial event.
 *         
 *       
 * 
 * <p>Java-Klasse für CallCenterAgentMonitoringSubscriptionEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CallCenterAgentMonitoringSubscriptionEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData">
 *       &lt;sequence>
 *         &lt;element name="monitoringStatus" type="{http://schema.broadsoft.com/xsi}CallCenterAgentMonitoringStatus"/>
 *         &lt;element name="alertInfo" type="{http://schema.broadsoft.com/xsi}CallCenterAgentOnCallAlertInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallCenterAgentMonitoringSubscriptionEvent", propOrder = {
    "monitoringStatus",
    "alertInfo"
})
public class CallCenterAgentMonitoringSubscriptionEvent
    extends EventData
{

    @XmlElement(required = true)
    protected CallCenterAgentMonitoringStatus monitoringStatus;
    protected CallCenterAgentOnCallAlertInfo alertInfo;

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

    /**
     * Ruft den Wert der alertInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CallCenterAgentOnCallAlertInfo }
     *     
     */
    public CallCenterAgentOnCallAlertInfo getAlertInfo() {
        return alertInfo;
    }

    /**
     * Legt den Wert der alertInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CallCenterAgentOnCallAlertInfo }
     *     
     */
    public void setAlertInfo(CallCenterAgentOnCallAlertInfo value) {
        this.alertInfo = value;
    }

}
