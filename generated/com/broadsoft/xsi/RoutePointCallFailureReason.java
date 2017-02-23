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
 * <p>Java-Klasse für RoutePointCallFailureReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RoutePointCallFailureReason">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="CallFailureRequested"/>
 *     &lt;enumeration value="CallFailureDueToInactivity"/>
 *     &lt;enumeration value="RoutePointFailure"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
