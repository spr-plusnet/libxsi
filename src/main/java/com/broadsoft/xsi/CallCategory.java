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
 * <p>Java-Klasse für CallCategory.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="CallCategory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Local"/&gt;
 *     &lt;enumeration value="National"/&gt;
 *     &lt;enumeration value="Interlata"/&gt;
 *     &lt;enumeration value="Intralata"/&gt;
 *     &lt;enumeration value="International"/&gt;
 *     &lt;enumeration value="Private"/&gt;
 *     &lt;enumeration value="Emergency"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CallCategory")
@XmlEnum
public enum CallCategory {

    @XmlEnumValue("Local")
    LOCAL("Local"),
    @XmlEnumValue("National")
    NATIONAL("National"),
    @XmlEnumValue("Interlata")
    INTERLATA("Interlata"),
    @XmlEnumValue("Intralata")
    INTRALATA("Intralata"),
    @XmlEnumValue("International")
    INTERNATIONAL("International"),
    @XmlEnumValue("Private")
    PRIVATE("Private"),
    @XmlEnumValue("Emergency")
    EMERGENCY("Emergency"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    CallCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallCategory fromValue(String v) {
        for (CallCategory c: CallCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
