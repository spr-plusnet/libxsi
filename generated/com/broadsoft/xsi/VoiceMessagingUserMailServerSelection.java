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
 * <p>Java-Klasse für VoiceMessagingUserMailServerSelection.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="VoiceMessagingUserMailServerSelection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Group Mail Server"/>
 *     &lt;enumeration value="Personal Mail Server"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
