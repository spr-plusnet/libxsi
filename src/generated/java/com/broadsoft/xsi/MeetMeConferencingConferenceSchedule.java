//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="MeetMeConferencingConferenceSchedule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="scheduleReservationless"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                     &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="scheduleOneTime"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                     &lt;element name="duration" type="{http://schema.broadsoft.com/xsi}MeetMeConferencingConferenceDuration"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="scheduleRecurring"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                     &lt;element name="duration" type="{http://schema.broadsoft.com/xsi}MeetMeConferencingConferenceDuration"/&gt;
 *                     &lt;element name="recurrence" type="{http://schema.broadsoft.com/xsi}Recurrence"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="duration" type="{http://schema.broadsoft.com/xsi}MeetMeConferencingConferenceDuration"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
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
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="duration" type="{http://schema.broadsoft.com/xsi}MeetMeConferencingConferenceDuration"/&gt;
     *         &lt;element name="recurrence" type="{http://schema.broadsoft.com/xsi}Recurrence"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
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
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
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
