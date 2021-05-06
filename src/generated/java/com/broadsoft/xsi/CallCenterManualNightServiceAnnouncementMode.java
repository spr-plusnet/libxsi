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
 * <p>Java-Klasse für CallCenterManualNightServiceAnnouncementMode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="CallCenterManualNightServiceAnnouncementMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Normal Announcement"/&gt;
 *     &lt;enumeration value="Manual Announcement"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CallCenterManualNightServiceAnnouncementMode")
@XmlEnum
public enum CallCenterManualNightServiceAnnouncementMode {

    @XmlEnumValue("Normal Announcement")
    NORMAL_ANNOUNCEMENT("Normal Announcement"),
    @XmlEnumValue("Manual Announcement")
    MANUAL_ANNOUNCEMENT("Manual Announcement");
    private final String value;

    CallCenterManualNightServiceAnnouncementMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallCenterManualNightServiceAnnouncementMode fromValue(String v) {
        for (CallCenterManualNightServiceAnnouncementMode c: CallCenterManualNightServiceAnnouncementMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
