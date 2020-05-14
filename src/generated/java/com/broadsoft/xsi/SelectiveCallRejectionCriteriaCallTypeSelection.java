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
 * <p>Java-Klasse für SelectiveCallRejectionCriteriaCallTypeSelection.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SelectiveCallRejectionCriteriaCallTypeSelection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Any"/>
 *     &lt;enumeration value="Forwarded"/>
 *     &lt;enumeration value="Specified Only"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SelectiveCallRejectionCriteriaCallTypeSelection")
@XmlEnum
public enum SelectiveCallRejectionCriteriaCallTypeSelection {

    @XmlEnumValue("Any")
    ANY("Any"),
    @XmlEnumValue("Forwarded")
    FORWARDED("Forwarded"),
    @XmlEnumValue("Specified Only")
    SPECIFIED_ONLY("Specified Only");
    private final String value;

    SelectiveCallRejectionCriteriaCallTypeSelection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SelectiveCallRejectionCriteriaCallTypeSelection fromValue(String v) {
        for (SelectiveCallRejectionCriteriaCallTypeSelection c: SelectiveCallRejectionCriteriaCallTypeSelection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
