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
 *         Defines recurrence.
 *       
 * 
 * <p>Java-Klasse für Recurrence complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Recurrence"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="recurDaily"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="recurInterval" type="{http://schema.broadsoft.com/xsi}RecurDailyInterval" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="recurWeekly"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="recurInterval" type="{http://schema.broadsoft.com/xsi}RecurWeeklyInterval" minOccurs="0"/&gt;
 *                     &lt;element name="sunday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                     &lt;element name="monday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                     &lt;element name="tuesday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                     &lt;element name="wednesday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                     &lt;element name="thursday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                     &lt;element name="friday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                     &lt;element name="saturday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="recurMonthlyByDay"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="recurInterval" type="{http://schema.broadsoft.com/xsi}RecurMonthlyInterval" minOccurs="0"/&gt;
 *                     &lt;element name="dayOfMonth" type="{http://schema.broadsoft.com/xsi}DayOfMonth"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="recurMonthlyByWeek"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="recurInterval" type="{http://schema.broadsoft.com/xsi}RecurMonthlyInterval" minOccurs="0"/&gt;
 *                     &lt;element name="dayOfWeekInMonth" type="{http://schema.broadsoft.com/xsi}DayOfWeekInMonth"/&gt;
 *                     &lt;element name="dayOfWeek" type="{http://schema.broadsoft.com/xsi}DayOfWeek"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="recurYearlyByDay"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="recurInterval" type="{http://schema.broadsoft.com/xsi}RecurYearlyInterval" minOccurs="0"/&gt;
 *                     &lt;element name="dayOfMonth" type="{http://schema.broadsoft.com/xsi}DayOfMonth"/&gt;
 *                     &lt;element name="month" type="{http://schema.broadsoft.com/xsi}Month"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="recurYearlyByWeek"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="recurInterval" type="{http://schema.broadsoft.com/xsi}RecurYearlyInterval" minOccurs="0"/&gt;
 *                     &lt;element name="dayOfWeek" type="{http://schema.broadsoft.com/xsi}DayOfWeek"/&gt;
 *                     &lt;element name="dayOfWeekInMonth" type="{http://schema.broadsoft.com/xsi}DayOfWeekInMonth"/&gt;
 *                     &lt;element name="month" type="{http://schema.broadsoft.com/xsi}Month"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element name="recurForEver" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *           &lt;element name="recurEndDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *           &lt;element name="recurEndOccurrence" type="{http://schema.broadsoft.com/xsi}RecurEndOccurrence"/&gt;
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
@XmlType(name = "Recurrence", propOrder = {
    "recurDaily",
    "recurWeekly",
    "recurMonthlyByDay",
    "recurMonthlyByWeek",
    "recurYearlyByDay",
    "recurYearlyByWeek",
    "recurForEver",
    "recurEndDate",
    "recurEndOccurrence"
})
public class Recurrence {

    protected Recurrence.RecurDaily recurDaily;
    protected Recurrence.RecurWeekly recurWeekly;
    protected Recurrence.RecurMonthlyByDay recurMonthlyByDay;
    protected Recurrence.RecurMonthlyByWeek recurMonthlyByWeek;
    protected Recurrence.RecurYearlyByDay recurYearlyByDay;
    protected Recurrence.RecurYearlyByWeek recurYearlyByWeek;
    protected Boolean recurForEver;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar recurEndDate;
    protected Integer recurEndOccurrence;

    /**
     * Ruft den Wert der recurDaily-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Recurrence.RecurDaily }
     *     
     */
    public Recurrence.RecurDaily getRecurDaily() {
        return recurDaily;
    }

    /**
     * Legt den Wert der recurDaily-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Recurrence.RecurDaily }
     *     
     */
    public void setRecurDaily(Recurrence.RecurDaily value) {
        this.recurDaily = value;
    }

    /**
     * Ruft den Wert der recurWeekly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Recurrence.RecurWeekly }
     *     
     */
    public Recurrence.RecurWeekly getRecurWeekly() {
        return recurWeekly;
    }

    /**
     * Legt den Wert der recurWeekly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Recurrence.RecurWeekly }
     *     
     */
    public void setRecurWeekly(Recurrence.RecurWeekly value) {
        this.recurWeekly = value;
    }

    /**
     * Ruft den Wert der recurMonthlyByDay-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Recurrence.RecurMonthlyByDay }
     *     
     */
    public Recurrence.RecurMonthlyByDay getRecurMonthlyByDay() {
        return recurMonthlyByDay;
    }

    /**
     * Legt den Wert der recurMonthlyByDay-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Recurrence.RecurMonthlyByDay }
     *     
     */
    public void setRecurMonthlyByDay(Recurrence.RecurMonthlyByDay value) {
        this.recurMonthlyByDay = value;
    }

    /**
     * Ruft den Wert der recurMonthlyByWeek-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Recurrence.RecurMonthlyByWeek }
     *     
     */
    public Recurrence.RecurMonthlyByWeek getRecurMonthlyByWeek() {
        return recurMonthlyByWeek;
    }

    /**
     * Legt den Wert der recurMonthlyByWeek-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Recurrence.RecurMonthlyByWeek }
     *     
     */
    public void setRecurMonthlyByWeek(Recurrence.RecurMonthlyByWeek value) {
        this.recurMonthlyByWeek = value;
    }

    /**
     * Ruft den Wert der recurYearlyByDay-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Recurrence.RecurYearlyByDay }
     *     
     */
    public Recurrence.RecurYearlyByDay getRecurYearlyByDay() {
        return recurYearlyByDay;
    }

    /**
     * Legt den Wert der recurYearlyByDay-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Recurrence.RecurYearlyByDay }
     *     
     */
    public void setRecurYearlyByDay(Recurrence.RecurYearlyByDay value) {
        this.recurYearlyByDay = value;
    }

    /**
     * Ruft den Wert der recurYearlyByWeek-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Recurrence.RecurYearlyByWeek }
     *     
     */
    public Recurrence.RecurYearlyByWeek getRecurYearlyByWeek() {
        return recurYearlyByWeek;
    }

    /**
     * Legt den Wert der recurYearlyByWeek-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Recurrence.RecurYearlyByWeek }
     *     
     */
    public void setRecurYearlyByWeek(Recurrence.RecurYearlyByWeek value) {
        this.recurYearlyByWeek = value;
    }

    /**
     * Ruft den Wert der recurForEver-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecurForEver() {
        return recurForEver;
    }

    /**
     * Legt den Wert der recurForEver-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecurForEver(Boolean value) {
        this.recurForEver = value;
    }

    /**
     * Ruft den Wert der recurEndDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecurEndDate() {
        return recurEndDate;
    }

    /**
     * Legt den Wert der recurEndDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecurEndDate(XMLGregorianCalendar value) {
        this.recurEndDate = value;
    }

    /**
     * Ruft den Wert der recurEndOccurrence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecurEndOccurrence() {
        return recurEndOccurrence;
    }

    /**
     * Legt den Wert der recurEndOccurrence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecurEndOccurrence(Integer value) {
        this.recurEndOccurrence = value;
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
     *         &lt;element name="recurInterval" type="{http://schema.broadsoft.com/xsi}RecurDailyInterval" minOccurs="0"/&gt;
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
        "recurInterval"
    })
    public static class RecurDaily {

        protected Integer recurInterval;

        /**
         * Ruft den Wert der recurInterval-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getRecurInterval() {
            return recurInterval;
        }

        /**
         * Legt den Wert der recurInterval-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setRecurInterval(Integer value) {
            this.recurInterval = value;
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
     *         &lt;element name="recurInterval" type="{http://schema.broadsoft.com/xsi}RecurMonthlyInterval" minOccurs="0"/&gt;
     *         &lt;element name="dayOfMonth" type="{http://schema.broadsoft.com/xsi}DayOfMonth"/&gt;
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
        "recurInterval",
        "dayOfMonth"
    })
    public static class RecurMonthlyByDay {

        protected Integer recurInterval;
        protected int dayOfMonth;

        /**
         * Ruft den Wert der recurInterval-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getRecurInterval() {
            return recurInterval;
        }

        /**
         * Legt den Wert der recurInterval-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setRecurInterval(Integer value) {
            this.recurInterval = value;
        }

        /**
         * Ruft den Wert der dayOfMonth-Eigenschaft ab.
         * 
         */
        public int getDayOfMonth() {
            return dayOfMonth;
        }

        /**
         * Legt den Wert der dayOfMonth-Eigenschaft fest.
         * 
         */
        public void setDayOfMonth(int value) {
            this.dayOfMonth = value;
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
     *         &lt;element name="recurInterval" type="{http://schema.broadsoft.com/xsi}RecurMonthlyInterval" minOccurs="0"/&gt;
     *         &lt;element name="dayOfWeekInMonth" type="{http://schema.broadsoft.com/xsi}DayOfWeekInMonth"/&gt;
     *         &lt;element name="dayOfWeek" type="{http://schema.broadsoft.com/xsi}DayOfWeek"/&gt;
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
        "recurInterval",
        "dayOfWeekInMonth",
        "dayOfWeek"
    })
    public static class RecurMonthlyByWeek {

        protected Integer recurInterval;
        @XmlElement(required = true)
        @XmlSchemaType(name = "token")
        protected DayOfWeekInMonth dayOfWeekInMonth;
        @XmlElement(required = true)
        @XmlSchemaType(name = "NMTOKEN")
        protected DayOfWeek dayOfWeek;

        /**
         * Ruft den Wert der recurInterval-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getRecurInterval() {
            return recurInterval;
        }

        /**
         * Legt den Wert der recurInterval-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setRecurInterval(Integer value) {
            this.recurInterval = value;
        }

        /**
         * Ruft den Wert der dayOfWeekInMonth-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DayOfWeekInMonth }
         *     
         */
        public DayOfWeekInMonth getDayOfWeekInMonth() {
            return dayOfWeekInMonth;
        }

        /**
         * Legt den Wert der dayOfWeekInMonth-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DayOfWeekInMonth }
         *     
         */
        public void setDayOfWeekInMonth(DayOfWeekInMonth value) {
            this.dayOfWeekInMonth = value;
        }

        /**
         * Ruft den Wert der dayOfWeek-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DayOfWeek }
         *     
         */
        public DayOfWeek getDayOfWeek() {
            return dayOfWeek;
        }

        /**
         * Legt den Wert der dayOfWeek-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DayOfWeek }
         *     
         */
        public void setDayOfWeek(DayOfWeek value) {
            this.dayOfWeek = value;
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
     *         &lt;element name="recurInterval" type="{http://schema.broadsoft.com/xsi}RecurWeeklyInterval" minOccurs="0"/&gt;
     *         &lt;element name="sunday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="monday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="tuesday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="wednesday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="thursday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="friday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="saturday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
        "recurInterval",
        "sunday",
        "monday",
        "tuesday",
        "wednesday",
        "thursday",
        "friday",
        "saturday"
    })
    public static class RecurWeekly {

        protected Integer recurInterval;
        protected boolean sunday;
        protected boolean monday;
        protected boolean tuesday;
        protected boolean wednesday;
        protected boolean thursday;
        protected boolean friday;
        protected boolean saturday;

        /**
         * Ruft den Wert der recurInterval-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getRecurInterval() {
            return recurInterval;
        }

        /**
         * Legt den Wert der recurInterval-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setRecurInterval(Integer value) {
            this.recurInterval = value;
        }

        /**
         * Ruft den Wert der sunday-Eigenschaft ab.
         * 
         */
        public boolean isSunday() {
            return sunday;
        }

        /**
         * Legt den Wert der sunday-Eigenschaft fest.
         * 
         */
        public void setSunday(boolean value) {
            this.sunday = value;
        }

        /**
         * Ruft den Wert der monday-Eigenschaft ab.
         * 
         */
        public boolean isMonday() {
            return monday;
        }

        /**
         * Legt den Wert der monday-Eigenschaft fest.
         * 
         */
        public void setMonday(boolean value) {
            this.monday = value;
        }

        /**
         * Ruft den Wert der tuesday-Eigenschaft ab.
         * 
         */
        public boolean isTuesday() {
            return tuesday;
        }

        /**
         * Legt den Wert der tuesday-Eigenschaft fest.
         * 
         */
        public void setTuesday(boolean value) {
            this.tuesday = value;
        }

        /**
         * Ruft den Wert der wednesday-Eigenschaft ab.
         * 
         */
        public boolean isWednesday() {
            return wednesday;
        }

        /**
         * Legt den Wert der wednesday-Eigenschaft fest.
         * 
         */
        public void setWednesday(boolean value) {
            this.wednesday = value;
        }

        /**
         * Ruft den Wert der thursday-Eigenschaft ab.
         * 
         */
        public boolean isThursday() {
            return thursday;
        }

        /**
         * Legt den Wert der thursday-Eigenschaft fest.
         * 
         */
        public void setThursday(boolean value) {
            this.thursday = value;
        }

        /**
         * Ruft den Wert der friday-Eigenschaft ab.
         * 
         */
        public boolean isFriday() {
            return friday;
        }

        /**
         * Legt den Wert der friday-Eigenschaft fest.
         * 
         */
        public void setFriday(boolean value) {
            this.friday = value;
        }

        /**
         * Ruft den Wert der saturday-Eigenschaft ab.
         * 
         */
        public boolean isSaturday() {
            return saturday;
        }

        /**
         * Legt den Wert der saturday-Eigenschaft fest.
         * 
         */
        public void setSaturday(boolean value) {
            this.saturday = value;
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
     *         &lt;element name="recurInterval" type="{http://schema.broadsoft.com/xsi}RecurYearlyInterval" minOccurs="0"/&gt;
     *         &lt;element name="dayOfMonth" type="{http://schema.broadsoft.com/xsi}DayOfMonth"/&gt;
     *         &lt;element name="month" type="{http://schema.broadsoft.com/xsi}Month"/&gt;
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
        "recurInterval",
        "dayOfMonth",
        "month"
    })
    public static class RecurYearlyByDay {

        protected Integer recurInterval;
        protected int dayOfMonth;
        @XmlElement(required = true)
        @XmlSchemaType(name = "token")
        protected Month month;

        /**
         * Ruft den Wert der recurInterval-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getRecurInterval() {
            return recurInterval;
        }

        /**
         * Legt den Wert der recurInterval-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setRecurInterval(Integer value) {
            this.recurInterval = value;
        }

        /**
         * Ruft den Wert der dayOfMonth-Eigenschaft ab.
         * 
         */
        public int getDayOfMonth() {
            return dayOfMonth;
        }

        /**
         * Legt den Wert der dayOfMonth-Eigenschaft fest.
         * 
         */
        public void setDayOfMonth(int value) {
            this.dayOfMonth = value;
        }

        /**
         * Ruft den Wert der month-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Month }
         *     
         */
        public Month getMonth() {
            return month;
        }

        /**
         * Legt den Wert der month-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Month }
         *     
         */
        public void setMonth(Month value) {
            this.month = value;
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
     *         &lt;element name="recurInterval" type="{http://schema.broadsoft.com/xsi}RecurYearlyInterval" minOccurs="0"/&gt;
     *         &lt;element name="dayOfWeek" type="{http://schema.broadsoft.com/xsi}DayOfWeek"/&gt;
     *         &lt;element name="dayOfWeekInMonth" type="{http://schema.broadsoft.com/xsi}DayOfWeekInMonth"/&gt;
     *         &lt;element name="month" type="{http://schema.broadsoft.com/xsi}Month"/&gt;
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
        "recurInterval",
        "dayOfWeek",
        "dayOfWeekInMonth",
        "month"
    })
    public static class RecurYearlyByWeek {

        protected Integer recurInterval;
        @XmlElement(required = true)
        @XmlSchemaType(name = "NMTOKEN")
        protected DayOfWeek dayOfWeek;
        @XmlElement(required = true)
        @XmlSchemaType(name = "token")
        protected DayOfWeekInMonth dayOfWeekInMonth;
        @XmlElement(required = true)
        @XmlSchemaType(name = "token")
        protected Month month;

        /**
         * Ruft den Wert der recurInterval-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getRecurInterval() {
            return recurInterval;
        }

        /**
         * Legt den Wert der recurInterval-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setRecurInterval(Integer value) {
            this.recurInterval = value;
        }

        /**
         * Ruft den Wert der dayOfWeek-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DayOfWeek }
         *     
         */
        public DayOfWeek getDayOfWeek() {
            return dayOfWeek;
        }

        /**
         * Legt den Wert der dayOfWeek-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DayOfWeek }
         *     
         */
        public void setDayOfWeek(DayOfWeek value) {
            this.dayOfWeek = value;
        }

        /**
         * Ruft den Wert der dayOfWeekInMonth-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DayOfWeekInMonth }
         *     
         */
        public DayOfWeekInMonth getDayOfWeekInMonth() {
            return dayOfWeekInMonth;
        }

        /**
         * Legt den Wert der dayOfWeekInMonth-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DayOfWeekInMonth }
         *     
         */
        public void setDayOfWeekInMonth(DayOfWeekInMonth value) {
            this.dayOfWeekInMonth = value;
        }

        /**
         * Ruft den Wert der month-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Month }
         *     
         */
        public Month getMonth() {
            return month;
        }

        /**
         * Legt den Wert der month-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Month }
         *     
         */
        public void setMonth(Month value) {
            this.month = value;
        }

    }

}
