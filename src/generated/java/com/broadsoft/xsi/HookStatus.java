//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="hookStatus" type="{http://schema.broadsoft.com/xsi}HookStatusType"/>
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
    "hookStatus"
})
@XmlRootElement(name = "HookStatus")
public class HookStatus {

    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected HookStatusType hookStatus;

    /**
     * Ruft den Wert der hookStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HookStatusType }
     *     
     */
    public HookStatusType getHookStatus() {
        return hookStatus;
    }

    /**
     * Legt den Wert der hookStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HookStatusType }
     *     
     */
    public void setHookStatus(HookStatusType value) {
        this.hookStatus = value;
    }

}
