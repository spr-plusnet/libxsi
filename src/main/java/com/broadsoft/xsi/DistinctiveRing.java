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
 * <p>Java-Klasse für DistinctiveRing.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="DistinctiveRing"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="Bellcore-dr2"/&gt;
 *     &lt;enumeration value="Bellcore-dr3"/&gt;
 *     &lt;enumeration value="Bellcore-dr4"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DistinctiveRing")
@XmlEnum
public enum DistinctiveRing {


    /**
     * 
     *             Distinctive ringing pattern 2 as defined in
     *             GR-506-CORE. This
     *             is used by the Priority Alert service, and
     *             for the Long-Long ring pattern of
     *             the Alternate Numbers
     *             service.
     *           
     * 
     */
    @XmlEnumValue("Bellcore-dr2")
    BELLCORE_DR_2("Bellcore-dr2"),

    /**
     * 
     *             Distinctive ringing pattern 3 as defined in
     *             GR-506-CORE. This
     *             is used for the Short-Short-Long ring
     *             pattern of the Alternate Numbers
     *             service.
     *           
     * 
     */
    @XmlEnumValue("Bellcore-dr3")
    BELLCORE_DR_3("Bellcore-dr3"),

    /**
     * 
     *             Distinctive ringing pattern 4 as defined in
     *             GR-506-CORE. This
     *             is used for the Short-Long-Short ring
     *             pattern of the Alternate Numbers
     *             service.
     *           
     * 
     */
    @XmlEnumValue("Bellcore-dr4")
    BELLCORE_DR_4("Bellcore-dr4");
    private final String value;

    DistinctiveRing(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DistinctiveRing fromValue(String v) {
        for (DistinctiveRing c: DistinctiveRing.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
