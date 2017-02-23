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
 * <p>Java-Klasse für ExtendedFileResourceSelection.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ExtendedFileResourceSelection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="File"/>
 *     &lt;enumeration value="URL"/>
 *     &lt;enumeration value="Default"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExtendedFileResourceSelection")
@XmlEnum
public enum ExtendedFileResourceSelection {

    @XmlEnumValue("File")
    FILE("File"),
    URL("URL"),
    @XmlEnumValue("Default")
    DEFAULT("Default");
    private final String value;

    ExtendedFileResourceSelection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExtendedFileResourceSelection fromValue(String v) {
        for (ExtendedFileResourceSelection c: ExtendedFileResourceSelection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
