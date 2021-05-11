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
 * <p>Java-Klasse für EnhancedCallLogsSubscriberType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="EnhancedCallLogsSubscriberType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Auto Attendant"/&gt;
 *     &lt;enumeration value="BroadWorks Anywhere Portal"/&gt;
 *     &lt;enumeration value="Call Center"/&gt;
 *     &lt;enumeration value="Hunt Group"/&gt;
 *     &lt;enumeration value="Route Point"/&gt;
 *     &lt;enumeration value="Find-me/Follow-me"/&gt;
 *     &lt;enumeration value="Flexible Seating Host"/&gt;
 *     &lt;enumeration value="VoiceXML"/&gt;
 *     &lt;enumeration value="User"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnhancedCallLogsSubscriberType")
@XmlEnum
public enum EnhancedCallLogsSubscriberType {

    @XmlEnumValue("Auto Attendant")
    AUTO_ATTENDANT("Auto Attendant"),
    @XmlEnumValue("BroadWorks Anywhere Portal")
    BROAD_WORKS_ANYWHERE_PORTAL("BroadWorks Anywhere Portal"),
    @XmlEnumValue("Call Center")
    CALL_CENTER("Call Center"),
    @XmlEnumValue("Hunt Group")
    HUNT_GROUP("Hunt Group"),
    @XmlEnumValue("Route Point")
    ROUTE_POINT("Route Point"),
    @XmlEnumValue("Find-me/Follow-me")
    FIND_ME_FOLLOW_ME("Find-me/Follow-me"),
    @XmlEnumValue("Flexible Seating Host")
    FLEXIBLE_SEATING_HOST("Flexible Seating Host"),
    @XmlEnumValue("VoiceXML")
    VOICE_XML("VoiceXML"),
    @XmlEnumValue("User")
    USER("User");
    private final String value;

    EnhancedCallLogsSubscriberType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnhancedCallLogsSubscriberType fromValue(String v) {
        for (EnhancedCallLogsSubscriberType c: EnhancedCallLogsSubscriberType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
