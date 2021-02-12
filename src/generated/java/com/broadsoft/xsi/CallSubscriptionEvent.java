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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="CallSubscriptionEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData">
 *       &lt;sequence>
 *         &lt;element name="calls" type="{http://schema.broadsoft.com/xsi}CallList" minOccurs="0"/>
 *         &lt;element name="conference" type="{http://schema.broadsoft.com/xsi}Conference" minOccurs="0"/>
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
