//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.0 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.15 um 02:45:42 PM CET 
//


package com.broadsoft.xsi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callNotifyEmailAddress" type="{http://schema.broadsoft.com/xsi}EmailAddress" minOccurs="0"/&gt;
 *         &lt;element name="criteriaActivation" type="{http://schema.broadsoft.com/xsi}CriteriaActivation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "callNotifyEmailAddress",
    "criteriaActivation"
})
@XmlRootElement(name = "CallNotify")
public class CallNotify {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String callNotifyEmailAddress;
    protected List<CriteriaActivation> criteriaActivation;

    /**
     * Ruft den Wert der callNotifyEmailAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallNotifyEmailAddress() {
        return callNotifyEmailAddress;
    }

    /**
     * Legt den Wert der callNotifyEmailAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallNotifyEmailAddress(String value) {
        this.callNotifyEmailAddress = value;
    }

    /**
     * Gets the value of the criteriaActivation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
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
