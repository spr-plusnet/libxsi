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
 * <p>Java-Klasse für CommPilotExpressVoiceMailGreeting.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CommPilotExpressVoiceMailGreeting">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="No Answer"/>
 *     &lt;enumeration value="Unavailable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommPilotExpressVoiceMailGreeting")
@XmlEnum
public enum CommPilotExpressVoiceMailGreeting {

    @XmlEnumValue("No Answer")
    NO_ANSWER("No Answer"),
    @XmlEnumValue("Unavailable")
    UNAVAILABLE("Unavailable");
    private final String value;

    CommPilotExpressVoiceMailGreeting(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommPilotExpressVoiceMailGreeting fromValue(String v) {
        for (CommPilotExpressVoiceMailGreeting c: CommPilotExpressVoiceMailGreeting.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
