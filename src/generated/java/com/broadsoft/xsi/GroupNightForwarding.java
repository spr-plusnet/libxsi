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


/**
 * 
 *         Provides info regarding if/when the night service applies to the user and
 *         contains the details regarding the time and holiday schedule for the
 *         Group Night Forwarding service. 
 *         Change History:
 *         R19.0 – Added.
 *       
 * 
 * <p>Java-Klasse für GroupNightForwarding complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GroupNightForwarding">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userNightForwardingMode" type="{http://schema.broadsoft.com/xsi}GroupNightForwardingUserServiceActivationMode"/>
 *         &lt;element name="businessHours" type="{http://schema.broadsoft.com/xsi}TimeSchedule" minOccurs="0"/>
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
@XmlType(name = "GroupNightForwarding", propOrder = {
    "userNightForwardingMode",
    "businessHours",
    "holidaySchedule"
})
public class GroupNightForwarding {

    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected GroupNightForwardingUserServiceActivationMode userNightForwardingMode;
    protected TimeSchedule businessHours;
    protected HolidaySchedule holidaySchedule;

    /**
     * Ruft den Wert der userNightForwardingMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupNightForwardingUserServiceActivationMode }
     *     
     */
    public GroupNightForwardingUserServiceActivationMode getUserNightForwardingMode() {
        return userNightForwardingMode;
    }

    /**
     * Legt den Wert der userNightForwardingMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupNightForwardingUserServiceActivationMode }
     *     
     */
    public void setUserNightForwardingMode(GroupNightForwardingUserServiceActivationMode value) {
        this.userNightForwardingMode = value;
    }

    /**
     * Ruft den Wert der businessHours-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TimeSchedule }
     *     
     */
    public TimeSchedule getBusinessHours() {
        return businessHours;
    }

    /**
     * Legt den Wert der businessHours-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSchedule }
     *     
     */
    public void setBusinessHours(TimeSchedule value) {
        this.businessHours = value;
    }

    /**
     * Ruft den Wert der holidaySchedule-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HolidaySchedule }
     *     
     */
    public HolidaySchedule getHolidaySchedule() {
        return holidaySchedule;
    }

    /**
     * Legt den Wert der holidaySchedule-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HolidaySchedule }
     *     
     */
    public void setHolidaySchedule(HolidaySchedule value) {
        this.holidaySchedule = value;
    }

}
