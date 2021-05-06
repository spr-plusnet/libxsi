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
 * <p>Java-Klasse für RedirectingPresentationIndicator.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="RedirectingPresentationIndicator"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Anonymous"/&gt;
 *     &lt;enumeration value="Anonymous Name"/&gt;
 *     &lt;enumeration value="Anonymous URI"/&gt;
 *     &lt;enumeration value="Public"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RedirectingPresentationIndicator")
@XmlEnum
public enum RedirectingPresentationIndicator {

    @XmlEnumValue("Anonymous")
    ANONYMOUS("Anonymous"),
    @XmlEnumValue("Anonymous Name")
    ANONYMOUS_NAME("Anonymous Name"),
    @XmlEnumValue("Anonymous URI")
    ANONYMOUS_URI("Anonymous URI"),
    @XmlEnumValue("Public")
    PUBLIC("Public");
    private final String value;

    RedirectingPresentationIndicator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RedirectingPresentationIndicator fromValue(String v) {
        for (RedirectingPresentationIndicator c: RedirectingPresentationIndicator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
