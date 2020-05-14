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
 *         CommPilot Express Busy Configuration.
 *       
 * 
 * <p>Java-Klasse für CommPilotExpressBusy complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CommPilotExpressBusy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="incomingCalls" type="{http://schema.broadsoft.com/xsi}CommPilotExpressRedirectionWithException" minOccurs="0"/>
 *         &lt;element name="voiceMailNotify" type="{http://schema.broadsoft.com/xsi}CommPilotExpressEmailNotify" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommPilotExpressBusy", propOrder = {
    "incomingCalls",
    "voiceMailNotify"
})
public class CommPilotExpressBusy {

    protected CommPilotExpressRedirectionWithException incomingCalls;
    protected CommPilotExpressEmailNotify voiceMailNotify;

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
     * Ruft den Wert der voiceMailNotify-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CommPilotExpressEmailNotify }
     *     
     */
    public CommPilotExpressEmailNotify getVoiceMailNotify() {
        return voiceMailNotify;
    }

    /**
     * Legt den Wert der voiceMailNotify-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CommPilotExpressEmailNotify }
     *     
     */
    public void setVoiceMailNotify(CommPilotExpressEmailNotify value) {
        this.voiceMailNotify = value;
    }

}
