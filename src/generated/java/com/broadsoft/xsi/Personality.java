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
 * <p>Java-Klasse für Personality.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Personality">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="Originator"/>
 *     &lt;enumeration value="Terminator"/>
 *     &lt;enumeration value="Click-to-Dial"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
