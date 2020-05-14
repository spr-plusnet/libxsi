//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ExecutiveAlertingCallingLineIdNameMode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ExecutiveAlertingCallingLineIdNameMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Executive"/>
 *     &lt;enumeration value="Executive-Originator"/>
 *     &lt;enumeration value="Originator-Executive"/>
 *     &lt;enumeration value="Originator"/>
 *     &lt;enumeration value="Custom"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExecutiveAlertingCallingLineIdNameMode")
@XmlEnum
public enum ExecutiveAlertingCallingLineIdNameMode {

    @XmlEnumValue("Executive")
    EXECUTIVE("Executive"),
    @XmlEnumValue("Executive-Originator")
    EXECUTIVE_ORIGINATOR("Executive-Originator"),
    @XmlEnumValue("Originator-Executive")
    ORIGINATOR_EXECUTIVE("Originator-Executive"),
    @XmlEnumValue("Originator")
    ORIGINATOR("Originator"),
    @XmlEnumValue("Custom")
    CUSTOM("Custom");
    private final String value;

    ExecutiveAlertingCallingLineIdNameMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExecutiveAlertingCallingLineIdNameMode fromValue(String v) {
        for (ExecutiveAlertingCallingLineIdNameMode c: ExecutiveAlertingCallingLineIdNameMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
