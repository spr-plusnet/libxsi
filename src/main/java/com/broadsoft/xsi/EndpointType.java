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
 * <p>Java-Klasse für EndpointType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="EndpointType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Primary"/&gt;
 *     &lt;enumeration value="Shared Call Appearance"/&gt;
 *     &lt;enumeration value="Video Add On"/&gt;
 *     &lt;enumeration value="Public Service Identity"/&gt;
 *     &lt;enumeration value="Music On Hold Internal"/&gt;
 *     &lt;enumeration value="Flexible Seating Guest"/&gt;
 *     &lt;enumeration value="Mobility"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EndpointType")
@XmlEnum
public enum EndpointType {

    @XmlEnumValue("Primary")
    PRIMARY("Primary"),
    @XmlEnumValue("Shared Call Appearance")
    SHARED_CALL_APPEARANCE("Shared Call Appearance"),
    @XmlEnumValue("Video Add On")
    VIDEO_ADD_ON("Video Add On"),
    @XmlEnumValue("Public Service Identity")
    PUBLIC_SERVICE_IDENTITY("Public Service Identity"),
    @XmlEnumValue("Music On Hold Internal")
    MUSIC_ON_HOLD_INTERNAL("Music On Hold Internal"),
    @XmlEnumValue("Flexible Seating Guest")
    FLEXIBLE_SEATING_GUEST("Flexible Seating Guest"),
    @XmlEnumValue("Mobility")
    MOBILITY("Mobility");
    private final String value;

    EndpointType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EndpointType fromValue(String v) {
        for (EndpointType c: EndpointType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
