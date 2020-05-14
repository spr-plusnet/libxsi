//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         Contains the information of a MeetMe conferencing Passcodes.
 *         There can be 2 types of passcodes, Conference Id and Moderator Pin     
 *         Release 19: Optional passcode "Security Pin" added.
 *         Release Added: R17.sp3
 *       
 * 
 * <p>Java-Klasse für MeetMeConferencingConferenceInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MeetMeConferencingConferenceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conferenceId" type="{http://schema.broadsoft.com/xsi}MeetMeConferencingConferencePassCode"/>
 *         &lt;element name="moderatorPin" type="{http://schema.broadsoft.com/xsi}MeetMeConferencingConferencePassCode"/>
 *         &lt;element name="securityPin" type="{http://schema.broadsoft.com/xsi}MeetMeConferencingConferenceSecurityPin" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetMeConferencingConferenceInfo", propOrder = {
    "conferenceId",
    "moderatorPin",
    "securityPin"
})
public class MeetMeConferencingConferenceInfo {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String conferenceId;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String moderatorPin;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String securityPin;

    /**
     * Ruft den Wert der conferenceId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConferenceId() {
        return conferenceId;
    }

    /**
     * Legt den Wert der conferenceId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConferenceId(String value) {
        this.conferenceId = value;
    }

    /**
     * Ruft den Wert der moderatorPin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeratorPin() {
        return moderatorPin;
    }

    /**
     * Legt den Wert der moderatorPin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeratorPin(String value) {
        this.moderatorPin = value;
    }

    /**
     * Ruft den Wert der securityPin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityPin() {
        return securityPin;
    }

    /**
     * Legt den Wert der securityPin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityPin(String value) {
        this.securityPin = value;
    }

}
