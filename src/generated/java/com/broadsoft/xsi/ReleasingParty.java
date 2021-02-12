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
 * <p>Java-Klasse für ReleasingParty.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ReleasingParty">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="localRelease"/>
 *     &lt;enumeration value="remoteRelease"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
