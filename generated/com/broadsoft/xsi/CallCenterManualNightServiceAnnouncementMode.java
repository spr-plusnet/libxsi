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
 * <p>Java-Klasse für CallCenterManualNightServiceAnnouncementMode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CallCenterManualNightServiceAnnouncementMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Normal Announcement"/>
 *     &lt;enumeration value="Manual Announcement"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
