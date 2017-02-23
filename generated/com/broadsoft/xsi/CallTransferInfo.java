//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.03.01 um 11:55:38 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="CallTransferInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recallActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="recallNumberOfRings" type="{http://schema.broadsoft.com/xsi}NumberOfRingsTwoToTwenty" minOccurs="0"/>
 *         &lt;element name="busyCampOnActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="busyCampOnSeconds" type="{http://schema.broadsoft.com/xsi}CallTransferBusyCampOnSeconds" minOccurs="0"/>
 *         &lt;element name="useDiversionInhibitorForBlindTransfer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="useDiversionInhibitorForConsultativeCalls" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
