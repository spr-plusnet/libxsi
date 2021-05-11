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
 * <p>Java-Klasse für CommPilotExpressRedirectionAction.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="CommPilotExpressRedirectionAction"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="Transfer To Voice Mail"/&gt;
 *     &lt;enumeration value="Forward"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CommPilotExpressRedirectionAction")
@XmlEnum
public enum CommPilotExpressRedirectionAction {

    @XmlEnumValue("Transfer To Voice Mail")
    TRANSFER_TO_VOICE_MAIL("Transfer To Voice Mail"),
    @XmlEnumValue("Forward")
    FORWARD("Forward");
    private final String value;

    CommPilotExpressRedirectionAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommPilotExpressRedirectionAction fromValue(String v) {
        for (CommPilotExpressRedirectionAction c: CommPilotExpressRedirectionAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
