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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The CallRecordingStoppedEvent is generated when the user sends an explicit stop recording request, 
 *         or when the call recording fails.
 *         R20 - Added.
 *       
 * 
 * <p>Java-Klasse für CallRecordingStoppedEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CallRecordingStoppedEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}CallEvent">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{http://schema.broadsoft.com/xsi}RecordingStoppedReason"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallRecordingStoppedEvent", propOrder = {
    "reason"
})
public class CallRecordingStoppedEvent
    extends CallEvent
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected RecordingStoppedReason reason;

    /**
     * Ruft den Wert der reason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RecordingStoppedReason }
     *     
     */
    public RecordingStoppedReason getReason() {
        return reason;
    }

    /**
     * Legt den Wert der reason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordingStoppedReason }
     *     
     */
    public void setReason(RecordingStoppedReason value) {
        this.reason = value;
    }

}
