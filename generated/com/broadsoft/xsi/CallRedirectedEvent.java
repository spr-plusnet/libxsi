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
 *         The Call Redirected event is event is generated when one or more calls
 *         are redirected by the subscriber. The event includes the
 *         redirection reason which indicates the type of redirection (e.g.
 *         simultaneous ring, call forward always, blind transfer). The
 *         call state is set to Detached.
 *       
 * 
 * <p>Java-Klasse für CallRedirectedEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CallRedirectedEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData">
 *       &lt;sequence>
 *         &lt;element name="calls" type="{http://schema.broadsoft.com/xsi}CallList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallRedirectedEvent", propOrder = {
    "calls"
})
public class CallRedirectedEvent
    extends EventData
{

    @XmlElement(required = true)
    protected CallList calls;

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

}
