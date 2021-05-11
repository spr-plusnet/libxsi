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
 * <p>Java-Klasse für RecordingStoppedReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="RecordingStoppedReason"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="User Requested"/&gt;
 *     &lt;enumeration value="Failure"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
