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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *         Collaborate room schedule.
 *       
 * 
 * <p>Java-Klasse für CollaborateRoomSchedule complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CollaborateRoomSchedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="scheduleReservationless">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                     &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="scheduleOneTime">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                     &lt;element name="duration" type="{http://schema.broadsoft.com/xsi}CollaborateRoomScheduleDuration"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="scheduleRecurring">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                     &lt;element name="duration" type="{http://schema.broadsoft.com/xsi}CollaborateRoomScheduleDuration"/>
 *                     &lt;element name="recurrence" type="{http://schema.broadsoft.com/xsi}Recurrence"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollaborateRoomSchedule", propOrder = {
    "scheduleReservationless",
    "scheduleOneTime",
    "scheduleRecurring"
})
public class CollaborateRoomSchedule {

    protected CollaborateRoomSchedule.ScheduleReservationless scheduleReservationless;
    protected CollaborateRoomSchedule.ScheduleOneTime scheduleOneTime;
    protected CollaborateRoomSchedule.ScheduleRecurring scheduleRecurring;

    /**
     * Ruft den Wert der scheduleReservationless-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CollaborateRoomSchedule.ScheduleReservationless }
     *     
     */
    public CollaborateRoomSchedule.ScheduleReservationless getScheduleReservationless() {
        return scheduleReservationless;
    }

    /**
     * Legt den Wert der scheduleReservationless-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CollaborateRoomSchedule.ScheduleReservationless }
     *     
     */
    public void setScheduleReservationless(CollaborateRoomSchedule.ScheduleReservationless value) {
        this.scheduleReservationless = value;
    }

    /**
     * Ruft den Wert der scheduleOneTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CollaborateRoomSchedule.ScheduleOneTime }
     *     
     */
    public CollaborateRoomSchedule.ScheduleOneTime getScheduleOneTime() {
        return scheduleOneTime;
    }

    /**
     * Legt den Wert der scheduleOneTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CollaborateRoomSchedule.ScheduleOneTime }
     *     
     */
    public void setScheduleOneTime(CollaborateRoomSchedule.ScheduleOneTime value) {
        this.scheduleOneTime = value;
    }

    /**
     * Ruft den Wert der scheduleRecurring-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CollaborateRoomSchedule.ScheduleRecurring }
     *     
     */
    public CollaborateRoomSchedule.ScheduleRecurring getScheduleRecurring() {
        return scheduleRecurring;
    }

    /**
     * Legt den Wert der scheduleRecurring-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CollaborateRoomSchedule.ScheduleRecurring }
     *     
     */
    public void setScheduleRecurring(CollaborateRoomSchedule.ScheduleRecurring value) {
        this.scheduleRecurring = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="duration" type="{http://schema.broadsoft.com/xsi}CollaborateRoomScheduleDuration"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "startTime",
        "duration"
    })
    public static class ScheduleOneTime {

        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar startTime;
        @XmlElement(required = true)
        protected CollaborateRoomScheduleDuration duration;

        /**
         * Ruft den Wert der startTime-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStartTime() {
            return startTime;
        }

        /**
         * Legt den Wert der startTime-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStartTime(XMLGregorianCalendar value) {
            this.startTime = value;
        }

        /**
         * Ruft den Wert der duration-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link CollaborateRoomScheduleDuration }
         *     
         */
        public CollaborateRoomScheduleDuration getDuration() {
            return duration;
        }

        /**
         * Legt den Wert der duration-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link CollaborateRoomScheduleDuration }
         *     
         */
        public void setDuration(CollaborateRoomScheduleDuration value) {
            this.duration = value;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="duration" type="{http://schema.broadsoft.com/xsi}CollaborateRoomScheduleDuration"/>
     *         &lt;element name="recurrence" type="{http://schema.broadsoft.com/xsi}Recurrence"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "startTime",
        "duration",
        "recurrence"
    })
    public static class ScheduleRecurring {

        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar startTime;
        @XmlElement(required = true)
        protected CollaborateRoomScheduleDuration duration;
        @XmlElement(required = true)
        protected Recurrence recurrence;

        /**
         * Ruft den Wert der startTime-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStartTime() {
            return startTime;
        }

        /**
         * Legt den Wert der startTime-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStartTime(XMLGregorianCalendar value) {
            this.startTime = value;
        }

        /**
         * Ruft den Wert der duration-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link CollaborateRoomScheduleDuration }
         *     
         */
        public CollaborateRoomScheduleDuration getDuration() {
            return duration;
        }

        /**
         * Legt den Wert der duration-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link CollaborateRoomScheduleDuration }
         *     
         */
        public void setDuration(CollaborateRoomScheduleDuration value) {
            this.duration = value;
        }

        /**
         * Ruft den Wert der recurrence-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Recurrence }
         *     
         */
        public Recurrence getRecurrence() {
            return recurrence;
        }

        /**
         * Legt den Wert der recurrence-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Recurrence }
         *     
         */
        public void setRecurrence(Recurrence value) {
            this.recurrence = value;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "startTime",
        "endTime"
    })
    public static class ScheduleReservationless {

        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar startTime;
        @XmlElement(required = true, nillable = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar endTime;

        /**
         * Ruft den Wert der startTime-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStartTime() {
            return startTime;
        }

        /**
         * Legt den Wert der startTime-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStartTime(XMLGregorianCalendar value) {
            this.startTime = value;
        }

        /**
         * Ruft den Wert der endTime-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEndTime() {
            return endTime;
        }

        /**
         * Legt den Wert der endTime-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEndTime(XMLGregorianCalendar value) {
            this.endTime = value;
        }

    }

}
