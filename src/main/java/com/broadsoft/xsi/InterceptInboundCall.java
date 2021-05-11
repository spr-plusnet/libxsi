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
 * <p>Java-Klasse für InterceptInboundCall.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="InterceptInboundCall"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Intercept All"/&gt;
 *     &lt;enumeration value="Allow All"/&gt;
 *     &lt;enumeration value="Allow System Dns"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InterceptInboundCall")
@XmlEnum
public enum InterceptInboundCall {

    @XmlEnumValue("Intercept All")
    INTERCEPT_ALL("Intercept All"),
    @XmlEnumValue("Allow All")
    ALLOW_ALL("Allow All"),
    @XmlEnumValue("Allow System Dns")
    ALLOW_SYSTEM_DNS("Allow System Dns");
    private final String value;

    InterceptInboundCall(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InterceptInboundCall fromValue(String v) {
        for (InterceptInboundCall c: InterceptInboundCall.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
