//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Notification with the updated voice mail message summary status for the
 *         Third-Party Voice Mail Support/Voice Messaging service.
 *       
 * 
 * <p>Java-Klasse für VoiceMailMessageSummaryEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VoiceMailMessageSummaryEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData">
 *       &lt;sequence>
 *         &lt;element name="messageSummary" type="{http://schema.broadsoft.com/xsi}MessageSummary"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoiceMailMessageSummaryEvent", propOrder = {
    "messageSummary"
})
public class VoiceMailMessageSummaryEvent
    extends EventData
{

    @XmlElement(required = true)
    protected MessageSummary messageSummary;

    /**
     * Ruft den Wert der messageSummary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MessageSummary }
     *     
     */
    public MessageSummary getMessageSummary() {
        return messageSummary;
    }

    /**
     * Legt den Wert der messageSummary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageSummary }
     *     
     */
    public void setMessageSummary(MessageSummary value) {
        this.messageSummary = value;
    }

}
