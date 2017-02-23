//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.01.26 um 02:45:28 PM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *           Notification with the current configuration setting 
 *           for the Call Recording service.
 *           
 *           Change History:
 *           17.sp4 – Added.        
 *         
 * 
 * <p>Java-Klasse für CallRecordingEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CallRecordingEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData">
 *       &lt;sequence>
 *         &lt;element name="recordingMode" type="{http://schema.broadsoft.com/xsi}CallRecordingMode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallRecordingEvent", propOrder = {
    "recordingMode"
})
public class CallRecordingEvent
    extends EventData
{

    @XmlSchemaType(name = "token")
    protected CallRecordingMode recordingMode;

    /**
     * Ruft den Wert der recordingMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CallRecordingMode }
     *     
     */
    public CallRecordingMode getRecordingMode() {
        return recordingMode;
    }

    /**
     * Legt den Wert der recordingMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CallRecordingMode }
     *     
     */
    public void setRecordingMode(CallRecordingMode value) {
        this.recordingMode = value;
    }

}
