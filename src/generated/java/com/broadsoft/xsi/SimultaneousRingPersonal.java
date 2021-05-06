//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="SimultaneousRingPersonal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.broadsoft.com/xsi}ActivatableServiceInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="incomingCalls" type="{http://schema.broadsoft.com/xsi}SimultaneousRingSelection"/&gt;
 *         &lt;element name="simRingLocations" type="{http://schema.broadsoft.com/xsi}SimultaneousRingLocationList" minOccurs="0"/&gt;
 *         &lt;element name="criteriaActivationList" type="{http://schema.broadsoft.com/xsi}CriteriaActivationList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
