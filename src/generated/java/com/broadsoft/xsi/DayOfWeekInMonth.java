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
 * <p>Java-Klasse für DayOfWeekInMonth.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DayOfWeekInMonth">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="First"/>
 *     &lt;enumeration value="Second"/>
 *     &lt;enumeration value="Third"/>
 *     &lt;enumeration value="Fourth"/>
 *     &lt;enumeration value="Last"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DayOfWeekInMonth")
@XmlEnum
public enum DayOfWeekInMonth {

    @XmlEnumValue("First")
    FIRST("First"),
    @XmlEnumValue("Second")
    SECOND("Second"),
    @XmlEnumValue("Third")
    THIRD("Third"),
    @XmlEnumValue("Fourth")
    FOURTH("Fourth"),
    @XmlEnumValue("Last")
    LAST("Last");
    private final String value;

    DayOfWeekInMonth(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DayOfWeekInMonth fromValue(String v) {
        for (DayOfWeekInMonth c: DayOfWeekInMonth.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
