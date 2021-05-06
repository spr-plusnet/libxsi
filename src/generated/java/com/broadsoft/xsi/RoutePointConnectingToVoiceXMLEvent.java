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
 *         The Route Point Connecting To VoiceXML event is sent when the remote application
 *         performs a Route Point Connect to VoiceXML against a call queued to
 *         a VoiceXML virtual subscriber. This event indicates that the call is offered to the
 *         VoiceXML virtual subscriber but remains in the queue.
 *       
 * 
 * <p>Java-Klasse für RoutePointConnectingToVoiceXMLEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RoutePointConnectingToVoiceXMLEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}RoutePointEvent"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutePointConnectingToVoiceXMLEvent")
public class RoutePointConnectingToVoiceXMLEvent
    extends RoutePointEvent
{


}
