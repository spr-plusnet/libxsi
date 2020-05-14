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
 * <p>Java-Klasse für MessageMediaFileType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageMediaFileType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="TIF"/>
 *     &lt;enumeration value="WAV"/>
 *     &lt;enumeration value="MOV"/>
 *     &lt;enumeration value="MP3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
