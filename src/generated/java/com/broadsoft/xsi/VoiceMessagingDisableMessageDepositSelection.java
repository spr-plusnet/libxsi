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
 * <p>Java-Klasse für VoiceMessagingDisableMessageDepositSelection.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="VoiceMessagingDisableMessageDepositSelection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Disconnect"/>
 *     &lt;enumeration value="Forward"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
