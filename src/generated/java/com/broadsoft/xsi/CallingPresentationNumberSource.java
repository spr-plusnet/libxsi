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
 * <p>Java-Klasse für CallingPresentationNumberSource.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="CallingPresentationNumberSource"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Configurable CLID"/&gt;
 *     &lt;enumeration value="DNIS"/&gt;
 *     &lt;enumeration value="Emergency"/&gt;
 *     &lt;enumeration value="Group"/&gt;
 *     &lt;enumeration value="Trunk Group"/&gt;
 *     &lt;enumeration value="User"/&gt;
 *     &lt;enumeration value="Department"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
