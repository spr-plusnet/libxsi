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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         The CallCenterAgentOnCallAlertInfo indicates if an agent is 
 *           1) on a call or idle
 *           2) for how long, in either case (timestamp)
 *           3) whether that length of time is greater than a configured
 *             threshold
 *         
 *       
 * 
 * <p>Java-Klasse für CallCenterAgentOnCallAlertInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CallCenterAgentOnCallAlertInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alertEvent">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="OnCallTime"/>
 *               &lt;enumeration value="IdleTime"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="timestamp" type="{http://schema.broadsoft.com/xsi}TimestampWithSeverity"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallCenterAgentOnCallAlertInfo", propOrder = {
    "alertEvent",
    "timestamp"
})
public class CallCenterAgentOnCallAlertInfo {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String alertEvent;
    @XmlElement(required = true)
    protected TimestampWithSeverity timestamp;

    /**
     * Ruft den Wert der alertEvent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertEvent() {
        return alertEvent;
    }

    /**
     * Legt den Wert der alertEvent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertEvent(String value) {
        this.alertEvent = value;
    }

    /**
     * Ruft den Wert der timestamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimestampWithSeverity }
     *     
     */
    public TimestampWithSeverity getTimestamp() {
        return timestamp;
    }

    /**
     * Legt den Wert der timestamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimestampWithSeverity }
     *     
     */
    public void setTimestamp(TimestampWithSeverity value) {
        this.timestamp = value;
    }

}
