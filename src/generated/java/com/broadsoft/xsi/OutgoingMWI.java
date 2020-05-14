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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo">
 *       &lt;sequence>
 *         &lt;element name="outgoingSMDIMWIPhoneNumberList" type="{http://schema.broadsoft.com/xsi}OutgoingDNList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "outgoingSMDIMWIPhoneNumberList"
})
@XmlRootElement(name = "OutgoingMWI")
public class OutgoingMWI
    extends ActivatableServiceInfo
{

    @XmlElementRef(name = "outgoingSMDIMWIPhoneNumberList", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<OutgoingDNList> outgoingSMDIMWIPhoneNumberList;

    /**
     * Ruft den Wert der outgoingSMDIMWIPhoneNumberList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OutgoingDNList }{@code >}
     *     
     */
    public JAXBElement<OutgoingDNList> getOutgoingSMDIMWIPhoneNumberList() {
        return outgoingSMDIMWIPhoneNumberList;
    }

    /**
     * Legt den Wert der outgoingSMDIMWIPhoneNumberList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OutgoingDNList }{@code >}
     *     
     */
    public void setOutgoingSMDIMWIPhoneNumberList(JAXBElement<OutgoingDNList> value) {
        this.outgoingSMDIMWIPhoneNumberList = value;
    }

}
