//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="CallForwarding"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="forwardToPhoneNumber" type="{http://schema.broadsoft.com/xsi}Address" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallForwarding", propOrder = {
    "forwardToPhoneNumber"
})
@XmlSeeAlso({
    CallForwardingAlways.class,
    CallForwardingAlwaysSecondary.class,
    CallForwardingBusy.class,
    CallForwardingNoAnswer.class,
    CallForwardingNotReachable.class
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
