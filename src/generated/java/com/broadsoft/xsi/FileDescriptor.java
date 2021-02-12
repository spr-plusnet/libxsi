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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         File Descriptive details.
 *       
 * 
 * <p>Java-Klasse für FileDescriptor complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FileDescriptor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fileTypeSelected" type="{http://schema.broadsoft.com/xsi}FileSelectionType" minOccurs="0"/>
 *         &lt;element name="mediaType" type="{http://schema.broadsoft.com/xsi}MediaFileType" minOccurs="0"/>
 *         &lt;element name="file" type="{http://schema.broadsoft.com/xsi}FileResource" minOccurs="0"/>
 *         &lt;element name="fileDescription" type="{http://schema.broadsoft.com/xsi}FileDescription" minOccurs="0"/>
 *         &lt;element name="fileUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileDescriptor", propOrder = {
    "fileTypeSelected",
    "mediaType",
    "file",
    "fileDescription",
    "fileUrl"
})
public class FileDescriptor {

    @XmlElement(defaultValue = "Default")
    @XmlSchemaType(name = "token")
    protected FileSelectionType fileTypeSelected;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String mediaType;
    protected FileResource file;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fileDescription;
    @XmlElementRef(name = "fileUrl", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fileUrl;

    /**
     * Ruft den Wert der fileTypeSelected-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FileSelectionType }
     *     
     */
    public FileSelectionType getFileTypeSelected() {
        return fileTypeSelected;
    }

    /**
     * Legt den Wert der fileTypeSelected-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FileSelectionType }
     *     
     */
    public void setFileTypeSelected(FileSelectionType value) {
        this.fileTypeSelected = value;
    }

    /**
     * Ruft den Wert der mediaType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * Legt den Wert der mediaType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaType(String value) {
        this.mediaType = value;
    }

    /**
     * Ruft den Wert der file-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FileResource }
     *     
     */
    public FileResource getFile() {
        return file;
    }

    /**
     * Legt den Wert der file-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FileResource }
     *     
     */
    public void setFile(FileResource value) {
        this.file = value;
    }

    /**
     * Ruft den Wert der fileDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileDescription() {
        return fileDescription;
    }

    /**
     * Legt den Wert der fileDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileDescription(String value) {
        this.fileDescription = value;
    }

    /**
     * Ruft den Wert der fileUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFileUrl() {
        return fileUrl;
    }

    /**
     * Legt den Wert der fileUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFileUrl(JAXBElement<String> value) {
        this.fileUrl = value;
    }

}
