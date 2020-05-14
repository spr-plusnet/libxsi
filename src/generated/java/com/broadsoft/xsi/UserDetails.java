//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         Details of the user in User Services.
 *       
 * 
 * <p>Java-Klasse für UserDetails complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UserDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}UserInfo">
 *       &lt;sequence>
 *         &lt;element name="groupId" type="{http://schema.broadsoft.com/xsi}GroupId" minOccurs="0"/>
 *         &lt;element name="serviceProvider" type="{http://schema.broadsoft.com/xsi}ServiceProvider" minOccurs="0"/>
 *         &lt;element name="number" type="{http://schema.broadsoft.com/xsi}DN" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://schema.broadsoft.com/xsi}Extension" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserDetails", propOrder = {
    "groupId",
    "serviceProvider",
    "number",
    "extension"
})
@XmlSeeAlso({
    UserDetailInfo.class,
    ContactDetails.class,
    UserAdditionalEnterpriseGroupDetails.class
})
public class UserDetails
    extends UserInfo
{

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String groupId;
    protected ServiceProvider serviceProvider;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String number;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String extension;

    /**
     * Ruft den Wert der groupId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Legt den Wert der groupId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

    /**
     * Ruft den Wert der serviceProvider-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceProvider }
     *     
     */
    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    /**
     * Legt den Wert der serviceProvider-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceProvider }
     *     
     */
    public void setServiceProvider(ServiceProvider value) {
        this.serviceProvider = value;
    }

    /**
     * Ruft den Wert der number-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Legt den Wert der number-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Ruft den Wert der extension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Legt den Wert der extension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

}
