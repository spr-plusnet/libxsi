//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *   User Flexible Seating Guest properties. Flexible Seating Guest allows a user to associate their service profile with a Flexible Seating Host user. This allows the guest user to use the host's device with the guest user's service profile. This is useful for transient employees. The Xsi provides for association of a Flexible Seating Host user to a Flexible Seating Guest, as well as control of Flexible Seating Guest settings.
 *     The following elements are read-only 
 *       hostLastName
 *       hostFirstName
 *       hostAssociationDateTime
 *       hostEnforcesAssociationLimit
 *       hostAssociationLimitHours
 *         Change History:
 *         R20.0 – Added. 
 *    
 * 
 * <p>Java-Klasse für FlexibleSeatingGuest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FlexibleSeatingGuest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo">
 *       &lt;sequence>
 *         &lt;element name="enableAssociationLimit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="associationLimitHours" type="{http://schema.broadsoft.com/xsi}FlexibleSeatingAssociationLimitHours" minOccurs="0"/>
 *         &lt;element name="unlockPhonePINCode" type="{http://schema.broadsoft.com/xsi}FlexibleSeatingGuestUnlockPhonePINCode" minOccurs="0"/>
 *         &lt;element name="accessDevice" type="{http://schema.broadsoft.com/xsi}FlexibleSeatingGuestAccessDevice" minOccurs="0"/>
 *         &lt;element name="hostUserId" type="{http://schema.broadsoft.com/xsi}UserId" minOccurs="0"/>
 *         &lt;element name="hostLastName" type="{http://schema.broadsoft.com/xsi}LastName" minOccurs="0"/>
 *         &lt;element name="hostFirstName" type="{http://schema.broadsoft.com/xsi}FirstName" minOccurs="0"/>
 *         &lt;element name="hostAssociationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="hostEnforcesAssociationLimit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hostAssociationLimitHours" type="{http://schema.broadsoft.com/xsi}FlexibleSeatingAssociationLimitHours" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlexibleSeatingGuest", propOrder = {
    "enableAssociationLimit",
    "associationLimitHours",
    "unlockPhonePINCode",
    "accessDevice",
    "hostUserId",
    "hostLastName",
    "hostFirstName",
    "hostAssociationDateTime",
    "hostEnforcesAssociationLimit",
    "hostAssociationLimitHours"
})
public class FlexibleSeatingGuest
    extends ActivatableServiceInfo
{

    protected Boolean enableAssociationLimit;
    protected Integer associationLimitHours;
    @XmlElementRef(name = "unlockPhonePINCode", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> unlockPhonePINCode;
    protected FlexibleSeatingGuestAccessDevice accessDevice;
    @XmlElementRef(name = "hostUserId", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hostUserId;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String hostLastName;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String hostFirstName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar hostAssociationDateTime;
    protected Boolean hostEnforcesAssociationLimit;
    protected Integer hostAssociationLimitHours;

    /**
     * Ruft den Wert der enableAssociationLimit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableAssociationLimit() {
        return enableAssociationLimit;
    }

    /**
     * Legt den Wert der enableAssociationLimit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableAssociationLimit(Boolean value) {
        this.enableAssociationLimit = value;
    }

    /**
     * Ruft den Wert der associationLimitHours-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAssociationLimitHours() {
        return associationLimitHours;
    }

    /**
     * Legt den Wert der associationLimitHours-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAssociationLimitHours(Integer value) {
        this.associationLimitHours = value;
    }

    /**
     * Ruft den Wert der unlockPhonePINCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnlockPhonePINCode() {
        return unlockPhonePINCode;
    }

    /**
     * Legt den Wert der unlockPhonePINCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnlockPhonePINCode(JAXBElement<String> value) {
        this.unlockPhonePINCode = value;
    }

    /**
     * Ruft den Wert der accessDevice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlexibleSeatingGuestAccessDevice }
     *     
     */
    public FlexibleSeatingGuestAccessDevice getAccessDevice() {
        return accessDevice;
    }

    /**
     * Legt den Wert der accessDevice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexibleSeatingGuestAccessDevice }
     *     
     */
    public void setAccessDevice(FlexibleSeatingGuestAccessDevice value) {
        this.accessDevice = value;
    }

    /**
     * Ruft den Wert der hostUserId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHostUserId() {
        return hostUserId;
    }

    /**
     * Legt den Wert der hostUserId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHostUserId(JAXBElement<String> value) {
        this.hostUserId = value;
    }

    /**
     * Ruft den Wert der hostLastName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostLastName() {
        return hostLastName;
    }

    /**
     * Legt den Wert der hostLastName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostLastName(String value) {
        this.hostLastName = value;
    }

    /**
     * Ruft den Wert der hostFirstName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostFirstName() {
        return hostFirstName;
    }

    /**
     * Legt den Wert der hostFirstName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostFirstName(String value) {
        this.hostFirstName = value;
    }

    /**
     * Ruft den Wert der hostAssociationDateTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHostAssociationDateTime() {
        return hostAssociationDateTime;
    }

    /**
     * Legt den Wert der hostAssociationDateTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHostAssociationDateTime(XMLGregorianCalendar value) {
        this.hostAssociationDateTime = value;
    }

    /**
     * Ruft den Wert der hostEnforcesAssociationLimit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHostEnforcesAssociationLimit() {
        return hostEnforcesAssociationLimit;
    }

    /**
     * Legt den Wert der hostEnforcesAssociationLimit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHostEnforcesAssociationLimit(Boolean value) {
        this.hostEnforcesAssociationLimit = value;
    }

    /**
     * Ruft den Wert der hostAssociationLimitHours-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHostAssociationLimitHours() {
        return hostAssociationLimitHours;
    }

    /**
     * Legt den Wert der hostAssociationLimitHours-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHostAssociationLimitHours(Integer value) {
        this.hostAssociationLimitHours = value;
    }

}
