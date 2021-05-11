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
 *         The ACD Call Stranded event is sent when a call is identified as
 *         stranded. The call is removed from the queue and is handled as
 *         per policay configuration.
 *         
 *         Change History:
 *         17.sp3 - "treatmentStarted" element added 
 *                  "redirections" element added        
 *       
 * 
 * <p>Java-Klasse für ACDCallStrandedEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ACDCallStrandedEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}ACDEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="redirect" type="{http://schema.broadsoft.com/xsi}Redirect" minOccurs="0"/&gt;
 *         &lt;element name="treatmentStarted" type="{http://schema.broadsoft.com/xsi}EmptyContent" minOccurs="0"/&gt;
 *         &lt;element name="redirections" type="{http://schema.broadsoft.com/xsi}RedirectionList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACDCallStrandedEvent", propOrder = {
    "redirect",
    "treatmentStarted",
    "redirections"
})
public class ACDCallStrandedEvent
    extends ACDEvent
{

    protected Redirect redirect;
    protected EmptyContent treatmentStarted;
    protected RedirectionList redirections;

    /**
     * Ruft den Wert der redirect-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Redirect }
     *     
     */
    public Redirect getRedirect() {
        return redirect;
    }

    /**
     * Legt den Wert der redirect-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Redirect }
     *     
     */
    public void setRedirect(Redirect value) {
        this.redirect = value;
    }

    /**
     * Ruft den Wert der treatmentStarted-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmptyContent }
     *     
     */
    public EmptyContent getTreatmentStarted() {
        return treatmentStarted;
    }

    /**
     * Legt den Wert der treatmentStarted-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyContent }
     *     
     */
    public void setTreatmentStarted(EmptyContent value) {
        this.treatmentStarted = value;
    }

    /**
     * Ruft den Wert der redirections-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RedirectionList }
     *     
     */
    public RedirectionList getRedirections() {
        return redirections;
    }

    /**
     * Legt den Wert der redirections-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RedirectionList }
     *     
     */
    public void setRedirections(RedirectionList value) {
        this.redirections = value;
    }

}
