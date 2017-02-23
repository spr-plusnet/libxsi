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
 * <p>Java-Klasse für OutlookIntegrationContactRetrieval.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="OutlookIntegrationContactRetrieval">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Retrieve Default Contact Folder Only"/>
 *     &lt;enumeration value="Retrieve All Contacts"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OutlookIntegrationContactRetrieval")
@XmlEnum
public enum OutlookIntegrationContactRetrieval {

    @XmlEnumValue("Retrieve Default Contact Folder Only")
    RETRIEVE_DEFAULT_CONTACT_FOLDER_ONLY("Retrieve Default Contact Folder Only"),
    @XmlEnumValue("Retrieve All Contacts")
    RETRIEVE_ALL_CONTACTS("Retrieve All Contacts");
    private final String value;

    OutlookIntegrationContactRetrieval(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutlookIntegrationContactRetrieval fromValue(String v) {
        for (OutlookIntegrationContactRetrieval c: OutlookIntegrationContactRetrieval.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
