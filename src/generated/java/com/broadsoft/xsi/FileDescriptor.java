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
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 * &lt;complexType name="FileDescriptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fileTypeSelected" type="{http://schema.broadsoft.com/xsi}FileSelectionType" minOccurs="0"/&gt;
 *         &lt;element name="mediaType" type="{http://schema.broadsoft.com/xsi}MediaFileType" minOccurs="0"/&gt;
 *         &lt;element name="file" type="{http://schema.broadsoft.com/xsi}FileResource" minOccurs="0"/&gt;
 *         &lt;element name="fileDescription" type="{http://schema.broadsoft.com/xsi}FileDescription" minOccurs="0"/&gt;
 *         &lt;element name="fileUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
