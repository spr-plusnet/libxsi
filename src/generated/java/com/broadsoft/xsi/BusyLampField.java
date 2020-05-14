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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listURI" type="{http://schema.broadsoft.com/xsi}SIPURI" minOccurs="0"/>
 *         &lt;element name="monitoredUserList" type="{http://schema.broadsoft.com/xsi}UserDetailInfoList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listURI",
    "monitoredUserList"
})
@XmlRootElement(name = "BusyLampField")
public class BusyLampField {

    @XmlElementRef(name = "listURI", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> listURI;
    @XmlElementRef(name = "monitoredUserList", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<UserDetailInfoList> monitoredUserList;

    /**
     * Ruft den Wert der listURI-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getListURI() {
        return listURI;
    }

    /**
     * Legt den Wert der listURI-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setListURI(JAXBElement<String> value) {
        this.listURI = value;
    }

    /**
     * Ruft den Wert der monitoredUserList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserDetailInfoList }{@code >}
     *     
     */
    public JAXBElement<UserDetailInfoList> getMonitoredUserList() {
        return monitoredUserList;
    }

    /**
     * Legt den Wert der monitoredUserList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserDetailInfoList }{@code >}
     *     
     */
    public void setMonitoredUserList(JAXBElement<UserDetailInfoList> value) {
        this.monitoredUserList = value;
    }

}
