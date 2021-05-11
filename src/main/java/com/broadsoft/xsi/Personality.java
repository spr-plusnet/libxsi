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
 * <p>Java-Klasse für Personality.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="Personality"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="Originator"/&gt;
 *     &lt;enumeration value="Terminator"/&gt;
 *     &lt;enumeration value="Click-to-Dial"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Personality")
@XmlEnum
public enum Personality {


    /**
     * 
     *             Personality of the call when the subscriber
     *             is the initiator
     *             of the call session. If A initiates a call
     *             session to destination B, then the
     *             call associated to A has
     *             its personality
     *             set to "Originator".
     *           
     * 
     */
    @XmlEnumValue("Originator")
    ORIGINATOR("Originator"),

    /**
     * 
     *             Personality of the call when the subscriber
     *             receives an incoming call. If A initiates a 
     *             call to destination B, then the call
     *             associated to B has its
     *             personality set to "Terminator".
     *           
     * 
     */
    @XmlEnumValue("Terminator")
    TERMINATOR("Terminator"),

    /**
     * 
     *             Personality of the call when a "dial"
     *             request is being sent on
     *             behalf of a subscriber. If a remote
     *             application tries to establish a call
     *             session from A to B (through a third
     *             party call control dial request) then
     *             the call associated to A has its
     *             personality set to "Click-to-Dial" until A
     *             answers. Once A has answered, then a
     *             call attempt is made by BroadWorks to B
     *             and A's personality is set to
     *             "Originator".
     *           
     * 
     */
    @XmlEnumValue("Click-to-Dial")
    CLICK_TO_DIAL("Click-to-Dial");
    private final String value;

    Personality(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Personality fromValue(String v) {
        for (Personality c: Personality.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
