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
 *         CallSecurityClassificationUpdatedEvent informs the remote     
 *         application of changes to the security classification    
 *         level of a call for users that have the security  
 *         classification service assigned. The event contains the call 
 *         classification level name.  The event is generated when
 *         (a) there is a change in the call classification level caused
 *         by a user changing his current classification level,
 *         (b) there is a change in the call classification level caused 
 *         by the remote user changing his user classification level (c) there is 
 *         a change to the call classification level caused by changes to the     
 *         call connected party (i.e. transfers).
 *       
 * 
 * <p>Java-Klasse für CallSecurityClassificationUpdatedEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CallSecurityClassificationUpdatedEvent"&gt;
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
@XmlType(name = "CallSecurityClassificationUpdatedEvent")
public class CallSecurityClassificationUpdatedEvent
    extends CallEvent
{


}
