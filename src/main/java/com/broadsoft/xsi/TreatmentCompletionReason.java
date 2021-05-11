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
 * <p>Java-Klasse für TreatmentCompletionReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="TreatmentCompletionReason"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="EOF"/&gt;
 *     &lt;enumeration value="remoteRelease"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TreatmentCompletionReason")
@XmlEnum
public enum TreatmentCompletionReason {


    /**
     * 
     *             The treatment was completed as expected. 
     *           
     * 
     */
    EOF("EOF"),

    /**
     * 
     *             The treatment was completed because the call was
     *             released by the remote party.            
     *           
     * 
     */
    @XmlEnumValue("remoteRelease")
    REMOTE_RELEASE("remoteRelease");
    private final String value;

    TreatmentCompletionReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TreatmentCompletionReason fromValue(String v) {
        for (TreatmentCompletionReason c: TreatmentCompletionReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
