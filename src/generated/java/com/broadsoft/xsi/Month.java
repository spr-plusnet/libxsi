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
 * <p>Java-Klasse für Month.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="Month"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="January"/&gt;
 *     &lt;enumeration value="February"/&gt;
 *     &lt;enumeration value="March"/&gt;
 *     &lt;enumeration value="April"/&gt;
 *     &lt;enumeration value="May"/&gt;
 *     &lt;enumeration value="June"/&gt;
 *     &lt;enumeration value="July"/&gt;
 *     &lt;enumeration value="August"/&gt;
 *     &lt;enumeration value="September"/&gt;
 *     &lt;enumeration value="October"/&gt;
 *     &lt;enumeration value="November"/&gt;
 *     &lt;enumeration value="December"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Month")
@XmlEnum
public enum Month {

    @XmlEnumValue("January")
    JANUARY("January"),
    @XmlEnumValue("February")
    FEBRUARY("February"),
    @XmlEnumValue("March")
    MARCH("March"),
    @XmlEnumValue("April")
    APRIL("April"),
    @XmlEnumValue("May")
    MAY("May"),
    @XmlEnumValue("June")
    JUNE("June"),
    @XmlEnumValue("July")
    JULY("July"),
    @XmlEnumValue("August")
    AUGUST("August"),
    @XmlEnumValue("September")
    SEPTEMBER("September"),
    @XmlEnumValue("October")
    OCTOBER("October"),
    @XmlEnumValue("November")
    NOVEMBER("November"),
    @XmlEnumValue("December")
    DECEMBER("December");
    private final String value;

    Month(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Month fromValue(String v) {
        for (Month c: Month.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
