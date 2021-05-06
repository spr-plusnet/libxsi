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
 * <p>Java-Klasse für SelectiveCallRejectionCriteriaCallTypeSelection.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="SelectiveCallRejectionCriteriaCallTypeSelection"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Any"/&gt;
 *     &lt;enumeration value="Forwarded"/&gt;
 *     &lt;enumeration value="Specified Only"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
