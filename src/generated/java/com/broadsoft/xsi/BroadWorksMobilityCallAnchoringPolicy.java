//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         Provides call anchoring settings for a BroadWorks Mobility Mobile
 *         identity. These settings can be modifies only when the BroadWorks Mobility
 *         user is allowed to control these settings.
 *         Change History:
 *         R21 - Added
 *       
 * 
 * <p>Java-Klasse für BroadWorksMobilityCallAnchoringPolicy complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BroadWorksMobilityCallAnchoringPolicy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enableCallAnchoring" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="timeSchedule" type="{http://schema.broadsoft.com/xsi}TimeSchedule" minOccurs="0"/&gt;
 *         &lt;element name="holidaySchedule" type="{http://schema.broadsoft.com/xsi}HolidaySchedule" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BroadWorksMobilityCallAnchoringPolicy", propOrder = {
    "enableCallAnchoring",
    "timeSchedule",
    "holidaySchedule"
})
public class BroadWorksMobilityCallAnchoringPolicy {

    protected Boolean enableCallAnchoring;
    @XmlElementRef(name = "timeSchedule", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<TimeSchedule> timeSchedule;
    @XmlElementRef(name = "holidaySchedule", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<HolidaySchedule> holidaySchedule;

    /**
     * Ruft den Wert der enableCallAnchoring-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableCallAnchoring() {
        return enableCallAnchoring;
    }

    /**
     * Legt den Wert der enableCallAnchoring-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableCallAnchoring(Boolean value) {
        this.enableCallAnchoring = value;
    }

    /**
     * Ruft den Wert der timeSchedule-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimeSchedule }{@code >}
     *     
     */
    public JAXBElement<TimeSchedule> getTimeSchedule() {
        return timeSchedule;
    }

    /**
     * Legt den Wert der timeSchedule-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimeSchedule }{@code >}
     *     
     */
    public void setTimeSchedule(JAXBElement<TimeSchedule> value) {
        this.timeSchedule = value;
    }

    /**
     * Ruft den Wert der holidaySchedule-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HolidaySchedule }{@code >}
     *     
     */
    public JAXBElement<HolidaySchedule> getHolidaySchedule() {
        return holidaySchedule;
    }

    /**
     * Legt den Wert der holidaySchedule-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HolidaySchedule }{@code >}
     *     
     */
    public void setHolidaySchedule(JAXBElement<HolidaySchedule> value) {
        this.holidaySchedule = value;
    }

}
