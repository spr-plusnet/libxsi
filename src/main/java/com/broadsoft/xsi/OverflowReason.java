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
 * <p>Java-Klasse für OverflowReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="OverflowReason"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="size"/&gt;
 *     &lt;enumeration value="time"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OverflowReason")
@XmlEnum
public enum OverflowReason {


    /**
     * 
     *             The call was overflowed because the queue
     *             had reached its
     *             maximum capacity when trying to add the
     *             call.
     *           
     * 
     */
    @XmlEnumValue("size")
    SIZE("size"),

    /**
     * 
     *             The call was overflowed because the call was
     *             not handled
     *             within the configured amount of time.
     *           
     * 
     */
    @XmlEnumValue("time")
    TIME("time");
    private final String value;

    OverflowReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OverflowReason fromValue(String v) {
        for (OverflowReason c: OverflowReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
