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
 * <p>Java-Klasse für ExecutiveCallFilteringCriteriaDnSelection.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ExecutiveCallFilteringCriteriaDnSelection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Any"/>
 *     &lt;enumeration value="Any Internal"/>
 *     &lt;enumeration value="Any External"/>
 *     &lt;enumeration value="Specified Only"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExecutiveCallFilteringCriteriaDnSelection")
@XmlEnum
public enum ExecutiveCallFilteringCriteriaDnSelection {

    @XmlEnumValue("Any")
    ANY("Any"),
    @XmlEnumValue("Any Internal")
    ANY_INTERNAL("Any Internal"),
    @XmlEnumValue("Any External")
    ANY_EXTERNAL("Any External"),
    @XmlEnumValue("Specified Only")
    SPECIFIED_ONLY("Specified Only");
    private final String value;

    ExecutiveCallFilteringCriteriaDnSelection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExecutiveCallFilteringCriteriaDnSelection fromValue(String v) {
        for (ExecutiveCallFilteringCriteriaDnSelection c: ExecutiveCallFilteringCriteriaDnSelection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
