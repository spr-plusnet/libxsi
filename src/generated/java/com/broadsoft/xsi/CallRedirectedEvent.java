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
 * &lt;complexType name="CallRedirectedEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="calls" type="{http://schema.broadsoft.com/xsi}CallList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
