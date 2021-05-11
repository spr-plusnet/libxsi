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
 * <p>Java-Klasse für AudioFileCodecEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="AudioFileCodecEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="G711"/&gt;
 *     &lt;enumeration value="G729"/&gt;
 *     &lt;enumeration value="G726"/&gt;
 *     &lt;enumeration value="AMR"/&gt;
 *     &lt;enumeration value="G722"/&gt;
 *     &lt;enumeration value="AMR-WB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
