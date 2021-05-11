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
 * <p>Java-Klasse für GroupNightForwardingUserServiceActivationMode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="GroupNightForwardingUserServiceActivationMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Automatic On"/&gt;
 *     &lt;enumeration value="Always On"/&gt;
 *     &lt;enumeration value="Off"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GroupNightForwardingUserServiceActivationMode")
@XmlEnum
public enum GroupNightForwardingUserServiceActivationMode {

    @XmlEnumValue("Automatic On")
    AUTOMATIC_ON("Automatic On"),
    @XmlEnumValue("Always On")
    ALWAYS_ON("Always On"),
    @XmlEnumValue("Off")
    OFF("Off");
    private final String value;

    GroupNightForwardingUserServiceActivationMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GroupNightForwardingUserServiceActivationMode fromValue(String v) {
        for (GroupNightForwardingUserServiceActivationMode c: GroupNightForwardingUserServiceActivationMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
