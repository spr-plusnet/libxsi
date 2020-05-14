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
 * <p>Java-Klasse für BasicCallType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BasicCallType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Group"/>
 *     &lt;enumeration value="Enterprise"/>
 *     &lt;enumeration value="Network"/>
 *     &lt;enumeration value="Network URL"/>
 *     &lt;enumeration value="Repair"/>
 *     &lt;enumeration value="Emergency"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BasicCallType")
@XmlEnum
public enum BasicCallType {

    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("Enterprise")
    ENTERPRISE("Enterprise"),
    @XmlEnumValue("Network")
    NETWORK("Network"),
    @XmlEnumValue("Network URL")
    NETWORK_URL("Network URL"),
    @XmlEnumValue("Repair")
    REPAIR("Repair"),
    @XmlEnumValue("Emergency")
    EMERGENCY("Emergency");
    private final String value;

    BasicCallType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BasicCallType fromValue(String v) {
        for (BasicCallType c: BasicCallType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
