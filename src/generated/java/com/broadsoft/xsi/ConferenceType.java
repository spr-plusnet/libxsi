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
 * <p>Java-Klasse für ConferenceType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ConferenceType">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="Barge-In"/>
 *     &lt;enumeration value="Silently Monitored"/>
 *     &lt;enumeration value="Supervisor Coached"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConferenceType")
@XmlEnum
public enum ConferenceType {

    @XmlEnumValue("Barge-In")
    BARGE_IN("Barge-In"),
    @XmlEnumValue("Silently Monitored")
    SILENTLY_MONITORED("Silently Monitored"),
    @XmlEnumValue("Supervisor Coached")
    SUPERVISOR_COACHED("Supervisor Coached");
    private final String value;

    ConferenceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConferenceType fromValue(String v) {
        for (ConferenceType c: ConferenceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
