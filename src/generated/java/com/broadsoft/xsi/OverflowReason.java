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
 * <p>Java-Klasse für OverflowReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="OverflowReason">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="size"/>
 *     &lt;enumeration value="time"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
