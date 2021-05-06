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
 * <p>Java-Klasse für CollaborateRoomType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="CollaborateRoomType"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="MyRoom"/&gt;
 *     &lt;enumeration value="InstantRoom"/&gt;
 *     &lt;enumeration value="ProjectRoom"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CollaborateRoomType")
@XmlEnum
public enum CollaborateRoomType {

    @XmlEnumValue("MyRoom")
    MY_ROOM("MyRoom"),
    @XmlEnumValue("InstantRoom")
    INSTANT_ROOM("InstantRoom"),
    @XmlEnumValue("ProjectRoom")
    PROJECT_ROOM("ProjectRoom");
    private final String value;

    CollaborateRoomType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CollaborateRoomType fromValue(String v) {
        for (CollaborateRoomType c: CollaborateRoomType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
