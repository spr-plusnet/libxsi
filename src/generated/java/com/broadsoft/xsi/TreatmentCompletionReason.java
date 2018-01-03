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
 * <p>Java-Klasse für TreatmentCompletionReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TreatmentCompletionReason">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="EOF"/>
 *     &lt;enumeration value="remoteRelease"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
