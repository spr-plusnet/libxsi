//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MeetMeConferencingConferenceAttendeeNotification.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MeetMeConferencingConferenceAttendeeNotification">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Play Tone"/>
 *     &lt;enumeration value="Play Recorded Name"/>
 *     &lt;enumeration value="No Notification"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
