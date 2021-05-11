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
 * <p>Java-Klasse für PlayCollectType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="PlayCollectType"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="Treatment"/&gt;
 *     &lt;enumeration value="MOH"/&gt;
 *     &lt;enumeration value="Ringback"/&gt;
 *     &lt;enumeration value="Busy"/&gt;
 *     &lt;enumeration value="Silence "/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PlayCollectType")
@XmlEnum
public enum PlayCollectType {


    /**
     * 
     *             Indicates that a treatment is being played.
     *                     
     * 
     */
    @XmlEnumValue("Treatment")
    TREATMENT("Treatment"),

    /**
     * 
     *             Indicates that Music On Hold is being played.
     *                     
     * 
     */
    MOH("MOH"),

    /**
     * 
     *             Indicates that a ringback is being played.
     *                     
     * 
     */
    @XmlEnumValue("Ringback")
    RINGBACK("Ringback"),

    /**
     * 
     *             Indicates that a busy is being played.
     *                     
     * 
     */
    @XmlEnumValue("Busy")
    BUSY("Busy"),

    /**
     * 
     *             Indicates that silence is being played.
     *                     
     * 
     */
    @XmlEnumValue("Silence ")
    SILENCE("Silence ");
    private final String value;

    PlayCollectType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlayCollectType fromValue(String v) {
        for (PlayCollectType c: PlayCollectType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
