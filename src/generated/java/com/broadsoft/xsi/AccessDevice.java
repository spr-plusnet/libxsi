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
 *         Device associated with a user.
 *         Change History:
 *         R18.0 - Added
 *         R19.0 - Added version.
 *         R20.0 - deviceTypeUrl, deviceUserNamePassword are made optional.
 *         R21.0 - deviceUserNamePassword is included in Xsi responses only when 
 *                 BroadWorks is configured to allow retrieval of device credentials.
 *         R21.sp1 - Added elements allowTermination and endpointType. 
 *                   The endpointType is only present in the GET response when the 
 *                   client XSI version in the GET request is 21.sp1 or greater.
 *       
 * 
 * <p>Java-Klasse für AccessDevice complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AccessDevice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceName" type="{http://schema.broadsoft.com/xsi}AccessDeviceName"/&gt;
 *         &lt;element name="deviceLevel" type="{http://schema.broadsoft.com/xsi}AccessDeviceLevel"/&gt;
 *         &lt;element name="deviceType" type="{http://schema.broadsoft.com/xsi}AccessDeviceType"/&gt;
 *         &lt;element name="deviceLinePort" type="{http://schema.broadsoft.com/xsi}AccessDeviceEndpointLinePort"/&gt;
 *         &lt;element name="deviceTypeUrl" type="{http://schema.broadsoft.com/xsi}URL" minOccurs="0"/&gt;
 *         &lt;element name="deviceUserNamePassword" type="{http://schema.broadsoft.com/xsi}DeviceManagementUserNamePassword" minOccurs="0"/&gt;
 *         &lt;element name="version" type="{http://schema.broadsoft.com/xsi}UserAgentSipHeader" minOccurs="0"/&gt;
 *         &lt;element name="allowTermination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="endpointType" type="{http://schema.broadsoft.com/xsi}EndpointType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessDevice", propOrder = {
    "deviceName",
    "deviceLevel",
    "deviceType",
    "deviceLinePort",
    "deviceTypeUrl",
    "deviceUserNamePassword",
    "version",
    "allowTermination",
    "endpointType"
})
public class AccessDevice {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String deviceName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected AccessDeviceLevel deviceLevel;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String deviceType;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String deviceLinePort;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String deviceTypeUrl;
    protected DeviceManagementUserNamePassword deviceUserNamePassword;
    protected String version;
    protected Boolean allowTermination;
    @XmlSchemaType(name = "token")
    protected EndpointType endpointType;

    /**
     * Ruft den Wert der deviceName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Legt den Wert der deviceName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceName(String value) {
        this.deviceName = value;
    }

    /**
     * Ruft den Wert der deviceLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessDeviceLevel }
     *     
     */
    public AccessDeviceLevel getDeviceLevel() {
        return deviceLevel;
    }

    /**
     * Legt den Wert der deviceLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessDeviceLevel }
     *     
     */
    public void setDeviceLevel(AccessDeviceLevel value) {
        this.deviceLevel = value;
    }

    /**
     * Ruft den Wert der deviceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * Legt den Wert der deviceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceType(String value) {
        this.deviceType = value;
    }

    /**
     * Ruft den Wert der deviceLinePort-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceLinePort() {
        return deviceLinePort;
    }

    /**
     * Legt den Wert der deviceLinePort-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceLinePort(String value) {
        this.deviceLinePort = value;
    }

    /**
     * Ruft den Wert der deviceTypeUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceTypeUrl() {
        return deviceTypeUrl;
    }

    /**
     * Legt den Wert der deviceTypeUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceTypeUrl(String value) {
        this.deviceTypeUrl = value;
    }

    /**
     * Ruft den Wert der deviceUserNamePassword-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeviceManagementUserNamePassword }
     *     
     */
    public DeviceManagementUserNamePassword getDeviceUserNamePassword() {
        return deviceUserNamePassword;
    }

    /**
     * Legt den Wert der deviceUserNamePassword-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceManagementUserNamePassword }
     *     
     */
    public void setDeviceUserNamePassword(DeviceManagementUserNamePassword value) {
        this.deviceUserNamePassword = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Ruft den Wert der allowTermination-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowTermination() {
        return allowTermination;
    }

    /**
     * Legt den Wert der allowTermination-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowTermination(Boolean value) {
        this.allowTermination = value;
    }

    /**
     * Ruft den Wert der endpointType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EndpointType }
     *     
     */
    public EndpointType getEndpointType() {
        return endpointType;
    }

    /**
     * Legt den Wert der endpointType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointType }
     *     
     */
    public void setEndpointType(EndpointType value) {
        this.endpointType = value;
    }

}
