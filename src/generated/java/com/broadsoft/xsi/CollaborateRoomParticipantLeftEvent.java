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
 *         Sent when one or more participants leave a collaboration.
 *         
 *         Change History:
 *         21.0 - added.
 *       
 * 
 * <p>Java-Klasse für CollaborateRoomParticipantLeftEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CollaborateRoomParticipantLeftEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callIds" type="{http://schema.broadsoft.com/xsi}CollaborateRoomCallIdList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollaborateRoomParticipantLeftEvent", propOrder = {
    "callIds"
})
public class CollaborateRoomParticipantLeftEvent
    extends EventData
{

    protected CollaborateRoomCallIdList callIds;

    /**
     * Ruft den Wert der callIds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CollaborateRoomCallIdList }
     *     
     */
    public CollaborateRoomCallIdList getCallIds() {
        return callIds;
    }

    /**
     * Legt den Wert der callIds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CollaborateRoomCallIdList }
     *     
     */
    public void setCallIds(CollaborateRoomCallIdList value) {
        this.callIds = value;
    }

}
