//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CPDResult.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CPDResult">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="SIT"/>
 *     &lt;enumeration value="Fax"/>
 *     &lt;enumeration value="VoiceMessaging"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
