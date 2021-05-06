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
 * <p>Java-Klasse für ExecutiveScreeningAlertType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="ExecutiveScreeningAlertType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Silent"/&gt;
 *     &lt;enumeration value="Ring Splash"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExecutiveScreeningAlertType")
@XmlEnum
public enum ExecutiveScreeningAlertType {

    @XmlEnumValue("Silent")
    SILENT("Silent"),
    @XmlEnumValue("Ring Splash")
    RING_SPLASH("Ring Splash");
    private final String value;

    ExecutiveScreeningAlertType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExecutiveScreeningAlertType fromValue(String v) {
        for (ExecutiveScreeningAlertType c: ExecutiveScreeningAlertType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
