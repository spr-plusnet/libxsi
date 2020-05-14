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
 * <p>Java-Klasse für CallState.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CallState">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="Alerting"/>
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Held"/>
 *     &lt;enumeration value="Remote Held"/>
 *     &lt;enumeration value="Detached"/>
 *     &lt;enumeration value="Released"/>
 *     &lt;enumeration value="Idle"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
