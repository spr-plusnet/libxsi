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
 *         A Call Center Agent On-Call Alert Event is sent
 *         if an agent has been on a call or idle
 *         for too long.
 *   
 *         The event is also sent to clear or update the
 *         severity of alerts.
 *       
 * 
 * <p>Java-Klasse für CallCenterAgentOnCallAlertEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CallCenterAgentOnCallAlertEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertInfo" type="{http://schema.broadsoft.com/xsi}CallCenterAgentOnCallAlertInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallCenterAgentOnCallAlertEvent", propOrder = {
    "alertInfo"
})
public class CallCenterAgentOnCallAlertEvent
    extends EventData
{

    @XmlElement(required = true)
    protected CallCenterAgentOnCallAlertInfo alertInfo;

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
