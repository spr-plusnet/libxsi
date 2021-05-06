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
 * <p>Java-Klasse für BusyPattern.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="BusyPattern"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="Normal"/&gt;
 *     &lt;enumeration value="FastBusy"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BusyPattern")
@XmlEnum
public enum BusyPattern {


    /**
     * 
     *             Corresponds to the localized busy signal.
     *           
     * 
     */
    @XmlEnumValue("Normal")
    NORMAL("Normal"),

    /**
     * 
     *             Corresponds to the localized fast busy
     *             signal.
     *           
     * 
     */
    @XmlEnumValue("FastBusy")
    FAST_BUSY("FastBusy");
    private final String value;

    BusyPattern(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BusyPattern fromValue(String v) {
        for (BusyPattern c: BusyPattern.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
