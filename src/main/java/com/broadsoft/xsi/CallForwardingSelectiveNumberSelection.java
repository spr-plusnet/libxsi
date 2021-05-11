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
 * <p>Java-Klasse für CallForwardingSelectiveNumberSelection.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="CallForwardingSelectiveNumberSelection"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Forward To Default Number"/&gt;
 *     &lt;enumeration value="Forward To Specified Number"/&gt;
 *     &lt;enumeration value="Do not forward"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CallForwardingSelectiveNumberSelection")
@XmlEnum
public enum CallForwardingSelectiveNumberSelection {

    @XmlEnumValue("Forward To Default Number")
    FORWARD_TO_DEFAULT_NUMBER("Forward To Default Number"),
    @XmlEnumValue("Forward To Specified Number")
    FORWARD_TO_SPECIFIED_NUMBER("Forward To Specified Number"),
    @XmlEnumValue("Do not forward")
    DO_NOT_FORWARD("Do not forward");
    private final String value;

    CallForwardingSelectiveNumberSelection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallForwardingSelectiveNumberSelection fromValue(String v) {
        for (CallForwardingSelectiveNumberSelection c: CallForwardingSelectiveNumberSelection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
