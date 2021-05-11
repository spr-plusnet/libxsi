//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *         Contains the Call Transfer service configuration data.
 *       
 * 
 * <p>Java-Klasse für CallTransferInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CallTransferInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recallActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="recallNumberOfRings" type="{http://schema.broadsoft.com/xsi}NumberOfRingsTwoToTwenty" minOccurs="0"/&gt;
 *         &lt;element name="busyCampOnActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="busyCampOnSeconds" type="{http://schema.broadsoft.com/xsi}CallTransferBusyCampOnSeconds" minOccurs="0"/&gt;
 *         &lt;element name="useDiversionInhibitorForBlindTransfer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="useDiversionInhibitorForConsultativeCalls" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallTransferInfo", propOrder = {
    "recallActive",
    "recallNumberOfRings",
    "busyCampOnActive",
    "busyCampOnSeconds",
    "useDiversionInhibitorForBlindTransfer",
    "useDiversionInhibitorForConsultativeCalls"
})
public class CallTransferInfo {

    protected Boolean recallActive;
    protected Integer recallNumberOfRings;
    protected Boolean busyCampOnActive;
    protected Integer busyCampOnSeconds;
    protected Boolean useDiversionInhibitorForBlindTransfer;
    protected Boolean useDiversionInhibitorForConsultativeCalls;

    /**
     * Ruft den Wert der recallActive-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecallActive() {
        return recallActive;
    }

    /**
     * Legt den Wert der recallActive-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecallActive(Boolean value) {
        this.recallActive = value;
    }

    /**
     * Ruft den Wert der recallNumberOfRings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecallNumberOfRings() {
        return recallNumberOfRings;
    }

    /**
     * Legt den Wert der recallNumberOfRings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecallNumberOfRings(Integer value) {
        this.recallNumberOfRings = value;
    }

    /**
     * Ruft den Wert der busyCampOnActive-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBusyCampOnActive() {
        return busyCampOnActive;
    }

    /**
     * Legt den Wert der busyCampOnActive-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBusyCampOnActive(Boolean value) {
        this.busyCampOnActive = value;
    }

    /**
     * Ruft den Wert der busyCampOnSeconds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBusyCampOnSeconds() {
        return busyCampOnSeconds;
    }

    /**
     * Legt den Wert der busyCampOnSeconds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBusyCampOnSeconds(Integer value) {
        this.busyCampOnSeconds = value;
    }

    /**
     * Ruft den Wert der useDiversionInhibitorForBlindTransfer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseDiversionInhibitorForBlindTransfer() {
        return useDiversionInhibitorForBlindTransfer;
    }

    /**
     * Legt den Wert der useDiversionInhibitorForBlindTransfer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseDiversionInhibitorForBlindTransfer(Boolean value) {
        this.useDiversionInhibitorForBlindTransfer = value;
    }

    /**
     * Ruft den Wert der useDiversionInhibitorForConsultativeCalls-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseDiversionInhibitorForConsultativeCalls() {
        return useDiversionInhibitorForConsultativeCalls;
    }

    /**
     * Legt den Wert der useDiversionInhibitorForConsultativeCalls-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseDiversionInhibitorForConsultativeCalls(Boolean value) {
        this.useDiversionInhibitorForConsultativeCalls = value;
    }

}
