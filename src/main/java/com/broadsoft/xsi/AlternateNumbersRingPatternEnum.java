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
 * <p>Java-Klasse für AlternateNumbersRingPatternEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="AlternateNumbersRingPatternEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Long-Long"/&gt;
 *     &lt;enumeration value="Short-Short-Long"/&gt;
 *     &lt;enumeration value="Short-Long-Short"/&gt;
 *     &lt;enumeration value="Normal"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AlternateNumbersRingPatternEnum")
@XmlEnum
public enum AlternateNumbersRingPatternEnum {

    @XmlEnumValue("Long-Long")
    LONG_LONG("Long-Long"),
    @XmlEnumValue("Short-Short-Long")
    SHORT_SHORT_LONG("Short-Short-Long"),
    @XmlEnumValue("Short-Long-Short")
    SHORT_LONG_SHORT("Short-Long-Short"),
    @XmlEnumValue("Normal")
    NORMAL("Normal");
    private final String value;

    AlternateNumbersRingPatternEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlternateNumbersRingPatternEnum fromValue(String v) {
        for (AlternateNumbersRingPatternEnum c: AlternateNumbersRingPatternEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
