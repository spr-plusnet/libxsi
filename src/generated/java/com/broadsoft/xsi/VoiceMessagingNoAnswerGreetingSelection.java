//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für VoiceMessagingNoAnswerGreetingSelection.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="VoiceMessagingNoAnswerGreetingSelection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Personal"/>
 *     &lt;enumeration value="Alternate01"/>
 *     &lt;enumeration value="Alternate02"/>
 *     &lt;enumeration value="Alternate03"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VoiceMessagingNoAnswerGreetingSelection")
@XmlEnum
public enum VoiceMessagingNoAnswerGreetingSelection {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Personal")
    PERSONAL("Personal"),
    @XmlEnumValue("Alternate01")
    ALTERNATE_01("Alternate01"),
    @XmlEnumValue("Alternate02")
    ALTERNATE_02("Alternate02"),
    @XmlEnumValue("Alternate03")
    ALTERNATE_03("Alternate03");
    private final String value;

    VoiceMessagingNoAnswerGreetingSelection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VoiceMessagingNoAnswerGreetingSelection fromValue(String v) {
        for (VoiceMessagingNoAnswerGreetingSelection c: VoiceMessagingNoAnswerGreetingSelection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
