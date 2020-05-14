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
 * <p>Java-Klasse für AlternateAddressTypeEnum.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AlternateAddressTypeEnum">
 *   &lt;restriction base="{http://schema.broadsoft.com/xsi}NonEmptyToken">
 *     &lt;enumeration value="Fax"/>
 *     &lt;enumeration value="DNIS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlternateAddressTypeEnum")
@XmlEnum
public enum AlternateAddressTypeEnum {


    /**
     * 
     *             Fax Messaging address.
     *           
     * 
     */
    @XmlEnumValue("Fax")
    FAX("Fax"),

    /**
     * 
     *             DNIS address.
     *           
     * 
     */
    DNIS("DNIS");
    private final String value;

    AlternateAddressTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlternateAddressTypeEnum fromValue(String v) {
        for (AlternateAddressTypeEnum c: AlternateAddressTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
