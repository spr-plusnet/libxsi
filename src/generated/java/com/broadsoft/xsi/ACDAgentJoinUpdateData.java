//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Contains the ACD service update data for agent joining or leaving.
 *       
 * 
 * <p>Java-Klasse für ACDAgentJoinUpdateData complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ACDAgentJoinUpdateData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="joinInfo" type="{http://schema.broadsoft.com/xsi}ACDAgentJoinInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACDAgentJoinUpdateData", propOrder = {
    "joinInfo"
})
public class ACDAgentJoinUpdateData {

    protected ACDAgentJoinInfo joinInfo;

    /**
     * Ruft den Wert der joinInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ACDAgentJoinInfo }
     *     
     */
    public ACDAgentJoinInfo getJoinInfo() {
        return joinInfo;
    }

    /**
     * Legt den Wert der joinInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ACDAgentJoinInfo }
     *     
     */
    public void setJoinInfo(ACDAgentJoinInfo value) {
        this.joinInfo = value;
    }

}
