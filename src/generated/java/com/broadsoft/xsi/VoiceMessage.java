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
 *         &lt;element name="messageInfo" type="{http://schema.broadsoft.com/xsi}MessageInfo"/&gt;
 *         &lt;element name="messageMediaContent" type="{http://schema.broadsoft.com/xsi}MessageMediaContent"/&gt;
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
    "messageInfo",
    "messageMediaContent"
})
@XmlRootElement(name = "VoiceMessage")
public class VoiceMessage {

    @XmlElement(required = true)
    protected MessageInfo messageInfo;
    @XmlElement(required = true)
    protected MessageMediaContent messageMediaContent;

    /**
     * Ruft den Wert der messageInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MessageInfo }
     *     
     */
    public MessageInfo getMessageInfo() {
        return messageInfo;
    }

    /**
     * Legt den Wert der messageInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageInfo }
     *     
     */
    public void setMessageInfo(MessageInfo value) {
        this.messageInfo = value;
    }

    /**
     * Ruft den Wert der messageMediaContent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MessageMediaContent }
     *     
     */
    public MessageMediaContent getMessageMediaContent() {
        return messageMediaContent;
    }

    /**
     * Legt den Wert der messageMediaContent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageMediaContent }
     *     
     */
    public void setMessageMediaContent(MessageMediaContent value) {
        this.messageMediaContent = value;
    }

}
