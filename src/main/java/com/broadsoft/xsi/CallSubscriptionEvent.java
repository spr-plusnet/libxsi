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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         The Call Subscription event is issued immediately after a subscription
 *         is added or refreshed, provided that the subscription target is
 *         not a collection of subscriber (e.g. a group) and that contact
 *         were registered with the subscription.
 *         
 *         Release Modified: R19.sp6
 *       
 * 
 * <p>Java-Klasse für CallSubscriptionEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CallSubscriptionEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="calls" type="{http://schema.broadsoft.com/xsi}CallList" minOccurs="0"/&gt;
 *         &lt;element name="conference" type="{http://schema.broadsoft.com/xsi}Conference" minOccurs="0"/&gt;
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
@XmlType(name = "CallSubscriptionEvent", propOrder = {
    "calls",
    "conference",
    "hookStatus"
})
@XmlSeeAlso({
    CallSubscriptionResyncEvent.class
})
public class CallSubscriptionEvent
    extends EventData
{

    protected CallList calls;
    protected Conference conference;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected HookStatusType hookStatus;

    /**
     * Ruft den Wert der calls-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CallList }
     *     
     */
    public CallList getCalls() {
        return calls;
    }

    /**
     * Legt den Wert der calls-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CallList }
     *     
     */
    public void setCalls(CallList value) {
        this.calls = value;
    }

    /**
     * Ruft den Wert der conference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Conference }
     *     
     */
    public Conference getConference() {
        return conference;
    }

    /**
     * Legt den Wert der conference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Conference }
     *     
     */
    public void setConference(Conference value) {
        this.conference = value;
    }

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
