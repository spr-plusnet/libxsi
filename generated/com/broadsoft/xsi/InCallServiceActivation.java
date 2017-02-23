//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         Contains the In-Call Service Activation service configuration data.
 *         
 *         In-Call Service Activation allows BroadWorks users to activate 
 *         mid-call services transparently.
 *       
 * 
 * <p>Java-Klasse für InCallServiceActivation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="InCallServiceActivation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo">
 *       &lt;sequence>
 *         &lt;element name="flashActivationDigits" type="{http://schema.broadsoft.com/xsi}InCallServiceActivationDigits" minOccurs="0"/>
 *         &lt;element name="callTransferActivationDigits" type="{http://schema.broadsoft.com/xsi}InCallServiceActivationDigits" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InCallServiceActivation", propOrder = {
    "flashActivationDigits",
    "callTransferActivationDigits"
})
public class InCallServiceActivation
    extends ActivatableServiceInfo
{

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String flashActivationDigits;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String callTransferActivationDigits;

    /**
     * Ruft den Wert der flashActivationDigits-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlashActivationDigits() {
        return flashActivationDigits;
    }

    /**
     * Legt den Wert der flashActivationDigits-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlashActivationDigits(String value) {
        this.flashActivationDigits = value;
    }

    /**
     * Ruft den Wert der callTransferActivationDigits-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallTransferActivationDigits() {
        return callTransferActivationDigits;
    }

    /**
     * Legt den Wert der callTransferActivationDigits-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallTransferActivationDigits(String value) {
        this.callTransferActivationDigits = value;
    }

}
