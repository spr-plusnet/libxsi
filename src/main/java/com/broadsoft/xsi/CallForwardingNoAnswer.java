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
 *         Contains the Call Forwarding No Answer service configuration data.
 *       
 * 
 * <p>Java-Klasse für CallForwardingNoAnswer complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CallForwardingNoAnswer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}CallForwarding"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberOfRings" type="{http://schema.broadsoft.com/xsi}NumberOfRingsZeroToTwentyExcludeOne" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallForwardingNoAnswer", propOrder = {
    "numberOfRings"
})
public class CallForwardingNoAnswer
    extends CallForwarding
{

    protected Integer numberOfRings;

    /**
     * Ruft den Wert der numberOfRings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfRings() {
        return numberOfRings;
    }

    /**
     * Legt den Wert der numberOfRings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfRings(Integer value) {
        this.numberOfRings = value;
    }

}
