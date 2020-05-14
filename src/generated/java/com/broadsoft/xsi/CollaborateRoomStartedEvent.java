//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Sent whenever a collaboration starts.
 *         A room starts when the first participant joins unless the owner required 
 *         to start room option is selected for the room, in which case the room does 
 *         not start until a owner joins the room.
 *         
 *         Note that rooms can be started more than once.  Each time a room starts it 
 *         initializes the room information according to the configuration of the room.
 *         It is possible for a conference to require a owner before starting.  In this 
 *         case, any other participants who connect prior to the moderator joining are 
 *         placed on hold. Only when an owner joins is a CollaborateRoomStartedEvent sent. 
 *         It is followed by a join event that contains a list of the participants who 
 *         have now entered the call, including the owner.
 *       
 * 
 * <p>Java-Klasse für CollaborateRoomStartedEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CollaborateRoomStartedEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollaborateRoomStartedEvent")
public class CollaborateRoomStartedEvent
    extends EventData
{


}
