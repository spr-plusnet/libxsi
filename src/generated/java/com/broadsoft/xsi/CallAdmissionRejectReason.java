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
 * <p>Java-Klasse für CallAdmissionRejectReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CallAdmissionRejectReason">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="CallRejectRequested"/>
 *     &lt;enumeration value="CallAdmissionTimeout"/>
 *     &lt;enumeration value="CallAbandoned"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
