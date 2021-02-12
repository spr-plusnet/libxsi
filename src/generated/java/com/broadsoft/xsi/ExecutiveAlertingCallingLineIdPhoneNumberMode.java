//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ExecutiveAlertingCallingLineIdPhoneNumberMode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ExecutiveAlertingCallingLineIdPhoneNumberMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Executive"/>
 *     &lt;enumeration value="Originator"/>
 *     &lt;enumeration value="Custom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
