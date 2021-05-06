//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         Contains the details related to an endpoint for
 *         a network device. A network device is a device that the
 *         AS uses for routing to/from the general network
 *         as opposed to/from an access device
 *         for a specific address of record. Services such
 *         as BroadWorks Anywhere and Remote
 *         Office use a network device
 *         instead of an access device.
 *       
 * 
 * <p>Java-Klasse für NetworkEndpoint complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NetworkEndpoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}Endpoint"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://schema.broadsoft.com/xsi}Address"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkEndpoint", propOrder = {
    "address"
})
@XmlSeeAlso({
    BroadWorksAnywhereEndpoint.class,
    RemoteOfficeEndpoint.class,
    BroadWorksMobilityEndpoint.class,
    ExecutiveAssistantEndpoint.class
})
public abstract class NetworkEndpoint
    extends Endpoint
{

    @XmlElement(required = true)
    protected Address address;

    /**
     * Ruft den Wert der address-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Legt den Wert der address-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

}
