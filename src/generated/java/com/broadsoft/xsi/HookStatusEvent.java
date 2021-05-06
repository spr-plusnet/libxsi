//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="HookStatusEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hookStatus" type="{http://schema.broadsoft.com/xsi}HookStatusType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
