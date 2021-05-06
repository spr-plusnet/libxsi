//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         User Hoteling Guest properties. Hoteling Guest allows a user to
 *   associate their service profile
 *   with a Hoteling Host user. This allows the guest user to use the host's
 *   device with the guest
 *   user's service profile. This is useful for transient employees. The Xsi
 *   provides for association
 *   of a Hoteling Host user to a Hoteling Guest, as well as control of
 *   Hoteling Guest settings. The
 *   list of Hoteling Host users can be retrieved as well. However, control
 *   of Hoteling Host settings
 *   is not provided at this time.
 *       
 * 
 * <p>Java-Klasse für HotelingGuest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HotelingGuest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enableAssociationLimit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="associationLimitHours" type="{http://schema.broadsoft.com/xsi}HotelingAssociationLimitHours" minOccurs="0"/&gt;
 *         &lt;element name="hostUserId" type="{http://schema.broadsoft.com/xsi}UserId" minOccurs="0"/&gt;
 *         &lt;element name="hostLastName" type="{http://schema.broadsoft.com/xsi}LastName" minOccurs="0"/&gt;
 *         &lt;element name="hostFirstName" type="{http://schema.broadsoft.com/xsi}FirstName" minOccurs="0"/&gt;
 *         &lt;element name="hostAssociationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="hostEnforcesAssociationLimit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="hostAssociationLimitHours" type="{http://schema.broadsoft.com/xsi}HotelingAssociationLimitHours" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelingGuest", propOrder = {
    "enableAssociationLimit",
    "associationLimitHours",
    "hostUserId",
    "hostLastName",
    "hostFirstName",
    "hostAssociationDateTime",
    "hostEnforcesAssociationLimit",
    "hostAssociationLimitHours"
})
public class HotelingGuest
    extends ActivatableServiceInfo
{

    protected Boolean enableAssociationLimit;
    protected Integer associationLimitHours;
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
