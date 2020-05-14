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
 * <p>Java-Klasse für CallType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CallType">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="Group"/>
 *     &lt;enumeration value="Enterprise"/>
 *     &lt;enumeration value="Network"/>
 *     &lt;enumeration value="Emergency"/>
 *     &lt;enumeration value="Repair"/>
 *     &lt;enumeration value="City-Wide Centrex"/>
 *     &lt;enumeration value="Private Dial Plan"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CallType")
@XmlEnum
public enum CallType {


    /**
     * 
     *             The call session is between parties
     *             belonging to the same
     *             BroadWorks group. Call Session
     *             topology:Intra group/enterprise.
     *           
     * 
     */
    @XmlEnumValue("Group")
    GROUP("Group"),

    /**
     * 
     *             The call session is between parties
     *             belonging to the same
     *             BroadWorks Enterprise. Call Session
     *             topology:Intra group/enterprise.
     *           
     * 
     */
    @XmlEnumValue("Enterprise")
    ENTERPRISE("Enterprise"),

    /**
     * 
     *             One of the party connected to the call
     *             session is not a
     *             BroadWorks subscriber. Call Session
     *             topology:Extra-BroadWorks and
     *             Intra-BroadWorks topologies.
     *           
     * 
     */
    @XmlEnumValue("Network")
    NETWORK("Network"),

    /**
     * 
     *             The call session is connected to an
     *             emergency party (e.g.
     *             911). Call Session
     *             topology:Extra-BroadWorks topology.
     *          
     * 
     */
    @XmlEnumValue("Emergency")
    EMERGENCY("Emergency"),

    /**
     * 
     *             The call session is connected to a repair
     *             party. Call Session
     *             topology:Extra-BroadWorks topology.
     *           
     * 
     */
    @XmlEnumValue("Repair")
    REPAIR("Repair"),

    /**
     * 
     *             The call session was established by using
     *             the Private Dial
     *             Plan configured in BroadWorks for a
     *             City Wide
     *             Centrex subscriber. Call
     *             Session topology:Extra-BroadWorks
     *             topology.
     * 	  
     * 
     */
    @XmlEnumValue("City-Wide Centrex")
    CITY_WIDE_CENTREX("City-Wide Centrex"),

    /**
     * 
     *             The call session was established by using
     *             the Private Dial
     *             Plan configured in BroadWorks. Call
     *             Session
     *             topology:Extra-BroadWorks
     *             topology.
     *           
     * 
     */
    @XmlEnumValue("Private Dial Plan")
    PRIVATE_DIAL_PLAN("Private Dial Plan"),

    /**
     * 
     *             The call type is unknown. Call Session
     *             topology:Extra-BroadWorks and Single call topologies.
     *           
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * 
     *             There was an error in determining the call
     *             type. Call Session
     *             topology:Extra-BroadWorks topology.
     *           
     * 
     */
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    CallType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CallType fromValue(String v) {
        for (CallType c: CallType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
