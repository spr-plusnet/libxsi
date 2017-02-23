//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phoneNumber" type="{http://schema.broadsoft.com/xsi}DN" minOccurs="0"/>
 *         &lt;element name="description" type="{http://schema.broadsoft.com/xsi}NonEmptyToken" minOccurs="0"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="outboundAlternateNumber" type="{http://schema.broadsoft.com/xsi}OutgoingDNorSIPURI" minOccurs="0"/>
 *         &lt;element name="broadworksCallControl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="useDiversionInhibitor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="answerConfirmationRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="criteriaActivation" type="{http://schema.broadsoft.com/xsi}CriteriaActivation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "phoneNumber",
    "description",
    "active",
    "outboundAlternateNumber",
    "broadworksCallControl",
    "useDiversionInhibitor",
    "answerConfirmationRequired",
    "criteriaActivation"
})
@XmlRootElement(name = "BroadWorksAnywhereLocation")
public class BroadWorksAnywhereLocation {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String phoneNumber;
    @XmlElementRef(name = "description", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    protected Boolean active;
    @XmlElementRef(name = "outboundAlternateNumber", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> outboundAlternateNumber;
    protected Boolean broadworksCallControl;
    protected Boolean useDiversionInhibitor;
    protected Boolean answerConfirmationRequired;
    protected List<CriteriaActivation> criteriaActivation;

    /**
     * Ruft den Wert der phoneNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Legt den Wert der phoneNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der active-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Legt den Wert der active-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Ruft den Wert der outboundAlternateNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutboundAlternateNumber() {
        return outboundAlternateNumber;
    }

    /**
     * Legt den Wert der outboundAlternateNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutboundAlternateNumber(JAXBElement<String> value) {
        this.outboundAlternateNumber = value;
    }

    /**
     * Ruft den Wert der broadworksCallControl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBroadworksCallControl() {
        return broadworksCallControl;
    }

    /**
     * Legt den Wert der broadworksCallControl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBroadworksCallControl(Boolean value) {
        this.broadworksCallControl = value;
    }

    /**
     * Ruft den Wert der useDiversionInhibitor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseDiversionInhibitor() {
        return useDiversionInhibitor;
    }

    /**
     * Legt den Wert der useDiversionInhibitor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseDiversionInhibitor(Boolean value) {
        this.useDiversionInhibitor = value;
    }

    /**
     * Ruft den Wert der answerConfirmationRequired-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnswerConfirmationRequired() {
        return answerConfirmationRequired;
    }

    /**
     * Legt den Wert der answerConfirmationRequired-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnswerConfirmationRequired(Boolean value) {
        this.answerConfirmationRequired = value;
    }

    /**
     * Gets the value of the criteriaActivation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criteriaActivation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriteriaActivation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CriteriaActivation }
     * 
     * 
     */
    public List<CriteriaActivation> getCriteriaActivation() {
        if (criteriaActivation == null) {
            criteriaActivation = new ArrayList<CriteriaActivation>();
        }
        return this.criteriaActivation;
    }

}
