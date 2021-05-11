//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="ACDAgentJoinUpdateEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ccAgentJoinUpdateData" type="{http://schema.broadsoft.com/xsi}ACDAgentJoinUpdateData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
