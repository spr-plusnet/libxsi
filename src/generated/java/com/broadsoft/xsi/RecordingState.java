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
 * <p>Java-Klasse für RecordingState.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RecordingState">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="Started"/>
 *     &lt;enumeration value="Paused"/>
 *     &lt;enumeration value="Failed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
