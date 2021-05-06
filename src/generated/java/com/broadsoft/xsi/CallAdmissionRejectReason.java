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
 * <p>Java-Klasse für CallAdmissionRejectReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="CallAdmissionRejectReason"&gt;
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken"&gt;
 *     &lt;enumeration value="CallRejectRequested"/&gt;
 *     &lt;enumeration value="CallAdmissionTimeout"/&gt;
 *     &lt;enumeration value="CallAbandoned"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CallAdmissionRejectReason")
@XmlEnum
public enum CallAdmissionRejectReason {


    /**
     * 
     *             The call is rejected as requested by the remote application.
     *           
     * 
     */
    @XmlEnumValue("CallRejectRequested")
    CALL_REJECT_REQUESTED("CallRejectRequested"),

    /**
     * 
     *            The call is rejected because the call admission timer expired prior to 
     *            the remote application admitting or rejecting the call.
     *           
     * 
     */
    @XmlEnumValue("CallAdmissionTimeout")
    CALL_ADMISSION_TIMEOUT("CallAdmissionTimeout"),

    /**
     * 
     *             The call is rejected because originating party abandoned the call.
     *           
     * 
     */
    @XmlEnumValue("CallAbandoned")
    CALL_ABANDONED("CallAbandoned");
    private final String value;

    CallAdmissionRejectReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallAdmissionRejectReason fromValue(String v) {
        for (CallAdmissionRejectReason c: CallAdmissionRejectReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
