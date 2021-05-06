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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 * &lt;complexType name="Criteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="criteriaName" type="{http://schema.broadsoft.com/xsi}CriteriaName" minOccurs="0"/&gt;
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
@XmlType(name = "Criteria", propOrder = {
    "criteriaName",
    "timeSchedule",
    "holidaySchedule"
})
@XmlSeeAlso({
    CriteriaWithToDn.class,
    CriteriaWithPriorityAlert.class,
    CriteriaWithSelectiveCall.class,
    CriteriaWithFromDn.class,
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
