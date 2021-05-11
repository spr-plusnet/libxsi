//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PersonalAssistantPresence.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="PersonalAssistantPresence"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Business Trip"/&gt;
 *     &lt;enumeration value="Gone for the Day"/&gt;
 *     &lt;enumeration value="Lunch"/&gt;
 *     &lt;enumeration value="Meeting"/&gt;
 *     &lt;enumeration value="Out Of Office"/&gt;
 *     &lt;enumeration value="Temporarily Out"/&gt;
 *     &lt;enumeration value="Training"/&gt;
 *     &lt;enumeration value="Unavailable"/&gt;
 *     &lt;enumeration value="Vacation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PersonalAssistantPresence")
@XmlEnum
public enum PersonalAssistantPresence {


    /**
     * 
     *             It indicates that the personal assistant is
     *             not enabled.
     *           
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     *             It indicates that the user is on a business
     *             trip.
     *           
     * 
     */
    @XmlEnumValue("Business Trip")
    BUSINESS_TRIP("Business Trip"),

    /**
     * 
     *             It indicates that the user is gone for the
     *             day.
     *           
     * 
     */
    @XmlEnumValue("Gone for the Day")
    GONE_FOR_THE_DAY("Gone for the Day"),

    /**
     * 
     *             Lunch: indicates that the user is at lunch.
     *           
     * 
     */
    @XmlEnumValue("Lunch")
    LUNCH("Lunch"),

    /**
     * 
     *             It indicates that the user is in meeting;
     *           
     * 
     */
    @XmlEnumValue("Meeting")
    MEETING("Meeting"),

    /**
     * 
     *             It indicates that the user is out of the
     *             office.
     *           
     * 
     */
    @XmlEnumValue("Out Of Office")
    OUT_OF_OFFICE("Out Of Office"),

    /**
     * 
     *             It indicates that the user is temporarily
     *             out.
     *           
     * 
     */
    @XmlEnumValue("Temporarily Out")
    TEMPORARILY_OUT("Temporarily Out"),

    /**
     * 
     *             It indicates that the user is in training.
     *           
     * 
     */
    @XmlEnumValue("Training")
    TRAINING("Training"),

    /**
     * 
     *             It indicates that the user is unavailable.
     *           
     * 
     */
    @XmlEnumValue("Unavailable")
    UNAVAILABLE("Unavailable"),

    /**
     * 
     *             It indicates that the user is on vacation.
     *           
     * 
     */
    @XmlEnumValue("Vacation")
    VACATION("Vacation");
    private final String value;

    PersonalAssistantPresence(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PersonalAssistantPresence fromValue(String v) {
        for (PersonalAssistantPresence c: PersonalAssistantPresence.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
