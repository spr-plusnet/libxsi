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
 * <p>Java-Klasse für PlayCompletionReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="PlayCompletionReason"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="Match"/&gt;
 *     &lt;enumeration value="NoMatch"/&gt;
 *     &lt;enumeration value="Timeout"/&gt;
 *     &lt;enumeration value="EOF"/&gt;
 *     &lt;enumeration value="Stopped-OutOfQueue"/&gt;
 *     &lt;enumeration value="Stopped-NewPlayCollect"/&gt;
 *     &lt;enumeration value="Stopped-OfferedWithRingback"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
