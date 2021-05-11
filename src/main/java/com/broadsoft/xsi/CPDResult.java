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
 * <p>Java-Klasse für CPDResult.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="CPDResult"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="SIT"/&gt;
 *     &lt;enumeration value="Fax"/&gt;
 *     &lt;enumeration value="VoiceMessaging"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CPDResult")
@XmlEnum
public enum CPDResult {


    /**
     * 
     *             Special Information Tone was received during call setup.
     *           
     * 
     */
    SIT("SIT"),

    /**
     * 
     *             A Fax machine answered the call.
     *                     
     * 
     */
    @XmlEnumValue("Fax")
    FAX("Fax"),

    /**
     * 
     *             A voice messaging system answered the call.
     *                     
     * 
     */
    @XmlEnumValue("VoiceMessaging")
    VOICE_MESSAGING("VoiceMessaging");
    private final String value;

    CPDResult(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CPDResult fromValue(String v) {
        for (CPDResult c: CPDResult.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
