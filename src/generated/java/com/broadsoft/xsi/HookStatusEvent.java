//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The Hook Status Event is sent when there is a change in the hook 
 *         status for a user. For example, the event is sent with a hook status 
 *         indicating "Off-Hook" when a user goes off hook to place a call or 
 *         to answer a call. The event is sent with a hook status indicating  
 *         "On-Hook" when the user goes on-hook when the user hangs up to release a 
 *         call.
 * 
 *         Release Added: R19.sp6
 *       
 * 
 * <p>Java-Klasse für HookStatusEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HookStatusEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData">
 *       &lt;sequence>
 *         &lt;element name="hookStatus" type="{http://schema.broadsoft.com/xsi}HookStatusType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HookStatusEvent", propOrder = {
    "hookStatus"
})
public class HookStatusEvent
    extends EventData
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected HookStatusType hookStatus;

    /**
     * Ruft den Wert der hookStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HookStatusType }
     *     
     */
    public HookStatusType getHookStatus() {
        return hookStatus;
    }

    /**
     * Legt den Wert der hookStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HookStatusType }
     *     
     */
    public void setHookStatus(HookStatusType value) {
        this.hookStatus = value;
    }

}
