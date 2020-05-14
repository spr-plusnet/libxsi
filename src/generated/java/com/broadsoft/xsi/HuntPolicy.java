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
 * <p>Java-Klasse für HuntPolicy.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="HuntPolicy">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Circular"/>
 *     &lt;enumeration value="Regular"/>
 *     &lt;enumeration value="Simultaneous"/>
 *     &lt;enumeration value="Uniform"/>
 *     &lt;enumeration value="Weighted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
