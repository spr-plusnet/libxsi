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
 * <p>Java-Klasse für RedirectReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="RedirectReason"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="user-busy"/&gt;
 *     &lt;enumeration value="no-answer"/&gt;
 *     &lt;enumeration value="unavailable"/&gt;
 *     &lt;enumeration value="unconditional"/&gt;
 *     &lt;enumeration value="time-of-day"/&gt;
 *     &lt;enumeration value="do-not-disturb"/&gt;
 *     &lt;enumeration value="deflection"/&gt;
 *     &lt;enumeration value="follow-me"/&gt;
 *     &lt;enumeration value="out-of-service"/&gt;
 *     &lt;enumeration value="away"/&gt;
 *     &lt;enumeration value="transfer"/&gt;
 *     &lt;enumeration value="voicemail"/&gt;
 *     &lt;enumeration value="hunt-group"/&gt;
 *     &lt;enumeration value="call-center"/&gt;
 *     &lt;enumeration value="route-point"/&gt;
 *     &lt;enumeration value="agent-wrap-up"/&gt;
 *     &lt;enumeration value="voicexml-script-termination"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
     *             The call session was redirected by an
     *             agent to a wrap-up destination.
     *           
     * 
     */
    @XmlEnumValue("agent-wrap-up")
    AGENT_WRAP_UP("agent-wrap-up"),

    /**
     * 
     *             The call session was redirected upon
     *             termination of VoiceXML script.
     *           
     * 
     */
    @XmlEnumValue("voicexml-script-termination")
    VOICEXML_SCRIPT_TERMINATION("voicexml-script-termination"),

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
