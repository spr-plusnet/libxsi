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
 * <p>Java-Klasse für RoutePointStateChangeReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="RoutePointStateChangeReason"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="FailureDetected"/&gt;
 *     &lt;enumeration value="ExternalRequest"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoutePointStateChangeReason")
@XmlEnum
public enum RoutePointStateChangeReason {


    /**
     * 
     *             The state change was performed because a failure was detected.
     *           
     * 
     */
    @XmlEnumValue("FailureDetected")
    FAILURE_DETECTED("FailureDetected"),

    /**
     * 
     *             The state change was performed because it was requested through an
     *             explicit request.
     *                     
     * 
     */
    @XmlEnumValue("ExternalRequest")
    EXTERNAL_REQUEST("ExternalRequest");
    private final String value;

    RoutePointStateChangeReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoutePointStateChangeReason fromValue(String v) {
        for (RoutePointStateChangeReason c: RoutePointStateChangeReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
