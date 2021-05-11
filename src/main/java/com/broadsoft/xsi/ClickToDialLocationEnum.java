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
 * <p>Java-Klasse für ClickToDialLocationEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="ClickToDialLocationEnum"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="Primary"/&gt;
 *     &lt;enumeration value="BroadWorksAnywhere"/&gt;
 *     &lt;enumeration value="SharedCallAppearance"/&gt;
 *     &lt;enumeration value="Mobility"/&gt;
 *     &lt;enumeration value="FlexibleSeatingGuest"/&gt;
 *     &lt;enumeration value="All"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
