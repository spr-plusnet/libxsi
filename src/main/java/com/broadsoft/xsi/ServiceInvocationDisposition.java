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
 * <p>Java-Klasse für ServiceInvocationDisposition.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="ServiceInvocationDisposition"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Automatic Hold/Retrieve"/&gt;
 *     &lt;enumeration value="Call Forward Always"/&gt;
 *     &lt;enumeration value="Call Forward Always Secondary"/&gt;
 *     &lt;enumeration value="Call Forward Busy"/&gt;
 *     &lt;enumeration value="Call Forward No Answer"/&gt;
 *     &lt;enumeration value="Call Forward Not Reachable"/&gt;
 *     &lt;enumeration value="Call Forward Selective"/&gt;
 *     &lt;enumeration value="Call Park"/&gt;
 *     &lt;enumeration value="Call Pickup"/&gt;
 *     &lt;enumeration value="Deflection"/&gt;
 *     &lt;enumeration value="Directed Call Pickup"/&gt;
 *     &lt;enumeration value="Distribution from Call Center"/&gt;
 *     &lt;enumeration value="Distribution from Hunt Group"/&gt;
 *     &lt;enumeration value="Distribution from Route Point"/&gt;
 *     &lt;enumeration value="Do Not Disturb"/&gt;
 *     &lt;enumeration value="Fax Deposit"/&gt;
 *     &lt;enumeration value="Find-me/Follow-me"/&gt;
 *     &lt;enumeration value="Group Night Forwarding"/&gt;
 *     &lt;enumeration value="Personal Assistant"/&gt;
 *     &lt;enumeration value="Sequential Ring"/&gt;
 *     &lt;enumeration value="Series Completion"/&gt;
 *     &lt;enumeration value="Simultaneous Ring"/&gt;
 *     &lt;enumeration value="Third Party Deflection"/&gt;
 *     &lt;enumeration value="Third Party Voice Mail Support"/&gt;
 *     &lt;enumeration value="Transfer Consult"/&gt;
 *     &lt;enumeration value="Trunk Group Forward Capacity Exceeded"/&gt;
 *     &lt;enumeration value="Trunk Group Forward Unreachable"/&gt;
 *     &lt;enumeration value="Trunk Group Forward Unconditional"/&gt;
 *     &lt;enumeration value="Voice Messaging"/&gt;
 *     &lt;enumeration value="Voice Mail Transfer"/&gt;
 *     &lt;enumeration value="VoiceXML Script Termination"/&gt;
 *     &lt;enumeration value="Agent Wrap-Up"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
    VOICE_MAIL_TRANSFER("Voice Mail Transfer"),
    @XmlEnumValue("VoiceXML Script Termination")
    VOICE_XML_SCRIPT_TERMINATION("VoiceXML Script Termination"),
    @XmlEnumValue("Agent Wrap-Up")
    AGENT_WRAP_UP("Agent Wrap-Up");
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
