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
 * <p>Java-Klasse für ExecutiveCallSimpleFilterType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ExecutiveCallSimpleFilterType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="All Calls"/>
 *     &lt;enumeration value="All Internal Calls"/>
 *     &lt;enumeration value="All External Calls"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExecutiveCallSimpleFilterType")
@XmlEnum
public enum ExecutiveCallSimpleFilterType {

    @XmlEnumValue("All Calls")
    ALL_CALLS("All Calls"),
    @XmlEnumValue("All Internal Calls")
    ALL_INTERNAL_CALLS("All Internal Calls"),
    @XmlEnumValue("All External Calls")
    ALL_EXTERNAL_CALLS("All External Calls");
    private final String value;

    ExecutiveCallSimpleFilterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExecutiveCallSimpleFilterType fromValue(String v) {
        for (ExecutiveCallSimpleFilterType c: ExecutiveCallSimpleFilterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
