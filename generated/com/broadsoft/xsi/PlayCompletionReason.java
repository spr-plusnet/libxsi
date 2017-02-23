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
 * <p>Java-Klasse für PlayCompletionReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PlayCompletionReason">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="Match"/>
 *     &lt;enumeration value="NoMatch"/>
 *     &lt;enumeration value="Timeout"/>
 *     &lt;enumeration value="EOF"/>
 *     &lt;enumeration value="Stopped-OutOfQueue"/>
 *     &lt;enumeration value="Stopped-NewPlayCollect"/>
 *     &lt;enumeration value="Stopped-OfferedWithRingback"/>
 *     &lt;enumeration value="Error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PlayCompletionReason")
@XmlEnum
public enum PlayCompletionReason {


    /**
     * 
     *             Indicates that the DTMF grammar was matched.
     *                     
     * 
     */
    @XmlEnumValue("Match")
    MATCH("Match"),

    /**
     * 
     *             Indicates that the DTMF grammar was not matched. The NoMatch value is
     *             required when the digits entered by the end-user doesn't
     *             match the digit map provided.
     *                     
     * 
     */
    @XmlEnumValue("NoMatch")
    NO_MATCH("NoMatch"),

    /**
     * 
     *             Indicates that no DTMF input was received before one of the collection
     *             timers expired.
     *                                 
     * 
     */
    @XmlEnumValue("Timeout")
    TIMEOUT("Timeout"),

    /**
     * 
     *             Indicates that the play operation has completed as expected. This reason is
     *             only used when no digits are collected.
     *                     
     * 
     */
    EOF("EOF"),

    /**
     * 
     *             Indicates that the play-collect operation was implicitly stopped because
     *             the call was removed from the Route Point queue.
     *           
     * 
     */
    @XmlEnumValue("Stopped-OutOfQueue")
    STOPPED_OUT_OF_QUEUE("Stopped-OutOfQueue"),

    /**
     * 
     *             Indicates that the play-collect operation was stopped because a new
     *             play-collect was requested for the call.
     *                     
     * 
     */
    @XmlEnumValue("Stopped-NewPlayCollect")
    STOPPED_NEW_PLAY_COLLECT("Stopped-NewPlayCollect"),

    /**
     * 
     *             Indicated that the play-collect operation was implicitly stopped because
     *             the call was offered to an agent and the system is now
     *             providing ringback as per the Route Point configuration.
     *           
     * 
     */
    @XmlEnumValue("Stopped-OfferedWithRingback")
    STOPPED_OFFERED_WITH_RINGBACK("Stopped-OfferedWithRingback"),

    /**
     * 
     *             Indicates that the play or DTMF collection operation was not completed
     *             because off an error. The error reason is provided in the
     *             errorDetail parameter of the PlayCollectResult.
     *           
     * 
     */
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    PlayCompletionReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlayCompletionReason fromValue(String v) {
        for (PlayCompletionReason c: PlayCompletionReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
