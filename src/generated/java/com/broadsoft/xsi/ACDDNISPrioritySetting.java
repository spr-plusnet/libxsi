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
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *          DNIS Priority Configuration.
 *       
 * 
 * <p>Java-Klasse für ACDDNISPrioritySetting complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ACDDNISPrioritySetting"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="promoteCallsFromPriority1to0" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="promoteCallsFromPriority1to0Seconds" type="{http://schema.broadsoft.com/xsi}DNISPromoteCallPrioritySeconds"/&gt;
 *         &lt;element name="promoteCallsFromPriority2to1" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="promoteCallsFromPriority2to1Seconds" type="{http://schema.broadsoft.com/xsi}DNISPromoteCallPrioritySeconds"/&gt;
 *         &lt;element name="promoteCallsFromPriority3to2" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="promoteCallsFromPriority3to2Seconds" type="{http://schema.broadsoft.com/xsi}DNISPromoteCallPrioritySeconds"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACDDNISPrioritySetting", propOrder = {
    "promoteCallsFromPriority1To0",
    "promoteCallsFromPriority1To0Seconds",
    "promoteCallsFromPriority2To1",
    "promoteCallsFromPriority2To1Seconds",
    "promoteCallsFromPriority3To2",
    "promoteCallsFromPriority3To2Seconds"
})
public class ACDDNISPrioritySetting {

    @XmlElement(name = "promoteCallsFromPriority1to0")
    protected boolean promoteCallsFromPriority1To0;
    @XmlElement(name = "promoteCallsFromPriority1to0Seconds")
    protected int promoteCallsFromPriority1To0Seconds;
    @XmlElement(name = "promoteCallsFromPriority2to1")
    protected boolean promoteCallsFromPriority2To1;
    @XmlElement(name = "promoteCallsFromPriority2to1Seconds")
    protected int promoteCallsFromPriority2To1Seconds;
    @XmlElement(name = "promoteCallsFromPriority3to2")
    protected boolean promoteCallsFromPriority3To2;
    @XmlElement(name = "promoteCallsFromPriority3to2Seconds")
    protected int promoteCallsFromPriority3To2Seconds;

    /**
     * Ruft den Wert der promoteCallsFromPriority1To0-Eigenschaft ab.
     * 
     */
    public boolean isPromoteCallsFromPriority1To0() {
        return promoteCallsFromPriority1To0;
    }

    /**
     * Legt den Wert der promoteCallsFromPriority1To0-Eigenschaft fest.
     * 
     */
    public void setPromoteCallsFromPriority1To0(boolean value) {
        this.promoteCallsFromPriority1To0 = value;
    }

    /**
     * Ruft den Wert der promoteCallsFromPriority1To0Seconds-Eigenschaft ab.
     * 
     */
    public int getPromoteCallsFromPriority1To0Seconds() {
        return promoteCallsFromPriority1To0Seconds;
    }

    /**
     * Legt den Wert der promoteCallsFromPriority1To0Seconds-Eigenschaft fest.
     * 
     */
    public void setPromoteCallsFromPriority1To0Seconds(int value) {
        this.promoteCallsFromPriority1To0Seconds = value;
    }

    /**
     * Ruft den Wert der promoteCallsFromPriority2To1-Eigenschaft ab.
     * 
     */
    public boolean isPromoteCallsFromPriority2To1() {
        return promoteCallsFromPriority2To1;
    }

    /**
     * Legt den Wert der promoteCallsFromPriority2To1-Eigenschaft fest.
     * 
     */
    public void setPromoteCallsFromPriority2To1(boolean value) {
        this.promoteCallsFromPriority2To1 = value;
    }

    /**
     * Ruft den Wert der promoteCallsFromPriority2To1Seconds-Eigenschaft ab.
     * 
     */
    public int getPromoteCallsFromPriority2To1Seconds() {
        return promoteCallsFromPriority2To1Seconds;
    }

    /**
     * Legt den Wert der promoteCallsFromPriority2To1Seconds-Eigenschaft fest.
     * 
     */
    public void setPromoteCallsFromPriority2To1Seconds(int value) {
        this.promoteCallsFromPriority2To1Seconds = value;
    }

    /**
     * Ruft den Wert der promoteCallsFromPriority3To2-Eigenschaft ab.
     * 
     */
    public boolean isPromoteCallsFromPriority3To2() {
        return promoteCallsFromPriority3To2;
    }

    /**
     * Legt den Wert der promoteCallsFromPriority3To2-Eigenschaft fest.
     * 
     */
    public void setPromoteCallsFromPriority3To2(boolean value) {
        this.promoteCallsFromPriority3To2 = value;
    }

    /**
     * Ruft den Wert der promoteCallsFromPriority3To2Seconds-Eigenschaft ab.
     * 
     */
    public int getPromoteCallsFromPriority3To2Seconds() {
        return promoteCallsFromPriority3To2Seconds;
    }

    /**
     * Legt den Wert der promoteCallsFromPriority3To2Seconds-Eigenschaft fest.
     * 
     */
    public void setPromoteCallsFromPriority3To2Seconds(int value) {
        this.promoteCallsFromPriority3To2Seconds = value;
    }

}
