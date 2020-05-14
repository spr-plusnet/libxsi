//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="RoutePointCallUpdatedEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}RoutePointEvent">
 *       &lt;sequence>
 *         &lt;element name="cpdResult" type="{http://schema.broadsoft.com/xsi}CPDResult" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://schema.broadsoft.com/xsi}CallUpdateReason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
