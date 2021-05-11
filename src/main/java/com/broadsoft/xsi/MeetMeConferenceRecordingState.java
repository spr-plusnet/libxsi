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
 * <p>Java-Klasse für MeetMeConferenceRecordingState.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="MeetMeConferenceRecordingState"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="Not Started"/&gt;
 *     &lt;enumeration value="Recording"/&gt;
 *     &lt;enumeration value="Pause"/&gt;
 *     &lt;enumeration value="End"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MeetMeConferenceRecordingState")
@XmlEnum
public enum MeetMeConferenceRecordingState {

    @XmlEnumValue("Not Started")
    NOT_STARTED("Not Started"),
    @XmlEnumValue("Recording")
    RECORDING("Recording"),
    @XmlEnumValue("Pause")
    PAUSE("Pause"),
    @XmlEnumValue("End")
    END("End");
    private final String value;

    MeetMeConferenceRecordingState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeetMeConferenceRecordingState fromValue(String v) {
        for (MeetMeConferenceRecordingState c: MeetMeConferenceRecordingState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
