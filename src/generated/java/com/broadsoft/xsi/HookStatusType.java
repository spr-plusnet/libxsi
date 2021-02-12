//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für HookStatusType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="HookStatusType">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="Off-Hook"/>
 *     &lt;enumeration value="On-Hook"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
