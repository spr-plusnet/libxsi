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
 * <p>Java-Klasse für ClickToDialLocationEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ClickToDialLocationEnum">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="Primary"/>
 *     &lt;enumeration value="BroadWorksAnywhere"/>
 *     &lt;enumeration value="SharedCallAppearance"/>
 *     &lt;enumeration value="Mobility"/>
 *     &lt;enumeration value="FlexibleSeatingGuest"/>
 *     &lt;enumeration value="All"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClickToDialLocationEnum")
@XmlEnum
public enum ClickToDialLocationEnum {


    /**
     * 
     *             Rings the target user's primary location only.
     *           
     * 
     */
    @XmlEnumValue("Primary")
    PRIMARY("Primary"),

    /**
     * 
     *             Rings the target user's BroadWorks Anywhere locations or a specified BroadWorks Anywhere location.
     *           
     * 
     */
    @XmlEnumValue("BroadWorksAnywhere")
    BROAD_WORKS_ANYWHERE("BroadWorksAnywhere"),

    /**
     * 
     *             Rings the target user's Shared Call Appearance locations or a specified Shared Call Appearance location.
     *           
     * 
     */
    @XmlEnumValue("SharedCallAppearance")
    SHARED_CALL_APPEARANCE("SharedCallAppearance"),

    /**
     * 
     *             Rings the target user's BroadWorks Mobility location.
     *           
     * 
     */
    @XmlEnumValue("Mobility")
    MOBILITY("Mobility"),

    /**
     * 
     *             Rings the target user's Flexible Seating Guest location.
     *           
     * 
     */
    @XmlEnumValue("FlexibleSeatingGuest")
    FLEXIBLE_SEATING_GUEST("FlexibleSeatingGuest"),

    /**
     * 
     *             Rings all the target user's locations.
     *           
     * 
     */
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    ClickToDialLocationEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClickToDialLocationEnum fromValue(String v) {
        for (ClickToDialLocationEnum c: ClickToDialLocationEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
