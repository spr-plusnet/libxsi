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
 * <p>Java-Klasse für ConnectedNumberSource.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ConnectedNumberSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Configurable CLID"/>
 *     &lt;enumeration value="Group"/>
 *     &lt;enumeration value="User"/>
 *     &lt;enumeration value="Department"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConnectedNumberSource")
@XmlEnum
public enum ConnectedNumberSource {

    @XmlEnumValue("Configurable CLID")
    CONFIGURABLE_CLID("Configurable CLID"),
    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("User")
    USER("User"),
    @XmlEnumValue("Department")
    DEPARTMENT("Department");
    private final String value;

    ConnectedNumberSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConnectedNumberSource fromValue(String v) {
        for (ConnectedNumberSource c: ConnectedNumberSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
