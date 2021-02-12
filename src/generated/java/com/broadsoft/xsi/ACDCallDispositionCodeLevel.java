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
 * <p>Java-Klasse für ACDCallDispositionCodeLevel.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ACDCallDispositionCodeLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Enterprise"/>
 *     &lt;enumeration value="Group"/>
 *     &lt;enumeration value="Queue"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ACDCallDispositionCodeLevel")
@XmlEnum
public enum ACDCallDispositionCodeLevel {

    @XmlEnumValue("Enterprise")
    ENTERPRISE("Enterprise"),
    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("Queue")
    QUEUE("Queue");
    private final String value;

    ACDCallDispositionCodeLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ACDCallDispositionCodeLevel fromValue(String v) {
        for (ACDCallDispositionCodeLevel c: ACDCallDispositionCodeLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
