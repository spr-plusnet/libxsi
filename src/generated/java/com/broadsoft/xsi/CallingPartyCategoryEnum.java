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
 * <p>Java-Klasse für CallingPartyCategoryEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="CallingPartyCategoryEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Special"/&gt;
 *     &lt;enumeration value="Hospital"/&gt;
 *     &lt;enumeration value="Hotel"/&gt;
 *     &lt;enumeration value="Prison"/&gt;
 *     &lt;enumeration value="Payphone"/&gt;
 *     &lt;enumeration value="Ordinary"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CallingPartyCategoryEnum")
@XmlEnum
public enum CallingPartyCategoryEnum {

    @XmlEnumValue("Special")
    SPECIAL("Special"),
    @XmlEnumValue("Hospital")
    HOSPITAL("Hospital"),
    @XmlEnumValue("Hotel")
    HOTEL("Hotel"),
    @XmlEnumValue("Prison")
    PRISON("Prison"),
    @XmlEnumValue("Payphone")
    PAYPHONE("Payphone"),
    @XmlEnumValue("Ordinary")
    ORDINARY("Ordinary");
    private final String value;

    CallingPartyCategoryEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallingPartyCategoryEnum fromValue(String v) {
        for (CallingPartyCategoryEnum c: CallingPartyCategoryEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
