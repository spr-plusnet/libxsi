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
 * <p>Java-Klasse für CallCenterScheduledServiceAction.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CallCenterScheduledServiceAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Busy"/>
 *     &lt;enumeration value="Transfer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CallCenterScheduledServiceAction")
@XmlEnum
public enum CallCenterScheduledServiceAction {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Busy")
    BUSY("Busy"),
    @XmlEnumValue("Transfer")
    TRANSFER("Transfer");
    private final String value;

    CallCenterScheduledServiceAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallCenterScheduledServiceAction fromValue(String v) {
        for (CallCenterScheduledServiceAction c: CallCenterScheduledServiceAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
