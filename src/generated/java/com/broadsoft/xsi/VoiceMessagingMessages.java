//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="messageInfoList" type="{http://schema.broadsoft.com/xsi}MessageInfoList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "messageInfoList"
})
@XmlRootElement(name = "VoiceMessagingMessages")
public class VoiceMessagingMessages {

    @XmlElement(required = true)
    protected MessageInfoList messageInfoList;

    /**
     * Ruft den Wert der messageInfoList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MessageInfoList }
     *     
     */
    public MessageInfoList getMessageInfoList() {
        return messageInfoList;
    }

    /**
     * Legt den Wert der messageInfoList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageInfoList }
     *     
     */
    public void setMessageInfoList(MessageInfoList value) {
        this.messageInfoList = value;
    }

}
