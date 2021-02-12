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
 * <p>Java-Klasse für RoutePointCallReleaseReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RoutePointCallReleaseReason">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="CallReleaseRequested"/>
 *     &lt;enumeration value="NoAnswerTimeOut"/>
 *     &lt;enumeration value="ReleasedWithCause"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
