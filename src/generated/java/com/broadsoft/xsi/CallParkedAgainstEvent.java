//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *           Provides information about the parked user when a call is
 *           parked against the target user or indicates a call is 
 *           no longer parked against the target user.
 * 
 *           Change History:
 *           R17.sp3 - Added                               
 *         
 * 
 * <p>Java-Klasse für CallParkedAgainstEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CallParkedAgainstEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData">
 *       &lt;sequence>
 *         &lt;element name="parkedParty" type="{http://schema.broadsoft.com/xsi}PartyInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallParkedAgainstEvent", propOrder = {
    "parkedParty"
})
public class CallParkedAgainstEvent
    extends EventData
{

    protected PartyInformation parkedParty;

    /**
     * Ruft den Wert der parkedParty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PartyInformation }
     *     
     */
    public PartyInformation getParkedParty() {
        return parkedParty;
    }

    /**
     * Legt den Wert der parkedParty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyInformation }
     *     
     */
    public void setParkedParty(PartyInformation value) {
        this.parkedParty = value;
    }

}
