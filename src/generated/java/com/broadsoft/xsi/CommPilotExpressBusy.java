//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="CommPilotExpressBusy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="incomingCalls" type="{http://schema.broadsoft.com/xsi}CommPilotExpressRedirectionWithException" minOccurs="0"/&gt;
 *         &lt;element name="voiceMailNotify" type="{http://schema.broadsoft.com/xsi}CommPilotExpressEmailNotify" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
