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
 * <p>Java-Klasse für RecordingState.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="RecordingState"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="Pending"/&gt;
 *     &lt;enumeration value="Started"/&gt;
 *     &lt;enumeration value="Paused"/&gt;
 *     &lt;enumeration value="Failed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RecordingState")
@XmlEnum
public enum RecordingState {


    /**
     * 
     *             Call recording has been requested but has not yet been started.  
     *             This can happen when the recording request is received while a call is held.
     *           
     * 
     */
    @XmlEnumValue("Pending")
    PENDING("Pending"),

    /**
     * 
     *             The call is being recorded.
     *           
     * 
     */
    @XmlEnumValue("Started")
    STARTED("Started"),

    /**
     * 
     *             Call recording was started, and is now paused.
     *           
     * 
     */
    @XmlEnumValue("Paused")
    PAUSED("Paused"),

    /**
     * 
     *             Call recording was started, but has failed.  In this state, a new call recording cannot be started.
     *           
     * 
     */
    @XmlEnumValue("Failed")
    FAILED("Failed");
    private final String value;

    RecordingState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecordingState fromValue(String v) {
        for (RecordingState c: RecordingState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
