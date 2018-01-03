//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         CommPilot Express Unavailable Configuration.
 *       
 * 
 * <p>Java-Klasse für CommPilotExpressUnavailable complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CommPilotExpressUnavailable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="incomingCalls" type="{http://schema.broadsoft.com/xsi}CommPilotExpressRedirectionWithException" minOccurs="0"/>
 *         &lt;element name="voiceMailGreeting" type="{http://schema.broadsoft.com/xsi}CommPilotExpressVoiceMailGreeting" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommPilotExpressUnavailable", propOrder = {
    "incomingCalls",
    "voiceMailGreeting"
})
public class CommPilotExpressUnavailable {

    protected CommPilotExpressRedirectionWithException incomingCalls;
    @XmlSchemaType(name = "token")
    protected CommPilotExpressVoiceMailGreeting voiceMailGreeting;

    /**
     * Ruft den Wert der incomingCalls-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CommPilotExpressRedirectionWithException }
     *     
     */
    public CommPilotExpressRedirectionWithException getIncomingCalls() {
        return incomingCalls;
    }

    /**
     * Legt den Wert der incomingCalls-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CommPilotExpressRedirectionWithException }
     *     
     */
    public void setIncomingCalls(CommPilotExpressRedirectionWithException value) {
        this.incomingCalls = value;
    }

    /**
     * Ruft den Wert der voiceMailGreeting-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CommPilotExpressVoiceMailGreeting }
     *     
     */
    public CommPilotExpressVoiceMailGreeting getVoiceMailGreeting() {
        return voiceMailGreeting;
    }

    /**
     * Legt den Wert der voiceMailGreeting-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CommPilotExpressVoiceMailGreeting }
     *     
     */
    public void setVoiceMailGreeting(CommPilotExpressVoiceMailGreeting value) {
        this.voiceMailGreeting = value;
    }

}
