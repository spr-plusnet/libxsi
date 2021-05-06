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
 * <p>Java-Klasse für MeetMeConferenceRecordingStoppedReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="MeetMeConferenceRecordingStoppedReason"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="Normal"/&gt;
 *     &lt;enumeration value="Max Recording File Size Reached"/&gt;
 *     &lt;enumeration value="Silence Only"/&gt;
 *     &lt;enumeration value="Media Failure"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
