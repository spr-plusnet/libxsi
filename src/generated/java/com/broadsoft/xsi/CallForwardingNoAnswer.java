//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="CallForwardingNoAnswer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}CallForwarding">
 *       &lt;sequence>
 *         &lt;element name="numberOfRings" type="{http://schema.broadsoft.com/xsi}NumberOfRingsZeroToTwentyExcludeOne" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name="CallForwardingNoAnswer")
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
