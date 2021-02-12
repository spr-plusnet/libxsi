//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="NetworkEndpoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}Endpoint">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://schema.broadsoft.com/xsi}Address"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkEndpoint", propOrder = {
    "address"
})
@XmlSeeAlso({
    ExecutiveAssistantEndpoint.class,
    BroadWorksMobilityEndpoint.class,
    RemoteOfficeEndpoint.class,
    BroadWorksAnywhereEndpoint.class
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
