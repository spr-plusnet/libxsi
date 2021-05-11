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
 * <p>Java-Klasse für RoutePointCallFailureReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="RoutePointCallFailureReason"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="CallFailureRequested"/&gt;
 *     &lt;enumeration value="CallFailureDueToInactivity"/&gt;
 *     &lt;enumeration value="RoutePointFailure"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoutePointCallFailureReason")
@XmlEnum
public enum RoutePointCallFailureReason {


    /**
     * 
     *             The call was marked as failed as requested by the remote application
     *             through a Route Point Fail Call
     *                     
     * 
     */
    @XmlEnumValue("CallFailureRequested")
    CALL_FAILURE_REQUESTED("CallFailureRequested"),

    /**
     * 
     *             The call was marked as failed because no request was received for the
     *             call within the configurable time period.
     *                     
     * 
     */
    @XmlEnumValue("CallFailureDueToInactivity")
    CALL_FAILURE_DUE_TO_INACTIVITY("CallFailureDueToInactivity"),

    /**
     * 
     *             The call was marked as failed because the Route Point is in the
     *             failed state.
     *                     
     * 
     */
    @XmlEnumValue("RoutePointFailure")
    ROUTE_POINT_FAILURE("RoutePointFailure");
    private final String value;

    RoutePointCallFailureReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoutePointCallFailureReason fromValue(String v) {
        for (RoutePointCallFailureReason c: RoutePointCallFailureReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
