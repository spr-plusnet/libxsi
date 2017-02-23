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
 * &lt;complexType name="CallSecurityClassificationUpdatedEvent">
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
@XmlType(name = "CallSecurityClassificationUpdatedEvent")
public class CallSecurityClassificationUpdatedEvent
    extends CallEvent
{


}
