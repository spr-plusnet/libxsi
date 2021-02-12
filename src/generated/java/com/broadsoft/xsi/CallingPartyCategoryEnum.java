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
 * <p>Java-Klasse für CallingPartyCategoryEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CallingPartyCategoryEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Special"/>
 *     &lt;enumeration value="Hospital"/>
 *     &lt;enumeration value="Hotel"/>
 *     &lt;enumeration value="Prison"/>
 *     &lt;enumeration value="Payphone"/>
 *     &lt;enumeration value="Ordinary"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
