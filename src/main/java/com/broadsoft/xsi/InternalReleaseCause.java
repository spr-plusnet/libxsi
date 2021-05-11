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
 * <p>Java-Klasse für InternalReleaseCause.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="InternalReleaseCause"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="Busy"/&gt;
 *     &lt;enumeration value="Forbidden"/&gt;
 *     &lt;enumeration value="Routing Failure"/&gt;
 *     &lt;enumeration value="Global Failure"/&gt;
 *     &lt;enumeration value="Request Failure"/&gt;
 *     &lt;enumeration value="Server Failure"/&gt;
 *     &lt;enumeration value="Translation Failure"/&gt;
 *     &lt;enumeration value="Temporarily Unavailable"/&gt;
 *     &lt;enumeration value="User Not Found"/&gt;
 *     &lt;enumeration value="Request Timeout"/&gt;
 *     &lt;enumeration value="Dial Tone Timeout"/&gt;
 *     &lt;enumeration value="Insufficient Credits"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InternalReleaseCause")
@XmlEnum
public enum InternalReleaseCause {


    /**
     * 
     *             As its name implies, this cause is used when the call cannot
     *             complete because the resources are
     *             currently in use for another call. Note
     *             that this Release Cause is also used
     *             by the Do Not Disturb service. This
     *             cause triggers the Call Forwarding Busy
     *             service and not the Call Forwarding
     *             No Answer service. It also triggers
     *             transfer to Voice Mail, but with specific
     *             Busy conditions.
     *           
     * 
     */
    @XmlEnumValue("Busy")
    BUSY("Busy"),

    /**
     * 
     *             This Release Cause is currently used by Call Blocking services
     *             and Call Processing to indicate
     *             that the call cannot complete because the
     *             current system configuration does
     *             not allow it. This cause is also used for
     *             some specific SIP status codes and
     *             when call loops are detected. Note that
     *             services that react on call releases
     *             do not trigger on FORBIDDEN Release
     *             Causes if they are received from
     *             services (for example, the call is not
     *             transferred to Voice Mail if blocked
     *             by Incoming Calling Plan [ICP]). These
     *             services include Voice Mail (VM),
     *             Call Forwarding No Answer (CFNA), and Call
     *             Forwarding Not Reachable (CFNR).
     *           
     * 
     */
    @XmlEnumValue("Forbidden")
    FORBIDDEN("Forbidden"),

    /**
     * 
     *             When BroadWorks cannot route a call because no route list was
     *             built, it uses this Release Cause.
     *           
     * 
     */
    @XmlEnumValue("Routing Failure")
    ROUTING_FAILURE("Routing Failure"),

    /**
     * 
     *             This Release Cause is used as a default
     *             value for 6xx SIP Response Codes. It is not generated
     *             internally and does not trigger any
     *             special service behavior.
     *           
     * 
     */
    @XmlEnumValue("Global Failure")
    GLOBAL_FAILURE("Global Failure"),

    /**
     * 
     *             This is the default, non-specific Release
     *             Cause for use with
     *             4xx SIP responses. This Release Cause
     *             triggers route advancing in the network
     *             router.
     *           
     * 
     */
    @XmlEnumValue("Request Failure")
    REQUEST_FAILURE("Request Failure"),

    /**
     * 
     *             This is the Release Cause used for all 5xx
     *             SIP responses. It
     *             also triggers route advancing in the
     *             network router.
     * 	  
     * 
     */
    @XmlEnumValue("Server Failure")
    SERVER_FAILURE("Server Failure"),

    /**
     * 
     *             When BroadWorks encounters invalid dialed
     *             digits, it uses the
     *             TRANSLATION_FAILURE Release Cause to
     *             release the call. This Release Cause
     *             does not trigger any
     *             specific service
     *             behavior.
     * 	  
     * 
     */
    @XmlEnumValue("Translation Failure")
    TRANSLATION_FAILURE("Translation Failure"),

    /**
     * 
     *             This Release Cause is used in any situation that is deemed
     *             temporary (that is, the call should
     *             work the next time it is tried, or in the
     *             near future). For example,
     *             communication problems with the Media Server
     *             yields a
     *             TEMPORARILY_UNAVAILABLE release, as this is most likely due to a
     *             transitional fault. Another typical use of this Release Cause is when a call
     *             is placed to an unregistered device.
     *           
     * 
     */
    @XmlEnumValue("Temporarily Unavailable")
    TEMPORARILY_UNAVAILABLE("Temporarily Unavailable"),

    /**
     * 
     *             As the name implies, this Release Cause is
     *             used when a call
     *             terminates to BroadWorks, but the
     *             user cannot be found. This differs from
     *             TRANSLATION_FAILURE in that the
     *             dialed digits are valid, but do not
     *             correspond to a user configured within
     *             BroadWorks.
     *           
     * 
     */
    @XmlEnumValue("User Not Found")
    USER_NOT_FOUND("User Not Found"),

    /**
     * 
     *             Again, as the name indicates, this Release
     *             Cause is used when
     *             the request has not been answered in a
     *             short enough time. The timeout depends
     *             on the request and situation. This
     *             Release Cause triggers route advancing in
     *             the network router.
     *           
     * 
     */
    @XmlEnumValue("Request Timeout")
    REQUEST_TIMEOUT("Request Timeout"),

    /**
     * 
     *             This Release Cause is used when the caller
     *             did not enter any
     *             digits before the timeout. It does
     *             not trigger any special service behavior.
     *           
     * 
     */
    @XmlEnumValue("Dial Tone Timeout")
    DIAL_TONE_TIMEOUT("Dial Tone Timeout"),

    /**
     * 
     *             This Release Cause is used when the Prepaid service releases a
     *             call because the user runs out of
     *             credits. Note that this Release Cause is
     *             used locally for the Prepaid user,
     *             but not for the remote party who is
     *             oblivious to this situation. Note that
     *             services that react on call releases
     *             do not trigger on
     *             NO_MORE_PREPAID_CREDITS Release Causes (for example, the
     *             call is not
     *             transferred to Voice Mail if it is not granted credits). These
     *             services
     *             include Voice Mail (VM), Call Forwarding No Answer (CFNA), and Call
     *             Forwarding Not Reachable (CFNR).
     *           
     * 
     */
    @XmlEnumValue("Insufficient Credits")
    INSUFFICIENT_CREDITS("Insufficient Credits");
    private final String value;

    InternalReleaseCause(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InternalReleaseCause fromValue(String v) {
        for (InternalReleaseCause c: InternalReleaseCause.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
