//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2021.02.12 um 09:46:20 AM CET 
//


package com.broadsoft.xsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Video File Details
 *       
 * 
 * <p>Java-Klasse für VideoFileDetails complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VideoFileDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fileDescriptor" type="{http://schema.broadsoft.com/xsi}FileDescriptor"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoFileDetails", propOrder = {
    "fileDescriptor"
})
public class VideoFileDetails {

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
