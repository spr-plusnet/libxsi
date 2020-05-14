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
 * <p>Java-Klasse für EventPackage.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EventPackage">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="Advanced Call"/>
 *     &lt;enumeration value="Basic Call"/>
 *     &lt;enumeration value="BroadWorks Anywhere"/>
 *     &lt;enumeration value="Call Center Agent"/>
 *     &lt;enumeration value="Call Center Agent Monitoring"/>
 *     &lt;enumeration value="Call Center Configuration"/>
 *     &lt;enumeration value="Call Center Monitoring"/>
 *     &lt;enumeration value="Call Center Queue"/>
 *     &lt;enumeration value="Call Forwarding Always"/>
 *     &lt;enumeration value="Call Forwarding Always Secondary"/>
 *     &lt;enumeration value="Call Forwarding Busy"/>
 *     &lt;enumeration value="Call Forwarding No Answer"/>
 *     &lt;enumeration value="Call Park"/>
 *     &lt;enumeration value="Call Recording"/>
 *     &lt;enumeration value="Call Transfer"/>
 *     &lt;enumeration value="Call Waiting"/>
 *     &lt;enumeration value="Collaborate Room"/>
 *     &lt;enumeration value="CommPilot Express"/>
 *     &lt;enumeration value="Do Not Disturb"/>
 *     &lt;enumeration value="Flexible Seating Guest"/>
 *     &lt;enumeration value="Hoteling Guest"/>
 *     &lt;enumeration value="Last Number Redial"/>
 *     &lt;enumeration value="Meet Me Conference"/>
 *     &lt;enumeration value="Music On Hold"/>
 *     &lt;enumeration value="N-Way Call"/>
 *     &lt;enumeration value="Personal Assistant"/>
 *     &lt;enumeration value="Push Notification Registration"/>
 *     &lt;enumeration value="Remote Office"/>
 *     &lt;enumeration value="Route Point Queue"/>
 *     &lt;enumeration value="Security Classification"/>
 *     &lt;enumeration value="Sequential Ring"/>
 *     &lt;enumeration value="Silent Alerting"/>
 *     &lt;enumeration value="Simultaneous Ring Personal"/>
 *     &lt;enumeration value="Standard Call"/>
 *     &lt;enumeration value="Third-Party Voice Mail Support"/>
 *     &lt;enumeration value="Three-Way Call"/>
 *     &lt;enumeration value="Voice Mail Message Summary"/>
 *     &lt;enumeration value="Voice Messaging"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EventPackage")
@XmlEnum
public enum EventPackage {

    @XmlEnumValue("Advanced Call")
    ADVANCED_CALL("Advanced Call"),
    @XmlEnumValue("Basic Call")
    BASIC_CALL("Basic Call"),
    @XmlEnumValue("BroadWorks Anywhere")
    BROAD_WORKS_ANYWHERE("BroadWorks Anywhere"),
    @XmlEnumValue("Call Center Agent")
    CALL_CENTER_AGENT("Call Center Agent"),
    @XmlEnumValue("Call Center Agent Monitoring")
    CALL_CENTER_AGENT_MONITORING("Call Center Agent Monitoring"),
    @XmlEnumValue("Call Center Configuration")
    CALL_CENTER_CONFIGURATION("Call Center Configuration"),
    @XmlEnumValue("Call Center Monitoring")
    CALL_CENTER_MONITORING("Call Center Monitoring"),
    @XmlEnumValue("Call Center Queue")
    CALL_CENTER_QUEUE("Call Center Queue"),
    @XmlEnumValue("Call Forwarding Always")
    CALL_FORWARDING_ALWAYS("Call Forwarding Always"),
    @XmlEnumValue("Call Forwarding Always Secondary")
    CALL_FORWARDING_ALWAYS_SECONDARY("Call Forwarding Always Secondary"),
    @XmlEnumValue("Call Forwarding Busy")
    CALL_FORWARDING_BUSY("Call Forwarding Busy"),
    @XmlEnumValue("Call Forwarding No Answer")
    CALL_FORWARDING_NO_ANSWER("Call Forwarding No Answer"),
    @XmlEnumValue("Call Park")
    CALL_PARK("Call Park"),
    @XmlEnumValue("Call Recording")
    CALL_RECORDING("Call Recording"),
    @XmlEnumValue("Call Transfer")
    CALL_TRANSFER("Call Transfer"),
    @XmlEnumValue("Call Waiting")
    CALL_WAITING("Call Waiting"),
    @XmlEnumValue("Collaborate Room")
    COLLABORATE_ROOM("Collaborate Room"),
    @XmlEnumValue("CommPilot Express")
    COMM_PILOT_EXPRESS("CommPilot Express"),
    @XmlEnumValue("Do Not Disturb")
    DO_NOT_DISTURB("Do Not Disturb"),
    @XmlEnumValue("Flexible Seating Guest")
    FLEXIBLE_SEATING_GUEST("Flexible Seating Guest"),
    @XmlEnumValue("Hoteling Guest")
    HOTELING_GUEST("Hoteling Guest"),
    @XmlEnumValue("Last Number Redial")
    LAST_NUMBER_REDIAL("Last Number Redial"),
    @XmlEnumValue("Meet Me Conference")
    MEET_ME_CONFERENCE("Meet Me Conference"),
    @XmlEnumValue("Music On Hold")
    MUSIC_ON_HOLD("Music On Hold"),
    @XmlEnumValue("N-Way Call")
    N_WAY_CALL("N-Way Call"),
    @XmlEnumValue("Personal Assistant")
    PERSONAL_ASSISTANT("Personal Assistant"),
    @XmlEnumValue("Push Notification Registration")
    PUSH_NOTIFICATION_REGISTRATION("Push Notification Registration"),
    @XmlEnumValue("Remote Office")
    REMOTE_OFFICE("Remote Office"),
    @XmlEnumValue("Route Point Queue")
    ROUTE_POINT_QUEUE("Route Point Queue"),
    @XmlEnumValue("Security Classification")
    SECURITY_CLASSIFICATION("Security Classification"),
    @XmlEnumValue("Sequential Ring")
    SEQUENTIAL_RING("Sequential Ring"),
    @XmlEnumValue("Silent Alerting")
    SILENT_ALERTING("Silent Alerting"),
    @XmlEnumValue("Simultaneous Ring Personal")
    SIMULTANEOUS_RING_PERSONAL("Simultaneous Ring Personal"),
    @XmlEnumValue("Standard Call")
    STANDARD_CALL("Standard Call"),
    @XmlEnumValue("Third-Party Voice Mail Support")
    THIRD_PARTY_VOICE_MAIL_SUPPORT("Third-Party Voice Mail Support"),
    @XmlEnumValue("Three-Way Call")
    THREE_WAY_CALL("Three-Way Call"),
    @XmlEnumValue("Voice Mail Message Summary")
    VOICE_MAIL_MESSAGE_SUMMARY("Voice Mail Message Summary"),
    @XmlEnumValue("Voice Messaging")
    VOICE_MESSAGING("Voice Messaging");
    private final String value;

    EventPackage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EventPackage fromValue(String v) {
        for (EventPackage c: EventPackage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
