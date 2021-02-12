//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Contains the Simultaneous Ring Personal service configuration data.
 *       
 * 
 * <p>Java-Klasse für SimultaneousRingPersonal complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SimultaneousRingPersonal">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo">
 *       &lt;sequence>
 *         &lt;element name="incomingCalls" type="{http://schema.broadsoft.com/xsi}SimultaneousRingSelection"/>
 *         &lt;element name="simRingLocations" type="{http://schema.broadsoft.com/xsi}SimultaneousRingLocationList" minOccurs="0"/>
 *         &lt;element name="criteriaActivationList" type="{http://schema.broadsoft.com/xsi}CriteriaActivationList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimultaneousRingPersonal", propOrder = {
    "incomingCalls",
    "simRingLocations",
    "criteriaActivationList"
})
public class SimultaneousRingPersonal
    extends ActivatableServiceInfo
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected SimultaneousRingSelection incomingCalls;
    @XmlElementRef(name = "simRingLocations", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<SimultaneousRingLocationList> simRingLocations;
    protected CriteriaActivationList criteriaActivationList;

    /**
     * Ruft den Wert der incomingCalls-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SimultaneousRingSelection }
     *     
     */
    public SimultaneousRingSelection getIncomingCalls() {
        return incomingCalls;
    }

    /**
     * Legt den Wert der incomingCalls-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SimultaneousRingSelection }
     *     
     */
    public void setIncomingCalls(SimultaneousRingSelection value) {
        this.incomingCalls = value;
    }

    /**
     * Ruft den Wert der simRingLocations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SimultaneousRingLocationList }{@code >}
     *     
     */
    public JAXBElement<SimultaneousRingLocationList> getSimRingLocations() {
        return simRingLocations;
    }

    /**
     * Legt den Wert der simRingLocations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SimultaneousRingLocationList }{@code >}
     *     
     */
    public void setSimRingLocations(JAXBElement<SimultaneousRingLocationList> value) {
        this.simRingLocations = value;
    }

    /**
     * Ruft den Wert der criteriaActivationList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CriteriaActivationList }
     *     
     */
    public CriteriaActivationList getCriteriaActivationList() {
        return criteriaActivationList;
    }

    /**
     * Legt den Wert der criteriaActivationList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CriteriaActivationList }
     *     
     */
    public void setCriteriaActivationList(CriteriaActivationList value) {
        this.criteriaActivationList = value;
    }

}
