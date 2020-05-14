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
 * <p>Java-Klasse für MeetMeConferenceRecordingState.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MeetMeConferenceRecordingState">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="Not Started"/>
 *     &lt;enumeration value="Recording"/>
 *     &lt;enumeration value="Pause"/>
 *     &lt;enumeration value="End"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
