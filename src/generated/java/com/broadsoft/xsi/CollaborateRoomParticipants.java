//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         A list of Collaborate room Participant.
 *         Release Added: R21.0
 *       
 * 
 * <p>Java-Klasse für CollaborateRoomParticipants complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CollaborateRoomParticipants">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roomParticipant" type="{http://schema.broadsoft.com/xsi}CollaborateRoomParticipant" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollaborateRoomParticipants", propOrder = {
    "roomParticipant"
})
public class CollaborateRoomParticipants {

    protected List<CollaborateRoomParticipant> roomParticipant;

    /**
     * Gets the value of the roomParticipant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomParticipant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomParticipant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollaborateRoomParticipant }
     * 
     * 
     */
    public List<CollaborateRoomParticipant> getRoomParticipant() {
        if (roomParticipant == null) {
            roomParticipant = new ArrayList<CollaborateRoomParticipant>();
        }
        return this.roomParticipant;
    }

}
