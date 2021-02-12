//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
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
 *         MeetMe Conference Schedule types. There are 3 types possible
 *         1. Reservationless
 *         2. One time 
 *         3. Recurring
 *         Release Added: R17.sp3
 *       
 * 
 * <p>Java-Klasse für MeetMeConferencingConferenceSchedule complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MeetMeConferencingConferenceSchedule">
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
 *                     &lt;element name="duration" type="{http://schema.broadsoft.com/xsi}MeetMeConferencingConferenceDuration"/>
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
 *                     &lt;element name="duration" type="{http://schema.broadsoft.com/xsi}MeetMeConferencingConferenceDuration"/>
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
@XmlType(name = "MeetMeConferencingConferenceSchedule", propOrder = {
    "scheduleReservationless",
    "scheduleOneTime",
    "scheduleRecurring"
})
public class MeetMeConferencingConferenceSchedule {

    protected MeetMeConferencingConferenceSchedule.ScheduleReservationless scheduleReservationless;
    protected MeetMeConferencingConferenceSchedule.ScheduleOneTime scheduleOneTime;
    protected MeetMeConferencingConferenceSchedule.ScheduleRecurring scheduleRecurring;

    /**
     * Ruft den Wert der scheduleReservationless-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeetMeConferencingConferenceSchedule.ScheduleReservationless }
     *     
     */
    public MeetMeConferencingConferenceSchedule.ScheduleReservationless getScheduleReservationless() {
        return scheduleReservationless;
    }

    /**
     * Legt den Wert der scheduleReservationless-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetMeConferencingConferenceSchedule.ScheduleReservationless }
     *     
     */
    public void setScheduleReservationless(MeetMeConferencingConferenceSchedule.ScheduleReservationless value) {
        this.scheduleReservationless = value;
    }

    /**
     * Ruft den Wert der scheduleOneTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeetMeConferencingConferenceSchedule.ScheduleOneTime }
     *     
     */
    public MeetMeConferencingConferenceSchedule.ScheduleOneTime getScheduleOneTime() {
        return scheduleOneTime;
    }

    /**
     * Legt den Wert der scheduleOneTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetMeConferencingConferenceSchedule.ScheduleOneTime }
     *     
     */
    public void setScheduleOneTime(MeetMeConferencingConferenceSchedule.ScheduleOneTime value) {
        this.scheduleOneTime = value;
    }

    /**
     * Ruft den Wert der scheduleRecurring-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeetMeConferencingConferenceSchedule.ScheduleRecurring }
     *     
     */
    public MeetMeConferencingConferenceSchedule.ScheduleRecurring getScheduleRecurring() {
        return scheduleRecurring;
    }

    /**
     * Legt den Wert der scheduleRecurring-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetMeConferencingConferenceSchedule.ScheduleRecurring }
     *     
     */
    public void setScheduleRecurring(MeetMeConferencingConferenceSchedule.ScheduleRecurring value) {
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
     *         &lt;element name="duration" type="{http://schema.broadsoft.com/xsi}MeetMeConferencingConferenceDuration"/>
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
        protected MeetMeConferencingConferenceDuration duration;

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
         *     {@link MeetMeConferencingConferenceDuration }
         *     
         */
        public MeetMeConferencingConferenceDuration getDuration() {
            return duration;
        }

        /**
         * Legt den Wert der duration-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link MeetMeConferencingConferenceDuration }
         *     
         */
        public void setDuration(MeetMeConferencingConferenceDuration value) {
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
     *         &lt;element name="duration" type="{http://schema.broadsoft.com/xsi}MeetMeConferencingConferenceDuration"/>
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
        protected MeetMeConferencingConferenceDuration duration;
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
         *     {@link MeetMeConferencingConferenceDuration }
         *     
         */
        public MeetMeConferencingConferenceDuration getDuration() {
            return duration;
        }

        /**
         * Legt den Wert der duration-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link MeetMeConferencingConferenceDuration }
         *     
         */
        public void setDuration(MeetMeConferencingConferenceDuration value) {
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
