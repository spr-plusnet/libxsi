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
 *         CommPilot Express Available Out Of Office Configuration.
 *       
 * 
 * <p>Java-Klasse für CommPilotExpressAvailableOutOfOffice complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CommPilotExpressAvailableOutOfOffice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="incomingCalls" type="{http://schema.broadsoft.com/xsi}CommPilotExpressRedirection" minOccurs="0"/&gt;
 *         &lt;element name="incomingCallNotify" type="{http://schema.broadsoft.com/xsi}CommPilotExpressEmailNotify" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommPilotExpressAvailableOutOfOffice", propOrder = {
    "incomingCalls",
    "incomingCallNotify"
})
public class CommPilotExpressAvailableOutOfOffice {

    protected CommPilotExpressRedirection incomingCalls;
    protected CommPilotExpressEmailNotify incomingCallNotify;

    /**
     * Ruft den Wert der incomingCalls-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CommPilotExpressRedirection }
     *     
     */
    public CommPilotExpressRedirection getIncomingCalls() {
        return incomingCalls;
    }

    /**
     * Legt den Wert der incomingCalls-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CommPilotExpressRedirection }
     *     
     */
    public void setIncomingCalls(CommPilotExpressRedirection value) {
        this.incomingCalls = value;
    }

    /**
     * Ruft den Wert der incomingCallNotify-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CommPilotExpressEmailNotify }
     *     
     */
    public CommPilotExpressEmailNotify getIncomingCallNotify() {
        return incomingCallNotify;
    }

    /**
     * Legt den Wert der incomingCallNotify-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CommPilotExpressEmailNotify }
     *     
     */
    public void setIncomingCallNotify(CommPilotExpressEmailNotify value) {
        this.incomingCallNotify = value;
    }

}
