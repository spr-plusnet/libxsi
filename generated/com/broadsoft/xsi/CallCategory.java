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
 * <p>Java-Klasse für CallCategory.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CallCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Local"/>
 *     &lt;enumeration value="National"/>
 *     &lt;enumeration value="Interlata"/>
 *     &lt;enumeration value="Intralata"/>
 *     &lt;enumeration value="International"/>
 *     &lt;enumeration value="Private"/>
 *     &lt;enumeration value="Emergency"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
