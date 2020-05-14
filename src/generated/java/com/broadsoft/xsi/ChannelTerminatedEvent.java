//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="ChannelTerminatedEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}BaseEvent">
 *       &lt;sequence>
 *         &lt;element name="channelId" type="{http://schema.broadsoft.com/xsi}ChannelId"/>
 *         &lt;element name="reason" type="{http://schema.broadsoft.com/xsi}ChannelTerminatedReason"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
