//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         Contains the details related to an endpoint for
 *         an access device. An access device is a device 
 *         that a user can access the AS with 
 *         (e.g. originate a call a trigger their originating
 *         services) using an address of record. Note that this
 *         type does not apply to services such as 
 *         BroadWorks Anywhere and Remote Office which use a
 *         network device, not an access device.
 *       
 * 
 * <p>Java-Klasse für AccessEndpoint complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AccessEndpoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}Endpoint">
 *       &lt;sequence>
 *         &lt;element name="addressOfRecord" type="{http://schema.broadsoft.com/xsi}AddressOfRecord"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessEndpoint", propOrder = {
    "addressOfRecord"
})
public class AccessEndpoint
    extends Endpoint
{

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String addressOfRecord;

    /**
     * Ruft den Wert der addressOfRecord-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressOfRecord() {
        return addressOfRecord;
    }

    /**
     * Legt den Wert der addressOfRecord-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressOfRecord(String value) {
        this.addressOfRecord = value;
    }

}
