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
 * <p>Java-Klasse für ExecutiveCallSimpleFilterType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="ExecutiveCallSimpleFilterType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="All Calls"/&gt;
 *     &lt;enumeration value="All Internal Calls"/&gt;
 *     &lt;enumeration value="All External Calls"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
