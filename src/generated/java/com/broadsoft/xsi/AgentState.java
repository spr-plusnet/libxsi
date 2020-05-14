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
 * <p>Java-Klasse für AgentState.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AgentState">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="Sign-In"/>
 *     &lt;enumeration value="Available"/>
 *     &lt;enumeration value="Unavailable"/>
 *     &lt;enumeration value="Wrap-Up"/>
 *     &lt;enumeration value="Sign-Out"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AgentState")
@XmlEnum
public enum AgentState {


    /**
     * 
     *             Agent is signing in. This state is a
     *             temporary state while logging-in.
     *           
     * 
     */
    @XmlEnumValue("Sign-In")
    SIGN_IN("Sign-In"),

    /**
     * 
     *             Agent is available.
     *           
     * 
     */
    @XmlEnumValue("Available")
    AVAILABLE("Available"),

    /**
     * 
     *             Agent is unavailable.
     *           
     * 
     */
    @XmlEnumValue("Unavailable")
    UNAVAILABLE("Unavailable"),

    /**
     * 
     *             Agent is performing post-call work.
     *           
     * 
     */
    @XmlEnumValue("Wrap-Up")
    WRAP_UP("Wrap-Up"),

    /**
     * 
     *             Agent is signed out.
     *           
     * 
     */
    @XmlEnumValue("Sign-Out")
    SIGN_OUT("Sign-Out");
    private final String value;

    AgentState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AgentState fromValue(String v) {
        for (AgentState c: AgentState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
