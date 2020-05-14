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
 * <p>Java-Klasse für CallingPresentationNumberSource.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CallingPresentationNumberSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Configurable CLID"/>
 *     &lt;enumeration value="DNIS"/>
 *     &lt;enumeration value="Emergency"/>
 *     &lt;enumeration value="Group"/>
 *     &lt;enumeration value="Trunk Group"/>
 *     &lt;enumeration value="User"/>
 *     &lt;enumeration value="Department"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CallingPresentationNumberSource")
@XmlEnum
public enum CallingPresentationNumberSource {

    @XmlEnumValue("Configurable CLID")
    CONFIGURABLE_CLID("Configurable CLID"),
    DNIS("DNIS"),
    @XmlEnumValue("Emergency")
    EMERGENCY("Emergency"),
    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("Trunk Group")
    TRUNK_GROUP("Trunk Group"),
    @XmlEnumValue("User")
    USER("User"),
    @XmlEnumValue("Department")
    DEPARTMENT("Department");
    private final String value;

    CallingPresentationNumberSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallingPresentationNumberSource fromValue(String v) {
        for (CallingPresentationNumberSource c: CallingPresentationNumberSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
