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
 * <p>Java-Klasse für CallForwardingSelectiveNumberSelection.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CallForwardingSelectiveNumberSelection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Forward To Default Number"/>
 *     &lt;enumeration value="Forward To Specified Number"/>
 *     &lt;enumeration value="Do not forward"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CallForwardingSelectiveNumberSelection")
@XmlEnum
public enum CallForwardingSelectiveNumberSelection {

    @XmlEnumValue("Forward To Default Number")
    FORWARD_TO_DEFAULT_NUMBER("Forward To Default Number"),
    @XmlEnumValue("Forward To Specified Number")
    FORWARD_TO_SPECIFIED_NUMBER("Forward To Specified Number"),
    @XmlEnumValue("Do not forward")
    DO_NOT_FORWARD("Do not forward");
    private final String value;

    CallForwardingSelectiveNumberSelection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallForwardingSelectiveNumberSelection fromValue(String v) {
        for (CallForwardingSelectiveNumberSelection c: CallForwardingSelectiveNumberSelection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
