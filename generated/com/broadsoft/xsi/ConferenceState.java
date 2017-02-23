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
 * <p>Java-Klasse für ConferenceState.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ConferenceState">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Held"/>
 *     &lt;enumeration value="Released"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
