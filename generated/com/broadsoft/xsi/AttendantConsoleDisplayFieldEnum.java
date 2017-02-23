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
 * <p>Java-Klasse für AttendantConsoleDisplayFieldEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AttendantConsoleDisplayFieldEnum">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="Action"/>
 *     &lt;enumeration value="Department"/>
 *     &lt;enumeration value="Email"/>
 *     &lt;enumeration value="Extension"/>
 *     &lt;enumeration value="Mobile"/>
 *     &lt;enumeration value="Name"/>
 *     &lt;enumeration value="Phone Number"/>
 *     &lt;enumeration value="Pager"/>
 *     &lt;enumeration value="Status"/>
 *     &lt;enumeration value="Title"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AttendantConsoleDisplayFieldEnum")
@XmlEnum
public enum AttendantConsoleDisplayFieldEnum {

    @XmlEnumValue("Action")
    ACTION("Action"),
    @XmlEnumValue("Department")
    DEPARTMENT("Department"),
    @XmlEnumValue("Email")
    EMAIL("Email"),
    @XmlEnumValue("Extension")
    EXTENSION("Extension"),
    @XmlEnumValue("Mobile")
    MOBILE("Mobile"),
    @XmlEnumValue("Name")
    NAME("Name"),
    @XmlEnumValue("Phone Number")
    PHONE_NUMBER("Phone Number"),
    @XmlEnumValue("Pager")
    PAGER("Pager"),
    @XmlEnumValue("Status")
    STATUS("Status"),
    @XmlEnumValue("Title")
    TITLE("Title");
    private final String value;

    AttendantConsoleDisplayFieldEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AttendantConsoleDisplayFieldEnum fromValue(String v) {
        for (AttendantConsoleDisplayFieldEnum c: AttendantConsoleDisplayFieldEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
