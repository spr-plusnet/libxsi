//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Contains the ACD service data that an agent has joined to or belong to.
 *       
 * 
 * <p>Java-Klasse für ACDAgentJoinData complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ACDAgentJoinData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="joinInfos" type="{http://schema.broadsoft.com/xsi}ACDAgentJoinInfoList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACDAgentJoinData", propOrder = {
    "joinInfos"
})
public class ACDAgentJoinData {

    protected ACDAgentJoinInfoList joinInfos;

    /**
     * Ruft den Wert der joinInfos-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ACDAgentJoinInfoList }
     *     
     */
    public ACDAgentJoinInfoList getJoinInfos() {
        return joinInfos;
    }

    /**
     * Legt den Wert der joinInfos-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ACDAgentJoinInfoList }
     *     
     */
    public void setJoinInfos(ACDAgentJoinInfoList value) {
        this.joinInfos = value;
    }

}
