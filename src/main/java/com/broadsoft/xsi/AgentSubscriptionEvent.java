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
 *         Notification with the list of ACDs that an agent belongs to and the state of the
 *         Agent. This is used for initial notifications.
 * 
 *       
 * 
 * <p>Java-Klasse für AgentSubscriptionEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AgentSubscriptionEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="joinData" type="{http://schema.broadsoft.com/xsi}ACDAgentJoinData"/&gt;
 *         &lt;element name="stateInfo" type="{http://schema.broadsoft.com/xsi}AgentStateInformation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentSubscriptionEvent", propOrder = {
    "joinData",
    "stateInfo"
})
public class AgentSubscriptionEvent
    extends EventData
{

    @XmlElement(required = true)
    protected ACDAgentJoinData joinData;
    protected AgentStateInformation stateInfo;

    /**
     * Ruft den Wert der joinData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ACDAgentJoinData }
     *     
     */
    public ACDAgentJoinData getJoinData() {
        return joinData;
    }

    /**
     * Legt den Wert der joinData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ACDAgentJoinData }
     *     
     */
    public void setJoinData(ACDAgentJoinData value) {
        this.joinData = value;
    }

    /**
     * Ruft den Wert der stateInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AgentStateInformation }
     *     
     */
    public AgentStateInformation getStateInfo() {
        return stateInfo;
    }

    /**
     * Legt den Wert der stateInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentStateInformation }
     *     
     */
    public void setStateInfo(AgentStateInformation value) {
        this.stateInfo = value;
    }

}
