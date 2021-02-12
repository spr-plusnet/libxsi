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
 * <p>Java-Klasse für PauseResumeNotifyMethod.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PauseResumeNotifyMethod">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="announcement"/>
 *     &lt;enumeration value="beeponly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PauseResumeNotifyMethod")
@XmlEnum
public enum PauseResumeNotifyMethod {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("announcement")
    ANNOUNCEMENT("announcement"),
    @XmlEnumValue("beeponly")
    BEEPONLY("beeponly");
    private final String value;

    PauseResumeNotifyMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PauseResumeNotifyMethod fromValue(String v) {
        for (PauseResumeNotifyMethod c: PauseResumeNotifyMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
