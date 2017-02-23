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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Contains the MWI Delivery to Mobile Endpoint service configuration
 *         data.
 * 
 *         MWI Delivery to Mobile Endpoint allows you to deliver a notification to
 *         your mobile phone about the reception of a new voice mail, fax or
 *         video message. If this feature is enabled, and your mobile phone has
 *         SMS (Short Messaging Service) or MWI (Message Waiting Indicator)
 *         capability, the information about new voice mail, fax or video message
 *         waiting will be presented at your mobile phone.
 *       
 * 
 * <p>Java-Klasse für MWIDeliveryToMobileEndpoint complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MWIDeliveryToMobileEndpoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo">
 *       &lt;sequence>
 *         &lt;element name="mobilePhoneNumber" type="{http://schema.broadsoft.com/xsi}DN" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MWIDeliveryToMobileEndpoint", propOrder = {
    "mobilePhoneNumber"
})
public class MWIDeliveryToMobileEndpoint
    extends ActivatableServiceInfo
{

    @XmlElementRef(name = "mobilePhoneNumber", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobilePhoneNumber;

    /**
     * Ruft den Wert der mobilePhoneNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    /**
     * Legt den Wert der mobilePhoneNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobilePhoneNumber(JAXBElement<String> value) {
        this.mobilePhoneNumber = value;
    }

}
