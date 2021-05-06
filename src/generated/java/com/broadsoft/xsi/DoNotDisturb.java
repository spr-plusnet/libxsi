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
 *         Contains the Do Not Disturb service configuration data. This setting
 *         allows you to send your calls
 *         directly to your voice messaging box without ringing
 *         your phone. In addition, you
 *         can make your primary phone emit a short ring burst to
 *         inform you when the call is
 *         being sent to voice messaging by using the Ring Reminder.
 *         This is important when you
 *         have forgotten the service is turned on and you are at
 *         your phone waiting to receive
 *         calls.
 *       
 * 
 * <p>Java-Klasse für DoNotDisturb complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DoNotDisturb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ringSplash" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoNotDisturb", propOrder = {
    "ringSplash"
})
public class DoNotDisturb
    extends ActivatableServiceInfo
{

    protected Boolean ringSplash;

    /**
     * Ruft den Wert der ringSplash-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRingSplash() {
        return ringSplash;
    }

    /**
     * Legt den Wert der ringSplash-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRingSplash(Boolean value) {
        this.ringSplash = value;
    }

}
