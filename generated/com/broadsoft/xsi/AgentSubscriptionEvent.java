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
 * &lt;complexType name="AgentSubscriptionEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData">
 *       &lt;sequence>
 *         &lt;element name="joinData" type="{http://schema.broadsoft.com/xsi}ACDAgentJoinData"/>
 *         &lt;element name="stateInfo" type="{http://schema.broadsoft.com/xsi}AgentStateInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
