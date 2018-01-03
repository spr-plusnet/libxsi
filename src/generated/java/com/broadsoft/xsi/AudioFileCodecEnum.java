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
 * <p>Java-Klasse für AudioFileCodecEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AudioFileCodecEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="G711"/>
 *     &lt;enumeration value="G729"/>
 *     &lt;enumeration value="G726"/>
 *     &lt;enumeration value="AMR"/>
 *     &lt;enumeration value="G722"/>
 *     &lt;enumeration value="AMR-WB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AudioFileCodecEnum")
@XmlEnum
public enum AudioFileCodecEnum {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("G711")
    G_711("G711"),
    @XmlEnumValue("G729")
    G_729("G729"),
    @XmlEnumValue("G726")
    G_726("G726"),
    AMR("AMR"),
    @XmlEnumValue("G722")
    G_722("G722"),
    @XmlEnumValue("AMR-WB")
    AMR_WB("AMR-WB");
    private final String value;

    AudioFileCodecEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AudioFileCodecEnum fromValue(String v) {
        for (AudioFileCodecEnum c: AudioFileCodecEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
