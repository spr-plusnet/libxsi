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
 *         The Agent State event is sent when an agent changes state. State
 *         change can be initiated by a remote application Agent State
 *         Change request or from the BroadWorks Call Center client or from
 *         the agent's endpoint or from the web portal.
 *       
 * 
 * <p>Java-Klasse für AgentStateEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AgentStateEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData">
 *       &lt;sequence>
 *         &lt;element name="agentStateInfo" type="{http://schema.broadsoft.com/xsi}AgentStateInformation"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentStateEvent", propOrder = {
    "agentStateInfo"
})
public class AgentStateEvent
    extends EventData
{

    @XmlElement(required = true)
    protected AgentStateInformation agentStateInfo;

    /**
     * Ruft den Wert der agentStateInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AgentStateInformation }
     *     
     */
    public AgentStateInformation getAgentStateInfo() {
        return agentStateInfo;
    }

    /**
     * Legt den Wert der agentStateInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentStateInformation }
     *     
     */
    public void setAgentStateInfo(AgentStateInformation value) {
        this.agentStateInfo = value;
    }

}
