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
 * &lt;complexType name="CollaborateRoomStartedEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
