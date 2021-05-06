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
 * <p>Java-Klasse für PauseResumeNotifyMethod.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="PauseResumeNotifyMethod"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="announcement"/&gt;
 *     &lt;enumeration value="beeponly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PauseResumeNotifyMethod")
@XmlEnum
public enum PauseResumeNotifyMethod {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("announcement")
    ANNOUNCEMENT("announcement"),
    @XmlEnumValue("beeponly")
    BEEPONLY("beeponly");
    private final String value;

    PauseResumeNotifyMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PauseResumeNotifyMethod fromValue(String v) {
        for (PauseResumeNotifyMethod c: PauseResumeNotifyMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
