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
 * <p>Java-Klasse für PlayCollectType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PlayCollectType">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="Treatment"/>
 *     &lt;enumeration value="MOH"/>
 *     &lt;enumeration value="Ringback"/>
 *     &lt;enumeration value="Busy"/>
 *     &lt;enumeration value="Silence "/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
