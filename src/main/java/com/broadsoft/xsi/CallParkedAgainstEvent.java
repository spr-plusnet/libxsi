//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="CallParkedAgainstEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}EventData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parkedParty" type="{http://schema.broadsoft.com/xsi}PartyInformation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
