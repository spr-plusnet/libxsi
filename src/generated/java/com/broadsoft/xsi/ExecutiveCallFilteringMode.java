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
 * <p>Java-Klasse für ExecutiveCallFilteringMode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ExecutiveCallFilteringMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Simple"/>
 *     &lt;enumeration value="Advanced"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExecutiveCallFilteringMode")
@XmlEnum
public enum ExecutiveCallFilteringMode {

    @XmlEnumValue("Simple")
    SIMPLE("Simple"),
    @XmlEnumValue("Advanced")
    ADVANCED("Advanced");
    private final String value;

    ExecutiveCallFilteringMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExecutiveCallFilteringMode fromValue(String v) {
        for (ExecutiveCallFilteringMode c: ExecutiveCallFilteringMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
