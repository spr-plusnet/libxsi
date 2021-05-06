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
 *         Initial event sent for the Collaboration event package.
 *         Event is sent if ClientSessionInfo is changed for the collaboration.
 *       
 * 
 * <p>Java-Klasse für CollaborateRoomClientSessionInfoUpdatedEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CollaborateRoomClientSessionInfoUpdatedEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roomSessionInfo" type="{http://schema.broadsoft.com/xsi}CollaborateRoomSessionInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollaborateRoomClientSessionInfoUpdatedEvent", propOrder = {
    "roomSessionInfo"
})
public class CollaborateRoomClientSessionInfoUpdatedEvent
    extends EventData
{

    protected CollaborateRoomSessionInfo roomSessionInfo;

    /**
     * Ruft den Wert der roomSessionInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CollaborateRoomSessionInfo }
     *     
     */
    public CollaborateRoomSessionInfo getRoomSessionInfo() {
        return roomSessionInfo;
    }

    /**
     * Legt den Wert der roomSessionInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CollaborateRoomSessionInfo }
     *     
     */
    public void setRoomSessionInfo(CollaborateRoomSessionInfo value) {
        this.roomSessionInfo = value;
    }

}
