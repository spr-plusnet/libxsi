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
 *         The Call Updated event is generated when call attributes are
 *         modified,with the call state not being modified. Examples of
 *         such updates are: remote party information changes, local
 *         endpoint changes, personality changes. Local endpoint changes
 *         occurs if for instance a subscriber has multiple access
 *         endpoints and performs a Call Retrieve from a phone, then the
 *         AccessEndpoint is expected to be modified. A Personality change
 *         can occur during a Directed Call Pickup with Barge-in
 *         As a result, a remote application must inspect the various field of
 *         the Call Updated event to determine what change occurred since
 *         the last notification.
 *       
 * 
 * <p>Java-Klasse für CallUpdatedEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CallUpdatedEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}CallEvent">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallUpdatedEvent")
public class CallUpdatedEvent
    extends CallEvent
{


}
