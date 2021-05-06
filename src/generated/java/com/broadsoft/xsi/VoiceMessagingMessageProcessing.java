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
 * <p>Java-Klasse für VoiceMessagingMessageProcessing.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="VoiceMessagingMessageProcessing"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Unified Voice and Email Messaging"/&gt;
 *     &lt;enumeration value="Deliver To Email Address Only"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
