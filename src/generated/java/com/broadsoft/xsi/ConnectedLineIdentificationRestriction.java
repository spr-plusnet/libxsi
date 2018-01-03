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
 *         User Connected Line Identification Restriction properties. Connected
 *         Line Identification
 *         Restriction allows you to block your number from being shown when receiving a
 *         call. Members of
 *         your group can still see your number when they call you. You have the
 *         choice of turning it on or
 *         off for all calls and then selectively turning it right back on or off
 *         using the feature access
 *         codes.
 *    
 * 
 * <p>Java-Klasse für ConnectedLineIdentificationRestriction complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ConnectedLineIdentificationRestriction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectedLineIdentificationRestriction")
public class ConnectedLineIdentificationRestriction
    extends ActivatableServiceInfo
{


}
