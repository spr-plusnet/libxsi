//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="ACDAgentJoinData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="joinInfos" type="{http://schema.broadsoft.com/xsi}ACDAgentJoinInfoList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
