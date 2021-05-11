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
 * <p>Java-Klasse für HuntPolicy.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="HuntPolicy"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Circular"/&gt;
 *     &lt;enumeration value="Regular"/&gt;
 *     &lt;enumeration value="Simultaneous"/&gt;
 *     &lt;enumeration value="Uniform"/&gt;
 *     &lt;enumeration value="Weighted"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HuntPolicy")
@XmlEnum
public enum HuntPolicy {

    @XmlEnumValue("Circular")
    CIRCULAR("Circular"),
    @XmlEnumValue("Regular")
    REGULAR("Regular"),
    @XmlEnumValue("Simultaneous")
    SIMULTANEOUS("Simultaneous"),
    @XmlEnumValue("Uniform")
    UNIFORM("Uniform"),
    @XmlEnumValue("Weighted")
    WEIGHTED("Weighted");
    private final String value;

    HuntPolicy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HuntPolicy fromValue(String v) {
        for (HuntPolicy c: HuntPolicy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
