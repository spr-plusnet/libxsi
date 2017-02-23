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
 * <p>Java-Klasse für CommPilotExpressRedirectionAction.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CommPilotExpressRedirectionAction">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="Transfer To Voice Mail"/>
 *     &lt;enumeration value="Forward"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
