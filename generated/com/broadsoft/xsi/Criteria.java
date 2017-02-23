//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         Criteria for services.
 *                 
 *         Change History:
 *         R19.0 - Removed criteriaFromDn element. If criteriaFromDn element is required
 *                 use the CriteriaWithFromDn type instead.
 *       
 * 
 * <p>Java-Klasse für Criteria complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Criteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="criteriaName" type="{http://schema.broadsoft.com/xsi}CriteriaName" minOccurs="0"/>
 *         &lt;element name="timeSchedule" type="{http://schema.broadsoft.com/xsi}TimeSchedule" minOccurs="0"/>
 *         &lt;element name="holidaySchedule" type="{http://schema.broadsoft.com/xsi}HolidaySchedule" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Criteria", propOrder = {
    "criteriaName",
    "timeSchedule",
    "holidaySchedule"
})
@XmlSeeAlso({
    CriteriaWithToDn.class,
    CriteriaWithPriorityAlert.class,
    CriteriaWithFromDn.class,
    CriteriaWithSelectiveCall.class,
    CriteriaWithExecutiveFiltering.class
})
public class Criteria {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String criteriaName;
    @XmlElementRef(name = "timeSchedule", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<TimeSchedule> timeSchedule;
    @XmlElementRef(name = "holidaySchedule", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<HolidaySchedule> holidaySchedule;

    /**
     * Ruft den Wert der criteriaName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriteriaName() {
        return criteriaName;
    }

    /**
     * Legt den Wert der criteriaName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriteriaName(String value) {
        this.criteriaName = value;
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
