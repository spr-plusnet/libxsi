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
 * <p>Java-Klasse für RoutePointState.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RoutePointState">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="Failed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoutePointState")
@XmlEnum
public enum RoutePointState {


    /**
     * 
     *             All call received by the Route Point are queued and treated normally.
     *           
     * 
     */
    @XmlEnumValue("Normal")
    NORMAL("Normal"),

    /**
     * 
     *             All call received by the Route Point are sent to the failed
     *             destination.
     *                     
     * 
     */
    @XmlEnumValue("Failed")
    FAILED("Failed");
    private final String value;

    RoutePointState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoutePointState fromValue(String v) {
        for (RoutePointState c: RoutePointState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
