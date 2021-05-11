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
 * <p>Java-Klasse für CommPilotExpressProfile.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="CommPilotExpressProfile"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="Available In Office"/&gt;
 *     &lt;enumeration value="Available Out Of Office"/&gt;
 *     &lt;enumeration value="Busy"/&gt;
 *     &lt;enumeration value="Unavailable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CommPilotExpressProfile")
@XmlEnum
public enum CommPilotExpressProfile {

    @XmlEnumValue("Available In Office")
    AVAILABLE_IN_OFFICE("Available In Office"),
    @XmlEnumValue("Available Out Of Office")
    AVAILABLE_OUT_OF_OFFICE("Available Out Of Office"),
    @XmlEnumValue("Busy")
    BUSY("Busy"),
    @XmlEnumValue("Unavailable")
    UNAVAILABLE("Unavailable");
    private final String value;

    CommPilotExpressProfile(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommPilotExpressProfile fromValue(String v) {
        for (CommPilotExpressProfile c: CommPilotExpressProfile.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
