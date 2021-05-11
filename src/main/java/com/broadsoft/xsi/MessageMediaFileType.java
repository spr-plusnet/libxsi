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
 * <p>Java-Klasse für MessageMediaFileType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="MessageMediaFileType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="TIF"/&gt;
 *     &lt;enumeration value="WAV"/&gt;
 *     &lt;enumeration value="MOV"/&gt;
 *     &lt;enumeration value="MP3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageMediaFileType")
@XmlEnum
public enum MessageMediaFileType {

    TIF("TIF"),
    WAV("WAV"),
    MOV("MOV"),
    @XmlEnumValue("MP3")
    MP_3("MP3");
    private final String value;

    MessageMediaFileType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageMediaFileType fromValue(String v) {
        for (MessageMediaFileType c: MessageMediaFileType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
