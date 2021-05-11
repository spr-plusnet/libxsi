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


/**
 * 
 *         The user level data associated with the Personal
 *         Assistant service
 * 
 *         Change History:
 *         21.0 - Added.
 *         Release Modified: R22.sp6 - Added alertMeFirst and numberOfRings elements.
 *       
 * 
 * <p>Java-Klasse für PersonalAssistant complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PersonalAssistant"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="presence" type="{http://schema.broadsoft.com/xsi}PersonalAssistantPresence" minOccurs="0"/&gt;
 *         &lt;element name="enableExpirationTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="expirationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="enableTransferToAttendant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="attendantNumber" type="{http://schema.broadsoft.com/xsi}OutgoingDNorSIPURI" minOccurs="0"/&gt;
 *         &lt;element name="ringSplash" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="callToNumberList" type="{http://schema.broadsoft.com/xsi}CallToNumberList" minOccurs="0"/&gt;
 *         &lt;element name="alertMeFirst" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="numberOfRings" type="{http://schema.broadsoft.com/xsi}NumberOfRingsZeroToTwentyExcludeOne" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonalAssistant", propOrder = {
    "presence",
    "enableExpirationTime",
    "expirationTime",
    "enableTransferToAttendant",
    "attendantNumber",
    "ringSplash",
    "callToNumberList",
    "alertMeFirst",
    "numberOfRings"
})
public class PersonalAssistant
    extends ActivatableServiceInfo
{

    @XmlSchemaType(name = "token")
    protected PersonalAssistantPresence presence;
    protected Boolean enableExpirationTime;
    @XmlElementRef(name = "expirationTime", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> expirationTime;
    protected Boolean enableTransferToAttendant;
    @XmlElementRef(name = "attendantNumber", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attendantNumber;
    protected Boolean ringSplash;
    @XmlElementRef(name = "callToNumberList", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<CallToNumberList> callToNumberList;
    protected Boolean alertMeFirst;
    protected Integer numberOfRings;

    /**
     * Ruft den Wert der presence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PersonalAssistantPresence }
     *     
     */
    public PersonalAssistantPresence getPresence() {
        return presence;
    }

    /**
     * Legt den Wert der presence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalAssistantPresence }
     *     
     */
    public void setPresence(PersonalAssistantPresence value) {
        this.presence = value;
    }

    /**
     * Ruft den Wert der enableExpirationTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableExpirationTime() {
        return enableExpirationTime;
    }

    /**
     * Legt den Wert der enableExpirationTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableExpirationTime(Boolean value) {
        this.enableExpirationTime = value;
    }

    /**
     * Ruft den Wert der expirationTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExpirationTime() {
        return expirationTime;
    }

    /**
     * Legt den Wert der expirationTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExpirationTime(JAXBElement<XMLGregorianCalendar> value) {
        this.expirationTime = value;
    }

    /**
     * Ruft den Wert der enableTransferToAttendant-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableTransferToAttendant() {
        return enableTransferToAttendant;
    }

    /**
     * Legt den Wert der enableTransferToAttendant-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableTransferToAttendant(Boolean value) {
        this.enableTransferToAttendant = value;
    }

    /**
     * Ruft den Wert der attendantNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttendantNumber() {
        return attendantNumber;
    }

    /**
     * Legt den Wert der attendantNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttendantNumber(JAXBElement<String> value) {
        this.attendantNumber = value;
    }

    /**
     * Ruft den Wert der ringSplash-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRingSplash() {
        return ringSplash;
    }

    /**
     * Legt den Wert der ringSplash-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRingSplash(Boolean value) {
        this.ringSplash = value;
    }

    /**
     * Ruft den Wert der callToNumberList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CallToNumberList }{@code >}
     *     
     */
    public JAXBElement<CallToNumberList> getCallToNumberList() {
        return callToNumberList;
    }

    /**
     * Legt den Wert der callToNumberList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CallToNumberList }{@code >}
     *     
     */
    public void setCallToNumberList(JAXBElement<CallToNumberList> value) {
        this.callToNumberList = value;
    }

    /**
     * Ruft den Wert der alertMeFirst-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlertMeFirst() {
        return alertMeFirst;
    }

    /**
     * Legt den Wert der alertMeFirst-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlertMeFirst(Boolean value) {
        this.alertMeFirst = value;
    }

    /**
     * Ruft den Wert der numberOfRings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfRings() {
        return numberOfRings;
    }

    /**
     * Legt den Wert der numberOfRings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfRings(Integer value) {
        this.numberOfRings = value;
    }

}
