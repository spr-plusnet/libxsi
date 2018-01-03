//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PersonalAssistantPresence.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonalAssistantPresence">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Business Trip"/>
 *     &lt;enumeration value="Gone for the Day"/>
 *     &lt;enumeration value="Lunch"/>
 *     &lt;enumeration value="Meeting"/>
 *     &lt;enumeration value="Out Of Office"/>
 *     &lt;enumeration value="Temporarily Out"/>
 *     &lt;enumeration value="Training"/>
 *     &lt;enumeration value="Unavailable"/>
 *     &lt;enumeration value="Vacation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
