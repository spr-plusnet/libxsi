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
 *         The Conference Call Made Undeaf event is sent when a call is no
 *         longer deaf through a Conference Undeaf call. The
 *         conferenceEntry specifies if a call is deaf or not. BroadWorks
 *         issues this event by sending a ConferenceCallMadeUndeafEvent.
 *         This event contains the common parameters listed at the
 *         beginning of this section and the following specific parameter.
 *       
 * 
 * <p>Java-Klasse für ConferenceCallMadeUnDeafEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ConferenceCallMadeUnDeafEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}ConferenceEvent"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConferenceCallMadeUnDeafEvent")
public class ConferenceCallMadeUnDeafEvent
    extends ConferenceEvent
{


}
