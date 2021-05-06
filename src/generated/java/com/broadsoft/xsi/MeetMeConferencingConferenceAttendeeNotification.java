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
 * <p>Java-Klasse für MeetMeConferencingConferenceAttendeeNotification.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="MeetMeConferencingConferenceAttendeeNotification"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Play Tone"/&gt;
 *     &lt;enumeration value="Play Recorded Name"/&gt;
 *     &lt;enumeration value="No Notification"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MeetMeConferencingConferenceAttendeeNotification")
@XmlEnum
public enum MeetMeConferencingConferenceAttendeeNotification {

    @XmlEnumValue("Play Tone")
    PLAY_TONE("Play Tone"),
    @XmlEnumValue("Play Recorded Name")
    PLAY_RECORDED_NAME("Play Recorded Name"),
    @XmlEnumValue("No Notification")
    NO_NOTIFICATION("No Notification");
    private final String value;

    MeetMeConferencingConferenceAttendeeNotification(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeetMeConferencingConferenceAttendeeNotification fromValue(String v) {
        for (MeetMeConferencingConferenceAttendeeNotification c: MeetMeConferencingConferenceAttendeeNotification.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
