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
 * <p>Java-Klasse für CallState.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="CallState"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="Alerting"/&gt;
 *     &lt;enumeration value="Active"/&gt;
 *     &lt;enumeration value="Held"/&gt;
 *     &lt;enumeration value="Remote Held"/&gt;
 *     &lt;enumeration value="Detached"/&gt;
 *     &lt;enumeration value="Released"/&gt;
 *     &lt;enumeration value="Idle"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CallState")
@XmlEnum
public enum CallState {


    /**
     * 
     *             This is the state in which an attempt is being made to establish
     *             communication. For example, when a caller manually dials a
     *             valid destination, the call is in the Alerting state while
     *             the communication is being established.
     *           
     * 
     */
    @XmlEnumValue("Alerting")
    ALERTING("Alerting"),

    /**
     * 
     *             The state in which a subscriber is actively participating in a call
     *             session. For example, when the remote subscriber goes
     *             off-hook on an incoming call, its call goes into the Active
     *             state.
     *           
     * 
     */
    @XmlEnumValue("Active")
    ACTIVE("Active"),

    /**
     * 
     *             The state in which the remote party is inactively participating in a
     *             call session. This can happen for instance when the
     *             subscriber has put the call on hold.
     *           
     * 
     */
    @XmlEnumValue("Held")
    HELD("Held"),

    /**
     * 
     *             The state in which a subscriber is inactively participating in a call
     *             session. This can happen for instance when the subscriber
     *             has been put on hold.
     *           
     * 
     */
    @XmlEnumValue("Remote Held")
    REMOTE_HELD("Remote Held"),

    /**
     * 
     *             The state in which the subscriber is no longer involved in the call
     *             session except for historical and tracking (e.g. billing)
     *             purposes. This can happen for instance when an incoming call
     *             has been forwarded to another destination. Once the call has
     *             been forwarded, the forwarding subscriber is in the Detached
     *             state. The subscriber call takes no longer an Active role in
     *             the call session but is kept in the Detached state. Once in
     *             the Detached state, the call can only go into the Released
     *             state. Transition to other states is not possible.
     *           
     * 
     */
    @XmlEnumValue("Detached")
    DETACHED("Detached"),

    /**
     * 
     *             The state in which the subscriber is no longer involved in the call
     *             session. This can happen if for instance the subscriber goes
     *             on-hook
     *           
     * 
     */
    @XmlEnumValue("Released")
    RELEASED("Released"),

    /**
     * 
     *             The state in which there is no relationship between a subscriber and
     *             the call session.
     *           
     * 
     */
    @XmlEnumValue("Idle")
    IDLE("Idle");
    private final String value;

    CallState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallState fromValue(String v) {
        for (CallState c: CallState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
