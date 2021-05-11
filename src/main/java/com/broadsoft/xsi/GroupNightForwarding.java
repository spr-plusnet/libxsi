//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="GroupNightForwarding"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userNightForwardingMode" type="{http://schema.broadsoft.com/xsi}GroupNightForwardingUserServiceActivationMode"/&gt;
 *         &lt;element name="businessHours" type="{http://schema.broadsoft.com/xsi}TimeSchedule" minOccurs="0"/&gt;
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
