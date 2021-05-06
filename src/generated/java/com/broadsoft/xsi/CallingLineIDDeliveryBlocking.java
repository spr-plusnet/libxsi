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
 *         User Calling LineID Delivery (CLID) Blocking properties. Calling Line ID
 *         Delivery Blocking
 *         allows you to block your number from being shown when calling other
 *         numbers. Members of your
 *         group can still see your number when they are called. You have the choice
 *         of turning it on or
 *         off for all calls and then selectively turning it back on or off using
 *         the feature access codes.
 *    
 * 
 * <p>Java-Klasse für CallingLineIDDeliveryBlocking complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CallingLineIDDeliveryBlocking"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallingLineIDDeliveryBlocking")
public class CallingLineIDDeliveryBlocking
    extends ActivatableServiceInfo
{


}
