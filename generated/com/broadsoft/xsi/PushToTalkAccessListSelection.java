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
 * <p>Java-Klasse für PushToTalkAccessListSelection.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PushToTalkAccessListSelection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Allow Calls From Selected Users"/>
 *     &lt;enumeration value="Allow Calls From Everyone Except Selected Users"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
