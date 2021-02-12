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
 * <p>Java-Klasse für PresentationIndicator.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PresentationIndicator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Anonymous"/>
 *     &lt;enumeration value="Anonymous Name"/>
 *     &lt;enumeration value="Anonymous URI"/>
 *     &lt;enumeration value="Anonymous Unavailable"/>
 *     &lt;enumeration value="Public"/>
 *     &lt;enumeration value="Unavailable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PresentationIndicator")
@XmlEnum
public enum PresentationIndicator {

    @XmlEnumValue("Anonymous")
    ANONYMOUS("Anonymous"),
    @XmlEnumValue("Anonymous Name")
    ANONYMOUS_NAME("Anonymous Name"),
    @XmlEnumValue("Anonymous URI")
    ANONYMOUS_URI("Anonymous URI"),
    @XmlEnumValue("Anonymous Unavailable")
    ANONYMOUS_UNAVAILABLE("Anonymous Unavailable"),
    @XmlEnumValue("Public")
    PUBLIC("Public"),
    @XmlEnumValue("Unavailable")
    UNAVAILABLE("Unavailable");
    private final String value;

    PresentationIndicator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PresentationIndicator fromValue(String v) {
        for (PresentationIndicator c: PresentationIndicator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
