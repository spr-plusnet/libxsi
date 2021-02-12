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
 * <p>Java-Klasse für VoiceMessagingMessageProcessing.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="VoiceMessagingMessageProcessing">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Unified Voice and Email Messaging"/>
 *     &lt;enumeration value="Deliver To Email Address Only"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VoiceMessagingMessageProcessing")
@XmlEnum
public enum VoiceMessagingMessageProcessing {

    @XmlEnumValue("Unified Voice and Email Messaging")
    UNIFIED_VOICE_AND_EMAIL_MESSAGING("Unified Voice and Email Messaging"),
    @XmlEnumValue("Deliver To Email Address Only")
    DELIVER_TO_EMAIL_ADDRESS_ONLY("Deliver To Email Address Only");
    private final String value;

    VoiceMessagingMessageProcessing(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VoiceMessagingMessageProcessing fromValue(String v) {
        for (VoiceMessagingMessageProcessing c: VoiceMessagingMessageProcessing.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
