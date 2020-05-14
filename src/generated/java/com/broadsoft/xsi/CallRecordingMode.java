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
 * <p>Java-Klasse für CallRecordingMode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CallRecordingMode">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="always"/>
 *     &lt;enumeration value="never"/>
 *     &lt;enumeration value="on-demand"/>
 *     &lt;enumeration value="always-pause-resume"/>
 *     &lt;enumeration value="on-demand-user-start"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CallRecordingMode")
@XmlEnum
public enum CallRecordingMode {

    @XmlEnumValue("always")
    ALWAYS("always"),
    @XmlEnumValue("never")
    NEVER("never"),
    @XmlEnumValue("on-demand")
    ON_DEMAND("on-demand"),
    @XmlEnumValue("always-pause-resume")
    ALWAYS_PAUSE_RESUME("always-pause-resume"),
    @XmlEnumValue("on-demand-user-start")
    ON_DEMAND_USER_START("on-demand-user-start");
    private final String value;

    CallRecordingMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallRecordingMode fromValue(String v) {
        for (CallRecordingMode c: CallRecordingMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
