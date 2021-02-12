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
 * <p>Java-Klasse für ChannelTerminatedReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ChannelTerminatedReason">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="DuplicateChannelSet"/>
 *     &lt;enumeration value="UserDeleted"/>
 *     &lt;enumeration value="NonResponsiveChannel"/>
 *     &lt;enumeration value="ExplicitDelete"/>
 *     &lt;enumeration value="Expired"/>
 *     &lt;enumeration value="UnknownChannel"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
