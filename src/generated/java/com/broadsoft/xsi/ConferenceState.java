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
 * <p>Java-Klasse für ConferenceState.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="ConferenceState"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="Active"/&gt;
 *     &lt;enumeration value="Held"/&gt;
 *     &lt;enumeration value="Released"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConferenceState")
@XmlEnum
public enum ConferenceState {


    /**
     * 
     *             The controller is an active participant.
     *           
     * 
     */
    @XmlEnumValue("Active")
    ACTIVE("Active"),

    /**
     * 
     *             The controller has held the conference and so is no longer an active
     *             participant.
     *           
     * 
     */
    @XmlEnumValue("Held")
    HELD("Held"),

    /**
     * 
     *             The conference has been released.
     *           
     * 
     */
    @XmlEnumValue("Released")
    RELEASED("Released");
    private final String value;

    ConferenceState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConferenceState fromValue(String v) {
        for (ConferenceState c: ConferenceState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
