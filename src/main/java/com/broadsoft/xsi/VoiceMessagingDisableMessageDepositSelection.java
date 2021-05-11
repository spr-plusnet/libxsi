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
 * <p>Java-Klasse für VoiceMessagingDisableMessageDepositSelection.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="VoiceMessagingDisableMessageDepositSelection"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Disconnect"/&gt;
 *     &lt;enumeration value="Forward"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VoiceMessagingDisableMessageDepositSelection")
@XmlEnum
public enum VoiceMessagingDisableMessageDepositSelection {

    @XmlEnumValue("Disconnect")
    DISCONNECT("Disconnect"),
    @XmlEnumValue("Forward")
    FORWARD("Forward");
    private final String value;

    VoiceMessagingDisableMessageDepositSelection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VoiceMessagingDisableMessageDepositSelection fromValue(String v) {
        for (VoiceMessagingDisableMessageDepositSelection c: VoiceMessagingDisableMessageDepositSelection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
