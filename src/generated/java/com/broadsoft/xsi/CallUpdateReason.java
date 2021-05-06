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
 * <p>Java-Klasse für CallUpdateReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="CallUpdateReason"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="Call Transferred"/&gt;
 *     &lt;enumeration value="Call Picked-Up"/&gt;
 *     &lt;enumeration value="Call Barged-In"/&gt;
 *     &lt;enumeration value="Call Monitored"/&gt;
 *     &lt;enumeration value="Call Forwarded"/&gt;
 *     &lt;enumeration value="Call Park Retrieved"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CallUpdateReason")
@XmlEnum
public enum CallUpdateReason {


    /**
     * 
     *             The call was transferred by the remote 
     *             party.
     *           
     * 
     */
    @XmlEnumValue("Call Transferred")
    CALL_TRANSFERRED("Call Transferred"),

    /**
     * 
     *             The call was picked-up by the remote 
     *             party as a result of a Directed Call 
     *             Pickup request or Directed Call Pickup 
     *             with Barge-in where the call state was 
     *             in Alerting.
     *           
     * 
     */
    @XmlEnumValue("Call Picked-Up")
    CALL_PICKED_UP("Call Picked-Up"),

    /**
     * 
     *             The call was barged-in as a result of a 
     *             Directed Call Pickup with Barge-in request.
     *           
     * 
     */
    @XmlEnumValue("Call Barged-In")
    CALL_BARGED_IN("Call Barged-In"),

    /**
     * 
     *             The call is being monitored as a result 
     *             of a Monitor Call or Monitor Next Call request.
     *           
     * 
     */
    @XmlEnumValue("Call Monitored")
    CALL_MONITORED("Call Monitored"),

    /**
     * 
     *             The call is being forwarded as a result 
     *             of the application of a BroadWorks service 
     *             (e.g. Call Forward Always).
     *           
     * 
     */
    @XmlEnumValue("Call Forwarded")
    CALL_FORWARDED("Call Forwarded"),

    /**
     * 
     *             The call was parked and is being retrieved.
     *           
     * 
     */
    @XmlEnumValue("Call Park Retrieved")
    CALL_PARK_RETRIEVED("Call Park Retrieved"),

    /**
     * 
     *             The remote party information is being
     *             updated, and there is no indication as to 
     *             the specific reason.
     *           
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    CallUpdateReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallUpdateReason fromValue(String v) {
        for (CallUpdateReason c: CallUpdateReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
