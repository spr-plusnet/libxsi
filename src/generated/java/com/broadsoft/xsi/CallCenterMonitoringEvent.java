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
 *         The Call Center Monitoring event is sent when
 *       
 * 
 * <p>Java-Klasse für CallCenterMonitoringEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CallCenterMonitoringEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData">
 *       &lt;sequence>
 *         &lt;element name="monitoringStatus" type="{http://schema.broadsoft.com/xsi}CallCenterMonitoringStatus"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallCenterMonitoringEvent", propOrder = {
    "monitoringStatus"
})
public class CallCenterMonitoringEvent
    extends EventData
{

    @XmlElement(required = true)
    protected CallCenterMonitoringStatus monitoringStatus;

    /**
     * Ruft den Wert der monitoringStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CallCenterMonitoringStatus }
     *     
     */
    public CallCenterMonitoringStatus getMonitoringStatus() {
        return monitoringStatus;
    }

    /**
     * Legt den Wert der monitoringStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CallCenterMonitoringStatus }
     *     
     */
    public void setMonitoringStatus(CallCenterMonitoringStatus value) {
        this.monitoringStatus = value;
    }

}
