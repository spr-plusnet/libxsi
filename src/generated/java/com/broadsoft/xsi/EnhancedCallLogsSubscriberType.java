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
 * <p>Java-Klasse für EnhancedCallLogsSubscriberType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EnhancedCallLogsSubscriberType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Auto Attendant"/>
 *     &lt;enumeration value="BroadWorks Anywhere Portal"/>
 *     &lt;enumeration value="Call Center"/>
 *     &lt;enumeration value="Hunt Group"/>
 *     &lt;enumeration value="Route Point"/>
 *     &lt;enumeration value="Find-me/Follow-me"/>
 *     &lt;enumeration value="Flexible Seating Host"/>
 *     &lt;enumeration value="VoiceXML"/>
 *     &lt;enumeration value="User"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
