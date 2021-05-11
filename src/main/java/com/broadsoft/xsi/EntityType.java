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
 * <p>Java-Klasse für EntityType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="EntityType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="User"/&gt;
 *     &lt;enumeration value="Group"/&gt;
 *     &lt;enumeration value="ServiceProvider"/&gt;
 *     &lt;enumeration value="System"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntityType")
@XmlEnum
public enum EntityType {

    @XmlEnumValue("User")
    USER("User"),
    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("ServiceProvider")
    SERVICE_PROVIDER("ServiceProvider"),
    @XmlEnumValue("System")
    SYSTEM("System");
    private final String value;

    EntityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntityType fromValue(String v) {
        for (EntityType c: EntityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
