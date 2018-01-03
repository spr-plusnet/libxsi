//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="messageInfo" type="{http://schema.broadsoft.com/xsi}MessageInfo"/>
 *         &lt;element name="messageMediaContent" type="{http://schema.broadsoft.com/xsi}MessageMediaContent"/>
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
