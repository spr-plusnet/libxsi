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
 * <p>Java-Klasse für SimultaneousRingSelection.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="SimultaneousRingSelection"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="Do not Ring if on a Call"/&gt;
 *     &lt;enumeration value="Ring for all Incoming Calls"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SimultaneousRingSelection")
@XmlEnum
public enum SimultaneousRingSelection {

    @XmlEnumValue("Do not Ring if on a Call")
    DO_NOT_RING_IF_ON_A_CALL("Do not Ring if on a Call"),
    @XmlEnumValue("Ring for all Incoming Calls")
    RING_FOR_ALL_INCOMING_CALLS("Ring for all Incoming Calls");
    private final String value;

    SimultaneousRingSelection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SimultaneousRingSelection fromValue(String v) {
        for (SimultaneousRingSelection c: SimultaneousRingSelection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
