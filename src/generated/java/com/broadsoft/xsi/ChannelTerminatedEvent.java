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
 *         This event is used to report that the specified channel has been
 *         terminated. 
 *       
 * 
 * <p>Java-Klasse für ChannelTerminatedEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ChannelTerminatedEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}BaseEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="channelId" type="{http://schema.broadsoft.com/xsi}ChannelId"/&gt;
 *         &lt;element name="reason" type="{http://schema.broadsoft.com/xsi}ChannelTerminatedReason"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelTerminatedEvent", propOrder = {
    "channelId",
    "reason"
})
public class ChannelTerminatedEvent
    extends BaseEvent
{

    @XmlElement(required = true)
    protected String channelId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected ChannelTerminatedReason reason;

    /**
     * Ruft den Wert der channelId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * Legt den Wert der channelId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelId(String value) {
        this.channelId = value;
    }

    /**
     * Ruft den Wert der reason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ChannelTerminatedReason }
     *     
     */
    public ChannelTerminatedReason getReason() {
        return reason;
    }

    /**
     * Legt den Wert der reason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelTerminatedReason }
     *     
     */
    public void setReason(ChannelTerminatedReason value) {
        this.reason = value;
    }

}
