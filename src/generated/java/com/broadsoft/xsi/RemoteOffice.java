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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Contains the Remote Office service configuration data.
 *         Remote Office
 *         allows you to use your home phone, your cell phone or even a hotel phone
 *         as your
 *         business phone. By using a call client application, you can make phone calls
 *         from
 *         this remote phone and have them billed to your business. This service
 *         also directs
 *         all calls coming to your business phone to ring the remote office
 *         phone.
 *       
 * 
 * <p>Java-Klasse für RemoteOffice complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RemoteOffice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo">
 *       &lt;sequence>
 *         &lt;element name="remoteOfficeNumber" type="{http://schema.broadsoft.com/xsi}Address" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name="RemoteOffice")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoteOffice", propOrder = {
    "remoteOfficeNumber"
})
public class RemoteOffice
    extends ActivatableServiceInfo
{

    @XmlElementRef(name = "remoteOfficeNumber", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<Address> remoteOfficeNumber;

    /**
     * Ruft den Wert der remoteOfficeNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public JAXBElement<Address> getRemoteOfficeNumber() {
        return remoteOfficeNumber;
    }

    /**
     * Legt den Wert der remoteOfficeNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public void setRemoteOfficeNumber(JAXBElement<Address> value) {
        this.remoteOfficeNumber = value;
    }

}
