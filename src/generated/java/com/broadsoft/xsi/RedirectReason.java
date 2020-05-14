//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RedirectReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RedirectReason">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="user-busy"/>
 *     &lt;enumeration value="no-answer"/>
 *     &lt;enumeration value="unavailable"/>
 *     &lt;enumeration value="unconditional"/>
 *     &lt;enumeration value="time-of-day"/>
 *     &lt;enumeration value="do-not-disturb"/>
 *     &lt;enumeration value="deflection"/>
 *     &lt;enumeration value="follow-me"/>
 *     &lt;enumeration value="out-of-service"/>
 *     &lt;enumeration value="away"/>
 *     &lt;enumeration value="transfer"/>
 *     &lt;enumeration value="voicemail"/>
 *     &lt;enumeration value="hunt-group"/>
 *     &lt;enumeration value="call-center"/>
 *     &lt;enumeration value="route-point"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RedirectReason")
@XmlEnum
public enum RedirectReason {


    /**
     * 
     *             The call session was redirected to a
     *             specified destination
     *             because Call Forward Busy service is
     *             activated and the subscriber is busy. A
     *             subscriber is considered busy when
     *             there are too many active calls.
     *           
     * 
     */
    @XmlEnumValue("user-busy")
    USER_BUSY("user-busy"),

    /**
     * 
     *             The call session was redirected because Call
     *             Forward No Answer service was activated and 
     *             the subscriber did not answer within the 
     *             Specified number of rings.
     *           
     * 
     */
    @XmlEnumValue("no-answer")
    NO_ANSWER("no-answer"),

    /**
     * 
     *             The call session was redirected because Call
     *             Forwarding Not
     *             Reachable service was activated and
     *             the subscriber device is unreachable or
     *             unregistered.
     *           
     * 
     */
    @XmlEnumValue("unavailable")
    UNAVAILABLE("unavailable"),

    /**
     * 
     *             The call session was redirected because Call
     *             Forward Always (CFA) service was activated. 
     *             When active, CFA causes all incoming calls to 
     *             be redirected unconditionally.
     *           
     * 
     */
    @XmlEnumValue("unconditional")
    UNCONDITIONAL("unconditional"),

    /**
     * 
     *             The call session was redirected because Call
     *             Forward Selective (CFS) was activated and the
     *             incoming call matched the pre-specified
     *             time-of-day criteria.
     *           
     * 
     */
    @XmlEnumValue("time-of-day")
    TIME_OF_DAY("time-of-day"),

    /**
     * 
     *             The call session was redirected because Call
     *             Forward Busy is enabled and the Do-Not-Disturb
     *             service was activated.
     *           
     * 
     */
    @XmlEnumValue("do-not-disturb")
    DO_NOT_DISTURB("do-not-disturb"),

    /**
     * 
     *             The call session was redirected following a
     *             blind transfer
     *             before the call was answered.
     *           
     * 
     */
    @XmlEnumValue("deflection")
    DEFLECTION("deflection"),

    /**
     * 
     *             The call session was redirected because one
     *             of the following
     *             services was activated: Simultaneous
     *             Ringing, Sequential Ringing, BroadWorks
     *             Anywhere or Remote Office.
     *           
     * 
     */
    @XmlEnumValue("follow-me")
    FOLLOW_ME("follow-me"),

    /**
     * 
     *             The call session was redirected by the
     *             network with the reason
     *             set to "out-of-service?".
     *           
     * 
     */
    @XmlEnumValue("out-of-service")
    OUT_OF_SERVICE("out-of-service"),

    /**
     * 
     *             The call session was redirected by the
     *             network with the reason
     *             set to "away".
     *           
     * 
     */
    @XmlEnumValue("away")
    AWAY("away"),

    /**
     * 
     *             The call session was redirected following a
     *             blind transfer  after the call was answered.
     *           
     * 
     */
    @XmlEnumValue("transfer")
    TRANSFER("transfer"),

    /**
     * 
     *             The call session was redirected because Call
     *             Forward Always to
     *             Voice Mail was activated, or the
     *             Call Forward Busy to Voice Mail was
     *             activated and the subscriber
     *             was busy,
     *             or the Call Forwarding No Answer to
     *             Voice Mail was activated and there was
     *             no answer.
     *            
     * 
     */
    @XmlEnumValue("voicemail")
    VOICEMAIL("voicemail"),

    /**
     * 
     *             The call session was redirected by a
     *             Hunt-group to an agent.
     *           
     * 
     */
    @XmlEnumValue("hunt-group")
    HUNT_GROUP("hunt-group"),

    /**
     * 
     *             The call session was redirected by a
     *             Call-Center to an agent.
     *           
     * 
     */
    @XmlEnumValue("call-center")
    CALL_CENTER("call-center"),

    /**
     * 
     *             The call session was redirected by a
     *             Route-Point to an agent.
     *           
     * 
     */
    @XmlEnumValue("route-point")
    ROUTE_POINT("route-point"),

    /**
     * 
     *             The call session was redirected for unknown
     *             reason.
     *           
     * 
     */
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    RedirectReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RedirectReason fromValue(String v) {
        for (RedirectReason c: RedirectReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
