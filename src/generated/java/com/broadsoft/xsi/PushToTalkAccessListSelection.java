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
 * <p>Java-Klasse für PushToTalkAccessListSelection.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="PushToTalkAccessListSelection"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Allow Calls From Selected Users"/&gt;
 *     &lt;enumeration value="Allow Calls From Everyone Except Selected Users"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PushToTalkAccessListSelection")
@XmlEnum
public enum PushToTalkAccessListSelection {

    @XmlEnumValue("Allow Calls From Selected Users")
    ALLOW_CALLS_FROM_SELECTED_USERS("Allow Calls From Selected Users"),
    @XmlEnumValue("Allow Calls From Everyone Except Selected Users")
    ALLOW_CALLS_FROM_EVERYONE_EXCEPT_SELECTED_USERS("Allow Calls From Everyone Except Selected Users");
    private final String value;

    PushToTalkAccessListSelection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PushToTalkAccessListSelection fromValue(String v) {
        for (PushToTalkAccessListSelection c: PushToTalkAccessListSelection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
