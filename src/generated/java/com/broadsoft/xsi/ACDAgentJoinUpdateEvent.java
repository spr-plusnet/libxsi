//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Notification with the information on the ACD the agent is joining or leaving.
 *         Change History:
 *           Rel19.0 - This event is also generated when the skill level of the 
 *                     agent is modified.
 *       
 * 
 * <p>Java-Klasse für ACDAgentJoinUpdateEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ACDAgentJoinUpdateEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData">
 *       &lt;sequence>
 *         &lt;element name="ccAgentJoinUpdateData" type="{http://schema.broadsoft.com/xsi}ACDAgentJoinUpdateData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACDAgentJoinUpdateEvent", propOrder = {
    "ccAgentJoinUpdateData"
})
public class ACDAgentJoinUpdateEvent
    extends EventData
{

    protected ACDAgentJoinUpdateData ccAgentJoinUpdateData;

    /**
     * Ruft den Wert der ccAgentJoinUpdateData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ACDAgentJoinUpdateData }
     *     
     */
    public ACDAgentJoinUpdateData getCcAgentJoinUpdateData() {
        return ccAgentJoinUpdateData;
    }

    /**
     * Legt den Wert der ccAgentJoinUpdateData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ACDAgentJoinUpdateData }
     *     
     */
    public void setCcAgentJoinUpdateData(ACDAgentJoinUpdateData value) {
        this.ccAgentJoinUpdateData = value;
    }

}
