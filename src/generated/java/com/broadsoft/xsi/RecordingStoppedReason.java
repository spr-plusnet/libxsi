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
 * <p>Java-Klasse für RecordingStoppedReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RecordingStoppedReason">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="User Requested"/>
 *     &lt;enumeration value="Failure"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RecordingStoppedReason")
@XmlEnum
public enum RecordingStoppedReason {


    /**
     * 
     *             The recording was stopped explicitly by the user.
     *           
     * 
     */
    @XmlEnumValue("User Requested")
    USER_REQUESTED("User Requested"),

    /**
     * 
     *             The recording was stopped due to a failure.
     *           
     * 
     */
    @XmlEnumValue("Failure")
    FAILURE("Failure");
    private final String value;

    RecordingStoppedReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecordingStoppedReason fromValue(String v) {
        for (RecordingStoppedReason c: RecordingStoppedReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
