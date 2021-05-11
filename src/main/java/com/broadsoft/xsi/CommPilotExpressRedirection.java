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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="CommPilotExpressRedirection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="action" type="{http://schema.broadsoft.com/xsi}CommPilotExpressRedirectionAction" minOccurs="0"/&gt;
 *         &lt;element name="forwardingAddress" type="{http://schema.broadsoft.com/xsi}Address" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
