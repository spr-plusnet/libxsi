//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         Sent whenever the security classification of a meetme conference 
 *         changes due to participants joining, leaving, or particiapnts
 *         updating their current security classification level.
 *         This event is sent when the conference owner has the 
 *         Security Classification service assigned.
 *         
 *         Change History:
 *         20.0 - added.
 *       
 * 
 * <p>Java-Klasse für MeetMeConferenceSecurityClassificationUpdatedEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MeetMeConferenceSecurityClassificationUpdatedEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData">
 *       &lt;sequence>
 *         &lt;element name="securityClassification" type="{http://schema.broadsoft.com/xsi}NonEmptyToken" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetMeConferenceSecurityClassificationUpdatedEvent", propOrder = {
    "securityClassification"
})
public class MeetMeConferenceSecurityClassificationUpdatedEvent
    extends EventData
{

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String securityClassification;

    /**
     * Ruft den Wert der securityClassification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityClassification() {
        return securityClassification;
    }

    /**
     * Legt den Wert der securityClassification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityClassification(String value) {
        this.securityClassification = value;
    }

}
