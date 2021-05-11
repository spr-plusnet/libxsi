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
 * <p>Java-Klasse für RoutePointCallReleaseReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="RoutePointCallReleaseReason"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="CallReleaseRequested"/&gt;
 *     &lt;enumeration value="NoAnswerTimeOut"/&gt;
 *     &lt;enumeration value="ReleasedWithCause"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoutePointCallReleaseReason")
@XmlEnum
public enum RoutePointCallReleaseReason {


    /**
     * 
     *             The call was released as requested by the remote application
     *             through a Route Point Release Call.
     *           
     * 
     */
    @XmlEnumValue("CallReleaseRequested")
    CALL_RELEASE_REQUESTED("CallReleaseRequested"),

    /**
     * 
     *             The call was released because the no answer timer expired 
     *             prior to the call being answered.
     *             This reason is only applicable for outgoing calls.
     *           
     * 
     */
    @XmlEnumValue("NoAnswerTimeOut")
    NO_ANSWER_TIME_OUT("NoAnswerTimeOut"),

    /**
     * 
     *             The call was released because the call failed to be 
     *             delivered to the provided destination.
     *             This reason is only applicable for outgoing calls.
     *           
     * 
     */
    @XmlEnumValue("ReleasedWithCause")
    RELEASED_WITH_CAUSE("ReleasedWithCause");
    private final String value;

    RoutePointCallReleaseReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoutePointCallReleaseReason fromValue(String v) {
        for (RoutePointCallReleaseReason c: RoutePointCallReleaseReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
