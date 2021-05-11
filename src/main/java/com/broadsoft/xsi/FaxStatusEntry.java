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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         The data for a single fax transaction.       
 *       
 * 
 * <p>Java-Klasse für FaxStatusEntry complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FaxStatusEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="faxId" type="{http://schema.broadsoft.com/xsi}FaxId"/&gt;
 *         &lt;element name="faxStatus" type="{http://schema.broadsoft.com/xsi}FaxStatusCode"/&gt;
 *         &lt;element name="faxFileName" type="{http://schema.broadsoft.com/xsi}FileName"/&gt;
 *         &lt;element name="faxDestination" type="{http://schema.broadsoft.com/xsi}Address"/&gt;
 *         &lt;element name="timestamp" type="{http://schema.broadsoft.com/xsi}Timestamp"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaxStatusEntry", propOrder = {
    "faxId",
    "faxStatus",
    "faxFileName",
    "faxDestination",
    "timestamp"
})
public class FaxStatusEntry {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String faxId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected FaxStatusCode faxStatus;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String faxFileName;
    @XmlElement(required = true)
    protected Address faxDestination;
    protected long timestamp;

    /**
     * Ruft den Wert der faxId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxId() {
        return faxId;
    }

    /**
     * Legt den Wert der faxId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxId(String value) {
        this.faxId = value;
    }

    /**
     * Ruft den Wert der faxStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FaxStatusCode }
     *     
     */
    public FaxStatusCode getFaxStatus() {
        return faxStatus;
    }

    /**
     * Legt den Wert der faxStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FaxStatusCode }
     *     
     */
    public void setFaxStatus(FaxStatusCode value) {
        this.faxStatus = value;
    }

    /**
     * Ruft den Wert der faxFileName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxFileName() {
        return faxFileName;
    }

    /**
     * Legt den Wert der faxFileName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxFileName(String value) {
        this.faxFileName = value;
    }

    /**
     * Ruft den Wert der faxDestination-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getFaxDestination() {
        return faxDestination;
    }

    /**
     * Legt den Wert der faxDestination-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setFaxDestination(Address value) {
        this.faxDestination = value;
    }

    /**
     * Ruft den Wert der timestamp-Eigenschaft ab.
     * 
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * Legt den Wert der timestamp-Eigenschaft fest.
     * 
     */
    public void setTimestamp(long value) {
        this.timestamp = value;
    }

}
