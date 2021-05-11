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
 * <p>Java-Klasse für AgentACDAutomaticState.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="AgentACDAutomaticState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Available"/&gt;
 *     &lt;enumeration value="Unavailable"/&gt;
 *     &lt;enumeration value="Wrap-Up"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AgentACDAutomaticState")
@XmlEnum
public enum AgentACDAutomaticState {

    @XmlEnumValue("Available")
    AVAILABLE("Available"),
    @XmlEnumValue("Unavailable")
    UNAVAILABLE("Unavailable"),
    @XmlEnumValue("Wrap-Up")
    WRAP_UP("Wrap-Up");
    private final String value;

    AgentACDAutomaticState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AgentACDAutomaticState fromValue(String v) {
        for (AgentACDAutomaticState c: AgentACDAutomaticState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
