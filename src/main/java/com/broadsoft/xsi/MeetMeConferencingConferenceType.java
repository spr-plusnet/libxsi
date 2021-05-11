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
 * <p>Java-Klasse für MeetMeConferencingConferenceType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="MeetMeConferencingConferenceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Reservationless"/&gt;
 *     &lt;enumeration value="One Time"/&gt;
 *     &lt;enumeration value="Recurring Daily"/&gt;
 *     &lt;enumeration value="Recurring Weekly"/&gt;
 *     &lt;enumeration value="Recurring Monthly"/&gt;
 *     &lt;enumeration value="Recurring Yearly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MeetMeConferencingConferenceType")
@XmlEnum
public enum MeetMeConferencingConferenceType {

    @XmlEnumValue("Reservationless")
    RESERVATIONLESS("Reservationless"),
    @XmlEnumValue("One Time")
    ONE_TIME("One Time"),
    @XmlEnumValue("Recurring Daily")
    RECURRING_DAILY("Recurring Daily"),
    @XmlEnumValue("Recurring Weekly")
    RECURRING_WEEKLY("Recurring Weekly"),
    @XmlEnumValue("Recurring Monthly")
    RECURRING_MONTHLY("Recurring Monthly"),
    @XmlEnumValue("Recurring Yearly")
    RECURRING_YEARLY("Recurring Yearly");
    private final String value;

    MeetMeConferencingConferenceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeetMeConferencingConferenceType fromValue(String v) {
        for (MeetMeConferencingConferenceType c: MeetMeConferencingConferenceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
