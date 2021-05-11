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
 * <p>Java-Klasse für VoiceMessagingUserMailServerSelection.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="VoiceMessagingUserMailServerSelection"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Group Mail Server"/&gt;
 *     &lt;enumeration value="Personal Mail Server"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VoiceMessagingUserMailServerSelection")
@XmlEnum
public enum VoiceMessagingUserMailServerSelection {

    @XmlEnumValue("Group Mail Server")
    GROUP_MAIL_SERVER("Group Mail Server"),
    @XmlEnumValue("Personal Mail Server")
    PERSONAL_MAIL_SERVER("Personal Mail Server");
    private final String value;

    VoiceMessagingUserMailServerSelection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VoiceMessagingUserMailServerSelection fromValue(String v) {
        for (VoiceMessagingUserMailServerSelection c: VoiceMessagingUserMailServerSelection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
