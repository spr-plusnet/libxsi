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
 * <p>Java-Klasse für InterceptOutboundCall.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="InterceptOutboundCall"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Block All"/&gt;
 *     &lt;enumeration value="Allow Outbound Local Calls"/&gt;
 *     &lt;enumeration value="Allow Outbound Enterprise Calls"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InterceptOutboundCall")
@XmlEnum
public enum InterceptOutboundCall {

    @XmlEnumValue("Block All")
    BLOCK_ALL("Block All"),
    @XmlEnumValue("Allow Outbound Local Calls")
    ALLOW_OUTBOUND_LOCAL_CALLS("Allow Outbound Local Calls"),
    @XmlEnumValue("Allow Outbound Enterprise Calls")
    ALLOW_OUTBOUND_ENTERPRISE_CALLS("Allow Outbound Enterprise Calls");
    private final String value;

    InterceptOutboundCall(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InterceptOutboundCall fromValue(String v) {
        for (InterceptOutboundCall c: InterceptOutboundCall.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
