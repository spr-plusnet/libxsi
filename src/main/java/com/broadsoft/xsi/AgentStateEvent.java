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
 * &lt;complexType name="AgentStateEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="agentStateInfo" type="{http://schema.broadsoft.com/xsi}AgentStateInformation"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
