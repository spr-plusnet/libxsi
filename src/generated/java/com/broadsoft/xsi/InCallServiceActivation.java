//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 * &lt;complexType name="InCallServiceActivation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flashActivationDigits" type="{http://schema.broadsoft.com/xsi}InCallServiceActivationDigits" minOccurs="0"/&gt;
 *         &lt;element name="callTransferActivationDigits" type="{http://schema.broadsoft.com/xsi}InCallServiceActivationDigits" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
