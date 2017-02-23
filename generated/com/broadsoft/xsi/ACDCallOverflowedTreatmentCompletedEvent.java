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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The ACDCallOverflowedTreatmentCompletedEvent is sent when the 
 *         annoucement is completed for a call treated according to the 
 *         Overflow policy.
 *         
 *         Change History:
 *         17.sp3 - Added
 *       
 * 
 * <p>Java-Klasse für ACDCallOverflowedTreatmentCompletedEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ACDCallOverflowedTreatmentCompletedEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}ACDEvent">
 *       &lt;sequence>
 *         &lt;element name="overflowReason" type="{http://schema.broadsoft.com/xsi}OverflowReason"/>
 *         &lt;element name="redirect" type="{http://schema.broadsoft.com/xsi}Redirect" minOccurs="0"/>
 *         &lt;element name="reason" type="{http://schema.broadsoft.com/xsi}TreatmentCompletionReason"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACDCallOverflowedTreatmentCompletedEvent", propOrder = {
    "overflowReason",
    "redirect",
    "reason"
})
public class ACDCallOverflowedTreatmentCompletedEvent
    extends ACDEvent
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected OverflowReason overflowReason;
    protected Redirect redirect;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected TreatmentCompletionReason reason;

    /**
     * Ruft den Wert der overflowReason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OverflowReason }
     *     
     */
    public OverflowReason getOverflowReason() {
        return overflowReason;
    }

    /**
     * Legt den Wert der overflowReason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OverflowReason }
     *     
     */
    public void setOverflowReason(OverflowReason value) {
        this.overflowReason = value;
    }

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
     * Ruft den Wert der reason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TreatmentCompletionReason }
     *     
     */
    public TreatmentCompletionReason getReason() {
        return reason;
    }

    /**
     * Legt den Wert der reason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TreatmentCompletionReason }
     *     
     */
    public void setReason(TreatmentCompletionReason value) {
        this.reason = value;
    }

}
