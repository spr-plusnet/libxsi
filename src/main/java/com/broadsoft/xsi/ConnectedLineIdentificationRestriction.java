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
 * &lt;complexType name="ConnectedLineIdentificationRestriction"&gt;
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
@XmlType(name = "ConnectedLineIdentificationRestriction")
public class ConnectedLineIdentificationRestriction
    extends ActivatableServiceInfo
{


}
