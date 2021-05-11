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
import jakarta.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="VoiceMailMessageSummaryEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="messageSummary" type="{http://schema.broadsoft.com/xsi}MessageSummary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
