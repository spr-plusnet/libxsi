//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.11 um 03:08:51 PM CEST 
//


package com.broadsoft.xsi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *           Contains a list of audio or video files to modify.
 *         
 * 
 * <p>Java-Klasse für CallCenterAnnouncementFileList complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CallCenterAnnouncementFileList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="file1" type="{http://schema.broadsoft.com/xsi}LabeledMediaFileResource" minOccurs="0"/>
 *         &lt;element name="file2" type="{http://schema.broadsoft.com/xsi}LabeledMediaFileResource" minOccurs="0"/>
 *         &lt;element name="file3" type="{http://schema.broadsoft.com/xsi}LabeledMediaFileResource" minOccurs="0"/>
 *         &lt;element name="file4" type="{http://schema.broadsoft.com/xsi}LabeledMediaFileResource" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallCenterAnnouncementFileList", propOrder = {
    "file1",
    "file2",
    "file3",
    "file4"
})
public class CallCenterAnnouncementFileList {

    @XmlElementRef(name = "file1", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<LabeledMediaFileResource> file1;
    @XmlElementRef(name = "file2", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<LabeledMediaFileResource> file2;
    @XmlElementRef(name = "file3", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<LabeledMediaFileResource> file3;
    @XmlElementRef(name = "file4", namespace = "http://schema.broadsoft.com/xsi", type = JAXBElement.class, required = false)
    protected JAXBElement<LabeledMediaFileResource> file4;

    /**
     * Ruft den Wert der file1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LabeledMediaFileResource }{@code >}
     *     
     */
    public JAXBElement<LabeledMediaFileResource> getFile1() {
        return file1;
    }

    /**
     * Legt den Wert der file1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LabeledMediaFileResource }{@code >}
     *     
     */
    public void setFile1(JAXBElement<LabeledMediaFileResource> value) {
        this.file1 = value;
    }

    /**
     * Ruft den Wert der file2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LabeledMediaFileResource }{@code >}
     *     
     */
    public JAXBElement<LabeledMediaFileResource> getFile2() {
        return file2;
    }

    /**
     * Legt den Wert der file2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LabeledMediaFileResource }{@code >}
     *     
     */
    public void setFile2(JAXBElement<LabeledMediaFileResource> value) {
        this.file2 = value;
    }

    /**
     * Ruft den Wert der file3-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LabeledMediaFileResource }{@code >}
     *     
     */
    public JAXBElement<LabeledMediaFileResource> getFile3() {
        return file3;
    }

    /**
     * Legt den Wert der file3-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LabeledMediaFileResource }{@code >}
     *     
     */
    public void setFile3(JAXBElement<LabeledMediaFileResource> value) {
        this.file3 = value;
    }

    /**
     * Ruft den Wert der file4-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LabeledMediaFileResource }{@code >}
     *     
     */
    public JAXBElement<LabeledMediaFileResource> getFile4() {
        return file4;
    }

    /**
     * Legt den Wert der file4-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LabeledMediaFileResource }{@code >}
     *     
     */
    public void setFile4(JAXBElement<LabeledMediaFileResource> value) {
        this.file4 = value;
    }

}
