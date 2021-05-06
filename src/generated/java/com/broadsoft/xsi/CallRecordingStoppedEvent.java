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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="CallRecordingStoppedEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}CallEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reason" type="{http://schema.broadsoft.com/xsi}RecordingStoppedReason"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
