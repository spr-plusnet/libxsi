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
 *         The RoutePointCallOverflowedTreatmentCompletedEvent is 
 *         sent when the annoucement is completed for a call treated 
 *         according to the Overflow policy.
 * 
 *         Change History:
 *         17.sp3 - Added                       
 *       
 * 
 * <p>Java-Klasse für RoutePointCallOverflowedTreatmentCompletedEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RoutePointCallOverflowedTreatmentCompletedEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}RoutePointEvent">
 *       &lt;sequence>
 *         &lt;element name="overFlowReason" type="{http://schema.broadsoft.com/xsi}OverflowReason" minOccurs="0"/>
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
@XmlType(name = "RoutePointCallOverflowedTreatmentCompletedEvent", propOrder = {
    "overFlowReason",
    "redirect",
    "reason"
})
public class RoutePointCallOverflowedTreatmentCompletedEvent
    extends RoutePointEvent
{

    @XmlSchemaType(name = "token")
    protected OverflowReason overFlowReason;
    protected Redirect redirect;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected TreatmentCompletionReason reason;

    /**
     * Ruft den Wert der overFlowReason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OverflowReason }
     *     
     */
    public OverflowReason getOverFlowReason() {
        return overFlowReason;
    }

    /**
     * Legt den Wert der overFlowReason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OverflowReason }
     *     
     */
    public void setOverFlowReason(OverflowReason value) {
        this.overFlowReason = value;
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
