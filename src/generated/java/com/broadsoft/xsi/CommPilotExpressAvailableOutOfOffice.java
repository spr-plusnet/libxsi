//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="CommPilotExpressAvailableOutOfOffice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="incomingCalls" type="{http://schema.broadsoft.com/xsi}CommPilotExpressRedirection" minOccurs="0"/>
 *         &lt;element name="incomingCallNotify" type="{http://schema.broadsoft.com/xsi}CommPilotExpressEmailNotify" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
