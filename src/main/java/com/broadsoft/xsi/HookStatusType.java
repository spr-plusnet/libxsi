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
 * <p>Java-Klasse für HookStatusType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="HookStatusType"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="Off-Hook"/&gt;
 *     &lt;enumeration value="On-Hook"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HookStatusType")
@XmlEnum
public enum HookStatusType {


    /**
     * 
     *             Indicates that user is off-hook.
     *           
     * 
     */
    @XmlEnumValue("Off-Hook")
    OFF_HOOK("Off-Hook"),

    /**
     * 
     *             Indicates that user is on-hook.
     *           
     * 
     */
    @XmlEnumValue("On-Hook")
    ON_HOOK("On-Hook");
    private final String value;

    HookStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HookStatusType fromValue(String v) {
        for (HookStatusType c: HookStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
