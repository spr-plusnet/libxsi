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
 *         Contains the Call Forwarding Always service configuration data.
 *         Call Forwarding Always allows you to forward all your incoming calls to a different
 *         phone number or SIP-URI, such as your home office or cell phone. You can also
 *         make your primary phone emit a short ring burst to inform you if you are next to your
 *         phone when the call is forwarded by using the Ring Reminder. This is important
 *         when you have forgotten the service is turned on and you are at your primary
 *         phone waiting to
 *         receive calls. Note that the address (phone number or SIP-URI) you forward
 *         your calls to must be permitted by your outgoing calling plan. You can also
 *         set the phone
 *         number or SIP-URI to forward to using the voice portal or on the phone
 *         using the feature access code.
 *       
 * 
 * <p>Java-Klasse für CallForwardingAlways complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CallForwardingAlways"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}CallForwarding"&gt;
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
@XmlType(name = "CallForwardingAlways", propOrder = {
    "ringSplash"
})
public class CallForwardingAlways
    extends CallForwarding
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
