//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Contains common data for all Call Forwarding services.
 *       
 * 
 * <p>Java-Klasse für CallForwarding complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CallForwarding">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo">
 *       &lt;sequence>
 *         &lt;element name="forwardToPhoneNumber" type="{http://schema.broadsoft.com/xsi}Address" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallForwarding", propOrder = {
    "forwardToPhoneNumber"
})
@XmlSeeAlso({
    CallForwardingBusy.class,
    CallForwardingAlwaysSecondary.class,
    CallForwardingAlways.class,
    CallForwardingNotReachable.class,
    CallForwardingNoAnswer.class
})
public class CallForwarding
    extends ActivatableServiceInfo
{

    @XmlElementRef(name = "forwardToPhoneNumber", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<Address> forwardToPhoneNumber;

    /**
     * Ruft den Wert der forwardToPhoneNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public JAXBElement<Address> getForwardToPhoneNumber() {
        return forwardToPhoneNumber;
    }

    /**
     * Legt den Wert der forwardToPhoneNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public void setForwardToPhoneNumber(JAXBElement<Address> value) {
        this.forwardToPhoneNumber = value;
    }

}
