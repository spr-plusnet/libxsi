//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Contains the Call Forwarding Always Secondary (CFAS) service configuration data.
 *         Call Forwarding Always Secondary allows you to forward all your incoming calls to a different
 *         phone number or SIP-URI, such as your home office or cell phone. You can also
 *         make your primary phone emit a short ring burst to inform you if you are next to your
 *         phone when the call is forwarded by using the Ring Reminder. This is important
 *         when you have forgotten the service is turned on and you are at your primary
 *         phone waiting to receive calls. Note that the address (phone number or SIP-URI) you forward
 *         your calls to must be permitted by your outgoing calling plan.
 *         Change History:
 *         R21.sp1 - Added
 *       
 * 
 * <p>Java-Klasse für CallForwardingAlwaysSecondary complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CallForwardingAlwaysSecondary">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}CallForwarding">
 *       &lt;sequence>
 *         &lt;element name="ringSplash" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallForwardingAlwaysSecondary", propOrder = {
    "ringSplash"
})
public class CallForwardingAlwaysSecondary
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
