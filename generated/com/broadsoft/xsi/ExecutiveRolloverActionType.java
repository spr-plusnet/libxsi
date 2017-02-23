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
 * <p>Java-Klasse für ExecutiveRolloverActionType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ExecutiveRolloverActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Voice Messaging"/>
 *     &lt;enumeration value="Forward"/>
 *     &lt;enumeration value="No Answer Processing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExecutiveRolloverActionType")
@XmlEnum
public enum ExecutiveRolloverActionType {

    @XmlEnumValue("Voice Messaging")
    VOICE_MESSAGING("Voice Messaging"),
    @XmlEnumValue("Forward")
    FORWARD("Forward"),
    @XmlEnumValue("No Answer Processing")
    NO_ANSWER_PROCESSING("No Answer Processing");
    private final String value;

    ExecutiveRolloverActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExecutiveRolloverActionType fromValue(String v) {
        for (ExecutiveRolloverActionType c: ExecutiveRolloverActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
