//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         CommPilot Express type to transfer to voice Mail or forward to a
 *         number used in the context.
 *         
 *         Change History:
 *         R19.0 - forwardingAddress element made nillable.
 *       
 * 
 * <p>Java-Klasse für CommPilotExpressRedirection complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CommPilotExpressRedirection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="action" type="{http://schema.broadsoft.com/xsi}CommPilotExpressRedirectionAction" minOccurs="0"/>
 *         &lt;element name="forwardingAddress" type="{http://schema.broadsoft.com/xsi}Address" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommPilotExpressRedirection", propOrder = {
    "action",
    "forwardingAddress"
})
public class CommPilotExpressRedirection {

    @XmlSchemaType(name = "token")
    protected CommPilotExpressRedirectionAction action;
    @XmlElementRef(name = "forwardingAddress", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<Address> forwardingAddress;

    /**
     * Ruft den Wert der action-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CommPilotExpressRedirectionAction }
     *     
     */
    public CommPilotExpressRedirectionAction getAction() {
        return action;
    }

    /**
     * Legt den Wert der action-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CommPilotExpressRedirectionAction }
     *     
     */
    public void setAction(CommPilotExpressRedirectionAction value) {
        this.action = value;
    }

    /**
     * Ruft den Wert der forwardingAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public JAXBElement<Address> getForwardingAddress() {
        return forwardingAddress;
    }

    /**
     * Legt den Wert der forwardingAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public void setForwardingAddress(JAXBElement<Address> value) {
        this.forwardingAddress = value;
    }

}
