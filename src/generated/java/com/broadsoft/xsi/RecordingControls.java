//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RecordingControls.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RecordingControls">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="record"/>
 *     &lt;enumeration value="pause"/>
 *     &lt;enumeration value="pause-stop"/>
 *     &lt;enumeration value="resume"/>
 *     &lt;enumeration value="resume-stop"/>
 *     &lt;enumeration value="stop"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RecordingControls")
@XmlEnum
public enum RecordingControls {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("record")
    RECORD("record"),
    @XmlEnumValue("pause")
    PAUSE("pause"),
    @XmlEnumValue("pause-stop")
    PAUSE_STOP("pause-stop"),
    @XmlEnumValue("resume")
    RESUME("resume"),
    @XmlEnumValue("resume-stop")
    RESUME_STOP("resume-stop"),
    @XmlEnumValue("stop")
    STOP("stop");
    private final String value;

    RecordingControls(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecordingControls fromValue(String v) {
        for (RecordingControls c: RecordingControls.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
