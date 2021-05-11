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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         Provides command baseline version.
 *         When applicable, also provides a list
 *         of patched commands. 
 *         
 *         Change History:
 *         R20.0 - Added
 *       
 * 
 * <p>Java-Klasse für Commands complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Commands"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="baseline" type="{http://schema.broadsoft.com/xsi}NonEmptyToken"/&gt;
 *         &lt;element name="patchedCommand" type="{http://schema.broadsoft.com/xsi}PatchedCommand" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Commands", propOrder = {
    "baseline",
    "patchedCommand"
})
public class Commands {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String baseline;
    protected List<PatchedCommand> patchedCommand;

    /**
     * Ruft den Wert der baseline-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseline() {
        return baseline;
    }

    /**
     * Legt den Wert der baseline-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseline(String value) {
        this.baseline = value;
    }

    /**
     * Gets the value of the patchedCommand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the patchedCommand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPatchedCommand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PatchedCommand }
     * 
     * 
     */
    public List<PatchedCommand> getPatchedCommand() {
        if (patchedCommand == null) {
            patchedCommand = new ArrayList<PatchedCommand>();
        }
        return this.patchedCommand;
    }

}
