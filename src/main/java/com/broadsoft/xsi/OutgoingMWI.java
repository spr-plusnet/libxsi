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
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="outgoingSMDIMWIPhoneNumberList" type="{http://schema.broadsoft.com/xsi}OutgoingDNList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
