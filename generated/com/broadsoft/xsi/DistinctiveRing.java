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
 * <p>Java-Klasse für DistinctiveRing.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DistinctiveRing">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="Bellcore-dr2"/>
 *     &lt;enumeration value="Bellcore-dr3"/>
 *     &lt;enumeration value="Bellcore-dr4"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
