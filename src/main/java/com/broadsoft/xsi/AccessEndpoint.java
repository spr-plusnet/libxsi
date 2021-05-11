//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 * &lt;complexType name="AccessEndpoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}Endpoint"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addressOfRecord" type="{http://schema.broadsoft.com/xsi}AddressOfRecord"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
