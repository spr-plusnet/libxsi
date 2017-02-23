//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GroupNightForwardingUserServiceActivationMode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="GroupNightForwardingUserServiceActivationMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Automatic On"/>
 *     &lt;enumeration value="Always On"/>
 *     &lt;enumeration value="Off"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
