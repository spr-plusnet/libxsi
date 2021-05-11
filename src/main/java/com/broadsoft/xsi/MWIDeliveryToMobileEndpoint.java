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
 * &lt;complexType name="MWIDeliveryToMobileEndpoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mobilePhoneNumber" type="{http://schema.broadsoft.com/xsi}DN" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
