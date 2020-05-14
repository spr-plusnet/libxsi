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
 * <p>Java-Klasse für AlternateNumbersRingPatternEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AlternateNumbersRingPatternEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Long-Long"/>
 *     &lt;enumeration value="Short-Short-Long"/>
 *     &lt;enumeration value="Short-Long-Short"/>
 *     &lt;enumeration value="Normal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
