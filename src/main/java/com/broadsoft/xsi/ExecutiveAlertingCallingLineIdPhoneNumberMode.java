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
 * <p>Java-Klasse für ExecutiveAlertingCallingLineIdPhoneNumberMode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="ExecutiveAlertingCallingLineIdPhoneNumberMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Executive"/&gt;
 *     &lt;enumeration value="Originator"/&gt;
 *     &lt;enumeration value="Custom"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExecutiveAlertingCallingLineIdPhoneNumberMode")
@XmlEnum
public enum ExecutiveAlertingCallingLineIdPhoneNumberMode {

    @XmlEnumValue("Executive")
    EXECUTIVE("Executive"),
    @XmlEnumValue("Originator")
    ORIGINATOR("Originator"),
    @XmlEnumValue("Custom")
    CUSTOM("Custom");
    private final String value;

    ExecutiveAlertingCallingLineIdPhoneNumberMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExecutiveAlertingCallingLineIdPhoneNumberMode fromValue(String v) {
        for (ExecutiveAlertingCallingLineIdPhoneNumberMode c: ExecutiveAlertingCallingLineIdPhoneNumberMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
