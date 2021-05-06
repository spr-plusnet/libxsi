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
 * <p>Java-Klasse für AgentState.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="AgentState"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="Sign-In"/&gt;
 *     &lt;enumeration value="Available"/&gt;
 *     &lt;enumeration value="Unavailable"/&gt;
 *     &lt;enumeration value="Wrap-Up"/&gt;
 *     &lt;enumeration value="Sign-Out"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
