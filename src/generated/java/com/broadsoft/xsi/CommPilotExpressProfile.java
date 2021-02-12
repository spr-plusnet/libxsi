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
 * <p>Java-Klasse für CommPilotExpressProfile.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CommPilotExpressProfile">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="Available In Office"/>
 *     &lt;enumeration value="Available Out Of Office"/>
 *     &lt;enumeration value="Busy"/>
 *     &lt;enumeration value="Unavailable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
