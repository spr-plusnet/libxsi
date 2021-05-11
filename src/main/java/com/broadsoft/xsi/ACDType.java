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
 * <p>Java-Klasse für ACDType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="ACDType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Basic"/&gt;
 *     &lt;enumeration value="Standard"/&gt;
 *     &lt;enumeration value="Premium"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ACDType")
@XmlEnum
public enum ACDType {

    @XmlEnumValue("Basic")
    BASIC("Basic"),
    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("Premium")
    PREMIUM("Premium");
    private final String value;

    ACDType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ACDType fromValue(String v) {
        for (ACDType c: ACDType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
