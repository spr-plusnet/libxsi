//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für EndpointType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EndpointType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Primary"/>
 *     &lt;enumeration value="Shared Call Appearance"/>
 *     &lt;enumeration value="Video Add On"/>
 *     &lt;enumeration value="Public Service Identity"/>
 *     &lt;enumeration value="Music On Hold Internal"/>
 *     &lt;enumeration value="Flexible Seating Guest"/>
 *     &lt;enumeration value="Mobility"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
