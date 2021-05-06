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
 * <p>Java-Klasse für ACDRouting.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="ACDRouting"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Priority Based"/&gt;
 *     &lt;enumeration value="Skill Based"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ACDRouting")
@XmlEnum
public enum ACDRouting {

    @XmlEnumValue("Priority Based")
    PRIORITY_BASED("Priority Based"),
    @XmlEnumValue("Skill Based")
    SKILL_BASED("Skill Based");
    private final String value;

    ACDRouting(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ACDRouting fromValue(String v) {
        for (ACDRouting c: ACDRouting.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
