//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         The Route Point Call Updated event is generated when the remote party
 *         attributes are modified while being in the queue.
 *       
 * 
 * <p>Java-Klasse für RoutePointCallUpdatedEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RoutePointCallUpdatedEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}RoutePointEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cpdResult" type="{http://schema.broadsoft.com/xsi}CPDResult" minOccurs="0"/&gt;
 *         &lt;element name="reason" type="{http://schema.broadsoft.com/xsi}CallUpdateReason" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutePointCallUpdatedEvent", propOrder = {
    "cpdResult",
    "reason"
})
public class RoutePointCallUpdatedEvent
    extends RoutePointEvent
{

    @XmlSchemaType(name = "token")
    protected CPDResult cpdResult;
    @XmlSchemaType(name = "token")
    protected CallUpdateReason reason;

    /**
     * Ruft den Wert der cpdResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CPDResult }
     *     
     */
    public CPDResult getCpdResult() {
        return cpdResult;
    }

    /**
     * Legt den Wert der cpdResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CPDResult }
     *     
     */
    public void setCpdResult(CPDResult value) {
        this.cpdResult = value;
    }

    /**
     * Ruft den Wert der reason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CallUpdateReason }
     *     
     */
    public CallUpdateReason getReason() {
        return reason;
    }

    /**
     * Legt den Wert der reason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CallUpdateReason }
     *     
     */
    public void setReason(CallUpdateReason value) {
        this.reason = value;
    }

}
