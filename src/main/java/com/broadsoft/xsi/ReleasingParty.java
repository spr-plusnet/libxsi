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
 * <p>Java-Klasse für ReleasingParty.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="ReleasingParty"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="localRelease"/&gt;
 *     &lt;enumeration value="remoteRelease"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReleasingParty")
@XmlEnum
public enum ReleasingParty {


    /**
     * 
     *             Specify that the release was performed by
     *             the subscriber
     *             associated with the call.
     *           
     * 
     */
    @XmlEnumValue("localRelease")
    LOCAL_RELEASE("localRelease"),

    /**
     * 
     *             Specify that the release was performed by
     *             the remote party.
     *           
     * 
     */
    @XmlEnumValue("remoteRelease")
    REMOTE_RELEASE("remoteRelease");
    private final String value;

    ReleasingParty(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReleasingParty fromValue(String v) {
        for (ReleasingParty c: ReleasingParty.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
