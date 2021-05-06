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
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


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
 * &lt;complexType name="CallCenterAnnouncementFileList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="file1" type="{http://schema.broadsoft.com/xsi}LabeledMediaFileResource" minOccurs="0"/&gt;
 *         &lt;element name="file2" type="{http://schema.broadsoft.com/xsi}LabeledMediaFileResource" minOccurs="0"/&gt;
 *         &lt;element name="file3" type="{http://schema.broadsoft.com/xsi}LabeledMediaFileResource" minOccurs="0"/&gt;
 *         &lt;element name="file4" type="{http://schema.broadsoft.com/xsi}LabeledMediaFileResource" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
