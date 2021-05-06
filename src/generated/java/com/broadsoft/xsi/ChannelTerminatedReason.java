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
 * <p>Java-Klasse für ChannelTerminatedReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="ChannelTerminatedReason"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="DuplicateChannelSet"/&gt;
 *     &lt;enumeration value="UserDeleted"/&gt;
 *     &lt;enumeration value="NonResponsiveChannel"/&gt;
 *     &lt;enumeration value="ExplicitDelete"/&gt;
 *     &lt;enumeration value="Expired"/&gt;
 *     &lt;enumeration value="UnknownChannel"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChannelTerminatedReason")
@XmlEnum
public enum ChannelTerminatedReason {


    /**
     * 
     *             BroadWorks limits the creation of a single notification 
     *             channel set for a user per remote application.
     *             A remote application receiving DuplicateChannelSet reason 
     *             should terminate the current session and inform the user 
     *             the reason for termination.
     *           
     * 
     */
    @XmlEnumValue("DuplicateChannelSet")
    DUPLICATE_CHANNEL_SET("DuplicateChannelSet"),

    /**
     * 
     *             The user for whom the channel was created was deleted.
     *           
     * 
     */
    @XmlEnumValue("UserDeleted")
    USER_DELETED("UserDeleted"),

    /**
     * 
     *             All channels in a channel set are not responding to 
     *             notification events.
     *           
     * 
     */
    @XmlEnumValue("NonResponsiveChannel")
    NON_RESPONSIVE_CHANNEL("NonResponsiveChannel"),

    /**
     * 
     *             The channel was explicitly deleted either by the remote 
     *             application or by a BroadWorks administrative action.
     *           
     * 
     */
    @XmlEnumValue("ExplicitDelete")
    EXPLICIT_DELETE("ExplicitDelete"),

    /**
     * 
     *             The channel duration expired.
     *           
     * 
     */
    @XmlEnumValue("Expired")
    EXPIRED("Expired"),

    /**
     * 
     *             A notification event included a channel ID that was unknown 
     *             to the remote application.  The remote application replied 
     *             with an Unknown Channel (404) response.
     *           
     * 
     */
    @XmlEnumValue("UnknownChannel")
    UNKNOWN_CHANNEL("UnknownChannel");
    private final String value;

    ChannelTerminatedReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChannelTerminatedReason fromValue(String v) {
        for (ChannelTerminatedReason c: ChannelTerminatedReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
