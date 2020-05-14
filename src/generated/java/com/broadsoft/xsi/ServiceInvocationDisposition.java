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
 * <p>Java-Klasse für ServiceInvocationDisposition.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceInvocationDisposition">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Automatic Hold/Retrieve"/>
 *     &lt;enumeration value="Call Forward Always"/>
 *     &lt;enumeration value="Call Forward Always Secondary"/>
 *     &lt;enumeration value="Call Forward Busy"/>
 *     &lt;enumeration value="Call Forward No Answer"/>
 *     &lt;enumeration value="Call Forward Not Reachable"/>
 *     &lt;enumeration value="Call Forward Selective"/>
 *     &lt;enumeration value="Call Park"/>
 *     &lt;enumeration value="Call Pickup"/>
 *     &lt;enumeration value="Deflection"/>
 *     &lt;enumeration value="Directed Call Pickup"/>
 *     &lt;enumeration value="Distribution from Call Center"/>
 *     &lt;enumeration value="Distribution from Hunt Group"/>
 *     &lt;enumeration value="Distribution from Route Point"/>
 *     &lt;enumeration value="Do Not Disturb"/>
 *     &lt;enumeration value="Fax Deposit"/>
 *     &lt;enumeration value="Find-me/Follow-me"/>
 *     &lt;enumeration value="Group Night Forwarding"/>
 *     &lt;enumeration value="Personal Assistant"/>
 *     &lt;enumeration value="Sequential Ring"/>
 *     &lt;enumeration value="Series Completion"/>
 *     &lt;enumeration value="Simultaneous Ring"/>
 *     &lt;enumeration value="Third Party Deflection"/>
 *     &lt;enumeration value="Third Party Voice Mail Support"/>
 *     &lt;enumeration value="Transfer Consult"/>
 *     &lt;enumeration value="Trunk Group Forward Capacity Exceeded"/>
 *     &lt;enumeration value="Trunk Group Forward Unreachable"/>
 *     &lt;enumeration value="Trunk Group Forward Unconditional"/>
 *     &lt;enumeration value="Voice Messaging"/>
 *     &lt;enumeration value="Voice Mail Transfer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServiceInvocationDisposition")
@XmlEnum
public enum ServiceInvocationDisposition {

    @XmlEnumValue("Automatic Hold/Retrieve")
    AUTOMATIC_HOLD_RETRIEVE("Automatic Hold/Retrieve"),
    @XmlEnumValue("Call Forward Always")
    CALL_FORWARD_ALWAYS("Call Forward Always"),
    @XmlEnumValue("Call Forward Always Secondary")
    CALL_FORWARD_ALWAYS_SECONDARY("Call Forward Always Secondary"),
    @XmlEnumValue("Call Forward Busy")
    CALL_FORWARD_BUSY("Call Forward Busy"),
    @XmlEnumValue("Call Forward No Answer")
    CALL_FORWARD_NO_ANSWER("Call Forward No Answer"),
    @XmlEnumValue("Call Forward Not Reachable")
    CALL_FORWARD_NOT_REACHABLE("Call Forward Not Reachable"),
    @XmlEnumValue("Call Forward Selective")
    CALL_FORWARD_SELECTIVE("Call Forward Selective"),
    @XmlEnumValue("Call Park")
    CALL_PARK("Call Park"),
    @XmlEnumValue("Call Pickup")
    CALL_PICKUP("Call Pickup"),
    @XmlEnumValue("Deflection")
    DEFLECTION("Deflection"),
    @XmlEnumValue("Directed Call Pickup")
    DIRECTED_CALL_PICKUP("Directed Call Pickup"),
    @XmlEnumValue("Distribution from Call Center")
    DISTRIBUTION_FROM_CALL_CENTER("Distribution from Call Center"),
    @XmlEnumValue("Distribution from Hunt Group")
    DISTRIBUTION_FROM_HUNT_GROUP("Distribution from Hunt Group"),
    @XmlEnumValue("Distribution from Route Point")
    DISTRIBUTION_FROM_ROUTE_POINT("Distribution from Route Point"),
    @XmlEnumValue("Do Not Disturb")
    DO_NOT_DISTURB("Do Not Disturb"),
    @XmlEnumValue("Fax Deposit")
    FAX_DEPOSIT("Fax Deposit"),
    @XmlEnumValue("Find-me/Follow-me")
    FIND_ME_FOLLOW_ME("Find-me/Follow-me"),
    @XmlEnumValue("Group Night Forwarding")
    GROUP_NIGHT_FORWARDING("Group Night Forwarding"),
    @XmlEnumValue("Personal Assistant")
    PERSONAL_ASSISTANT("Personal Assistant"),
    @XmlEnumValue("Sequential Ring")
    SEQUENTIAL_RING("Sequential Ring"),
    @XmlEnumValue("Series Completion")
    SERIES_COMPLETION("Series Completion"),
    @XmlEnumValue("Simultaneous Ring")
    SIMULTANEOUS_RING("Simultaneous Ring"),
    @XmlEnumValue("Third Party Deflection")
    THIRD_PARTY_DEFLECTION("Third Party Deflection"),
    @XmlEnumValue("Third Party Voice Mail Support")
    THIRD_PARTY_VOICE_MAIL_SUPPORT("Third Party Voice Mail Support"),
    @XmlEnumValue("Transfer Consult")
    TRANSFER_CONSULT("Transfer Consult"),
    @XmlEnumValue("Trunk Group Forward Capacity Exceeded")
    TRUNK_GROUP_FORWARD_CAPACITY_EXCEEDED("Trunk Group Forward Capacity Exceeded"),
    @XmlEnumValue("Trunk Group Forward Unreachable")
    TRUNK_GROUP_FORWARD_UNREACHABLE("Trunk Group Forward Unreachable"),
    @XmlEnumValue("Trunk Group Forward Unconditional")
    TRUNK_GROUP_FORWARD_UNCONDITIONAL("Trunk Group Forward Unconditional"),
    @XmlEnumValue("Voice Messaging")
    VOICE_MESSAGING("Voice Messaging"),
    @XmlEnumValue("Voice Mail Transfer")
    VOICE_MAIL_TRANSFER("Voice Mail Transfer");
    private final String value;

    ServiceInvocationDisposition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceInvocationDisposition fromValue(String v) {
        for (ServiceInvocationDisposition c: ServiceInvocationDisposition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
