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
 * <p>Java-Klasse für MeetMeConferenceRecordingStoppedReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MeetMeConferenceRecordingStoppedReason">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="Max Recording File Size Reached"/>
 *     &lt;enumeration value="Silence Only"/>
 *     &lt;enumeration value="Media Failure"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MeetMeConferenceRecordingStoppedReason")
@XmlEnum
public enum MeetMeConferenceRecordingStoppedReason {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Max Recording File Size Reached")
    MAX_RECORDING_FILE_SIZE_REACHED("Max Recording File Size Reached"),
    @XmlEnumValue("Silence Only")
    SILENCE_ONLY("Silence Only"),
    @XmlEnumValue("Media Failure")
    MEDIA_FAILURE("Media Failure");
    private final String value;

    MeetMeConferenceRecordingStoppedReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeetMeConferenceRecordingStoppedReason fromValue(String v) {
        for (MeetMeConferenceRecordingStoppedReason c: MeetMeConferenceRecordingStoppedReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
