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
import jakarta.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="RemoteOffice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="remoteOfficeNumber" type="{http://schema.broadsoft.com/xsi}Address" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
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
