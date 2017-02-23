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
 * <p>Java-Klasse für MeetMeConferencingConferenceType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MeetMeConferencingConferenceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Reservationless"/>
 *     &lt;enumeration value="One Time"/>
 *     &lt;enumeration value="Recurring Daily"/>
 *     &lt;enumeration value="Recurring Weekly"/>
 *     &lt;enumeration value="Recurring Monthly"/>
 *     &lt;enumeration value="Recurring Yearly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
