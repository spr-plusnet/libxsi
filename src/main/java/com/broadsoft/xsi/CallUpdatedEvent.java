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
 * &lt;complexType name="CallUpdatedEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}CallEvent"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
