//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="CollaborateRoomClientSessionInfoUpdatedEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData">
 *       &lt;sequence>
 *         &lt;element name="roomSessionInfo" type="{http://schema.broadsoft.com/xsi}CollaborateRoomSessionInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
