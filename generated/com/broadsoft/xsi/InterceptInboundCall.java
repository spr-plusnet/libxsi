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
 * <p>Java-Klasse für InterceptInboundCall.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="InterceptInboundCall">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Intercept All"/>
 *     &lt;enumeration value="Allow All"/>
 *     &lt;enumeration value="Allow System Dns"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
