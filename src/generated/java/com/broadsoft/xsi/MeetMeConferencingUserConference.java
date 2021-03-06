//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         Contains the basic information of a MeetMe conferencing.
 *         Release Added: R17.sp3
 *       
 * 
 * <p>Java-Klasse für MeetMeConferencingUserConference complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MeetMeConferencingUserConference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bridgeId" type="{http://schema.broadsoft.com/xsi}UserId"/&gt;
 *         &lt;element name="conferenceId" type="{http://schema.broadsoft.com/xsi}MeetMeConferencingConferencePassCode"/&gt;
 *         &lt;element name="title" type="{http://schema.broadsoft.com/xsi}MeetMeConferencingConferenceTitle"/&gt;
 *         &lt;element name="bridgeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="status" type="{http://schema.broadsoft.com/xsi}MeetMeConferencingConferenceStatus"/&gt;
 *         &lt;element name="type" type="{http://schema.broadsoft.com/xsi}MeetMeConferencingConferenceType"/&gt;
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="conferenceUri" type="{http://schema.broadsoft.com/xsi}URL" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetMeConferencingUserConference", propOrder = {
    "bridgeId",
    "conferenceId",
    "title",
    "bridgeName",
    "status",
    "type",
    "startTime",
    "isActive",
    "conferenceUri"
})
public class MeetMeConferencingUserConference {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bridgeId;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String conferenceId;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String title;
    @XmlElement(required = true)
    protected String bridgeName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected MeetMeConferencingConferenceStatus status;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected MeetMeConferencingConferenceType type;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    protected boolean isActive;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String conferenceUri;

    /**
     * Ruft den Wert der bridgeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBridgeId() {
        return bridgeId;
    }

    /**
     * Legt den Wert der bridgeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBridgeId(String value) {
        this.bridgeId = value;
    }

    /**
     * Ruft den Wert der conferenceId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConferenceId() {
        return conferenceId;
    }

    /**
     * Legt den Wert der conferenceId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConferenceId(String value) {
        this.conferenceId = value;
    }

    /**
     * Ruft den Wert der title-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Legt den Wert der title-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Ruft den Wert der bridgeName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBridgeName() {
        return bridgeName;
    }

    /**
     * Legt den Wert der bridgeName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBridgeName(String value) {
        this.bridgeName = value;
    }

    /**
     * Ruft den Wert der status-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeetMeConferencingConferenceStatus }
     *     
     */
    public MeetMeConferencingConferenceStatus getStatus() {
        return status;
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetMeConferencingConferenceStatus }
     *     
     */
    public void setStatus(MeetMeConferencingConferenceStatus value) {
        this.status = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MeetMeConferencingConferenceType }
     *     
     */
    public MeetMeConferencingConferenceType getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetMeConferencingConferenceType }
     *     
     */
    public void setType(MeetMeConferencingConferenceType value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der startTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Legt den Wert der startTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Ruft den Wert der isActive-Eigenschaft ab.
     * 
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * Legt den Wert der isActive-Eigenschaft fest.
     * 
     */
    public void setIsActive(boolean value) {
        this.isActive = value;
    }

    /**
     * Ruft den Wert der conferenceUri-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConferenceUri() {
        return conferenceUri;
    }

    /**
     * Legt den Wert der conferenceUri-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConferenceUri(String value) {
        this.conferenceUri = value;
    }

}
