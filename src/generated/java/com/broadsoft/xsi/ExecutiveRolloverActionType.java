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
 * <p>Java-Klasse für ExecutiveRolloverActionType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="ExecutiveRolloverActionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Voice Messaging"/&gt;
 *     &lt;enumeration value="Forward"/&gt;
 *     &lt;enumeration value="No Answer Processing"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExecutiveRolloverActionType")
@XmlEnum
public enum ExecutiveRolloverActionType {

    @XmlEnumValue("Voice Messaging")
    VOICE_MESSAGING("Voice Messaging"),
    @XmlEnumValue("Forward")
    FORWARD("Forward"),
    @XmlEnumValue("No Answer Processing")
    NO_ANSWER_PROCESSING("No Answer Processing");
    private final String value;

    ExecutiveRolloverActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExecutiveRolloverActionType fromValue(String v) {
        for (ExecutiveRolloverActionType c: ExecutiveRolloverActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
