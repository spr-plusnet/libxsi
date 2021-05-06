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
 *         Audio File Details.
 *       
 * 
 * <p>Java-Klasse für AudioFileDetails complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AudioFileDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fileDescriptor" type="{http://schema.broadsoft.com/xsi}FileDescriptor"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudioFileDetails", propOrder = {
    "fileDescriptor"
})
public class AudioFileDetails {

    @XmlElement(required = true)
    protected FileDescriptor fileDescriptor;

    /**
     * Ruft den Wert der fileDescriptor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FileDescriptor }
     *     
     */
    public FileDescriptor getFileDescriptor() {
        return fileDescriptor;
    }

    /**
     * Legt den Wert der fileDescriptor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FileDescriptor }
     *     
     */
    public void setFileDescriptor(FileDescriptor value) {
        this.fileDescriptor = value;
    }

}
