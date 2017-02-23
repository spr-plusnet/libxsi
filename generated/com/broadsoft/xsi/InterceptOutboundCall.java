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
 * <p>Java-Klasse für InterceptOutboundCall.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="InterceptOutboundCall">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Block All"/>
 *     &lt;enumeration value="Allow Outbound Local Calls"/>
 *     &lt;enumeration value="Allow Outbound Enterprise Calls"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
