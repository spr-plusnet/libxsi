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
 * <p>Java-Klasse für RoutePointStateChangeReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RoutePointStateChangeReason">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="FailureDetected"/>
 *     &lt;enumeration value="ExternalRequest"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoutePointStateChangeReason")
@XmlEnum
public enum RoutePointStateChangeReason {


    /**
     * 
     *             The state change was performed because a failure was detected.
     *           
     * 
     */
    @XmlEnumValue("FailureDetected")
    FAILURE_DETECTED("FailureDetected"),

    /**
     * 
     *             The state change was performed because it was requested through an
     *             explicit request.
     *                     
     * 
     */
    @XmlEnumValue("ExternalRequest")
    EXTERNAL_REQUEST("ExternalRequest");
    private final String value;

    RoutePointStateChangeReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoutePointStateChangeReason fromValue(String v) {
        for (RoutePointStateChangeReason c: RoutePointStateChangeReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
