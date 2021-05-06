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
 * <p>Java-Klasse für ServiceInvocationBasicCallType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="ServiceInvocationBasicCallType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Group"/&gt;
 *     &lt;enumeration value="Enterprise"/&gt;
 *     &lt;enumeration value="Network"/&gt;
 *     &lt;enumeration value="Network URL"/&gt;
 *     &lt;enumeration value="Repair"/&gt;
 *     &lt;enumeration value="Emergency"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServiceInvocationBasicCallType")
@XmlEnum
public enum ServiceInvocationBasicCallType {

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

    ServiceInvocationBasicCallType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceInvocationBasicCallType fromValue(String v) {
        for (ServiceInvocationBasicCallType c: ServiceInvocationBasicCallType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
