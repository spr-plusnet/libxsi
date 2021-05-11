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
 * <p>Java-Klasse für RoutePointState.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="RoutePointState"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="Normal"/&gt;
 *     &lt;enumeration value="Failed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoutePointState")
@XmlEnum
public enum RoutePointState {


    /**
     * 
     *             All call received by the Route Point are queued and treated normally.
     *           
     * 
     */
    @XmlEnumValue("Normal")
    NORMAL("Normal"),

    /**
     * 
     *             All call received by the Route Point are sent to the failed
     *             destination.
     *                     
     * 
     */
    @XmlEnumValue("Failed")
    FAILED("Failed");
    private final String value;

    RoutePointState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoutePointState fromValue(String v) {
        for (RoutePointState c: RoutePointState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
