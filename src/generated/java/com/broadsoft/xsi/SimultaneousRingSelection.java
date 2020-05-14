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
 * <p>Java-Klasse für SimultaneousRingSelection.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SimultaneousRingSelection">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="Do not Ring if on a Call"/>
 *     &lt;enumeration value="Ring for all Incoming Calls"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
