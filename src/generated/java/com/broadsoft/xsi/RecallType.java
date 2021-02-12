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
 * <p>Java-Klasse für RecallType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RecallType">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="Busy Camp On Callback"/>
 *     &lt;enumeration value="Call Transfer Recall"/>
 *     &lt;enumeration value="Call Park Recall"/>
 *     &lt;enumeration value="Automatic Hold/Retrieve Recall"/>
 *     &lt;enumeration value="Executive-Assistant Call Push Recall"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RecallType")
@XmlEnum
public enum RecallType {


    /**
     * 
     *             The callback was performed because the
     *             camp-on call remained
     *             unanswered beyond the configurable
     *             period.
     * 	  
     * 
     */
    @XmlEnumValue("Busy Camp On Callback")
    BUSY_CAMP_ON_CALLBACK("Busy Camp On Callback"),

    /**
     * 
     *             The callback was performed because the
     *             transferred call failed
     *             to reach the destination.
     *           
     * 
     */
    @XmlEnumValue("Call Transfer Recall")
    CALL_TRANSFER_RECALL("Call Transfer Recall"),

    /**
     * 
     *             The callback was performed because the
     *             parked call was not
     *             retrieved within the configurable
     *             period.
     *           
     * 
     */
    @XmlEnumValue("Call Park Recall")
    CALL_PARK_RECALL("Call Park Recall"),

    /**
     * 
     *             The callback was performed because the held
     *             call was not
     *             retrieved within the configurable
     *             period.
     *           
     * 
     */
    @XmlEnumValue("Automatic Hold/Retrieve Recall")
    AUTOMATIC_HOLD_RETRIEVE_RECALL("Automatic Hold/Retrieve Recall"),

    /**
     * 
     *             The callback was performed because the call initiated by 
     *             the executive assistant was not answered by the executive.
     *           
     * 
     */
    @XmlEnumValue("Executive-Assistant Call Push Recall")
    EXECUTIVE_ASSISTANT_CALL_PUSH_RECALL("Executive-Assistant Call Push Recall");
    private final String value;

    RecallType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecallType fromValue(String v) {
        for (RecallType c: RecallType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
